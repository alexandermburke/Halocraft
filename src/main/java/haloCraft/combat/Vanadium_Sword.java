package haloCraft.combat;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class Vanadium_Sword extends ItemSword 
{
	public Vanadium_Sword(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Vanadium Sword");
		this.setTextureName("halo craft:Vanadium Sword");
		this.setCreativeTab(HaloCraft.tabCombat);
	}
}