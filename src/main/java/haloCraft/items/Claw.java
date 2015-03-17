package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.item.Item;

public class Claw extends Item 
{
	public Claw()
	{
		super();
		this.setCreativeTab(HaloCraft.tabItems);
		this.setTextureName(HaloCraft.NAME + ":Claw");
		this.setUnlocalizedName("Claw");
		this.setMaxStackSize(5);
	}
}