package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.ItemPickaxe;

public class Lithium_Pickaxe extends ItemPickaxe 
{

	public Lithium_Pickaxe(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Lithium Pickaxe");
		this.setTextureName("halo craft:Lithium Pickaxe");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}