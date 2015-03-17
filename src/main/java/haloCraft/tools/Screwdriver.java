package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.Item;

public class Screwdriver extends Item 
{
	public Screwdriver()
	{
		super();
		this.setMaxStackSize(1);
		this.setCreativeTab(HaloCraft.tabTools);
		this.setMaxDamage(50);
		this.setUnlocalizedName("Screwdriver");
		this.setTextureName(HaloCraft.NAME + ":Screwdriver");
	}
}