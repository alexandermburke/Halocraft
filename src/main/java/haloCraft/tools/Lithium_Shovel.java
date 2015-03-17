package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class Lithium_Shovel extends ItemSpade 
{

	public Lithium_Shovel(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Lithium Shovel");
		this.setTextureName("halo craft:Lithium Shovel");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}