package haloCraft.blocks;

import haloCraft.HaloCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class Magma_Cream_Block extends BlockFluidClassic
{
	@SideOnly(Side.CLIENT)
	private IIcon stillIcon;
	@SideOnly(Side.CLIENT)
	private IIcon flowIcon;
	
	public Magma_Cream_Block(Fluid fluid, Material material) 
	{
		super(fluid, material);
		this.setBlockName("Magma Cream");
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta)
	{
		return (side == 0 || side == 1)? stillIcon : flowIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register)
	{
		stillIcon = register.registerIcon(HaloCraft.NAME + ":Magma Cream Still");
		flowIcon = register.registerIcon(HaloCraft.NAME + ":Magma Cream Flow");
	} 

	@Override
	public boolean canDisplace(IBlockAccess world, int x, int y, int z)
	{
		if (world.getBlock(x, y, z).getMaterial().isLiquid()) return false;
		return super.canDisplace(world, x, y, z);
	}
      
	@Override
	public boolean displaceIfPossible(World world, int x, int y, int z) 
	{
		if (world.getBlock(x, y, z).getMaterial().isLiquid()) return false;
		return super.displaceIfPossible(world, x, y, z);
	}
}