package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.item.Item;

public class Visor extends Item 
{
	public Visor()
	{
		super();
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Visor");
		this.setTextureName(HaloCraft.NAME + ":" +"Visor");
		this.setCreativeTab(HaloCraft.tabItems);		
	}
}