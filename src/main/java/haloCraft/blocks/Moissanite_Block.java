package haloCraft.blocks;

import haloCraft.HaloCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Moissanite_Block extends Block 
{
	public Moissanite_Block() 
	{
		super(Material.iron);
		this.setBlockName("Moissanite Block");
		this.setBlockTextureName(HaloCraft.NAME + ":" + "Moissanite Block");
		this.setResistance(70);
		this.setHardness(5);
		this.setStepSound(soundTypeMetal);
		this.setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(HaloCraft.tabBlocks);
	}
}