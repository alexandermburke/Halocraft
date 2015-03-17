package haloCraft.blocks;

import haloCraft.HaloCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.IIcon;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Crude_Oil_Block extends BlockFluidClassic 
{
	@SideOnly(Side.CLIENT)
	private IIcon stillIcon;
	@SideOnly(Side.CLIENT)
	private IIcon flowIcon;
	
	public Crude_Oil_Block(Fluid fluid, Material material) 
	{
		super(fluid, material);
		this.setBlockName("Crude Oil");
		this.setLightOpacity(2);
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta)
	{
		return (side == 0 || side == 1)? stillIcon : flowIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register)
	{
		stillIcon = register.registerIcon(HaloCraft.NAME + ":Crude Oil Still");
		flowIcon = register.registerIcon(HaloCraft.NAME + ":Crude Oil Flow");
	} 

	@Override
	public boolean canDisplace(IBlockAccess world, int x, int y, int z)
    {
        if (world.getBlock(x, y, z).isAir(world, x, y, z)) return true;

        Block block = world.getBlock(x, y, z);

        if (block == this) {
            return false;
        }

        if (displacements.containsKey(block)) {
            return displacements.get(block);
        }

        Material material = block.getMaterial();
        if (material.blocksMovement() || material == Material.portal) {
            return false;
        }

        int density = getDensity(world, x, y, z);
        if (density == Integer.MAX_VALUE) {
        	 return true;
        }
        
        if (this.density > density) {
        	return true;
        }else{
        	return false;
        }
    }
      
	@Override
	public boolean displaceIfPossible(World world, int x, int y, int z)
	{
		if (world.getBlock(x, y, z).isAir(world, x, y, z)) {
            return true;
        }

        Block block = world.getBlock(x, y, z);
        if (block == this) {
            return false;
        }

        if (displacements.containsKey(block)) {
            if (displacements.get(block)) {
                block.dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
                return true;
            }
            return false;
        }

        Material material = block.getMaterial();
        if (material.blocksMovement() || material == Material.portal) {
            return false;
        }

        int density = getDensity(world, x, y, z);
        if (density == Integer.MAX_VALUE)  {
        	 block.dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
        	 return true;
        }
        
        if (this.density > density) {
        	return true;
        }else{
        	return false;
        }
    }
	
	@Override
	public void velocityToAddToEntity(World world, int x, int y, int z, Entity entity, Vec3 par6)
	{
		Vec3 vec31 = this.getFlowVector(world, x, y, z);
		par6.xCoord += vec31.xCoord;
		par6.yCoord += vec31.yCoord;
		par6.zCoord += vec31.zCoord;
	}
}