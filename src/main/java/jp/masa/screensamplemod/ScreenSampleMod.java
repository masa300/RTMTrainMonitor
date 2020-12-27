package jp.masa.screensamplemod;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = ScreenSampleMod.MODID, name = ScreenSampleMod.MODNAME, version = ScreenSampleMod.VERSION)
public class ScreenSampleMod {
    public static final String MODID = "ScreenSampleMod";
    public static final String MODNAME = "Screen Sample Mod";
    public static final String VERSION = "1.0.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        new Thread(ScreenFX::run).start();
        FMLCommonHandler.instance().bus().register(new ScreenSwing());
    }
}
