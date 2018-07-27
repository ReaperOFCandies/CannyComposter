package com.wumple.composter.config;

import java.util.LinkedHashMap;
import java.util.Map;

import com.wumple.composter.Reference;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Name;
import net.minecraftforge.common.config.Config.RangeDouble;
import net.minecraftforge.common.config.Config.RangeInt;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = Reference.MOD_ID)
@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class ModConfig
{
	@Name("Enable compost bonemeal")
	@Config.Comment("Compost triggers plant growth like bonemeal.")
    public static boolean enableCompostBonemeal = true;
	
	@Name("Compost strength")
	@Config.Comment("The probability that compost will succeed relative to bonemeal.")
	@RangeDouble(min=0.0, max=1.0)
    public static double compostBonemealStrength = 0.5F;
	
	@Name("Compost item")
	@Config.Comment("The item that the compost bin generates")
	public static String compostItem = "composter:compost";
	
	@Name("Decomposed units needed")
	@Config.Comment("The number of compost units needed to make one compost output")
	@RangeInt(min=1)
	public static int binDecomposeUnitsNeeded = 1000;
	
	@Name("Compost bin ticks between evaluation")
	@Config.Comment("Number of ticks between evaluating compost bin contents - lower increases CPU expense")
	@RangeInt(min=1)
	public static int binEvaluateTicks = 40;
	
    @Name("Items")
    @Config.Comment("Set compost unit amounts for items.")
    public static Items items = new Items();

    public static class Items
    {
        @Name("Compost amount")
        @Config.Comment("Compost unit amount, -1 means item doesn't compost")
        @RangeInt(min = -1)
        public Map<String, Integer> amount = new LinkedHashMap<String, Integer>();
    }
    
    @Name("Debugging")
    @Config.Comment("Debugging options")
    public static Debugging zdebugging = new Debugging();

    public static class Debugging
    {
        @Name("Debug mode")
        @Config.Comment("Enable debug features on this menu, display extra debug info.")
        public boolean debug = false;
    }
    
    @Mod.EventBusSubscriber(modid = Reference.MOD_ID)
    private static class EventHandler
    { 
        /**
         * Inject the new values and save to the config file when the config has been changed from the GUI.
         *
         * @param event The event
         */
        @SubscribeEvent
        public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event)
	{
            if (event.getModID().equals(Reference.MOD_ID))
	    {
                ConfigManager.sync(Reference.MOD_ID, Config.Type.INSTANCE);
            }
        }
    }
}
