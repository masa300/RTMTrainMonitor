package jp.masa.screensamplemod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = ScreenSampleMod.MODID, name = ScreenSampleMod.MODNAME, version = ScreenSampleMod.VERSION)
public class ScreenSampleMod {
    public static final String MODID = "rtmtrainmonitor";
    public static final String MODNAME = "RTM Train Monitor";
    public static final String VERSION = "1.0.0";

    @Mod.EventHandler
    public void init(FMLPostInitializationEvent event) {
        new Thread(ScreenFX::run).start();
    }
}
