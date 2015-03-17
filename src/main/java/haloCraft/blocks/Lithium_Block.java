package haloCraft.blocks;

import haloCraft.HaloCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Lithium_Block extends Block 
{
	public Lithium_Block() 
	{
		super(Material.iron);
		this.setBlockName("Lithium Block");
		this.setBlockTextureName(HaloCraft.NAME + ":" + "Lithium Block");
		this.setResistance(30);
		this.setHardness(5);
		this.setStepSound(soundTypeMetal);
		this.setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(HaloCraft.tabBlocks);
	}
}