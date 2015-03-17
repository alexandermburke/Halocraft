package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class Vanadium_Pickaxe extends ItemPickaxe 
{

	public Vanadium_Pickaxe(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Vanadium Pickaxe");
		this.setTextureName("halo craft:Vanadium Pickaxe");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}