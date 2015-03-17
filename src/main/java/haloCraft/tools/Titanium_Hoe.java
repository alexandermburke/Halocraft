package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.ItemHoe;

public class Titanium_Hoe extends ItemHoe 
{

	public Titanium_Hoe(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Titanium Hoe");
		this.setTextureName("halo craft:Titanium Hoe");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}