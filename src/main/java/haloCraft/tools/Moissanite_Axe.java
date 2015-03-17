package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class Moissanite_Axe extends ItemAxe 
{

	public Moissanite_Axe(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Moissanite Axe");
		this.setTextureName("halo craft:Moissanite Axe");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}