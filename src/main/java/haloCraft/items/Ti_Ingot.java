package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.item.Item;

public class Ti_Ingot extends Item 
{
	public Ti_Ingot()
	{
		super();
		this.setMaxStackSize(64);
		this.setUnlocalizedName("Ti Ingot");
		this.setTextureName(HaloCraft.NAME + ":" +"Heat Ingot");
		this.setCreativeTab(HaloCraft.tabItems);		
	}
}