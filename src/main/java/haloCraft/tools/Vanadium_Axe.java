package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class Vanadium_Axe extends ItemAxe 
{

	public Vanadium_Axe(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Vanadium Axe");
		this.setTextureName("halo craft:Vanadium Axe");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}