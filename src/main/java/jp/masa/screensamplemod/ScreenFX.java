package jp.masa.screensamplemod;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

import java.io.InputStream;

public class ScreenFX extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        System.out.println(Minecraft.getMinecraft().getResourceManager().getResourceDomains());
        stage.setTitle("RTM Train Monitor");
        InputStream is = Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation(ScreenSampleMod.MODID, "default.fxml")).getInputStream();
        Parent root = new FXMLLoader().load(is);
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void run() {
        launch();
    }
}
