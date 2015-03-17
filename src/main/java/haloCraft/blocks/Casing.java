package haloCraft.blocks;

import haloCraft.HaloCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Casing extends Block 
{
	public Casing()
	{
		super(Material.iron);
		this.setCreativeTab(HaloCraft.tabBlocks);
		this.setHardness(5);
		this.setResistance(15);
		this.setHarvestLevel("pickaxe", 2);
		this.setBlockTextureName(HaloCraft.NAME + ":Casing");
	}
}