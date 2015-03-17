package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.item.Item;

public class Bolt extends Item 
{
	public Bolt()
	{
		super();
		this.setMaxStackSize(32);
		this.setUnlocalizedName("Bolt");
		this.setTextureName(HaloCraft.NAME + ":" + "Bolt");
		this.setCreativeTab(HaloCraft.tabItems);
	}
}