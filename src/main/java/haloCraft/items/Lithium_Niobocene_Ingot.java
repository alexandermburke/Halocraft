package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.item.Item;

public class Lithium_Niobocene_Ingot extends Item 
{
	public Lithium_Niobocene_Ingot()
	{
		this.setMaxStackSize(64);
		this.setUnlocalizedName("Lithium Niobocene Ingot");
		this.setTextureName(HaloCraft.NAME + ":" + "Lithium Niobocene Ingot");
		this.setCreativeTab(HaloCraft.tabItems);
	}
}