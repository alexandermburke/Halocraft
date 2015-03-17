package haloCraft.blocks;

import haloCraft.HaloCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Vanadium_Ore extends Block 
{
	public Vanadium_Ore() 
	{
		super(Material.rock);
		this.setBlockName("Vanadium Ore");
		this.setBlockTextureName(HaloCraft.NAME + ":" + "Vanadium Ore");
		this.setResistance(15);
		this.setHardness(3);
		this.setStepSound(soundTypeStone);
		this.setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(HaloCraft.tabBlocks);
	}
}