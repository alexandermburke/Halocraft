package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class Aluminum_Hoe extends ItemHoe 
{

	public Aluminum_Hoe(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Aluminum Hoe");
		this.setTextureName("halo craft:Aluminum Hoe");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}