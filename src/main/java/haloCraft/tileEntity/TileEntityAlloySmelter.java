	package haloCraft.tileEntity;

import haloCraft.AlloySmelterRecipes;
import haloCraft.blocks.AlloySmelter;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntityAlloySmelter extends TileEntity implements ISidedInventory
{
	private ItemStack slots[];
	
	public int dualPower;
	public int dualCookTime;
	public static final int maxPower = 30000;
	public static final int smeltingSpeed = 500;
	
	private static final int[] slots_top = new int[] {0, 1};
	private static final int[] slots_right = new int[] {2};
	private static final int[] slots_bottom = new int[] {3};
	
	private String customName;
	
	public TileEntityAlloySmelter()
	{
		slots = new ItemStack[4];
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
		return this.hasCustomInventoryName() ? this.customName : "Alloy Smelter";
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
		}
	}

	public void openInventory() {}
	public void closeInventory() {}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemStack) 
	{
		return i == 3 ? false : (i == 0 ? hasItemPower(itemStack) : true);
	}
	
	public boolean hasItemPower(ItemStack itemStack)
	{
		return getItemPower(itemStack) > 0;
	}
	
	private static int getItemPower(ItemStack itemStack)
	{
		if (itemStack == null) {
			return 0;
		}else{
			Item item = itemStack.getItem();
			
			 if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air)
	            {
	                Block block = Block.getBlockFromItem(item);

	                if (block == Blocks.wooden_slab)
	                {
	                    return 150;
	                }

	                if (block.getMaterial() == Material.wood)
	                {
	                    return 300;
	                }

	                if (block == Blocks.coal_block)
	                {
	                    return 16000;
	                }
	            }

	            if (item instanceof ItemTool && ((ItemTool)item).getToolMaterialName().equals("WOOD")) return 200;
	            if (item instanceof ItemSword && ((ItemSword)item).getToolMaterialName().equals("WOOD")) return 200;
	            if (item instanceof ItemHoe && ((ItemHoe)item).getToolMaterialName().equals("WOOD")) return 200;
	            if (item == Items.stick) return 100;
	            if (item == Items.coal) return 1600;
	            if (item == Items.lava_bucket) return 20000;
	            if (item == Item.getItemFromBlock(Blocks.sapling)) return 100;
	            if (item == Items.blaze_rod) return 2400;
	            return GameRegistry.getFuelValue(itemStack);
		}
	}
	
	public static boolean isItemFuel(ItemStack itemStack)
	{
		return getItemPower(itemStack) > 0;
	}
	
	public void writeToNBT(NBTTagCompound nbt)
	{
		super.writeToNBT(nbt);
		nbt.setShort("PowerTime", (short)dualPower);
		nbt.setShort("CookTime", (short)dualCookTime);
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
		
		dualPower = nbt.getShort("PowerTime");
		dualCookTime = nbt.getShort("CookTime");
	}

	@Override
	public int[] getAccessibleSlotsFromSide(int i) 
	{
		return i == 0 ? slots_bottom : (i == 1 ? slots_top : slots_right);
	}

	@Override
	public boolean canInsertItem(int i, ItemStack itemStack, int j) 
	{
		return this.isItemValidForSlot(i, itemStack);
	}

	@Override
	public boolean canExtractItem(int i, ItemStack itemStack, int j) 
	{
		return j != 0 || i != 1 || itemStack.getItem() == Items.bucket;
	}
	
	public int getSmelterProgressScaled(int i)
	{
		return (dualCookTime * i) / this.smeltingSpeed;
	}
	
	public int getPowerRemainingScaled(int i)
	{
		return (dualPower * i) / maxPower;
	}
	
	private boolean canSmelt()
	{
		if(slots[0] == null || slots[1] == null) {
			return false;
		}
		
		ItemStack itemStack = AlloySmelterRecipes.AlloySmelterResult(slots[0].getItem(), slots[1].getItem());
	
		if (itemStack == null) {
			return false;
		}
		
		if (slots[3] == null) {
			return true;	
		}
		
		if (!slots[3].isItemEqual(itemStack)) {
			return false;
		}
		
		if (slots[3].stackSize < getInventoryStackLimit() && slots[3].stackSize < slots[3].getMaxStackSize()) {
			return true;
		}else{
			return slots[3].stackSize < itemStack.getMaxStackSize();
		}	
	}
	
	public boolean hasPower() 
	{
		return dualPower > 0;
	}
	
	public boolean isSmelting() 
	{
		return this.dualCookTime > 0;
	}
	
	private void smeltItem()
	{
		if (canSmelt()) {
			ItemStack itemStack = AlloySmelterRecipes.AlloySmelterResult(slots[0].getItem(), slots[1].getItem());
			
			if (slots[3] == null) {
				slots[3] = itemStack.copy();
			}else if (slots[3].isItemEqual(itemStack)) {
				slots[3].stackSize += itemStack.stackSize;
			}
			
			for(int i = 0; i < 2; i++) {
				if (slots[i].stackSize <= 0) {
					slots[i] = new ItemStack(slots[i].getItem().setFull3D());
				}else{
					slots[i].stackSize--;
				}
				if (slots[i].stackSize <= 0) {
					slots[i] = null;
				}
			}
		}
	}
	
	public void updateEntity()
	{
		boolean flag = this.isSmelting();
		boolean flag1 = false;
		
		if(hasPower() && this.isSmelting()) {
			this.dualPower--;
		}
		
		if (!worldObj.isRemote) {
			if (this.hasItemPower(this.slots[2]) && this.dualPower <= (this.maxPower - this.getItemPower(this.slots[2]))) {
				this.dualPower += getItemPower(this.slots[2]);
				
				if(this.slots[2] != null) {
					flag1 = true;
					
					this.slots[2].stackSize--;
					
					if(this.slots[2].stackSize == 0) {
						this.slots[2] = this.slots[2].getItem().getContainerItem(this.slots[2]);
					}
				}
			}
			if (hasPower() && canSmelt()) {
				dualCookTime++;
				
				if (this.dualCookTime == this.smeltingSpeed) {
					this.dualCookTime = 0;
					this.smeltItem();
					flag1 = true;
				}
			}else{
				dualCookTime = 0;
			}
			
			if (flag != this.isSmelting()) {
				flag1 = true;
				AlloySmelter.updateBlockState(this.canSmelt(), this.worldObj, this.xCoord, this.yCoord, this.zCoord);
			}
		}
		
		if (flag1) {
			this.markDirty();
		}
	}
}