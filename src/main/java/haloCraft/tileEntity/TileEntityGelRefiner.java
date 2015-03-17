package haloCraft.tileEntity;

import haloCraft.GelRefinerRecipies;
import haloCraft.HaloCraft;
import haloCraft.blocks.GelRefiner;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityGelRefiner extends TileEntity implements ISidedInventory
{
	private ItemStack slots[];
	
	public int tankLevel;
	public int refineTime;
	public static final int maxVolume = 20000;
	public static final int refiningSpeed = 2000;
	
	private static final int[] slots_top = new int[] {1};
	private static final int[] slots_right = new int[] {0};
	private static final int[] slots_bottom = new int[] {3};
	
	private String customName;
	
	public TileEntityGelRefiner() 
	{
		slots = new ItemStack[3];
	}
	
	@Override
	public int getSizeInventory() 
	{
		return slots.length;
	}

	@Override
	public ItemStack getStackInSlot(int i) 
	{
		return slots[i];
	}

	@Override
	public ItemStack decrStackSize(int i, int j) 
	{
		if (slots[i] != null) {
			if (slots[i].stackSize <= j) {
				ItemStack itemStack = slots[i];
				slots[i] = null;
				return itemStack;
			}
			ItemStack itemStack1 = slots[i].splitStack(j);
			
			if (slots[i].stackSize == 0) {
				slots[i] = null;
			}
			return itemStack1;
		}else{
			return null;
		}
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int i) 
	{
		if (slots[i] != null) {
			ItemStack itemStack = slots[i];
			slots[i] = null;
			return itemStack;
		}else{
		return null;
		}
	}

	@Override
	public void setInventorySlotContents(int i, ItemStack itemStack) 
	{
		slots[i] = itemStack;
		if (itemStack != null && itemStack.stackSize > getInventoryStackLimit()) {
			itemStack.stackSize = getInventoryStackLimit();
		}	
	}

	@Override
	public String getInventoryName() 
	{
		return this.hasCustomInventoryName() ? this.customName : "Gel Refiner";
	}

	@Override
	public boolean hasCustomInventoryName()
	{
		return this.customName != null && this.customName.length() > 0;
	}

	@Override
	public int getInventoryStackLimit() 
	{
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) 
	{
		if (worldObj.getTileEntity(xCoord, yCoord, zCoord) != this) {
			return false;
		}else{
			return player.getDistanceSq((double)xCoord + 0.5D, (double)yCoord + 0.5D, (double)zCoord + 0.5D) <= 64;
		}	}

	public void openInventory() {}
	public void closeInventory() {}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemStack) 
	{
		return i == 2 ? false : (i == 1 ? isItemBucket(itemStack) :true);
	}

	public boolean isItemBucket (ItemStack itemStack) 
	{
		if (itemStack != null) {
			if (itemStack.getItem() == Items.bucket) {
				return true;
			}
		}
		return false;
	}
	
	public void writeToNBT(NBTTagCompound nbt)
	{
		super.writeToNBT(nbt);
		nbt.setShort("PowerTime", (short)tankLevel);
		nbt.setShort("CookTime", (short)refineTime);
		NBTTagList list = new NBTTagList();
		
		for (int i = 0; i < slots.length; i++) {
			if (slots[i] != null) {
				NBTTagCompound nbt1 = new NBTTagCompound();
				nbt1.setByte("Slot", (byte)i);
				slots[i].writeToNBT(nbt1);
				list.appendTag(nbt1);
			}
		}
		
		nbt.setTag("Items", list);
	}
	
	public void readFromNBT(NBTTagCompound nbt)
	{
		super.readFromNBT(nbt);
		NBTTagList list = nbt.getTagList("Items", 10);
		slots = new ItemStack[getSizeInventory()];
		
		for (int i = 0; i < list.tagCount(); i++) {
			NBTTagCompound nbt1 = (NBTTagCompound)list.getCompoundTagAt(i);
			byte b0 = nbt1.getByte("Slot");
			
			if (b0 >= 0 && b0 < slots.length) {
				slots[b0] = ItemStack.loadItemStackFromNBT(nbt1);
			}
		}
		
		tankLevel = nbt.getShort("PowerTime");
		refineTime = nbt.getShort("CookTime");
	}


	@Override
	public int[] getAccessibleSlotsFromSide(int i) 
	{
		return i == 0 ? slots_bottom : (i == 1 ? slots_top : slots_right);
	}

	@Override
	public boolean canInsertItem(int i, ItemStack itemStack, int j)
	{
		return isItemValidForSlot(j, itemStack);
	}

	@Override
	public boolean canExtractItem(int i, ItemStack itemStack, int j) {
		return j != 0 || i != 1 || itemStack.getItem() == Items.bucket;
	}
	
	public int getRefinerProgressScaled(int i)
	{
		return (refineTime * i) / this.refiningSpeed;
	}
	
	public int getTankLevelScaled(int i)
	{
		return (tankLevel * i) / this.maxVolume;
	}
	
	private boolean canRefine()
	{
		if(slots[0] == null || slots[1] == null) {
			return false;
		}
		
		ItemStack itemStack = GelRefinerRecipies.GelRefinerResult(slots[0].getItem(), slots[1].getItem());
		
		if (tankLevel <= 0) {
			return false;
		}	
		
		if (itemStack == null) {
			return false;
		}
		
		if (slots[2] == null) {
			return true;	
		}
		
		if (!slots[2].isItemEqual(itemStack)) {
			return false;
		}
		
		if (slots[2].stackSize < getInventoryStackLimit() && slots[2].stackSize < slots[2].getMaxStackSize()) {
			return true;
		}else{
			return slots[2].stackSize < itemStack.getMaxStackSize();
		}	
	}
	
	public boolean hasMaterial() {
		return tankLevel > 0;
	}
	
	public boolean isRefining() {
		return this.refineTime > 0;
	}
	
	private void refineItem()
	{
		if (canRefine()) {
			ItemStack itemStack = GelRefinerRecipies.GelRefinerResult(slots[0].getItem(), slots[1].getItem());

			
			
			if (slots[2] == null) {
				slots[2] = itemStack.copy();
			}else if (slots[2].isItemEqual(itemStack)) {
				slots[2].stackSize += itemStack.stackSize;
			}
			
			for(int i = 0; i < 2; i++) {
				if (slots[i].stackSize <= 0) {
					slots[i] = new ItemStack(slots[i].getItem().setFull3D());
				}else{
					slots[i].stackSize--;
				}
				if (slots[1].stackSize <= 0) {
					slots[1] = null;
				}
				if(this.slots[0].stackSize <= 0) {
					if(this.slots[0].getItem().getContainerItem(this.slots[0]) != null) {
						this.slots[0] = this.slots[0].getItem().getContainerItem(this.slots[0]);
					}
				}
			}
			
			
		}
	}
	
	public void addToTank(Item item, EntityPlayer player)
	{
		ItemStack itemStack = player.inventory.getCurrentItem();
		
		if (item == Items.magma_cream) {
			if (this.tankLevel <= this.maxVolume - 250) {
				this.tankLevel += 250;
				if (!player.capabilities.isCreativeMode) {
					itemStack.stackSize--;
				}
			}
		}else if(item == HaloCraft.Magma_Bucket) {
			if (this.tankLevel <= this.maxVolume - 2000) {
				this.tankLevel += 2000;
				if (!player.capabilities.isCreativeMode) {
					itemStack.stackSize--;
                }
			}
		}
	}
	
	public void updateEntity()
	{
		boolean flag = this.isRefining();
		boolean flag1 = false;
		
		if(hasMaterial() && this.isRefining()) {
			this.tankLevel--;
		}
		
		if (!worldObj.isRemote) {
			if (hasMaterial() && canRefine()) {
				refineTime++;
				
				if (this.refineTime == this.refiningSpeed) {
					this.refineTime = 0;
					this.refineItem();
					flag1 = true;
				}
			}else{
				refineTime = 0;
			}
			
			if (flag != this.isRefining()) {
				flag1 = true;
				GelRefiner.updateBlockState(this.canRefine(), this.worldObj, this.xCoord, this.yCoord, this.zCoord);
			}
		}
		
		if (flag1) {
			this.markDirty();
		}
	}
}