package com.example.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Start extends Application {
 // edit again
   //musfiq edit
    @Override
    public void start(Stage primaryStage) throws Exception {
       Parent root= FXMLLoader.load(getClass().getResource("LogInPage.fxml"));
       Scene scene=new Scene(root);
       primaryStage.setScene(scene);
       primaryStage.show();
       primaryStage.setTitle("codeCAMPUS");
    }
    public static void main(String[] args) {
        launch(args);
    }
}
