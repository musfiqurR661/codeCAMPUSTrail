package com.example.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Server.startInBackground();
        Parent root = FXMLLoader.load(Objects.requireNonNull(
                getClass().getResource("sample.fxml"),
                "Missing sample.fxml"));
        primaryStage.setTitle("Messenger");
        primaryStage.setScene(new Scene(root, 330, 560));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
