package haloCraft.blocks;

import java.util.Random;

import haloCraft.HaloCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class Moissanite_Ore extends Block 
{
	public Moissanite_Ore() 
	{
		super(Material.rock);
		this.setBlockName("Moissanite Ore");
		this.setBlockTextureName(HaloCraft.NAME + ":" + "Moissanite Ore");
		this.setResistance(55);
		this.setHardness(5);
		this.setStepSound(soundTypeStone);
		this.setHarvestLevel("pickaxe", 2);
		this.setCreativeTab(HaloCraft.tabBlocks);
	}
	
	public void dropXpOnBlockBreak(World world, int i, int j, int k, int l)
    {
        if (!world.isRemote)
        {
            while (l > 0)
            {
                int i1 = EntityXPOrb.getXPSplit(l);
                l -= i1;
                world.spawnEntityInWorld(new EntityXPOrb(world, (double)i + 0.5D, (double)j + 0.5D, (double)k + 0.5D, i1));
            }
        }
    }
	
	public Item getItemDropped(int i, Random rand, int j)
    {
        return HaloCraft.Moissanite;
    }
	
	public int quantityDropped(Random rand)
	{
		Random drop = new Random();
		int number = rand.nextInt(6) + 1;
		return number;
	}
}