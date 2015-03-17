package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.item.Item;

public class Niobium_Ingot extends Item 
{
	public Niobium_Ingot()
	{
		this.setMaxStackSize(64);
		this.setUnlocalizedName("Niobium Ingot");
		this.setTextureName(HaloCraft.NAME + ":" + "Niobium Ingot");
		this.setCreativeTab(HaloCraft.tabItems);
	}
}