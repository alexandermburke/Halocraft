package haloCraft.blocks;

import haloCraft.HaloCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Titanium_Block extends Block 
{
	public Titanium_Block() 
	{
		super(Material.rock);
		this.setBlockName("Titanium Block");
		this.setBlockTextureName(HaloCraft.NAME + ":" + "Titanium Block");
		this.setHardness(5);
		this.setResistance(30);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypeMetal);
		this.setCreativeTab(HaloCraft.tabBlocks);
	}

}