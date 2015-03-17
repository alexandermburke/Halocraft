package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class Titanium_Pickaxe extends ItemPickaxe 
{

	public Titanium_Pickaxe(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Titanium Pickaxe");
		this.setTextureName("halo craft:Titanium Pickaxe");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}