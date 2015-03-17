package haloCraft.blocks;

import haloCraft.HaloCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Rod extends Block 
{
	public Rod()
	{
		super(Material.iron);
		this.setResistance(15);
		this.setHardness(3);
		this.setHarvestLevel("pickaxe", 2);
		this.setBlockTextureName(HaloCraft.NAME + ":Rod");
		this.setCreativeTab(HaloCraft.tabBlocks);
		
	}
}