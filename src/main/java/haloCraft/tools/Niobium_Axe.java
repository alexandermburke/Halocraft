package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.ItemAxe;

public class Niobium_Axe extends ItemAxe
{

	public Niobium_Axe(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Niobium Axe");
		this.setTextureName(HaloCraft.NAME + ":" + "Niobium Axe");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}