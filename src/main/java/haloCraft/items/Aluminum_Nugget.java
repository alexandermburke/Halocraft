package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.item.Item;

public class Aluminum_Nugget extends Item 
{
	public Aluminum_Nugget()
	{
		super();
		this.setMaxStackSize(64);
		this.setCreativeTab(HaloCraft.tabItems);
		this.setUnlocalizedName("Aluminum Nugget");
		this.setTextureName(HaloCraft.NAME + ":" + "Aluminum Nugget");
	}
}