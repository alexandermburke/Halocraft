package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.item.Item;

public class Vanadium_Nugget extends Item 
{
	public Vanadium_Nugget()
	{
		super();
		this.setMaxStackSize(64);
		this.setCreativeTab(HaloCraft.tabItems);
		this.setUnlocalizedName("Vanadium Nugget");
		this.setTextureName(HaloCraft.NAME + ":" + "Vanadium Nugget");
	}
}