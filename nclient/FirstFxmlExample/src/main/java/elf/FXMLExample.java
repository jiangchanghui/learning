package elf;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class FXMLExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("FXML Example");
        Parent root = FXMLLoader.load(getClass().getResource("fxml_example.fxml"),
                ResourceBundle.getBundle("fxmlexample.fxml_example"));
        Scene scene = new Scene(root, 226, 264);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
