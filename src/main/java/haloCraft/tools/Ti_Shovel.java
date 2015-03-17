package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class Ti_Shovel extends ItemSpade 
{

	public Ti_Shovel(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Ti Shovel");
		this.setTextureName("halo craft:Titanium Shovel");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}