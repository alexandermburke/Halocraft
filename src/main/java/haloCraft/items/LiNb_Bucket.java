package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.block.Block;

public class LiNb_Bucket extends net.minecraft.item.ItemBucket
{
	public LiNb_Bucket(Block block)
	{
		super(block);
		this.setUnlocalizedName("Lithium Niobocene Bucket");
		this.setTextureName(HaloCraft.NAME + ":" + "Lithium Niobocene Bucket");
		this.setCreativeTab(HaloCraft.tabItems);
	}
}