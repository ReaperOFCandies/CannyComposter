package com.wumple.composter.config;

import com.wumple.composter.ObjectHolder;
import com.wumple.composter.Reference;
import com.wumple.composter.bin.BlockCompostBin;
import com.wumple.composter.capability.CompostBinCap;
import com.wumple.composter.compost.ItemCompost;
import com.wumple.util.config.MatchingConfig;
import com.wumple.util.config.MatchingConfigBase;

import net.minecraft.init.Items;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;

public class ConfigHandler
{
	public static final MatchingConfig<Integer> compostAmounts = new MatchingConfig<Integer>(ModConfig.items.amount, CompostBinCap.NO_DECOMPOSE_TIME);
	public static final MatchingConfig<Integer> composters = new MatchingConfig<Integer>(ModConfig.composters.amount, CompostBinCap.NO_COMPOSTING);
	
	public static void init()
	{
	    composters.addDefaultProperty(BlockCompostBin.ID, CompostBinCap.DEFAULT_SPEED);

        // force 1 compost in = 1 compost out
        ModConfig.items.amount.put(ItemCompost.ID, ModConfig.binDecomposeUnitsNeeded);
	    
		compostAmounts.addDefaultProperty(Items.ROTTEN_FLESH, "minecraft:rotten_flesh", 100);
		compostAmounts.addDefaultProperty(BlockCompostBin.ID, 125);
		compostAmounts.addDefaultProperty("minecraft:wooden_axe", 125);
		compostAmounts.addDefaultProperty("minecraft:wooden_pickaxe", 125);
		compostAmounts.addDefaultProperty("minecraft:wooden_sword", 125);
		compostAmounts.addDefaultProperty("minecraft:wooden_shovel", 125);
		compostAmounts.addDefaultProperty("minecraft:wooden_spade", 125);
		compostAmounts.addDefaultProperty("minecraft:wooden_hoe", 125);
		compostAmounts.addDefaultProperty("minecraft:wooden_button", 125);
		compostAmounts.addDefaultProperty("minecraft:wooden_pressure_plate", 125);
		compostAmounts.addDefaultProperty("minecraft:wooden_door", 125);
		compostAmounts.addDefaultProperty("minecraft:wool", 75);
		
		// Food Funk mod
		compostAmounts.addDefaultProperty("foodfunk:spoiled_milk", 100);
		compostAmounts.addDefaultProperty("foodfunk:rotten_food", 100);
		compostAmounts.addDefaultProperty("foodfunk:biodegradable_item", 100);
		
		// ore dict
        compostAmounts.addDefaultProperty("logWood", 125);
        compostAmounts.addDefaultProperty("plankWood", 125);
        compostAmounts.addDefaultProperty("slabWood", 125);
        compostAmounts.addDefaultProperty("stairWood", 125);
        compostAmounts.addDefaultProperty("fenceWood", 125);
        compostAmounts.addDefaultProperty("fenceGateWood", 125);
        compostAmounts.addDefaultProperty("stickWood", 125);
        compostAmounts.addDefaultProperty("treeSapling", 125);
        compostAmounts.addDefaultProperty("treeLeaves", 125);
        compostAmounts.addDefaultProperty("vine", 125);
        
        // crops
        compostAmounts.addDefaultProperty("cropWheat", 125);
        compostAmounts.addDefaultProperty("cropPotato", 125);
        compostAmounts.addDefaultProperty("cropCarrot", 125);
        compostAmounts.addDefaultProperty("cropNetherWart", 125);
        compostAmounts.addDefaultProperty("sugarcane", 125);
        compostAmounts.addDefaultProperty("blockCactus", 125);
        compostAmounts.addDefaultProperty("minecraft:melon_block", 600); // 3 + (0-5) slices dropped
        compostAmounts.addDefaultProperty("minecraft:pumpkin", 300); // 3 ingredients

        // misc materials
        compostAmounts.addDefaultProperty("dye", 125);
        compostAmounts.addDefaultProperty("paper", 75);
        compostAmounts.addDefaultProperty("minecraft:arrow", 125);
        compostAmounts.addDefaultProperty("minecraft:feather", 50);

        // mob drops
        compostAmounts.addDefaultProperty("slimeball", 125);
        
        compostAmounts.addDefaultProperty("bone", 125);
        compostAmounts.addDefaultProperty("gunpowder", 125);
        compostAmounts.addDefaultProperty("string", 50);
        compostAmounts.addDefaultProperty("leather", 125);
        compostAmounts.addDefaultProperty("feather", 125);
        compostAmounts.addDefaultProperty("egg", 125);
        
        compostAmounts.addDefaultProperty("grass", 50);
             
        compostAmounts.addDefaultProperty("torch", 75);
        compostAmounts.addDefaultProperty("workbench", 125);
        compostAmounts.addDefaultProperty("blockSlime", 125);
        compostAmounts.addDefaultProperty("chestWood", 125);

        // AgriCraft - Seeds:
        compostAmounts.addDefaultProperty("agricraft:agri_seed", 50);

        // ATLCraft Candles Mod - Seeds:
        compostAmounts.addDefaultProperty("atlcraft:atlcraft_bayberry_seeds", 50);

        // Garden Stuff - Seeds:
        compostAmounts.addDefaultProperty("gardenstuff:candelilla_seeds", 50);

        // Hatchery - Chicken Manure + Chicken Feed:
        compostAmounts.addDefaultProperty("hatchery:chickenmanure", 50);
        compostAmounts.addDefaultProperty("hatchery:chicken_feed", 50);
        
        // ADD NEW SPECIFIC ENTRIES HERE!
        
        // Minecraft and Pam's Harvestcraft - Seeds:
        // NOTE I can't find this in sources anywhere - is it real?
        compostAmounts.addDefaultProperty(ObjectHolder.Ids.listAllSeed, 50);
        
        compostAmounts.addDefaultProperty(ObjectHolder.Ids.listAllMelon, 150);
        compostAmounts.addDefaultProperty(ObjectHolder.Ids.listAllFlower, 75);
        compostAmounts.addDefaultProperty(ObjectHolder.Ids.listAllMushroom, 100);
        
        // ADD NEW GENERAL ENTRIES HERE!
        
        // default for food
        compostAmounts.addDefaultProperty(MatchingConfigBase.FOOD_TAG, 125);
        compostAmounts.addDefaultProperty("compostable", 100);
        
        ConfigManager.sync(Reference.MOD_ID, Config.Type.INSTANCE);
	}
	
