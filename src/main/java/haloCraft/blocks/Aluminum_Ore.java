package haloCraft.blocks;

import haloCraft.HaloCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Aluminum_Ore extends Block 
{
	public Aluminum_Ore() 
	{
		super(Material.rock);
		this.setBlockName("Aluminum Ore");
		this.setBlockTextureName(HaloCraft.NAME + ":" +"Aluminum Ore");
		this.setResistance(15);
		this.setHardness(3);
		this.setStepSound(soundTypeStone);
		this.setHarvestLevel("pickaxe", 1);
		this.setCreativeTab(HaloCraft.tabBlocks);
	}
}