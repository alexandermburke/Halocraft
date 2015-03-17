package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class Aluminum_Pickaxe extends ItemPickaxe 
{

	public Aluminum_Pickaxe(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Aluminum Pickaxe");
		this.setTextureName("halo craft:Aluminum Pickaxe");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}