package haloCraft.handler;

import haloCraft.HaloCraft;
import haloCraft.container.ContainerAlloySmelter;
import haloCraft.container.ContainerGelRefiner;
import haloCraft.gui.GuiAlloySmelter;
import haloCraft.gui.GuiGelRefiner;
import haloCraft.tileEntity.TileEntityAlloySmelter;
import haloCraft.tileEntity.TileEntityGelRefiner;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) 
	{
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null) {
			switch(ID) {
			case HaloCraft.guiIDAlloySmelter:
				if(entity instanceof TileEntityAlloySmelter) {
					return new ContainerAlloySmelter(player.inventory, (TileEntityAlloySmelter) entity);
				}
			case HaloCraft.guiIDGelRefiner:
				if(entity instanceof TileEntityGelRefiner) {
					return new ContainerGelRefiner(player.inventory, (TileEntityGelRefiner) entity);
				}
				return null;
			}
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) 
	{
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null) {
			switch(ID) {
			case HaloCraft.guiIDAlloySmelter:
				if (entity instanceof TileEntityAlloySmelter) {
					return new GuiAlloySmelter(player.inventory, (TileEntityAlloySmelter) entity);
				}
			case HaloCraft.guiIDGelRefiner:
				if(entity instanceof TileEntityGelRefiner) {
					return new GuiGelRefiner(player.inventory, (TileEntityGelRefiner) entity);
				}
				return null;
			}
		}
		return null;
	}
}