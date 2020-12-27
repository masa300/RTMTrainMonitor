package jp.masa.screensamplemod;

import javafx.application.Application;
import javafx.stage.Stage;

public class ScreenFX extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("JavaFX Screen");
        stage.setWidth(500);
        stage.setHeight(500);
        stage.show();
    }

    public static void run() {
        launch();
    }
}
