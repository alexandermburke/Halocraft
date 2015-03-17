package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.ItemSpade;

public class Vanadium_Shovel extends ItemSpade
{

	public Vanadium_Shovel(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Vanadium Shovel");
		this.setTextureName("halo craft:Vanadium Shovel");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}