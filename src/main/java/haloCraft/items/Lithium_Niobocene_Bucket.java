package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class Lithium_Niobocene_Bucket extends Item 
{
	public Lithium_Niobocene_Bucket()
	{
		this.setMaxStackSize(1);
		this.setContainerItem(Items.bucket);
		this.setUnlocalizedName("Lithium Niobocene Bucket");
		this.setTextureName(HaloCraft.NAME + ":" + "Lithium Niobocene Bucket");
		this.setCreativeTab(HaloCraft.tabItems);
	}
}