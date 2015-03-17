package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.item.Item;

public class Moissanite extends Item 
{
	public Moissanite()
	{
		this.setMaxStackSize(64);
		this.setUnlocalizedName("Moissanite");
		this.setTextureName(HaloCraft.NAME + ":" + "Moissanite");
		this.setCreativeTab(HaloCraft.tabItems);
	}
}