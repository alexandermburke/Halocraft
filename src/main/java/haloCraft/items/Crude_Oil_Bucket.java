package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.block.Block;

public class Crude_Oil_Bucket extends net.minecraft.item.ItemBucket
{
	public Crude_Oil_Bucket(Block block)
	{
		super(block);
		this.setUnlocalizedName("Crude Oil Bucket");
		this.setCreativeTab(HaloCraft.tabItems);
		this.setTextureName(HaloCraft.NAME + ":" + "Crude Oil Bucket");
	}

}