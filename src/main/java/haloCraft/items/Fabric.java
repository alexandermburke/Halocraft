package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.item.Item;

public class Fabric extends Item 
{
	public Fabric()
	{
		super();
		this.setMaxStackSize(64);
		this.setUnlocalizedName("Fabric");
		this.setTextureName(HaloCraft.NAME + ":" +"Fabric");
		this.setCreativeTab(HaloCraft.tabItems);		
	}
}