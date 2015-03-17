package haloCraft.blocks;

import haloCraft.HaloCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Cross_Beam extends Block 
{
	public Cross_Beam()
	{
		super(Material.iron);
		this.setBlockTextureName(HaloCraft.NAME + ":Cross Beam");
		this.setCreativeTab(HaloCraft.tabBlocks);
		this.setResistance(15);
		this.setHardness(5);
		this.setHarvestLevel("pickaxe", 2);
	}
}