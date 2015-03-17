package haloCraft.armor;

import haloCraft.HaloCraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class TiArmor extends ItemArmor 
{
	public TiArmor(ArmorMaterial material, int armorType, String name) 
	{		
		super(material, 0, armorType);
		this.setCreativeTab(HaloCraft.tabArmor);
		this.setUnlocalizedName(name);
		this.setTextureName(HaloCraft.NAME + ":" + name);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == HaloCraft.Ti_Helmet || stack.getItem() == HaloCraft.Ti_Chest || stack.getItem() == HaloCraft.Ti_Boots) {
			return HaloCraft.NAME + ":textures/models/armor/ti_Armor1.png";
		}else if(stack.getItem() == HaloCraft.Ti_Legs) {
			return HaloCraft.NAME + ":textures/models/armor/ti_Armor2.png";
		}
		
		return null;
	}
}