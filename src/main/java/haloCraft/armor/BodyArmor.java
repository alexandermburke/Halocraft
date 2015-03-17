package haloCraft.armor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import haloCraft.HaloCraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BodyArmor extends ItemArmor 
{
	public BodyArmor(ArmorMaterial material, int armorType, String name) 
	{		
		super(material, 0, armorType);
		this.setCreativeTab(HaloCraft.tabArmor);
		this.setUnlocalizedName(name);
		this.setTextureName(HaloCraft.NAME + ":" + name);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == HaloCraft.Body_Chest || stack.getItem() == HaloCraft.Body_Boots) {
			return HaloCraft.NAME + ":textures/models/armor/body_Armor1.png";
		}else if(stack.getItem() == HaloCraft.Body_Legs) {
			return HaloCraft.NAME + ":textures/models/armor/body_Armor2.png";
		}
		
		return null;
	}
}