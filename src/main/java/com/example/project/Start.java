package com.example.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Start extends Application {
 // edit again
    @Override
    public void start(Stage stage) throws Exception {
       Parent root= FXMLLoader.load(getClass().getResource("LogInPage.fxml"));
       Scene scene=new Scene(root);
       stage.setScene(scene);
       stage.show();
       //System.out.println("MARA");
       //ar na bhai..

       //partasina keno

    }
    public static void main(String[] args) {
        launch(args);
    }
}
