package haloCraft.tools;

import haloCraft.HaloCraft;
import net.minecraft.item.ItemPickaxe;

public class Moissanite_Pickaxe extends ItemPickaxe 
{

	public Moissanite_Pickaxe(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Moissanite Pickaxe");
		this.setTextureName("halo craft:Moissanite Pickaxe");
		this.setCreativeTab(HaloCraft.tabTools);
	}
}