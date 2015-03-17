package haloCraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import net.minecraft.creativetab.CreativeTabs;
import haloCraft.armor.AluminumArmor;
import haloCraft.armor.BodyArmor;
import haloCraft.armor.LithiumArmor;
import haloCraft.armor.MjolnirMarkV;
import haloCraft.armor.MoissaniteArmor;
import haloCraft.armor.NiobiumArmor;
import haloCraft.armor.TiArmor;
import haloCraft.armor.TitaniumArmor;
import haloCraft.armor.VanadiumArmor;
import haloCraft.blocks.AlloySmelter;
import haloCraft.blocks.Aluminum_Block;
import haloCraft.blocks.Aluminum_Ore;
import haloCraft.blocks.Crude_Oil_Block;
import haloCraft.blocks.GelRefiner;
import haloCraft.blocks.Hydrostatic_Gel_Block;
import haloCraft.blocks.LiNb_Block;
import haloCraft.blocks.Li_Nb_Block;
import haloCraft.blocks.Liquid_Crystal_Block;
import haloCraft.blocks.Lithium_Block;
import haloCraft.blocks.Lithium_Ore;
import haloCraft.blocks.Magma_Cream_Block;
import haloCraft.blocks.Moissanite_Block;
import haloCraft.blocks.Moissanite_Ore;
import haloCraft.blocks.Niobium_Block;
import haloCraft.blocks.Niobium_Ore;
import haloCraft.blocks.Reinforced_Glass;
import haloCraft.blocks.Ti_Block;
import haloCraft.blocks.Titanium_Block;
import haloCraft.blocks.Titanium_Ore;
import haloCraft.blocks.Vanadium_Block;
import haloCraft.blocks.Vanadium_Ore;
import haloCraft.combat.Aluminum_Sword;
import haloCraft.combat.Lithium_Sword;
import haloCraft.combat.Moissanite_Sword;
import haloCraft.combat.Niobium_Sword;
import haloCraft.combat.Ti_Sword;
import haloCraft.combat.Titanium_Sword;
import haloCraft.combat.Vanadium_Sword;
import haloCraft.handler.BucketHandler;
import haloCraft.handler.GuiHandler;
import haloCraft.items.Aluminum_Ingot;
import haloCraft.items.Aluminum_Nugget;
import haloCraft.items.Bolt;
import haloCraft.items.Crude_Oil_Bucket;
import haloCraft.items.Fabric;
import haloCraft.items.Grade5;
import haloCraft.items.Hydrostatic_Gel;
import haloCraft.items.Iron_Nugget;
import haloCraft.items.LiNb_Bucket;
import haloCraft.items.Liquid_Crystal_Bucket;
import haloCraft.items.Lithium_Ingot;
import haloCraft.items.Lithium_Niobocene_Ingot;
import haloCraft.items.Magma_Bucket;
import haloCraft.items.Moissanite;
import haloCraft.items.Niobium_Ingot;
import haloCraft.items.Screw;
import haloCraft.items.Ti_Ingot;
import haloCraft.items.Titanium_Ingot;
import haloCraft.items.Titanium_Nugget;
import haloCraft.items.Vanadium_Ingot;
import haloCraft.items.Vanadium_Nugget;
import haloCraft.items.Visor;
import haloCraft.items.Washer;
import haloCraft.tileEntity.TileEntityAlloySmelter;
import haloCraft.tileEntity.TileEntityGelRefiner;
import haloCraft.tools.Aluminum_Axe;
import haloCraft.tools.Aluminum_Hoe;
import haloCraft.tools.Aluminum_Pickaxe;
import haloCraft.tools.Aluminum_Shovel;
import haloCraft.tools.Lithium_Axe;
import haloCraft.tools.Lithium_Hoe;
import haloCraft.tools.Lithium_Pickaxe;
import haloCraft.tools.Lithium_Shovel;
import haloCraft.tools.Moissanite_Axe;
import haloCraft.tools.Moissanite_Hoe;
import haloCraft.tools.Moissanite_Pickaxe;
import haloCraft.tools.Moissanite_Shovel;
import haloCraft.tools.Niobium_Axe;
import haloCraft.tools.Niobium_Hoe;
import haloCraft.tools.Niobium_Pickaxe;
import haloCraft.tools.Niobium_Shovel;
import haloCraft.tools.Screwdriver;
import haloCraft.tools.Ti_Axe;
import haloCraft.tools.Ti_Hoe;
import haloCraft.tools.Ti_Pickaxe;
import haloCraft.tools.Ti_Shovel;
import haloCraft.tools.Titanium_Axe;
import haloCraft.tools.Titanium_Hoe;
import haloCraft.tools.Titanium_Pickaxe;
import haloCraft.tools.Titanium_Shovel;
import haloCraft.tools.Vanadium_Axe;
import haloCraft.tools.Vanadium_Hoe;
import haloCraft.tools.Vanadium_Pickaxe;
import haloCraft.tools.Vanadium_Shovel;
import haloCraft.tools.Wrench;

