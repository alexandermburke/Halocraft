package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.block.Block;

public class Liquid_Crystal_Bucket extends net.minecraft.item.ItemBucket 
{
	public Liquid_Crystal_Bucket(Block block)
	{
		super(block);
		this.setUnlocalizedName("Liquid Crystal Bucket");
		this.setTextureName(HaloCraft.NAME + ":" + "Liquid Crystal Bucket");
		this.setCreativeTab(HaloCraft.tabItems);
	}
}