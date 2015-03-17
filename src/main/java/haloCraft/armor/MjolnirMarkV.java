package haloCraft.armor;

import haloCraft.HaloCraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MjolnirMarkV extends ItemArmor 
{	
    private static final String[] OVERLAYS = new String[] {"halo craft:MarkV_Helmet_Overlay", "halo craft:MarkV_Chestplate_Overlay", "halo craft:MarkV_Leggings_Overlay", "halo craft:MarkV_Boots_Overlay"};
    
	@SideOnly(Side.CLIENT)
	private IIcon overlayIcon;
	
	public MjolnirMarkV(ArmorMaterial material, int armorType, String name) 
	{		
		super(material, 0, armorType);
		this.setCreativeTab(HaloCraft.tabArmor);
		this.setUnlocalizedName(name);
		this.setTextureName(HaloCraft.NAME + ":" + name);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack itemStack, int i)
	{
		if (i > 0) {
			return 16777215;
		}else{
			int j = this.getColor(itemStack);
			
			if (j < 0) {
				j = 16777215;
			}
			return j;
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public boolean requiresMultipleRenderPasses()
    {
        return this.getArmorMaterial() == HaloCraft.Mjolnir_MarkV;
    }

	@Override
	public boolean hasColor(ItemStack itemStack)
    {
        return this.getArmorMaterial() != HaloCraft.Mjolnir_MarkV ? false : (!itemStack.hasTagCompound() ? false : (!itemStack.getTagCompound().hasKey("display", 10) ? false : itemStack.getTagCompound().getCompoundTag("display").hasKey("color", 3)));
    }
	
	@Override
	public int getColor(ItemStack itemStack)
	{
		if (this.getArmorMaterial() != HaloCraft.Mjolnir_MarkV) {
			return -1;
		}else{
			NBTTagCompound nbttagcompound = itemStack.getTagCompound();
			
			if (nbttagcompound == null) {
				return 16777215;
			}else{
				NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");
				return nbttagcompound1 == null ? 16777215 : (nbttagcompound1.hasKey("color", 3) ? nbttagcompound1.getInteger("color") : 16777215);
			}
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamageForRenderPass(int i, int j)
	{
		return j == 1 ? this.overlayIcon : super.getIconFromDamageForRenderPass(i, j);
	}
	
	@Override
	public void removeColor(ItemStack itemStack)
	{
		if (this.getArmorMaterial() == HaloCraft.Mjolnir_MarkV) {
			NBTTagCompound nbttagcompound = itemStack.getTagCompound();
			
			if (nbttagcompound != null) {
				NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");
				
				if (nbttagcompound1.hasKey("color")) {
					nbttagcompound1.removeTag("color");
				}
			}
		}
	}
	
	@Override
	public void func_82813_b(ItemStack itemStack, int i)
    {
		if (this.getArmorMaterial() != HaloCraft.Mjolnir_MarkV) {
            throw new UnsupportedOperationException("Can\'t paint not MarkV!");
        }else{
            NBTTagCompound nbttagcompound = itemStack.getTagCompound();

            if (nbttagcompound == null) {
                nbttagcompound = new NBTTagCompound();
                itemStack.setTagCompound(nbttagcompound);
            }

            NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");

            if (!nbttagcompound.hasKey("display", 10)) {
                nbttagcompound.setTag("display", nbttagcompound1);
            }

            nbttagcompound1.setInteger("color", i);
        }
    }
	
	@SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister IIconRegister)
    {
        super.registerIcons(IIconRegister);

        if (this.getArmorMaterial() == HaloCraft.Mjolnir_MarkV) {
            this.overlayIcon = IIconRegister.registerIcon(OVERLAYS[this.armorType]);
        }
    }
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == HaloCraft.MjolnirV_Helm || stack.getItem() == HaloCraft.MjolnirV_Chest || stack.getItem() == HaloCraft.MjolnirV_Boots) {
			return HaloCraft.NAME + ":textures/models/armor/MarkV_Armor1.png";
		}else if(stack.getItem() == HaloCraft.MjolnirV_Legs) {
			return HaloCraft.NAME + ":textures/models/armor/MarkV_Armor2.png";
		}
		
	return null;
	}
}