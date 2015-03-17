package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.item.Item;

public class Washer extends Item 
{
	public Washer()
	{
		super();
		this.setMaxStackSize(32);
		this.setCreativeTab(HaloCraft.tabItems);
		this.setUnlocalizedName("Washer");
		this.setTextureName(HaloCraft.NAME + ":" + "Washer");
	}
}