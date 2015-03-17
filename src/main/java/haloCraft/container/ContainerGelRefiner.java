package haloCraft.container;

import haloCraft.slot.SlotGelRefiner;
import haloCraft.tileEntity.TileEntityGelRefiner;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.tileentity.TileEntityFurnace;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ContainerGelRefiner extends Container 
{
	private TileEntityGelRefiner refiner;
	private int refineTime;
	private int tankLevel;
	private int lastItemBurnTime;
	
	public ContainerGelRefiner(InventoryPlayer invPlayer, TileEntityGelRefiner teGelRefiner) 
	{
		refineTime = 0;
		tankLevel = 0;
		lastItemBurnTime = 0;
		
		refiner = teGelRefiner;
		
		this.addSlotToContainer(new Slot(teGelRefiner, 0, 8, 52));
		this.addSlotToContainer(new Slot(teGelRefiner, 1, 87, 52));
		this.addSlotToContainer(new SlotGelRefiner(invPlayer.player, teGelRefiner, 2, 116, 35));
		
		//Inventory
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 9; j++) {
				this.addSlotToContainer(new Slot(invPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}
		
		//ActionBar
		for(int i = 0; i < 9; i++) {
			this.addSlotToContainer(new Slot(invPlayer, i, 8 + i * 18, 142));
		}
	}
	
	public void addCraftingToCrafters (ICrafting crafting)
	{
		super.addCraftingToCrafters(crafting);
		crafting.sendProgressBarUpdate(this, 0, this.refiner.refineTime);
		crafting.sendProgressBarUpdate(this, 1, this.refiner.tankLevel);
	}
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer p_82846_1_, int p_82846_2_)
    {
		ItemStack itemstack = null;
		Slot slot = (Slot)this.inventorySlots.get(p_82846_2_);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (p_82846_2_ == 2)
            {
                if (!this.mergeItemStack(itemstack1, 3, 39, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (p_82846_2_ != 1 && p_82846_2_ != 0)
            {
                if (FurnaceRecipes.smelting().getSmeltingResult(itemstack1) != null)
                {
                    if (!this.mergeItemStack(itemstack1, 0, 1, false))
                    {
                        return null;
                    }
                }
                else if (TileEntityFurnace.isItemFuel(itemstack1))
                {
                    if (!this.mergeItemStack(itemstack1, 1, 2, false))
                    {
                        return null;
                    }
                }
                else if (p_82846_2_ >= 3 && p_82846_2_ < 30)
                {
                    if (!this.mergeItemStack(itemstack1, 30, 39, false))
                    {
                        return null;
                    }
                }
                else if (p_82846_2_ >= 30 && p_82846_2_ < 39 && !this.mergeItemStack(itemstack1, 3, 30, false))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 3, 39, false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize)
            {
                return null;
            }

            slot.onPickupFromSlot(p_82846_1_, itemstack1);
        }

        return itemstack;
    }

	@Override
	public boolean canInteractWith(EntityPlayer player) 
	{
		return refiner.isUseableByPlayer(player);
	}

	public void detectAndSendChanges() 
	{
		super.detectAndSendChanges();
		
		for (int i = 0; i < this.crafters.size(); i++) {
			ICrafting icrafting = (ICrafting)this.crafters.get(i);
			
			if (this.refineTime != refiner.refineTime) {
				icrafting.sendProgressBarUpdate(this, 0, this.refiner.refineTime);
			}
			if (this.tankLevel != refiner.tankLevel) {
				icrafting.sendProgressBarUpdate(this, 1, this.refiner.tankLevel);
			}
		}
		
		this.refineTime = this.refiner.refineTime;
		this.tankLevel = this.refiner.tankLevel;
	}
	
	@SideOnly(Side.CLIENT)
    public void updateProgressBar(int i, int j)
    {
		if (i == 0) {
			refiner.refineTime = j;
		}
		if (i == 1) {
			refiner.tankLevel = j;
		}
    }
}