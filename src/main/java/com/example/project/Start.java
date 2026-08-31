package com.example.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;

public class Start extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Server.startInBackground();

        Parent root = FXMLLoader.load(Objects.requireNonNull(
                getClass().getResource("Start1.fxml"),
                "Missing Start1.fxml"));

        Scene scene = new Scene(root);
        stage.setTitle("codeCAMPUS");
        URL icon = getClass().getResource("logo.png");
        if (icon != null) {
            stage.getIcons().add(new Image(icon.toExternalForm()));
        }
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static String currentUserName;
    public static String currentUserUsername;
    public static String currentUserType;
    public static int counterForMenuOpenClose = 0;
    public static int counterForShowingPostTypeWise = 0;
    /**
     *  All -> 0
     *  Announcement -> 1
     *  Contest Announcement -> 2
     *  Query -> 3
     */
}
