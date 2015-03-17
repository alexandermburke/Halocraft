package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.item.Item;

public class Aluminum_Ingot extends Item 
{
	public Aluminum_Ingot()
	{
		this.setMaxStackSize(64);
		this.setUnlocalizedName("Aluminum Ingot");
		this.setTextureName(HaloCraft.NAME + ":" + "Aluminum Ingot");
		this.setCreativeTab(HaloCraft.tabItems);
	}
}