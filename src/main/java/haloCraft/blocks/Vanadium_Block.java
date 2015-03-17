package haloCraft.blocks;

import haloCraft.HaloCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Vanadium_Block extends Block 
{
	public Vanadium_Block() 
	{
		super(Material.iron);
		this.setBlockName("Vanadium Block");
		this.setBlockTextureName(HaloCraft.NAME + ":" + "Vanadium Block");
		this.setResistance(30);
		this.setHardness(5);
		this.setStepSound(soundTypeMetal);
		this.setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(HaloCraft.tabBlocks);
	}
}