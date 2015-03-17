package haloCraft.combat;

import haloCraft.HaloCraft;
import net.minecraft.item.ItemSword;

public class Ti_Sword extends ItemSword 
{
	public Ti_Sword(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Ti Sword");
		this.setTextureName("halo craft:Titanium Sword");
		this.setCreativeTab(HaloCraft.tabCombat);
	}
}