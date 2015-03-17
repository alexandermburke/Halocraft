package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class Ti_Pickaxe extends ItemPickaxe 
{

	public Ti_Pickaxe(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Ti Pickaxe");
		this.setTextureName("halo craft:Titanium Pickaxe");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}