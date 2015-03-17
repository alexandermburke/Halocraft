package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class Moissanite_Shovel extends ItemSpade 
{

	public Moissanite_Shovel(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Moissanite Shovel");
		this.setTextureName("halo craft:Moissanite Shovel");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}