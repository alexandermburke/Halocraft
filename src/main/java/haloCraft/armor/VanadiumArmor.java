package haloCraft.armor;

import haloCraft.HaloCraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class VanadiumArmor extends ItemArmor 
{
	public VanadiumArmor(ArmorMaterial material, int armorType, String name) 
	{		
		super(material, 0, armorType);
		this.setCreativeTab(HaloCraft.tabArmor);
		this.setUnlocalizedName(name);
		this.setTextureName(HaloCraft.NAME + ":" + name);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == HaloCraft.Vanadium_Helmet || stack.getItem() == HaloCraft.Vanadium_Chest || stack.getItem() == HaloCraft.Vanadium_Boots) {
			return HaloCraft.NAME + ":textures/models/armor/vanadium_Armor1.png";
		}else if(stack.getItem() == HaloCraft.Vanadium_Legs) {
			return HaloCraft.NAME + ":textures/models/armor/vanadium_Armor2.png";
		}
		
		return null;
	}
}