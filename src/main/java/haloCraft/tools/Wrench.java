package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.Item;

public class Wrench extends Item 
{
	public Wrench() 
	{
		super();
		this.setCreativeTab(HaloCraft.tabTools);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Wrench");
		this.setTextureName(HaloCraft.NAME + ":Wrench");
		this.setMaxDamage(50);
	}
}