@Mod(modid = HaloCraft.MODID, name = HaloCraft.NAME, version = HaloCraft.VERSION)
public class HaloCraft
{
	
    public static final String MODID = "Avr33_HaloCraft";
    public static final String NAME = "Halo Craft";
    public static final String VERSION = "0.9.4";
    @Instance(MODID)
    public static HaloCraft instance;
    
    // Creative Tabs
    public static CreativeTabs tabBlocks = new CreativeTabs("tabBlocks") {
    	@Override
    	@SideOnly(Side.CLIENT)
    	public Item getTabIconItem() {
    		return Item.getItemFromBlock(HaloCraft.Titanium_Ore);

	
    public static CreativeTabs tabMech = new CreativeTabs("tabMech") {
    	@Override
    	@SideOnly(Side.CLIENT)
    	public Item getTabIconItem() {
    		return Item.getItemFromBlock(HaloCraft.AlloySmelterIdle);

    public static CreativeTabs tabItems = new CreativeTabs("tabItems") {
    	@Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return HaloCraft.Titanium_Ingot;

	
	public static CreativeTabs tabTools = new CreativeTabs("tabTools") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return HaloCraft.Titanium_Pickaxe;

	
	public static CreativeTabs tabCombat = new CreativeTabs("tabCombat") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return HaloCraft.Titanium_Sword;

	
	public static CreativeTabs tabArmor = new CreativeTabs("tabArmor") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return HaloCraft.MjolnirV_Helm;
   
    // Blocks
    public static Block Titanium_Ore;
    public static Block Titanium_Block;
    public static Block Ti_Block;
    public static Block Aluminum_Ore;
    public static Block Aluminum_Block;
    public static Block Vanadium_Ore;
    public static Block Vanadium_Block;
    public static Block Moissanite_Ore;
    public static Block Moissanite_Block;
    public static Block Lithium_Ore;
    public static Block Lithium_Block;
    public static Block Niobium_Ore;
    public static Block Niobium_Block;
    public static Block Lithium_Niobocene_Block;
    public static Block Reinforced_Glass;
    
    public static Block Crude_Oil_Block;
    public static Block LiNb_Liquid_Block;
    public static Block Magma_Cream_Block;
    public static Block Hydrostatic_Gel_Block;
    public static Block Liquid_Crystal_Block;
    
    // Machines
    public static Block AlloySmelterIdle;
    public static Block AlloySmelterActive;
    public static final int guiIDAlloySmelter = 0;
    
    public static Block GelRefinerIdle;
    public static Block GelRefinerActive;
    public static final int guiIDGelRefiner = 1;
    
    // Items
    public static Item Titanium_Ingot;
    public static Item Ti_Ingot;
    public static Item Aluminum_Ingot;
    public static Item Vanadium_Ingot;
    public static Item Lithium_Ingot;
    public static Item Niobium_Ingot;
    public static Item Lithium_Niobocene_Ingot;
    public static Item Moissanite;
    public static Item Grade5;
    public static Item Iron_Nugget;
    public static Item Titanium_Nugget;
    public static Item Vanadium_Nugget;
    public static Item Aluminum_Nugget;
    public static Item Visor;
    public static Item Kevlar;
    public static Item Bolt;
    public static Item Washer;
    public static Item Screw;
    
    // Buckets
    public static Item Oil_Bucket;
    public static Item LiNb_Bucket;
    public static Item Magma_Bucket;
    public static Item Gel_Bucket;
    public static Item Crystal_Bucket;
    
    // Tools
    public static Item Wrench;
    public static Item Screwdriver;
    
    public static Item Titanium_Pickaxe;
    public static Item Titanium_Axe;
    public static Item Titanium_Hoe;
    public static Item Titanium_Shovel;
    public static Item Titanium_Sword;	
    
    public static Item Ti_Pickaxe;
    public static Item Ti_Axe;
    public static Item Ti_Hoe;
    public static Item Ti_Shovel;
    public static Item Ti_Sword;	
    
    public static Item Aluminum_Pickaxe;
    public static Item Aluminum_Axe;
    public static Item Aluminum_Hoe;
    public static Item Aluminum_Shovel;
    public static Item Aluminum_Sword;	
    
    public static Item Vanadium_Pickaxe;
    public static Item Vanadium_Axe;
    public static Item Vanadium_Hoe;
    public static Item Vanadium_Shovel;
    public static Item Vanadium_Sword;
    
    public static Item Lithium_Pickaxe;
    public static Item Lithium_Axe;
    public static Item Lithium_Hoe;
    public static Item Lithium_Shovel;
    public static Item Lithium_Sword;
    
    public static Item Niobium_Pickaxe;
    public static Item Niobium_Axe;
    public static Item Niobium_Hoe;
    public static Item Niobium_Shovel;
    public static Item Niobium_Sword;

    public static Item Moissanite_Pickaxe;
    public static Item Moissanite_Axe;
    public static Item Moissanite_Hoe;
    public static Item Moissanite_Shovel;
    public static Item Moissanite_Sword;
    
    // Armor 
    public static Item MjolnirV_Helm;
    public static Item MjolnirV_Chest;
    public static Item MjolnirV_Legs;
    public static Item MjolnirV_Boots;
    
    public static Item Titanium_Helmet;
    public static Item Titanium_Chest;
    public static Item Titanium_Legs;
    public static Item Titanium_Boots;
    
    public static Item Ti_Helmet;
    public static Item Ti_Chest;
    public static Item Ti_Legs;
    public static Item Ti_Boots;
    
    public static Item Aluminum_Helmet;
    public static Item Aluminum_Chest;
    public static Item Aluminum_Legs;
    public static Item Aluminum_Boots;
    
    public static Item Vanadium_Helmet;
    public static Item Vanadium_Chest;
    public static Item Vanadium_Legs;
    public static Item Vanadium_Boots;
    
    public static Item Lithium_Helmet;
    public static Item Lithium_Chest;
    public static Item Lithium_Legs;
    public static Item Lithium_Boots;
    
    public static Item Niobium_Helmet;
    public static Item Niobium_Chest;
    public static Item Niobium_Legs;
    public static Item Niobium_Boots;
    
    public static Item Moissanite_Helmet;
    public static Item Moissanite_Chest;
    public static Item Moissanite_Legs;
    public static Item Moissanite_Boots;
    
    public static Item Body_Chest;
    public static Item Body_Legs;
    public static Item Body_Boots;

    // Fluids
    public static Fluid Crude_Oil = new Fluid("Crude Oil").setBlock(Crude_Oil_Block).setDensity(825).setViscosity(800);
    public static Fluid LiNb_Fluid = new Fluid("Lithium Niobocene").setBlock(LiNb_Liquid_Block).setDensity(3521).setViscosity(800);
    public static Fluid Magma_Cream = new Fluid("Magma Cream").setBlock(Magma_Cream_Block).setDensity(3214).setViscosity(1500);
    public static Fluid Gel = new Fluid("Gel").setBlock(Hydrostatic_Gel_Block).setDensity(1500).setViscosity(7000);
    public static Fluid LC = new Fluid("Liquid Crystal").setBlock(Liquid_Crystal_Block).setDensity(2000).setViscosity(800);
    
    // Materials
    public static ToolMaterial Titanium_Tools = EnumHelper.addToolMaterial("Titanium Tools", 2, 265, 6.5F, 2.4F, 12); 
    public static ToolMaterial Ti_Tools = EnumHelper.addToolMaterial("Ti Tools", 2, 300, 6.5F, 2.6F, 18); 
    public static ToolMaterial Aluminum_Tools = EnumHelper.addToolMaterial("Aluminum Tools", 2, 240, 9.5F, 1.6F, 22); 
    public static ToolMaterial Vanadium_Tools = EnumHelper.addToolMaterial("Vanadium Tools", 2, 300, 7.5F, 3.0F, 3);
    public static ToolMaterial Lithium_Tools = EnumHelper.addToolMaterial("Lithium Tools", 2, 250, 8.5F, 2.0F, 18);
    public static ToolMaterial Niobium_Tools = EnumHelper.addToolMaterial("Niobium Tools", 2, 285, 7.5F, 2.6F, 6);
    public static ToolMaterial Moissanite_Tools = EnumHelper.addToolMaterial("Moissanite Tools", 3, 2561, 10F, 4F, 26);
    
    public static ArmorMaterial Mjolnir_MarkV = EnumHelper.addArmorMaterial("MjolnirV", 60, new int[]{3, 10, 7, 4}, 0);
    public static ArmorMaterial Titanium_Armor = EnumHelper.addArmorMaterial("Titanium Armor", 16, new int[]{2, 6, 5, 2}, 10);
    public static ArmorMaterial Ti_Armor = EnumHelper.addArmorMaterial("Ti Armor", 20, new int[]{2, 6, 5, 2}, 16);
    public static ArmorMaterial Aluminum_Armor = EnumHelper.addArmorMaterial("Aluminum Armor", 12, new int[]{2, 6, 5, 2}, 25);
    public static ArmorMaterial Vanadium_Armor = EnumHelper.addArmorMaterial("Vanadium Armor", 24, new int[]{3, 7, 5, 3}, 3);
    public static ArmorMaterial Lithium_Armor = EnumHelper.addArmorMaterial("Lithium Armor", 16, new int[]{2, 6, 5, 2}, 8);
    public static ArmorMaterial Niobium_Armor = EnumHelper.addArmorMaterial("Niobium Armor", 19, new int[]{2, 6, 5, 2}, 10);
    public static ArmorMaterial Moissanite_Armor = EnumHelper.addArmorMaterial("Moissanite Armor", 36, new int[]{3, 8, 6, 3}, 30);
    public static ArmorMaterial Body_Armor = EnumHelper.addArmorMaterial("Body Armor", 21, new int[]{2,  6, 5, 2}, 21);
        
    EventManager eventmanager = new EventManager();
        
 
    @EventHandler
    public void Preinit(FMLPreInitializationEvent event) 
    {
    	Crude_Oil.setUnlocalizedName("Crude Oil");
    	FluidRegistry.registerFluid(Crude_Oil);
    	LiNb_Fluid.setUnlocalizedName("Lithium Niobocene");
    	FluidRegistry.registerFluid(LiNb_Fluid);
    	Magma_Cream.setUnlocalizedName("Magma Cream");
    	FluidRegistry.registerFluid(Magma_Cream);
    	Gel.setUnlocalizedName("Hydrostatic Gel");
    	FluidRegistry.registerFluid(Gel);
    	LC.setUnlocalizedName("Liquid Crystal");
    	FluidRegistry.registerFluid(LC);
    }
    {
    }
    @EventHandler
    public void load (FMLInitializationEvent event);
    {
    	// Blocks
    	Titanium_Ore = new Titanium_Ore();
    	GameRegistry.registerBlock(Titanium_Ore, "Titanium Ore");
   		Titanium_Block = new Titanium_Block();
 		GameRegistry.registerBlock(Titanium_Block, "Titanium Block");
 		Ti_Block = new Ti_Block();
 		GameRegistry.registerBlock(Ti_Block, "Ti6Al4V Block");
    	Aluminum_Ore = new Aluminum_Ore();
    	GameRegistry.registerBlock(Aluminum_Ore, "Aluminum Ore");
    	Aluminum_Block = new Aluminum_Block();
    	GameRegistry.registerBlock(Aluminum_Block, "Aluminum Block");
    	Vanadium_Ore = new Vanadium_Ore();
    	GameRegistry.registerBlock(Vanadium_Ore, "Vanadium Ore");
    	Vanadium_Block = new Vanadium_Block();
    	GameRegistry.registerBlock(Vanadium_Block, "Vanadium Block");
    	Moissanite_Ore = new Moissanite_Ore();
    	GameRegistry.registerBlock(Moissanite_Ore, "Moissanite Ore");
    	Moissanite_Block = new Moissanite_Block();
    	GameRegistry.registerBlock(Moissanite_Block, "Moissanite Block");
    	Lithium_Ore = new Lithium_Ore();
    	GameRegistry.registerBlock(Lithium_Ore, "Lithium Ore");
    	Lithium_Block = new Lithium_Block();
    	GameRegistry.registerBlock(Lithium_Block, "Lithium Block");
    	Niobium_Ore = new Niobium_Ore();
    	GameRegistry.registerBlock(Niobium_Ore, "Niobium Ore");
    	Niobium_Block = new Niobium_Block();
    	GameRegistry.registerBlock(Niobium_Block, "Niobium Block");
    	Lithium_Niobocene_Block = new Li_Nb_Block();
    	GameRegistry.registerBlock(Lithium_Niobocene_Block, "Lithium Niobocene Block");
    	Reinforced_Glass = new Reinforced_Glass();
    	GameRegistry.registerBlock(Reinforced_Glass, "Reinforced Glass");
    	
    	Crude_Oil_Block = new Crude_Oil_Block(Crude_Oil, Material.water);
    	GameRegistry.registerBlock(Crude_Oil_Block, "Crude Oil");
    	LiNb_Liquid_Block = new LiNb_Block(LiNb_Fluid, Material.water);
    	GameRegistry.registerBlock(LiNb_Liquid_Block, "Lithium Niobocene");
    	Magma_Cream_Block = new Magma_Cream_Block(Magma_Cream, Material.lava);
    	GameRegistry.registerBlock(Magma_Cream_Block, "Magma Cream");
    	Hydrostatic_Gel_Block = new Hydrostatic_Gel_Block(Gel, Material.water);
    	GameRegistry.registerBlock(Hydrostatic_Gel_Block, "Hydrostatic Gel");
    	Liquid_Crystal_Block = new Liquid_Crystal_Block(LC, Material.water);
    	GameRegistry.registerBlock(Liquid_Crystal_Block, "Liquid Crystal");
    	
    	// Machines
    	AlloySmelterIdle = new AlloySmelter(false).setBlockName("AlloySmelterIdle").setCreativeTab(HaloCraft.tabMech);
    	GameRegistry.registerBlock(AlloySmelterIdle, "AlloySmelterIdle");
    	AlloySmelterActive = new AlloySmelter(true).setBlockName("AlloySmelterActive");
    	GameRegistry.registerBlock(AlloySmelterActive, "AlloySmelterActive");
    	
    	GelRefinerIdle = new GelRefiner(false).setBlockName("GelRefinerIdle").setCreativeTab(HaloCraft.tabMech);
    	GameRegistry.registerBlock(GelRefinerIdle, "GelRefinerIdle");
    	GelRefinerActive = new GelRefiner(true).setBlockName("GelRefinerActive");
    	GameRegistry.registerBlock(GelRefinerActive, "GelRefinerActive");
    	
    	// Items
    	Titanium_Ingot = new Titanium_Ingot();
    	GameRegistry.registerItem(Titanium_Ingot, "Titanium Ingot");
    	Ti_Ingot = new Ti_Ingot();
    	GameRegistry.registerItem(Ti_Ingot, "Ti Ingot");
    	Aluminum_Ingot = new Aluminum_Ingot();
    	GameRegistry.registerItem(Aluminum_Ingot, "Aluminum Ingot");
    	Vanadium_Ingot = new Vanadium_Ingot();
    	GameRegistry.registerItem(Vanadium_Ingot, "Vanadium Ingot");
    	Lithium_Ingot = new Lithium_Ingot();
    	GameRegistry.registerItem(Lithium_Ingot, "Lithium Ingot");
    	Niobium_Ingot = new Niobium_Ingot();
    	GameRegistry.registerItem(Niobium_Ingot, "Niobium Ingot");
    	Moissanite = new Moissanite();
    	GameRegistry.registerItem(Moissanite, "Moissanite");
    	Grade5 = new Grade5();
    	GameRegistry.registerItem(Grade5, "Grade 5");
    	Lithium_Niobocene_Ingot = new Lithium_Niobocene_Ingot();
    	GameRegistry.registerItem(Lithium_Niobocene_Ingot, "Lithium Niobocene Ingot");
    	Iron_Nugget = new Iron_Nugget();
    	GameRegistry.registerItem(Iron_Nugget, "Iron Nugget");
    	Titanium_Nugget = new Titanium_Nugget();
    	GameRegistry.registerItem(Titanium_Nugget, "Titanium Nugget");
    	Vanadium_Nugget = new Vanadium_Nugget();
    	GameRegistry.registerItem(Vanadium_Nugget, "Vanadium Nugget");
    	Aluminum_Nugget = new Aluminum_Nugget();
    	GameRegistry.registerItem(Aluminum_Nugget, "Aluminum Nugget");
    	Visor = new Visor();
    	GameRegistry.registerItem(Visor, "Visor");
    	Kevlar = new Fabric();
    	GameRegistry.registerItem(Kevlar, "Kevlar");
    	Bolt = new Bolt();
    	GameRegistry.registerItem(Bolt, "Bolt");
    	Washer = new Washer();
    	GameRegistry.registerItem(Washer, "Washer");
    	Screw = new Screw();
    	GameRegistry.registerItem(Screw, "Screw");
    	
    	// Buckets
    	Oil_Bucket = new Crude_Oil_Bucket(Crude_Oil_Block).setUnlocalizedName("Crude Oil Bucket").setContainerItem(Items.bucket);
    	GameRegistry.registerItem(Oil_Bucket, "Crude Oil Bucket");
    	LiNb_Bucket = new LiNb_Bucket(LiNb_Liquid_Block).setUnlocalizedName("Lithium Niobocene Bucket").setContainerItem(Items.bucket);
    	GameRegistry.registerItem(LiNb_Bucket, "Lithium Niobocene Bucket");
    	Magma_Bucket = new Magma_Bucket(Magma_Cream_Block).setUnlocalizedName("Magma Cream Bucket").setContainerItem(Items.bucket);
    	GameRegistry.registerItem(Magma_Bucket, "Magma Cream Bucket");
    	Gel_Bucket = new Hydrostatic_Gel(Hydrostatic_Gel_Block).setUnlocalizedName("Hydrostatic Gel Bucket").setContainerItem(Items.bucket);
    	GameRegistry.registerItem(Gel_Bucket, "Hydrostatic Gel Bucket");
    	Crystal_Bucket = new Liquid_Crystal_Bucket(Liquid_Crystal_Block).setUnlocalizedName("Liquid Crystal Block").setContainerItem(Items.bucket);
    	GameRegistry.registerItem(Crystal_Bucket, "Liquic Crytal Bucket");
    	
    	// Tools
    	Wrench = new Wrench();
    	GameRegistry.registerItem(Wrench, "Wrench");
    	Screwdriver = new Screwdriver();
    	GameRegistry.registerItem(Screwdriver, "Screwdriver");
    	
    	Titanium_Pickaxe = new Titanium_Pickaxe(Titanium_Tools);
    	GameRegistry.registerItem(Titanium_Pickaxe, "Titanium Pickaxe");
    	Titanium_Axe = new Titanium_Axe(Titanium_Tools);
    	GameRegistry.registerItem(Titanium_Axe, "Titanium Axe");
    	Titanium_Hoe = new Titanium_Hoe(Titanium_Tools);
    	GameRegistry.registerItem(Titanium_Hoe, "Titanium Hoe");
    	Titanium_Shovel = new Titanium_Shovel(Titanium_Tools);
    	GameRegistry.registerItem(Titanium_Shovel, "Titanium Shovel");
    	Titanium_Sword = new Titanium_Sword(Titanium_Tools);
    	GameRegistry.registerItem(Titanium_Sword, "Titanium Sword");
    	
    	Ti_Pickaxe = new Ti_Pickaxe(Ti_Tools);
    	GameRegistry.registerItem(Ti_Pickaxe, "Ti Pickaxe");
    	Ti_Axe = new Ti_Axe(Ti_Tools);
    	GameRegistry.registerItem(Ti_Axe, "Ti Axe");
    	Ti_Hoe = new Ti_Hoe(Ti_Tools);
    	GameRegistry.registerItem(Ti_Hoe, "Ti Hoe");
    	Ti_Shovel = new Ti_Shovel(Ti_Tools);
    	GameRegistry.registerItem(Ti_Shovel, "Ti Shovel");
    	Ti_Sword = new Ti_Sword(Ti_Tools);
    	GameRegistry.registerItem(Ti_Sword, "Ti Sword");
    			
    	Aluminum_Pickaxe = new Aluminum_Pickaxe(Aluminum_Tools);
    	GameRegistry.registerItem(Aluminum_Pickaxe, "Aluminum Pickaxe");
    	Aluminum_Axe = new Aluminum_Axe(Aluminum_Tools);
    	GameRegistry.registerItem(Aluminum_Axe, "Aluminum Axe");
    	Aluminum_Hoe = new Aluminum_Hoe(Aluminum_Tools);
    	GameRegistry.registerItem(Aluminum_Hoe, "Aluminum Hoe");
    	Aluminum_Shovel = new Aluminum_Shovel(Aluminum_Tools);
    	GameRegistry.registerItem(Aluminum_Shovel, "Aluminum Shovel");
    	Aluminum_Sword = new Aluminum_Sword(Aluminum_Tools);
    	GameRegistry.registerItem(Aluminum_Sword, "Aluminum Sword");
    	
    	Vanadium_Pickaxe = new Vanadium_Pickaxe(Vanadium_Tools);
    	GameRegistry.registerItem(Vanadium_Pickaxe, "Vanadium Pickaxe");
    	Vanadium_Axe = new Vanadium_Axe(Vanadium_Tools);
    	GameRegistry.registerItem(Vanadium_Axe, "Vanadium Axe");
    	Vanadium_Hoe = new Vanadium_Hoe(Vanadium_Tools);
    	GameRegistry.registerItem(Vanadium_Hoe, "Vanadium Hoe");
    	Vanadium_Shovel = new Vanadium_Shovel(Vanadium_Tools);
    	GameRegistry.registerItem(Vanadium_Shovel, "Vanadium Shovel");
    	Vanadium_Sword = new Vanadium_Sword(Vanadium_Tools);
    	GameRegistry.registerItem(Vanadium_Sword, "Vanadium Sword");
    	
    	Lithium_Pickaxe = new Lithium_Pickaxe(Lithium_Tools);
    	GameRegistry.registerItem(Lithium_Pickaxe, "Lithium Pickaxe");
    	Lithium_Axe = new Lithium_Axe(Lithium_Tools);
        GameRegistry.registerItem(Lithium_Axe, "Lithium Axe");
    	Lithium_Hoe = new Lithium_Hoe(Lithium_Tools);
    	GameRegistry.registerItem(Lithium_Hoe, "Lithium Hoe");
    	Lithium_Shovel = new Lithium_Shovel(Lithium_Tools);
    	GameRegistry.registerItem(Lithium_Shovel, "Lithium Shovel");
    	Lithium_Sword = new Lithium_Sword(Lithium_Tools);
    	GameRegistry.registerItem(Lithium_Sword, "Lithium Sword");
    	
    	Niobium_Pickaxe = new Niobium_Pickaxe(Niobium_Tools);
    	GameRegistry.registerItem(Niobium_Pickaxe, "Niobium Pickaxe");
    	Niobium_Axe = new Niobium_Axe(Niobium_Tools);
    	GameRegistry.registerItem(Niobium_Axe, "Niobium Axe");
    	Niobium_Hoe = new Niobium_Hoe(Niobium_Tools);
    	GameRegistry.registerItem(Niobium_Hoe, "Niobium Hoe");
    	Niobium_Shovel = new Niobium_Shovel(Niobium_Tools);
    	GameRegistry.registerItem(Niobium_Shovel, "Niobium Shovel");
    	Niobium_Sword = new Niobium_Sword(Niobium_Tools);
    	GameRegistry.registerItem(Niobium_Sword, "Niobium Sword");

    	Moissanite_Pickaxe = new Moissanite_Pickaxe(Moissanite_Tools);
    	GameRegistry.registerItem(Moissanite_Pickaxe, "Moissanite Pickaxe");
    	Moissanite_Axe = new Moissanite_Axe(Moissanite_Tools);
    	GameRegistry.registerItem(Moissanite_Axe, "Moissanite Axe");
    	Moissanite_Hoe = new Moissanite_Hoe(Moissanite_Tools);
    	GameRegistry.registerItem(Moissanite_Hoe, "Moissanite Hoe");
    	Moissanite_Shovel = new Moissanite_Shovel(Moissanite_Tools);
    	GameRegistry.registerItem(Moissanite_Shovel, "Moissanite Shovel");
    	Moissanite_Sword = new Moissanite_Sword(Moissanite_Tools);
    	GameRegistry.registerItem(Moissanite_Sword, "Moissanite Sword");
    	
    	// Armor
    	MjolnirV_Helm = new MjolnirMarkV(Mjolnir_MarkV, 0, "MarkV Helmet");
    	GameRegistry.registerItem(MjolnirV_Helm, "MarkV Helmet");
    	MjolnirV_Chest = new MjolnirMarkV(Mjolnir_MarkV, 1, "MarkV Chest");
    	GameRegistry.registerItem(MjolnirV_Chest, "MarkV Chest");
    	MjolnirV_Legs = new MjolnirMarkV(Mjolnir_MarkV, 2, "MarkV Leggings");
    	GameRegistry.registerItem(MjolnirV_Legs, "MarkV Leggings");
    	MjolnirV_Boots = new MjolnirMarkV(Mjolnir_MarkV, 3, "MarkV Boots");
    	GameRegistry.registerItem(MjolnirV_Boots, "MarkV Boots");
    	
    	Titanium_Helmet = new TitaniumArmor(Titanium_Armor, 0, "Titanium Helmet");
    	GameRegistry.registerItem(Titanium_Helmet, "Titanium Helmet");
    	Titanium_Chest = new TitaniumArmor(Titanium_Armor, 1, "Titanium Chestplate");
    	GameRegistry.registerItem(Titanium_Chest, "Titanium Chest");
    	Titanium_Legs = new TitaniumArmor(Titanium_Armor, 2, "Titanium Leggings");
    	GameRegistry.registerItem(Titanium_Legs, "Titanium Leggings");
    	Titanium_Boots = new TitaniumArmor(Titanium_Armor, 3, "Titanium Boots");
    	GameRegistry.registerItem(Titanium_Boots, "Titanium Boots");
    	
    	Ti_Helmet = new TiArmor(Ti_Armor, 0, "Ti6Al4V Helmet");
    	GameRegistry.registerItem(Ti_Helmet, "Ti6Al4V Helmet");
    	Ti_Chest = new TiArmor(Ti_Armor, 1, "Ti6Al4V Chestplate");
    	GameRegistry.registerItem(Ti_Chest, "Ti6Al4V Chestplate");
    	Ti_Legs = new TiArmor(Ti_Armor, 2, "Ti6Al4V Leggings");
    	GameRegistry.registerItem(Ti_Legs, "Ti6Al4V Leggings");
    	Ti_Boots = new TiArmor(Ti_Armor, 3, "Ti6Al4V Boots");
    	GameRegistry.registerItem(Ti_Boots, "Ti6Al4V Boots");
    	
    	Aluminum_Helmet = new AluminumArmor(Aluminum_Armor, 0, "Aluminum Helmet");
    	GameRegistry.registerItem(Aluminum_Helmet, "Aluminum Helmet");
    	Aluminum_Chest = new AluminumArmor(Aluminum_Armor, 1, "Aluminum Chestplate");
    	GameRegistry.registerItem(Aluminum_Chest, "Aluminum Chestplate");
    	Aluminum_Legs = new AluminumArmor(Aluminum_Armor, 2, "Aluminum Leggings");
    	GameRegistry.registerItem(Aluminum_Legs, "Aluminum Leggings");
    	Aluminum_Boots = new AluminumArmor(Aluminum_Armor, 3, "Aluminum Boots");
    	GameRegistry.registerItem(Aluminum_Boots, "Aluminum Boots");
    	
    	Vanadium_Helmet = new VanadiumArmor(Vanadium_Armor, 0, "Vanadium Helmet");
    	GameRegistry.registerItem(Vanadium_Helmet, "Vanadium Helmet");
    	Vanadium_Chest = new VanadiumArmor(Vanadium_Armor, 1, "Vanadium Chestplate");
    	GameRegistry.registerItem(Vanadium_Chest, "Vanadium Chestplate");
    	Vanadium_Legs = new VanadiumArmor(Vanadium_Armor, 2, "Vanadium Leggings");
    	GameRegistry.registerItem(Vanadium_Legs, "Vanadium Leggings");
    	Vanadium_Boots = new VanadiumArmor(Vanadium_Armor, 3, "Vanadium Boots");
    	GameRegistry.registerItem(Vanadium_Boots, "Vanadium Boots");
    	
    	Lithium_Helmet = new LithiumArmor(Lithium_Armor, 0, "Lithium Helmet");
    	GameRegistry.registerItem(Lithium_Helmet, "Lithium Helmet");
    	Lithium_Chest = new LithiumArmor(Lithium_Armor, 1, "Lithium Chestplate");
    	GameRegistry.registerItem(Lithium_Chest, "Lithium Chestplate");
    	Lithium_Legs = new LithiumArmor(Lithium_Armor, 2, "Lithium Leggings");   
    	GameRegistry.registerItem(Lithium_Legs, "Lithium Leggings");
    	Lithium_Boots = new LithiumArmor(Lithium_Armor, 3, "Lithium Boots");
    	GameRegistry.registerItem(Lithium_Boots, "Lithium Boots");
    	
    	Niobium_Helmet = new NiobiumArmor(Niobium_Armor, 0, "Niobium Helmet");
    	GameRegistry.registerItem(Niobium_Helmet, "Niobium Helmet");
    	Niobium_Chest = new NiobiumArmor(Niobium_Armor, 1, "Niobium Chestplate");
    	GameRegistry.registerItem(Niobium_Chest, "Niobium Chest");
    	Niobium_Legs = new NiobiumArmor(Niobium_Armor, 2, "Niobium Leggings");
    	GameRegistry.registerItem(Niobium_Legs, "Niobium Leggings");
    	Niobium_Boots = new NiobiumArmor(Niobium_Armor, 3, "Niobium Boots");
    	GameRegistry.registerItem(Niobium_Boots, "Niobium Boots");
    	
    	Moissanite_Helmet = new MoissaniteArmor(Moissanite_Armor, 0, "Moissanite Helmet");
    	GameRegistry.registerItem(Moissanite_Helmet, "Moissanite Helmet");
    	Moissanite_Chest = new MoissaniteArmor(Moissanite_Armor, 1, "Moissanite Chestplate");
    	GameRegistry.registerItem(Moissanite_Chest, "Moissanite Chestplate");
    	Moissanite_Legs = new MoissaniteArmor(Moissanite_Armor, 2, "Moissanite Leggings");
    	GameRegistry.registerItem(Moissanite_Legs, "Moissanite Leggings");
    	Moissanite_Boots = new MoissaniteArmor(Moissanite_Armor, 3, "Moissanite Boots");
    	GameRegistry.registerItem(Moissanite_Boots, "Moissanite Boots");
    	
    	Body_Chest = new BodyArmor(Body_Armor, 1, "Body Armor Chestplate");
    	GameRegistry.registerItem(Body_Chest, "Body Armor Chestplate");
    	Body_Legs = new BodyArmor(Body_Armor, 2, "Body Armor Legs");
    	GameRegistry.registerItem(Body_Legs, "Body Armor Legs");
    	Body_Boots = new BodyArmor(Body_Armor, 3, "Body Armor Boots");
    	GameRegistry.registerItem(Body_Boots, "Body Armor Boots");
    	
    	HaloCrafting.Crafting();
		GameRegistry.addRecipe(new HaloArmorDyes());
    	GameRegistry.registerWorldGenerator(eventmanager, 1);
    	GameRegistry.registerTileEntity(TileEntityAlloySmelter.class, "alloySmelter");
    	GameRegistry.registerTileEntity(TileEntityGelRefiner.class, "gelRefiner");
    	
    	MinecraftForge.EVENT_BUS.register(new BucketHandler());
    	
    	FluidContainerRegistry.registerFluidContainer(Gel, new ItemStack(Gel_Bucket), new ItemStack(Items.bucket));
    	FluidContainerRegistry.registerFluidContainer(LC, new ItemStack(Crystal_Bucket), new ItemStack(Items.bucket));
    	FluidContainerRegistry.registerFluidContainer(Crude_Oil, new ItemStack(Oil_Bucket), new ItemStack(Items.bucket));
    	FluidContainerRegistry.registerFluidContainer(LiNb_Fluid, new ItemStack(LiNb_Bucket), new ItemStack(Items.bucket));
    	FluidContainerRegistry.registerFluidContainer(Magma_Cream, new ItemStack(Magma_Bucket), new ItemStack(Items.bucket));
 
       	BucketHandler.INSTANCE.buckets.put(Crude_Oil_Block, Oil_Bucket);
       	BucketHandler.INSTANCE.buckets.put(LiNb_Liquid_Block, LiNb_Bucket);
       	BucketHandler.INSTANCE.buckets.put(Magma_Cream_Block, Magma_Bucket);
    	BucketHandler.INSTANCE.buckets.put(Hydrostatic_Gel_Block, Gel_Bucket);
    	BucketHandler.INSTANCE.buckets.put(Liquid_Crystal_Block, Crystal_Bucket);
    	
    	NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
    }
    
    @EventHandler
    public void PostInit(FMLPostInitializationEvent event) {}
}