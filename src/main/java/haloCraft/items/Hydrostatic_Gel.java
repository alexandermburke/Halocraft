package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.block.Block;

public class Hydrostatic_Gel extends net.minecraft.item.ItemBucket 
{
	public Hydrostatic_Gel(Block block)
	{
		super(block);
		this.setUnlocalizedName("Hydrostatic Gel Bucket");
		this.setTextureName(HaloCraft.NAME + ":" + "Hydrostatic Gel");
		this.setCreativeTab(HaloCraft.tabItems);
	}
}