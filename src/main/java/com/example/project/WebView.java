package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WebView implements Initializable{


    private Parent root;
    private Stage stage;
    private Scene scene;
    @FXML
    void gotoPreviousPage(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("LearningPort.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

    }



    ////** Learning portal all webview action event handle**////

    @FXML
    private javafx.scene.web.WebView webpage;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        System.out.println(LearninPortController.flag);
        if(LearninPortController.flag==1) {
            WebEngine webEngine = webpage.getEngine();
            webEngine.load("https://www.w3schools.com/");
        }

        else if(LearninPortController.flag==2) {
            WebEngine webEngine = webpage.getEngine();
            webEngine.load("https://stackoverflow.com/");
        }
        else if(LearninPortController.flag==3) {
            WebEngine webEngine = webpage.getEngine();
            webEngine.load("https://cp-algorithms.com/");
        }
        else if(LearninPortController.flag==4) {
            WebEngine webEngine = webpage.getEngine();
            webEngine.load("https://codeforwin.org/");
        }
        else if(LearninPortController.flag==5) {
            WebEngine webEngine = webpage.getEngine();
            webEngine.load("https://www.programiz.com/");
        }
        else if(LearninPortController.flag==6) {
            WebEngine webEngine = webpage.getEngine();
            webEngine.load("https://www.geeksforgeeks.org/");
        }
        else if(LearninPortController.flag==7) {
            WebEngine webEngine = webpage.getEngine();
            webEngine.load("https://www.github.com");
        }
        else if(LearninPortController.flag==8) {
            WebEngine webEngine = webpage.getEngine();
            webEngine.load("https://www.github.com");
        }


    }


}
