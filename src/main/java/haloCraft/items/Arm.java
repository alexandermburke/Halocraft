package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.item.Item;

public class Arm extends Item 
{	
	public Arm()
	{
		super();
		this.setTextureName(HaloCraft.NAME + ":Arm");
		this.setCreativeTab(HaloCraft.tabItems);
		this.setMaxStackSize(10);
		this.setUnlocalizedName("Arm");
	}
}