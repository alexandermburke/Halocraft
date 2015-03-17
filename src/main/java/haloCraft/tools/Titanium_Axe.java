package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class Titanium_Axe extends ItemAxe 
{

	public Titanium_Axe(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Titanium Axe");
		this.setTextureName("halo craft:Titanium Axe");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}