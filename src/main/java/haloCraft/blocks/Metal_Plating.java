package haloCraft.blocks;

import haloCraft.HaloCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Metal_Plating extends Block 
{
	public Metal_Plating()
	{
		super(Material.iron);
		this.setHardness(10);
		this.setResistance(35);
		this.setCreativeTab(HaloCraft.tabBlocks);
		this.setStepSound(soundTypeMetal);
		this.setHarvestLevel("pickaxe", 2);
		this.setBlockTextureName(HaloCraft.NAME + ":Metal Plating");
	}
}