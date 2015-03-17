package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.item.Item;

public class Screw extends Item
{
	public Screw()
	{
		super();
		this.setMaxStackSize(32);
		this.setCreativeTab(HaloCraft.tabItems);
		this.setUnlocalizedName("Screw");
		this.setTextureName(HaloCraft.NAME + ":" + "Screw");
	}
}