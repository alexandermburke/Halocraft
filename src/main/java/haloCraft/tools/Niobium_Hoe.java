package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class Niobium_Hoe extends ItemHoe
{

	public Niobium_Hoe(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Niobium Hoe");
		this.setTextureName(HaloCraft.NAME + ":" + "Niobium Hoe");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}