package haloCraft.combat;

import haloCraft.HaloCraft;
import net.minecraft.item.ItemSword;

public class Titanium_Sword extends ItemSword 
{
	public Titanium_Sword(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Titanium Sword");
		this.setTextureName("halo craft:Titanium Sword");
		this.setCreativeTab(HaloCraft.tabCombat);
	}
}