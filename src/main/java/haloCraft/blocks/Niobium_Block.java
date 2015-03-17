package haloCraft.blocks;

import haloCraft.HaloCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Niobium_Block extends Block 
{
	public Niobium_Block() 
	{
		super(Material.iron);
		this.setBlockName("Niobium Block");
		this.setBlockTextureName(HaloCraft.NAME + ":" + "Niobium Block");
		this.setResistance(30);
		this.setHardness(5);
		this.setStepSound(soundTypeMetal);
		this.setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(HaloCraft.tabBlocks);
	}
}