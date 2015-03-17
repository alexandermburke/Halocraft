package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.item.Item;

public class Titanium_Ingot extends Item 
{
	public Titanium_Ingot()
	{
		this.setMaxStackSize(64);
		this.setUnlocalizedName("Titanium Ingot");
		this.setTextureName(HaloCraft.NAME + ":" + "Titanium Ingot");
		this.setCreativeTab(HaloCraft.tabItems);
	}
}