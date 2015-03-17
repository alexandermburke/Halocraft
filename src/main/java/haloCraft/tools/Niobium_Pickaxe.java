package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.ItemPickaxe;

public class Niobium_Pickaxe extends ItemPickaxe
{

	public Niobium_Pickaxe(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Niobium Pickaxe");
		this.setTextureName(HaloCraft.NAME + ":" + "Niobium Pickaxe");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}