package haloCraft.combat;

import haloCraft.HaloCraft;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class Aluminum_Sword extends ItemSword
{

	public Aluminum_Sword(ToolMaterial material) 
	{
		super(material);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Aluminum Sword");
		this.setTextureName("halo craft:Aluminum Sword");
		this.setCreativeTab(HaloCraft.tabCombat);
	}
}