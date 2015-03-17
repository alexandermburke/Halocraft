package haloCraft.blocks;

import static net.minecraftforge.common.util.ForgeDirection.EAST;
import static net.minecraftforge.common.util.ForgeDirection.NORTH;
import static net.minecraftforge.common.util.ForgeDirection.SOUTH;
import static net.minecraftforge.common.util.ForgeDirection.WEST;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import haloCraft.HaloCraft;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class Reinforced_Glass extends BlockPane 
{
	private final String field_a = "ReinforcedGlassTop";
	private final boolean drop = false;
	private final String field_M = "ReinforcedGlass";
	@SideOnly(Side.CLIENT)
	private IIcon iconTop;
	
	public Reinforced_Glass() 
	{
		super("ReinforcedGlass", "ReinforcedGlassTop", Material.glass, false);
		this.setBlockName("Reinforced Glass");
		this.setHardness(0.6F);
		this.setResistance(3F);
		this.setCreativeTab(HaloCraft.tabBlocks);
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
		return !this.drop ? null : super.getItemDropped(p_149650_1_, p_149650_2_, p_149650_3_);
	}
	
	public boolean isOpaqueCube()
    {
        return false;
    }
	
	public int getRenderType()
    {
        return this.blockMaterial == Material.glass ? 41 : 18;
    }
	
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess blockAccess, int i, int j, int x, int z)
	{
		return blockAccess.getBlock(i, j, x) == this ? false : super.shouldSideBeRendered(blockAccess, i, j, x, z);
	}
	
	public void addCollisionBoxesToList(World world, int i, int j, int x, AxisAlignedBB axis, List list, Entity entity)
    {
        boolean flag  = this.canPaneConnectTo(world, i, j, x - 1, NORTH);
        boolean flag1 = this.canPaneConnectTo(world, i, j, x + 1, SOUTH);
        boolean flag2 = this.canPaneConnectTo(world, i - 1, j, x, WEST );
        boolean flag3 = this.canPaneConnectTo(world, i + 1, j, x, EAST );

        if ((!flag2 || !flag3) && (flag2 || flag3 || flag || flag1))
        {
            if (flag2 && !flag3)
            {
                this.setBlockBounds(0.0F, 0.0F, 0.4375F, 0.5F, 1.0F, 0.5625F);
                super.addCollisionBoxesToList(world, i, j, x, axis, list, entity);
            }
            else if (!flag2 && flag3)
            {
                this.setBlockBounds(0.5F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
                super.addCollisionBoxesToList(world, i, j, x, axis, list, entity);
            }
        }
        else
        {
            this.setBlockBounds(0.0F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
            super.addCollisionBoxesToList(world, i, j, x, axis, list, entity);
        }

        if ((!flag || !flag1) && (flag2 || flag3 || flag || flag1))
        {
            if (flag && !flag1)
            {
                this.setBlockBounds(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 0.5F);
                super.addCollisionBoxesToList(world, i, j, x, axis, list, entity);
            }
            else if (!flag && flag1)
            {
                this.setBlockBounds(0.4375F, 0.0F, 0.5F, 0.5625F, 1.0F, 1.0F);
                super.addCollisionBoxesToList(world, i, j, x, axis, list, entity);
            }
        }
        else
        {
            this.setBlockBounds(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 1.0F);
            super.addCollisionBoxesToList(world, i, j, x, axis, list, entity);
        }
    }
	
	public void setBlockBoundsForItemRender()
    {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }
	
	public void setBlockBoundsBasedOnState(IBlockAccess blockAccess, int i, int j, int k)
	{
		float f = 0.4375F;
		float f1 = 0.5625F;
		float f2 = 0.4375F;
		float f3 = 0.5625F;
		boolean flag  = this.canPaneConnectTo(blockAccess, i, j, k - 1, NORTH);
		boolean flag1 = this.canPaneConnectTo(blockAccess, i, j, k + 1, SOUTH);
		boolean flag2 = this.canPaneConnectTo(blockAccess, i - 1, j, k, WEST );
		boolean flag3 = this.canPaneConnectTo(blockAccess, i + 1, j, k, EAST );

		if ((!flag2 || !flag3) && (flag2 || flag3 || flag || flag1))
		{
			if (flag2 && !flag3)
			{
				f = 0.0F;
			}
			else if (!flag2 && flag3)
			{
				f1 = 1.0F;
			}
		}
		else
		{
			f = 0.0F;
			f1 = 1.0F;
		}
		
		if ((!flag || !flag1) && (flag2 || flag3 || flag || flag1))
		{
			if (flag && !flag1)
			{
				f2 = 0.0F;
			}
			else if (!flag && flag1)
			{
				f3 = 1.0F;
			}
		}
		else
		{
			f2 = 0.0F;
			f3 = 1.0F;
		}

		this.setBlockBounds(f, 0.0F, f2, f1, 1.0F, f3);
	}

	@SideOnly(Side.CLIENT)
	public IIcon func_150097_e()
	{
		return this.iconTop;
	}
	
	protected boolean canSilkHarvest()
    {
        return true;
    }
	
	protected ItemStack createStackedBlock(int i)
    {
        return new ItemStack(Item.getItemFromBlock(this), 1, i);
    }
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister IIcon)
	{
		this.blockIcon = IIcon.registerIcon(HaloCraft.NAME + ":" + "ReinforcedGlass");
		this.iconTop = IIcon.registerIcon(HaloCraft.NAME + ":" + "ReinforcedGlassTop");
	}
	
	public boolean canPaneConnectTo(IBlockAccess world, int x, int y, int z, ForgeDirection dir)
    {
        return canPaneConnectToBlock(world.getBlock(x, y, z)) || 
                world.isSideSolid(x, y, z, dir.getOpposite(), false);
    }
}