package jp.masa.screensamplemod;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLLoadCompleteEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import javafx.application.Application;

@Mod(modid = ScreenSampleMod.MODID, name = ScreenSampleMod.MODNAME, version = ScreenSampleMod.VERSION)
public class ScreenSampleMod {
    public static final String MODID = "rtmtrainmonitor";
    public static final String MODNAME = "RTM Train Monitor";
    public static final String VERSION = "1.0.0";

    @Mod.EventHandler
    public void init(FMLPostInitializationEvent event) {
        FMLCommonHandler.instance().bus().register(this);
    }

    @Mod.EventHandler
    public void onFMLLoadComplete(FMLLoadCompleteEvent e) {
        if (e.getSide() == Side.CLIENT) {
            new Thread(() -> Application.launch(ScreenFX.class)).start();
        }
    }
}
