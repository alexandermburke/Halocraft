package haloCraft.combat;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class Niobium_Sword extends ItemSword
{
	public Niobium_Sword(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Niobium Sword");
		this.setTextureName(HaloCraft.NAME + ":" + "Niobium Sword");
		this.setCreativeTab(HaloCraft.tabCombat);
	}
}