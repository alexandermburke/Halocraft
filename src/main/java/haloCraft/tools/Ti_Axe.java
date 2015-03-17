package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class Ti_Axe extends ItemAxe 
{

	public Ti_Axe(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Ti Axe");
		this.setTextureName("halo craft:Titanium Axe");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}