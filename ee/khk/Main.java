package ee.khk;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Button;


import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Label headerLbl = new Label("Press the login button");
        StackPane.setAlignment(headerLbl, Pos.TOP_CENTER);
        Label statusLbl = new Label("Start screen");
        StackPane.setAlignment(statusLbl, Pos.BOTTOM_CENTER);
        Button loginBtn = new Button("Login");

        StackPane root = new StackPane(headerLbl, statusLbl, loginBtn);

        Scene scene = new Scene(root, 300, 150);
        stage.setScene(scene);

        stage.setTitle("StackPane in JavaFX");

        stage.show();
    }

}