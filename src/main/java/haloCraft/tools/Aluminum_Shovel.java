package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class Aluminum_Shovel extends ItemSpade 
{

	public Aluminum_Shovel(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Aluminum Shovel");
		this.setTextureName("halo craft:Aluminum Shovel");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}