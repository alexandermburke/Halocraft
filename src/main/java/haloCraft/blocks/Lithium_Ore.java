package haloCraft.blocks;

import haloCraft.HaloCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Lithium_Ore extends Block 
{
	public Lithium_Ore() 
	{
		super(Material.rock);
		this.setBlockName("Lithium Ore");
		this.setBlockTextureName(HaloCraft.NAME + ":" + "Lithium Ore");
		this.setResistance(15);
		this.setHardness(3);
		this.setStepSound(soundTypeStone);
		this.setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(HaloCraft.tabBlocks);
	}
}