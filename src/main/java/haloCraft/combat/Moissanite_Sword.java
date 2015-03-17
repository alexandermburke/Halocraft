package haloCraft.combat;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class Moissanite_Sword extends ItemSword 
{
	public Moissanite_Sword(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Moissanite Sword");
		this.setTextureName("halo craft:Moissanite Sword");
		this.setCreativeTab(HaloCraft.tabCombat);
	}
}