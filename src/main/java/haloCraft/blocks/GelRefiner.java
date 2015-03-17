package haloCraft.blocks;

import haloCraft.HaloCraft;
import haloCraft.tileEntity.TileEntityAlloySmelter;
import haloCraft.tileEntity.TileEntityGelRefiner;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
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

public class GelRefiner extends BlockContainer
{
	private Random rand;
	private boolean isActive;
	private static boolean keepInventory = false;
	
	@SideOnly(Side.CLIENT)
	private IIcon iconFront;
	
	@SideOnly(Side.CLIENT)
	private IIcon iconTop;
	
	@SideOnly(Side.CLIENT)
	private IIcon iconBot;
	
	public GelRefiner(boolean blockState) 
	{
		super(Material.iron);
		this.setHardness(3.5F);
		this.setStepSound(soundTypeMetal);
		this.setHarvestLevel("pickaxe", 0);
		this.setResistance(17.5F);
		rand = new Random();
		isActive = blockState;
	}
	
	public Item getItemDropped(int i, Random rand, int j)
	{
		return Item.getItemFromBlock(HaloCraft.GelRefinerIdle);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		this.blockIcon = iconRegister.registerIcon(HaloCraft.NAME + ":" + "GelRefinerSide");
		this.iconFront = iconRegister.registerIcon(HaloCraft.NAME + ":" + (this.isActive ? "GelRefinerOn" : "GelRefinerOff"));
		this.iconTop = iconRegister.registerIcon(HaloCraft.NAME + ":" + "GelRefinerTop");
		this.iconBot = iconRegister.registerIcon(HaloCraft.NAME + ":" + "GelRefinerBot");
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata)
	{
		return metadata == 0 && side == 3 ? this.iconFront : side == 1 ? this.iconTop : (side == 0 ? this.iconBot : (side == metadata ? this.iconFront : this.blockIcon));
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
		TileEntityGelRefiner entity = (TileEntityGelRefiner) world.getTileEntity(x, y, z);
		ItemStack itemStack = player.inventory.getCurrentItem();
		
		if (world.isRemote) {
			return true;
		}else if (!player.isSneaking()) {	
			if (itemStack != null) {
				if (itemStack.getItem() == Items.magma_cream || itemStack.getItem() == HaloCraft.Magma_Bucket) {
					entity.addToTank(itemStack.getItem(), player);
					if (itemStack.getItem() == HaloCraft.Magma_Bucket) {
						if (!player.capabilities.isCreativeMode) { 
                        player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack(Items.bucket));
						}
					}
					return true;
				}
			} 
			if (entity != null) {
				FMLNetworkHandler.openGui(player, HaloCraft.instance, HaloCraft.guiIDGelRefiner, world, x, y, z);
			} 
		}
		return true;
	}

	
	@Override
	public TileEntity createNewTileEntity(World world, int i) 
	{
		return new TileEntityGelRefiner();
	}

	public static void updateBlockState(boolean canRefine, World world, int xCoord, int yCoord, int zCoord) 
	{
		int i = world.getBlockMetadata(xCoord, yCoord, zCoord);
		TileEntity entity = world.getTileEntity(xCoord, yCoord, zCoord);
		keepInventory = true;
		
		if (canRefine) {
			world.setBlock(xCoord, yCoord, zCoord, HaloCraft.GelRefinerActive);
			
		}else{
			world.setBlock(xCoord, yCoord, zCoord, HaloCraft.GelRefinerIdle);
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
}