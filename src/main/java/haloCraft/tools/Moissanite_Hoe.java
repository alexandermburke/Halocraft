package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class Moissanite_Hoe extends ItemHoe 
{

	public Moissanite_Hoe(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Moissanite Hoe");
		this.setTextureName("halo craft:Moissanite Hoe");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}