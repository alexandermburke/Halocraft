package haloCraft.blocks;

import haloCraft.HaloCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Ti_Block extends Block 
{
	public Ti_Block()
	{
		super(Material.iron);
		this.setBlockName("Ti6Al4V Block");
		this.setBlockTextureName(HaloCraft.NAME + ":" + "Ti6Al4V Block");
		this.setResistance(30);
		this.setHardness(5);
		this.setStepSound(soundTypeMetal);
		this.setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(HaloCraft.tabBlocks);
	}
}