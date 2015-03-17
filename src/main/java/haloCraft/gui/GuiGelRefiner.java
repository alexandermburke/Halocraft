package haloCraft.gui;

import haloCraft.HaloCraft;
import haloCraft.container.ContainerGelRefiner;
import haloCraft.tileEntity.TileEntityAlloySmelter;
import haloCraft.tileEntity.TileEntityGelRefiner;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class GuiGelRefiner extends GuiContainer 
{
	private ResourceLocation texture = new ResourceLocation(HaloCraft.NAME + ":" + "textures/gui/GelRefinerGUI.png");
	private TileEntityGelRefiner gelRefiner;
	
	public GuiGelRefiner(InventoryPlayer invPlayer, TileEntityGelRefiner teGelRefiner) 
	{
		super(new ContainerGelRefiner(invPlayer, teGelRefiner));
		gelRefiner = teGelRefiner;
		
		this.xSize = 176;
		this.ySize = 166;
	}
	
	protected void drawGuiContainerForegroundLayer(int i, int j)
	{
		String name = this.gelRefiner.hasCustomInventoryName() ? this.gelRefiner.getInventoryName() : I18n.format(this.gelRefiner.getInventoryName());
		
		this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory"), 8, this.ySize - 96 + 5, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) 
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
		if (gelRefiner.hasMaterial()) {
			int i1 = gelRefiner.getTankLevelScaled(36);
			drawTexturedModalRect(guiLeft + 8, guiTop + 49 - i1, 176, 36 - i1, 16, i1 + 1);
		}
		if (gelRefiner.isRefining()) {
			int i1 = gelRefiner.getRefinerProgressScaled(67);
			drawTexturedModalRect(guiLeft + 37, guiTop + 20, 176, 36, i1 + 1, 67);
		}
	}
}