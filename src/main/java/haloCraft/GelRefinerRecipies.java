package haloCraft;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GelRefinerRecipies 
{
	public GelRefinerRecipies() {}
	
	public static ItemStack GelRefinerResult(Item item, Item item2)
	{
		// Hydrostatic Gel
		if (item == Items.water_bucket && item2 == Items.bucket) {
			return new ItemStack(HaloCraft.Gel_Bucket);	
		}
		// Liquid Crystal
		if (item == HaloCraft.Moissanite && item2 == HaloCraft.LiNb_Bucket) {
			return new ItemStack(HaloCraft.Crystal_Bucket);
		}
		return null;
	}
}