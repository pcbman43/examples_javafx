package ee.khk;

import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;


public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Group root = new Group();
        Scene scene = new Scene(root, 400, 150, Color.BLUE);
        // taustavärvi määramise alternatiiv: scene.setFill(color.BLUE);
        stage.setScene(scene);

        stage.setTitle("Hello JavaFX!");

        stage.show();
    }

}