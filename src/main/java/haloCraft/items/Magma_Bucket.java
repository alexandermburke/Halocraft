package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.block.Block;
import net.minecraft.init.Items;

public class Magma_Bucket extends net.minecraft.item.ItemBucket
{
	public Magma_Bucket(Block block)
	{
		super(block);
		this.setUnlocalizedName("Magma Cream Bucket");
		this.setTextureName(HaloCraft.NAME + ":" + "Magma Cream Bucket");
		this.setCreativeTab(HaloCraft.tabItems);
	}
}