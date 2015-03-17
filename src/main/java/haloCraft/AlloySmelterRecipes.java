package haloCraft;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AlloySmelterRecipes 
{
	public AlloySmelterRecipes()
	{
		
	}
	
	public static ItemStack AlloySmelterResult(Item item, Item item2)
	{
		// Ti_Ingot
		if (item == HaloCraft.Grade5 && item2 == HaloCraft.Titanium_Ingot ||
				item == HaloCraft.Titanium_Ingot && item2 == HaloCraft.Grade5) {
			return new ItemStack(HaloCraft.Ti_Ingot);	
		}
		// Lithium Niobocene
		if (item == HaloCraft.Lithium_Ingot && item2 == HaloCraft.Niobium_Ingot ||
				item == HaloCraft.Niobium_Ingot && item2 == HaloCraft.Lithium_Ingot) {
			return new ItemStack(HaloCraft.Lithium_Niobocene_Ingot, 2);
		}
		// Lithium Niobocene Bucket
		if (item == HaloCraft.Lithium_Niobocene_Ingot && item2 == Items.bucket ||
				item == Items.bucket && item2 == HaloCraft.Lithium_Niobocene_Ingot) {
			return new ItemStack(HaloCraft.LiNb_Bucket);
		}
		// Reinforced Glass
		if (item == Item.getItemFromBlock(Blocks.glass_pane) && item2 == HaloCraft.Grade5 ||
				item == HaloCraft.Grade5 && item2 == Item.getItemFromBlock(Blocks.glass_pane)) {
			return new ItemStack(HaloCraft.Reinforced_Glass, 16);
		}
		return null;
	}
}