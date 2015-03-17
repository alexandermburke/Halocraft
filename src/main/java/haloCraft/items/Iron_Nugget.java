package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.item.Item;

public class Iron_Nugget extends Item 
{
	public Iron_Nugget()
	{
		this.setMaxStackSize(64);
		this.setUnlocalizedName("Iron Nugget");
		this.setTextureName(HaloCraft.NAME + ":" + "Iron Nugget");
		this.setCreativeTab(HaloCraft.tabItems);
	}
}