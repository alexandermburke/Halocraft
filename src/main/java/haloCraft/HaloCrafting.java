package haloCraft;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class HaloCrafting 
{
	public static void Crafting() 
	{
		// Misc
		GameRegistry.addShapelessRecipe(new ItemStack(HaloCraft.Iron_Nugget, 9), new Object[]{new ItemStack(Items.iron_ingot)});
		GameRegistry.addShapedRecipe(new ItemStack(Items.iron_ingot), new Object[]{
			"XXX",
			"XXX",
			"XXX", 'X', HaloCraft.Iron_Nugget});
		GameRegistry.addShapelessRecipe(new ItemStack(HaloCraft.Aluminum_Nugget, 9), new Object[]{new ItemStack(HaloCraft.Aluminum_Ingot)});
		GameRegistry.addShapedRecipe(new ItemStack(HaloCraft.Aluminum_Ingot), new Object[]{
			"XXX",
			"XXX",
			"XXX", 'X', HaloCraft.Aluminum_Nugget});
		GameRegistry.addShapelessRecipe(new ItemStack(HaloCraft.Titanium_Nugget, 9), new Object[]{new ItemStack(HaloCraft.Titanium_Ingot)});
		GameRegistry.addShapedRecipe(new ItemStack(HaloCraft.Titanium_Ingot), new Object[]{
			"XXX",
			"XXX",
			"XXX", 'X', HaloCraft.Titanium_Nugget});
		GameRegistry.addShapelessRecipe(new ItemStack(HaloCraft.Vanadium_Nugget, 9), new Object[]{new ItemStack(HaloCraft.Vanadium_Ingot)});
		GameRegistry.addShapedRecipe(new ItemStack(HaloCraft.Vanadium_Ingot), new Object[]{
			"XXX",
			"XXX",
			"XXX", 'X', HaloCraft.Vanadium_Nugget});
		
		// Items
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Visor), new Object[]{
			"R R",
			"RRR", 'R', HaloCraft.Reinforced_Glass});
		GameRegistry.addShapelessRecipe(new ItemStack(HaloCraft.Magma_Bucket), new Object[]{new ItemStack(Items.bucket),
			new ItemStack(Items.magma_cream), new ItemStack(Items.magma_cream), new ItemStack(Items.magma_cream),
			new ItemStack(Items.magma_cream), new ItemStack(Items.magma_cream), new ItemStack(Items.magma_cream),
			new ItemStack(Items.magma_cream), new ItemStack(Items.magma_cream)});
		GameRegistry.addShapelessRecipe(new ItemStack(HaloCraft.Grade5, 3), new Object[]{new ItemStack(HaloCraft.Iron_Nugget),
			new ItemStack(HaloCraft.Aluminum_Nugget), new ItemStack(HaloCraft.Aluminum_Nugget), new ItemStack(HaloCraft.Aluminum_Nugget),
			new ItemStack(HaloCraft.Aluminum_Nugget), new ItemStack(HaloCraft.Aluminum_Nugget), new ItemStack(HaloCraft.Vanadium_Nugget),
			new ItemStack(HaloCraft.Vanadium_Nugget), new ItemStack(HaloCraft.Vanadium_Nugget)});
		
		// Machine
		GameRegistry.addRecipe(new ItemStack(HaloCraft.AlloySmelterIdle), new Object[]{
			"SSS",
			"SHS",
			"SSS", 'S', Blocks.cobblestone, 'H', Blocks.hopper});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.GelRefinerIdle), new Object[]{
			"THT",
			"T T",
			"TTT", 'T', HaloCraft.Ti_Ingot, 'H', Blocks.hopper});

		// Mjolnir Mark V
		GameRegistry.addRecipe(new ItemStack(HaloCraft.MjolnirV_Helm), new Object[]{
			"TTT",
			"TVT",
			"TTT", 'T', HaloCraft.Ti_Ingot, 'V', HaloCraft.Visor});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.MjolnirV_Chest), new Object[]{
			"TLT",
			"TTT",
			"TTT", 'T', HaloCraft.Ti_Ingot, 'L', HaloCraft.Kevlar});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.MjolnirV_Legs), new Object[]{
			"LTL",
			"T T",
			"T T", 'L', HaloCraft.Kevlar, 'T', HaloCraft.Ti_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.MjolnirV_Legs), new Object[]{
			"L L",
			"T T", 'L', HaloCraft.Kevlar, 'T', HaloCraft.Ti_Ingot});
		
		// Titanium Armor
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Titanium_Helmet), new Object[]{
			"III",
			"I I", 'I', HaloCraft.Titanium_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Titanium_Chest), new Object[]{
			"I I",
			"III",
			"III", 'I', HaloCraft.Titanium_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Titanium_Legs), new Object[]{
			"III",
			"I I",
			"I I", 'I', HaloCraft.Titanium_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Titanium_Boots), new Object[]{
			"I I",
			"I I", 'I', HaloCraft.Titanium_Ingot});
		
		// Titanium Tools
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Titanium_Pickaxe), new Object[]{
			"III",
			" S ",
			" S ", 'I', HaloCraft.Titanium_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Titanium_Axe), new Object[]{
			"II",
			"IS",
			" S", 'I', HaloCraft.Titanium_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Titanium_Axe), new Object[]{
			"II",
			"SI",
			"S ", 'I', HaloCraft.Titanium_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Titanium_Hoe), new Object[]{
			"II",
			" S",
			" S", 'I', HaloCraft.Titanium_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Titanium_Hoe), new Object[]{
			"II",
			"S ",
			"S ", 'I', HaloCraft.Titanium_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Titanium_Shovel), new Object[]{
			"I",
			"S",
			"S", 'I', HaloCraft.Titanium_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Titanium_Sword), new Object[]{
			"I",
			"I",
			"S", 'I', HaloCraft.Titanium_Ingot, 'S', Items.stick});
		
		// Ti6Al4V Armor
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Ti_Helmet), new Object[]{
			"III",
			"I I", 'I', HaloCraft.Ti_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Ti_Chest), new Object[]{
			"I I",
			"III",
			"III", 'I', HaloCraft.Ti_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Ti_Legs), new Object[]{
			"III",
			"I I",
			"I I", 'I', HaloCraft.Ti_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Ti_Boots), new Object[]{
			"I I",
			"I I", 'I', HaloCraft.Ti_Ingot});
		
		// Ti6Al4V Tools
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Ti_Pickaxe), new Object[]{
			"III",
			" S ",
			" S ", 'I', HaloCraft.Ti_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Ti_Axe), new Object[]{
			"II",
			"IS",
			" S", 'I', HaloCraft.Ti_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Ti_Axe), new Object[]{
			"II",
			"SI",
			"S ", 'I', HaloCraft.Ti_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Ti_Hoe), new Object[]{
			"II",
			" S",
			" S", 'I', HaloCraft.Ti_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Ti_Hoe), new Object[]{
			"II",
			"S ",
			"S ", 'I', HaloCraft.Ti_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Ti_Shovel), new Object[]{
			"I",
			"S",
			"S", 'I', HaloCraft.Ti_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Ti_Sword), new Object[]{
			"I",
			"I",
			"S", 'I', HaloCraft.Ti_Ingot, 'S', Items.stick});
		
		// Aluminum Armor
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Aluminum_Helmet), new Object[]{
			"III",
			"I I", 'I', HaloCraft.Aluminum_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Aluminum_Chest), new Object[]{
			"I I",
			"III",
			"III", 'I', HaloCraft.Aluminum_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Aluminum_Legs), new Object[]{
			"III",
			"I I",
			"I I", 'I', HaloCraft.Aluminum_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Aluminum_Boots), new Object[]{
			"I I",
			"I I", 'I', HaloCraft.Aluminum_Ingot});
		
		// Aluminum Tools
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Aluminum_Pickaxe), new Object[]{
			"III",
			" S ",
			" S ", 'I', HaloCraft.Aluminum_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Aluminum_Axe), new Object[]{
			"II",
			"IS",
			" S", 'I', HaloCraft.Aluminum_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Aluminum_Axe), new Object[]{
			"II",
			"SI",
			"S ", 'I', HaloCraft.Aluminum_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Aluminum_Hoe), new Object[]{
			"II",
			" S",
			" S", 'I', HaloCraft.Aluminum_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Aluminum_Hoe), new Object[]{
			"II",
			"S ",
			"S ", 'I', HaloCraft.Aluminum_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Aluminum_Shovel), new Object[]{
			"I",
			"S",
			"S", 'I', HaloCraft.Aluminum_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Aluminum_Sword), new Object[]{
			"I",
			"I",
			"S", 'I', HaloCraft.Aluminum_Ingot, 'S', Items.stick});
		
		// Vanadium Armor
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Vanadium_Helmet), new Object[]{
			"III",
			"I I", 'I', HaloCraft.Vanadium_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Vanadium_Chest), new Object[]{
			"I I",
			"III",
			"III", 'I', HaloCraft.Vanadium_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Vanadium_Legs), new Object[]{
			"III",
			"I I",
			"I I", 'I', HaloCraft.Vanadium_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Vanadium_Boots), new Object[]{
			"I I",
			"I I", 'I', HaloCraft.Vanadium_Ingot});
		
		// Vanadium Tools
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Vanadium_Pickaxe), new Object[]{
			"III",
			" S ",
			" S ", 'I', HaloCraft.Vanadium_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Vanadium_Axe), new Object[]{
			"II",
			"IS",
			" S", 'I', HaloCraft.Vanadium_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Vanadium_Axe), new Object[]{
			"II",
			"SI",
			"S ", 'I', HaloCraft.Vanadium_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Vanadium_Hoe), new Object[]{
			"II",
			" S",
			" S", 'I', HaloCraft.Vanadium_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Vanadium_Hoe), new Object[]{
			"II",
			"S ",
			"S ", 'I', HaloCraft.Vanadium_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Vanadium_Shovel), new Object[]{
			"I",
			"S",
			"S", 'I', HaloCraft.Vanadium_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Vanadium_Sword), new Object[]{
			"I",
			"I",
			"S", 'I', HaloCraft.Vanadium_Ingot, 'S', Items.stick});
		
		// Lithium Armor
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Lithium_Helmet), new Object[]{
			"III",
			"I I", 'I', HaloCraft.Lithium_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Lithium_Chest), new Object[]{
			"I I",
			"III",
			"III", 'I', HaloCraft.Lithium_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Lithium_Legs), new Object[]{
			"III",
			"I I",
			"I I", 'I', HaloCraft.Lithium_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Lithium_Boots), new Object[]{
			"I I",
			"I I", 'I', HaloCraft.Lithium_Ingot});
		
		// Lithium Tools
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Lithium_Pickaxe), new Object[]{
			"III",
			" S ",
			" S ", 'I', HaloCraft.Lithium_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Lithium_Axe), new Object[]{
			"II",
			"IS",
			" S", 'I', HaloCraft.Lithium_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Lithium_Axe), new Object[]{
			"II",
			"SI",
			"S ", 'I', HaloCraft.Lithium_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Lithium_Hoe), new Object[]{
			"II",
			" S",
			" S", 'I', HaloCraft.Lithium_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Lithium_Hoe), new Object[]{
			"II",
			"S ",
			"S ", 'I', HaloCraft.Lithium_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Lithium_Shovel), new Object[]{
			"I",
			"S",
			"S", 'I', HaloCraft.Lithium_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Lithium_Sword), new Object[]{
			"I",
			"I",
			"S", 'I', HaloCraft.Lithium_Ingot, 'S', Items.stick});
		
		// Niobium Armor
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Niobium_Helmet), new Object[]{
			"III",
			"I I", 'I', HaloCraft.Niobium_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Niobium_Chest), new Object[]{
			"I I",
			"III",
			"III", 'I', HaloCraft.Niobium_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Niobium_Legs), new Object[]{
			"III",
			"I I",
			"I I", 'I', HaloCraft.Niobium_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Niobium_Boots), new Object[]{
			"I I",
			"I I", 'I', HaloCraft.Niobium_Ingot});
		
		// Niobium Tools
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Niobium_Pickaxe), new Object[]{
			"III",
			" S ",
			" S ", 'I', HaloCraft.Niobium_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Niobium_Axe), new Object[]{
			"II",
			"IS",
			" S", 'I', HaloCraft.Niobium_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Niobium_Axe), new Object[]{
			"II",
			"SI",
			"S ", 'I', HaloCraft.Niobium_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Niobium_Hoe), new Object[]{
			"II",
			" S",
			" S", 'I', HaloCraft.Niobium_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Niobium_Hoe), new Object[]{
			"II",
			"S ",
			"S ", 'I', HaloCraft.Niobium_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Niobium_Shovel), new Object[]{
			"I",
			"S",
			"S", 'I', HaloCraft.Niobium_Ingot, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Niobium_Sword), new Object[]{
			"I",
			"I",
			"S", 'I', HaloCraft.Niobium_Ingot, 'S', Items.stick});
			
		// Moissanite Armor
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Moissanite_Helmet), new Object[]{
			"III",
			"I I", 'I', HaloCraft.Moissanite});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Moissanite_Chest), new Object[]{
			"I I",
			"III",
			"III", 'I', HaloCraft.Moissanite});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Moissanite_Legs), new Object[]{
			"III",
			"I I",
			"I I", 'I', HaloCraft.Moissanite});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Moissanite_Boots), new Object[]{
			"I I",
			"I I", 'I', HaloCraft.Moissanite});
		
		// Moissanite Tools
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Moissanite_Pickaxe), new Object[]{
			"III",
			" S ",
			" S ", 'I', HaloCraft.Moissanite, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Moissanite_Axe), new Object[]{
			"II",
			"IS",
			" S", 'I', HaloCraft.Moissanite, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Moissanite_Axe), new Object[]{
			"II",
			"SI",
			"S ", 'I', HaloCraft.Moissanite, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Moissanite_Hoe), new Object[]{
			"II",
			" S",
			" S", 'I', HaloCraft.Moissanite, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Moissanite_Hoe), new Object[]{
			"II",
			"S ",
			"S ", 'I', HaloCraft.Moissanite, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Moissanite_Shovel), new Object[]{
			"I",
			"S",
			"S", 'I', HaloCraft.Moissanite, 'S', Items.stick});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Moissanite_Sword), new Object[]{
			"I",
			"I",
			"S", 'I', HaloCraft.Moissanite, 'S', Items.stick});
		
		// Blocks to Ingots
		GameRegistry.addShapelessRecipe(new ItemStack(HaloCraft.Titanium_Ingot, 9), new Object[]{
			new ItemStack(HaloCraft.Titanium_Block)});
		GameRegistry.addShapelessRecipe(new ItemStack(HaloCraft.Aluminum_Ingot, 9), new Object[]{
			new ItemStack(HaloCraft.Aluminum_Block)});
		GameRegistry.addShapelessRecipe(new ItemStack(HaloCraft.Vanadium_Ingot, 9), new Object[]{
			new ItemStack(HaloCraft.Vanadium_Block)});
		GameRegistry.addShapelessRecipe(new ItemStack(HaloCraft.Moissanite, 9), new Object[]{
			new ItemStack(HaloCraft.Moissanite_Block)});
		GameRegistry.addShapelessRecipe(new ItemStack(HaloCraft.Lithium_Ingot, 9), new Object[]{
			new ItemStack(HaloCraft.Lithium_Block)});
		GameRegistry.addShapelessRecipe(new ItemStack(HaloCraft.Niobium_Ingot, 9), new Object[]{
			new ItemStack(HaloCraft.Niobium_Block)});
		
		// Ingots to Blocks
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Titanium_Block), new Object[]{
			"XXX",
			"XXX",
			"XXX", 'X', HaloCraft.Titanium_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Ti_Block), new Object[]{
			"XXX",
			"XXX",
			"XXX", 'X', HaloCraft.Ti_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Aluminum_Block), new Object[]{
			"XXX",
			"XXX",
			"XXX", 'X', HaloCraft.Aluminum_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Vanadium_Block), new Object[]{
			"XXX",
			"XXX",
			"XXX", 'X', HaloCraft.Vanadium_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Moissanite_Block), new Object[]{
			"XXX",
			"XXX",
			"XXX", 'X', HaloCraft.Moissanite});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Lithium_Block), new Object[]{
			"XXX",
			"XXX",
			"XXX", 'X', HaloCraft.Lithium_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Niobium_Block), new Object[]{
			"XXX",
			"XXX",
			"XXX", 'X', HaloCraft.Niobium_Ingot});
		GameRegistry.addRecipe(new ItemStack(HaloCraft.Lithium_Niobocene_Block), new Object[]{
			"XXX",
			"XXX",
			"XXX", 'X', HaloCraft.Lithium_Niobocene_Ingot});
		
		// Smelting
		GameRegistry.addSmelting(Item.getItemFromBlock(HaloCraft.Titanium_Ore),
				new ItemStack(HaloCraft.Titanium_Ingot), 3.5F);
		GameRegistry.addSmelting(Item.getItemFromBlock(HaloCraft.Aluminum_Ore),
				new ItemStack(HaloCraft.Aluminum_Ingot), 2.0F);
		GameRegistry.addSmelting(Item.getItemFromBlock(HaloCraft.Vanadium_Ore),
				new ItemStack(HaloCraft.Vanadium_Ingot), 2.5F);
		GameRegistry.addSmelting(Item.getItemFromBlock(HaloCraft.Moissanite_Ore),
				new ItemStack(HaloCraft.Moissanite, 3), 5.5F);
		GameRegistry.addSmelting(Item.getItemFromBlock(HaloCraft.Lithium_Ore),
				new ItemStack(HaloCraft.Lithium_Ingot), 2.0F);
		GameRegistry.addSmelting(Item.getItemFromBlock(HaloCraft.Niobium_Ore),
				new ItemStack(HaloCraft.Niobium_Ingot), 2.5F);
	}
}