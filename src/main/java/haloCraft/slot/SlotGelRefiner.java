package haloCraft.slot;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class SlotGelRefiner extends Slot 
{
	public SlotGelRefiner(EntityPlayer player, IInventory iiventory, int i, int j, int k) 
	{
		super(iiventory, i, j, k);
	}
}