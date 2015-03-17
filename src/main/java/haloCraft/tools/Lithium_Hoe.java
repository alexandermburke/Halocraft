package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class Lithium_Hoe extends ItemHoe 
{

	public Lithium_Hoe(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Lithium Hoe");
		this.setTextureName("halo craft:Lithium Hoe");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}