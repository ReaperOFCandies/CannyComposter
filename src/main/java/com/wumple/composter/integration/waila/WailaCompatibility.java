package com.wumple.composter.integration.waila;

import net.minecraftforge.fml.common.event.FMLInterModComms;

public class WailaCompatibility
{
    private static boolean registered;

    public static void register()
    {
        if (registered) { return; }
        registered = true;
        FMLInterModComms.sendMessage("waila", "register", "com.wumple.composter.integration.waila.WailaDataProvider.load");
    }
    
    public static boolean getRegistered()
    {
        return registered;
    }
}