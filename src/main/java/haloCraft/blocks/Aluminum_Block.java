package haloCraft.blocks;

import haloCraft.HaloCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Aluminum_Block extends Block 
{
	public Aluminum_Block() 
	{
		super(Material.iron);
		this.setBlockName("Aluminum Block");
		this.setBlockTextureName(HaloCraft.NAME + ":" + "Aluminum Block");
		this.setResistance(30);
		this.setHardness(5);
		this.setStepSound(soundTypeMetal);
		this.setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(HaloCraft.tabBlocks);
	}
}