package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class Titanium_Shovel extends ItemSpade 
{

	public Titanium_Shovel(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Titanium Shovel");
		this.setTextureName("halo craft:Titanium Shovel");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}