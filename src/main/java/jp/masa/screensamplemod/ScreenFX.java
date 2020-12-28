package jp.masa.screensamplemod;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

import java.io.InputStream;

public class ScreenFX extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("RTM Train Monitor");
        InputStream is = Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation("fxml/images/monitor.png")).getInputStream();
        stage.setScene(new Scene(new Pane(new ImageView(new Image(is)))));
        stage.show();
    }
}
