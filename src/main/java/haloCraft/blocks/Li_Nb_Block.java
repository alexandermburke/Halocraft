package haloCraft.blocks;

import haloCraft.HaloCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Li_Nb_Block extends Block 
{
	public Li_Nb_Block() 
	{
		super(Material.iron);
		this.setBlockName("Lithium Niobocene Block");
		this.setBlockTextureName(HaloCraft.NAME + ":" + "Lithium Niobocene Block");
		this.setResistance(30);
		this.setHardness(5);
		this.setStepSound(soundTypeMetal);
		this.setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(HaloCraft.tabBlocks);
	}
}