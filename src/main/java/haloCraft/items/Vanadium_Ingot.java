package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.item.Item;

public class Vanadium_Ingot extends Item 
{
	public Vanadium_Ingot()
	{
		this.setMaxStackSize(64);
		this.setUnlocalizedName("Vanadium Ingot");
		this.setTextureName(HaloCraft.NAME + ":" +"Vanadium Ingot");
		this.setCreativeTab(HaloCraft.tabItems);
	}
}