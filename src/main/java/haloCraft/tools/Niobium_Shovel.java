package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class Niobium_Shovel extends ItemSpade
{

	public Niobium_Shovel(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Niobium Shovel");
		this.setTextureName(HaloCraft.NAME + ":" + "Niobium Shovel");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}