		/*
        // MAYBE more items
        // ItemArmor material leather
        // ItemArrow
        // ItemBanner
        // ItemBed
        // ItemBoat
        // ItemBook
        // ItemCarrotOnAStick
        // ItemCloth
        // ItemCoal
        // ItemDoor if wood (how?)
        // ItemDye
        // MAPBASE: ItemEmptyMap
        // ItemFishingRod
        // ItemHoe if wood
        // ItemKnowledgeBook
        // ItemLead
        // ItemLilyPad
        // ItemMapBase
        // MAPBASE: ItemMap
        // ItemSaddle
        // ItemSeeds
        // ItemSeedFood (?)
        // ItemSign
        // ItemSkull
        // ItemSlab if wood
        // ItemSnow
        // ItemSnowball
        // ItemSoup
        // ItemSword if wood
        // ItemWritableBook
        // ItemWrittenBook
        // ItemEnchantedBook
        // ItemBow
        // ItemHoe if wood

        // STICK
        // Stairs if wood
        // Plate if wood
        // Gear if wood
        
        public static final Item APPLE;
        public static final ItemBow BOW;
        public static final Item ARROW;
        public static final Item COAL;
        public static final Item WOODEN_SWORD;
        public static final Item WOODEN_SHOVEL;
        public static final Item WOODEN_PICKAXE;
        public static final Item WOODEN_AXE;
        public static final Item STICK;
        public static final Item BOWL;
        public static final Item MUSHROOM_STEW;
        public static final Item STRING;
        public static final Item FEATHER;
        public static final Item GUNPOWDER;
        public static final Item WOODEN_HOE;
        
        public static final Item WHEAT;
        public static final Item BREAD;
        public static final ItemArmor LEATHER_HELMET;
        public static final ItemArmor LEATHER_CHESTPLATE;
        public static final ItemArmor LEATHER_LEGGINGS;
        public static final ItemArmor LEATHER_BOOTS;
        public static final Item PORKCHOP;
        public static final Item COOKED_PORKCHOP;
        public static final Item PAINTING;
        public static final Item GOLDEN_APPLE;
        public static final Item SIGN;
        public static final Item OAK_DOOR;
        public static final Item SPRUCE_DOOR;
        public static final Item BIRCH_DOOR;
        public static final Item JUNGLE_DOOR;
        public static final Item ACACIA_DOOR;
        public static final Item DARK_OAK_DOOR;
        public static final Item WATER_BUCKET;
        public static final Item SADDLE;
        public static final Item REDSTONE;
        public static final Item SNOWBALL;
        public static final Item BOAT;
        public static final Item SPRUCE_BOAT;
        public static final Item BIRCH_BOAT;
        public static final Item JUNGLE_BOAT;
        public static final Item ACACIA_BOAT;
        public static final Item DARK_OAK_BOAT;
        public static final Item LEATHER;
        public static final Item MILK_BUCKET;
        public static final Item CLAY_BALL;
        public static final Item REEDS;
        public static final Item PAPER;
        public static final Item BOOK;
        public static final Item SLIME_BALL;
        public static final Item CHEST_MINECART;
        public static final Item EGG;
        public static final ItemFishingRod FISHING_ROD;
        public static final Item GLOWSTONE_DUST;
        public static final Item FISH;
        public static final Item COOKED_FISH;
        public static final Item DYE;
        public static final Item BONE;
        public static final Item SUGAR;
        public static final Item CAKE;
        public static final Item BED;
        public static final Item COOKIE;
        public static final ItemMap FILLED_MAP;
        public static final Item MELON;
        public static final Item BEEF;
        public static final Item COOKED_BEEF;
        public static final Item CHICKEN;
        public static final Item COOKED_CHICKEN;
        public static final Item MUTTON;
        public static final Item COOKED_MUTTON;
        public static final Item RABBIT;
        public static final Item COOKED_RABBIT;
        public static final Item RABBIT_STEW;
        public static final Item RABBIT_FOOT;
        public static final Item RABBIT_HIDE;
        public static final Item ROTTEN_FLESH;
        public static final Item GHAST_TEAR;
        public static final Item NETHER_WART;
        public static final ItemPotion POTIONITEM;
        public static final ItemPotion SPLASH_POTION;
        public static final ItemPotion LINGERING_POTION;
        public static final Item GLASS_BOTTLE;
        public static final Item DRAGON_BREATH;
        public static final Item SPIDER_EYE;
        public static final Item FERMENTED_SPIDER_EYE;
        public static final Item BLAZE_POWDER;
        public static final Item MAGMA_CREAM;
        public static final Item SPECKLED_MELON;
        public static final Item SPAWN_EGG;
        public static final Item WRITABLE_BOOK;
        public static final Item WRITTEN_BOOK;
        public static final Item ITEM_FRAME;
        public static final Item CARROT;
        public static final Item POTATO;
        public static final Item BAKED_POTATO;
        public static final Item POISONOUS_POTATO;
        public static final ItemEmptyMap MAP;
        public static final Item GOLDEN_CARROT;
        public static final Item SKULL;
        public static final Item CARROT_ON_A_STICK;
        public static final Item PUMPKIN_PIE;
        public static final Item FIREWORKS;
        public static final Item FIREWORK_CHARGE;
        public static final Item ENCHANTED_BOOK;
        public static final ItemArmorStand ARMOR_STAND;
        public static final Item LEAD;
        public static final Item BANNER;
        public static final Item SHIELD;
        public static final Item CHORUS_FRUIT;
        public static final Item CHORUS_FRUIT_POPPED;
        public static final Item BEETROOT;
        public static final Item BEETROOT_SOUP;
        public static final Item SHULKER_SHELL;
        public static final Item KNOWLEDGE_BOOK;
         */
}
