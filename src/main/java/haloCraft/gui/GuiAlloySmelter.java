package haloCraft.gui;

import org.lwjgl.opengl.GL11;

import haloCraft.HaloCraft;
import haloCraft.container.ContainerAlloySmelter;
import haloCraft.tileEntity.TileEntityAlloySmelter;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiAlloySmelter extends GuiContainer 
{
	private ResourceLocation texture = new ResourceLocation(HaloCraft.NAME + ":" + "textures/gui/AlloySmelterGUI.png");
	private TileEntityAlloySmelter alloySmelter;
	
	public GuiAlloySmelter(InventoryPlayer invPlayer, TileEntityAlloySmelter teAlloySmelter) 
	{
		super(new ContainerAlloySmelter(invPlayer, teAlloySmelter));
		alloySmelter = teAlloySmelter;
		
		this.xSize = 176;
		this.ySize = 166;
	}
	
	protected void drawGuiContainerForegroundLayer(int i, int j)
	{
		String name = this.alloySmelter.hasCustomInventoryName() ? this.alloySmelter.getInventoryName() : I18n.format(this.alloySmelter.getInventoryName());
		
		this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory"), 8, this.ySize - 96 + 5, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) 
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
		if (alloySmelter.hasPower()) {
			int i1 = alloySmelter.getPowerRemainingScaled(45);
			drawTexturedModalRect(guiLeft + 8, guiTop + 49 - i1, 176, 36 - i1, 16, i1 + 1);
		}
		if (alloySmelter.isSmelting()) {
			int i1 = alloySmelter.getSmelterProgressScaled(26);
			drawTexturedModalRect(guiLeft + 80, guiTop + 34, 176, 36, i1 + 1, 17);
		}
	}
}