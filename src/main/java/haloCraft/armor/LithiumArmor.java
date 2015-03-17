package haloCraft.armor;

import haloCraft.HaloCraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class LithiumArmor extends ItemArmor
{
	public LithiumArmor(ArmorMaterial material, int armorType, String name) 
	{
		super(material, 0, armorType);
		this.setCreativeTab(HaloCraft.tabArmor);
		this.setUnlocalizedName(name);
		this.setTextureName(HaloCraft.NAME + ":" + name);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == HaloCraft.Lithium_Helmet || stack.getItem() == HaloCraft.Lithium_Legs || stack.getItem() == HaloCraft.Lithium_Boots) {
			return HaloCraft.NAME + ":textures/models/armor/lithium_Armor1.png";
		}else if(stack.getItem() == HaloCraft.Lithium_Legs) {
			return HaloCraft.NAME + ":textures/models/armor/lithium_Armor2.png";
		}
		
		return null;
	}
}