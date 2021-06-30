package javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("hi im am a label");
        Scene scene = new Scene(label);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
