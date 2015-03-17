package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class Ti_Hoe extends ItemHoe 
{

	public Ti_Hoe(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Ti Hoe");
		this.setTextureName("halo craft:Titanium Hoe");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}