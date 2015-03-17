package haloCraft.items;

import haloCraft.HaloCraft;
import net.minecraft.item.Item;

public class Grade5 extends Item 
{
	public Grade5()
	{
		super();
		this.setUnlocalizedName("Grade 5");
		this.setTextureName(HaloCraft.NAME + ":" + "Grade 5");
		this.setCreativeTab(HaloCraft.tabItems);
	}
}