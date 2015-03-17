package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class Aluminum_Axe extends ItemAxe 
{

	public Aluminum_Axe(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Aluminum Axe");
		this.setTextureName("halo craft:Aluminum Axe");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}