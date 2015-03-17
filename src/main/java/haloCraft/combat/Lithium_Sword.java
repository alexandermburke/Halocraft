package haloCraft.combat;

import haloCraft.HaloCraft;
import net.minecraft.item.ItemSword;

public class Lithium_Sword extends ItemSword 
{

	public Lithium_Sword(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Lithium Sword");
		this.setTextureName(HaloCraft.NAME + ":" + "Lithium Sword");
		this.setCreativeTab(HaloCraft.tabCombat);
	}
}