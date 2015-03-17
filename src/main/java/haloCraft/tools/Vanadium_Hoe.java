package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class Vanadium_Hoe extends ItemHoe
{

	public Vanadium_Hoe(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Vanadium Hoe");
		this.setTextureName("halo craft:Vanadium Hoe");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}