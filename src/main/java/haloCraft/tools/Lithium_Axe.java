package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class Lithium_Axe extends ItemAxe 
{

	public Lithium_Axe(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Lithium Axe");
		this.setTextureName("halo craft:Lithium Axe");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}