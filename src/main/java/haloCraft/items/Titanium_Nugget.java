package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.item.Item;

public class Titanium_Nugget extends Item 
{
	public Titanium_Nugget()
	{
		super();
		this.setMaxStackSize(64);
		this.setCreativeTab(HaloCraft.tabItems);
		this.setUnlocalizedName("Titanium Nugget");
		this.setTextureName(HaloCraft.NAME + ":" + "Titanium Nugget");
	}
}