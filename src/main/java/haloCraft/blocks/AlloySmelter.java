package haloCraft.blocks;

import haloCraft.HaloCraft;
import haloCraft.tileEntity.TileEntityAlloySmelter;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class AlloySmelter extends BlockContainer
{
	private Random rand; 
	private boolean isActive;
	private static boolean keepInventory = false;
	
	@SideOnly(Side.CLIENT)
	private IIcon iconFront;
	
	@SideOnly(Side.CLIENT)
	private IIcon iconTop;
	
	public AlloySmelter(boolean blockState) 
	{
		super(Material.rock);
		this.setHardness(3.5F);
		this.setStepSound(soundTypeStone);
		this.setHarvestLevel("pickaxe", 0);
		this.setResistance(17.5F);
		rand = new Random();
		isActive = blockState;
	}
	
	public int getLightValue(IBlockAccess world,int  x,int y,int z){
		TileEntityAlloySmelter entity = (TileEntityAlloySmelter) world.getTileEntity(x, y, z);
    	if (entity !=null) {
        	if (this.isActive) {
        		return 13;
        	}
    	}
    	return 0;
    }
 
    private TileEntityAlloySmelter getTileEntityaround(IBlockAccess world,int  x,int y,int z)
    {
    	TileEntity entity1[] = {
    			world.getTileEntity(x, y, z),
    			world.getTileEntity(x + 1, y, z),
    			world.getTileEntity(x - 1, y, z),
    			world.getTileEntity(x, y + 1, z),
    			world.getTileEntity(x, y - 1, z),
    			world.getTileEntity(x, y, z + 1),
    			world.getTileEntity(x, y, z - 1)
    			};
    	byte i = 0;
    	
    	while(i < entity1.length) {
        	if ((entity1[i] != null) && (entity1[i] instanceof TileEntityAlloySmelter)) {
        		return (TileEntityAlloySmelter) entity1[i];
        	}
        	i++;
    	}
    	return null;
    }
	
	public Item getItemDropped(int i, Random rand, int j)
	{
		return Item.getItemFromBlock(HaloCraft.AlloySmelterIdle);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		this.blockIcon = iconRegister.registerIcon(HaloCraft.NAME + ":" + "AlloySmelterSide");
		this.iconFront = iconRegister.registerIcon(HaloCraft.NAME + ":" + (this.isActive ? "AlloySmelterOn" : "AlloySmelterOff"));
		this.iconTop = iconRegister.registerIcon(HaloCraft.NAME + ":" + "AlloySmelterTop");
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata)
	{
		return metadata == 0 && side == 3 ? this.iconFront : side == 1 ? this.iconTop : (side == 0 ? this.iconTop : (side == metadata ? this.iconFront : this.blockIcon));
	}
	
	public void onBlockAdded(World world, int x, int y, int z)
	{
		super.onBlockAdded(world, x, y, z);
		this.setDefaultDirection(world, x, y, z);
	}

	private void setDefaultDirection(World world, int x, int y, int z)
	{
		if(!world.isRemote) {
			Block block1 = world.getBlock(x, y, z - 1);
			Block block2 = world.getBlock(x, y, z + 1);
			Block block3 = world.getBlock(x - 1, y, z);
			Block block4 = world.getBlock(x + 1, y, z);
		
			byte b0 = 3;
			
			if(block1.func_149730_j() && !block2.func_149730_j()) {
				b0 = 3;
			}
			if(block2.func_149730_j() && !block1.func_149730_j()) {
				b0 = 2;
			}
			if(block3.func_149730_j() && !block4.func_149730_j()) {
				b0 = 5;
			}
			if(block4.func_149730_j() && !block3.func_149730_j()) {
				b0 = 4;
			}
			
			world.setBlockMetadataWithNotify(x, y, z, b0, 2);
		}
	}
	
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack itemStack)
	{
		int i = MathHelper.floor_double((double)(player.rotationYaw * 4.0F / 360F) + 0.5D) & 3;
		
		if (i == 0) {
			world.setBlockMetadataWithNotify(x, y, z, 2, 2);
		}
		if (i == 1) {
			world.setBlockMetadataWithNotify(x, y, z, 5, 2);
		}
		if (i == 2) {
			world.setBlockMetadataWithNotify(x, y, z, 3, 2);
		}
		if (i == 3) {
			world.setBlockMetadataWithNotify(x, y, z, 4, 2);
		}
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
	{
		if (world.isRemote) {
			return true;
		}else if (!player.isSneaking()) {
			TileEntityAlloySmelter entity = (TileEntityAlloySmelter) world.getTileEntity(x, y, z);
			if (entity != null) {
				FMLNetworkHandler.openGui(player, HaloCraft.instance, HaloCraft.guiIDAlloySmelter, world, x, y, z);
			}
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int i) 
	{
		return new TileEntityAlloySmelter();
	}

	public static void updateBlockState(boolean canSmelt, World world, int xCoord, int yCoord, int zCoord) 
	{
		int i = world.getBlockMetadata(xCoord, yCoord, zCoord);
		TileEntity entity = world.getTileEntity(xCoord, yCoord, zCoord);
		keepInventory = true;
		
		if (canSmelt) {
			world.setBlock(xCoord, yCoord, zCoord, HaloCraft.AlloySmelterActive);
			
		}else{
			world.setBlock(xCoord, yCoord, zCoord, HaloCraft.AlloySmelterIdle);
		}
		
		keepInventory = false;
		world.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, i, 2);		
		if (entity != null) {
			entity.validate();
			world.setTileEntity(xCoord, yCoord, zCoord, entity);
		}
	}
	
	public boolean hasComparatorInputOverride()
	{
		return true;
	}
	
	public int getComparatorInputOverride(World world, int i, int j, int k, int l)
	{
		return Container.calcRedstoneFromInventory((IInventory)world.getTileEntity(i, j, k));
	}
	  
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int x, int y, int z, Random rand)
	{
		if (this.isActive)
		{
			int l = world.getBlockMetadata(x, y, z);
			float f = (float)x + 0.5F;
			float f1 = (float)y + 0.0F + rand.nextFloat() * 6.0F / 16.0F;
			float f2 = (float)z + 0.5F;
			float f3 = 0.52F;
			float f4 = rand.nextFloat() * 0.6F - 0.3F;
			
			if (l == 4)
			{
				world.spawnParticle("smoke", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
				world.spawnParticle("flame", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
			}
			else if (l == 5)
			{
				world.spawnParticle("smoke", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
				world.spawnParticle("flame", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
			}
			else if (l == 2)
			{
				world.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
				world.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
			}
			else if (l == 3)
			{
				world.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
				world.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
			}
		}
	}
}