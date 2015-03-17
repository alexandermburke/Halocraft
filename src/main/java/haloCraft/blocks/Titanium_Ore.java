package haloCraft.blocks;

import haloCraft.HaloCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Titanium_Ore extends Block 
{
	public Titanium_Ore() 
	{
		super(Material.rock);
		this.setBlockName("Titanium Ore");
		this.setBlockTextureName(HaloCraft.NAME + ":" + "Titanium Ore");
		this.setHardness(3);
		this.setResistance(15);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(HaloCraft.tabBlocks);
	}
}