package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.item.Item;

public class Lithium_Ingot extends Item 
{
	public Lithium_Ingot()
	{
		this.setMaxStackSize(64);
		this.setUnlocalizedName("Lithium Ingot");
		this.setTextureName(HaloCraft.NAME + ":" + "Lithium Ingot");
		this.setCreativeTab(HaloCraft.tabItems);
	}
}