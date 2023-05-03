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

public class WebView2 implements Initializable {
    private Parent root;
    private Stage stage;
    private Scene scene;
    @FXML
    void goback(ActionEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("contest.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

    }
    @FXML
    private javafx.scene.web.WebView webpage2;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println(ContestController.ContestControllerCounter);
        if(ContestController.ContestControllerCounter==1){
            WebEngine webEngine = webpage2.getEngine();
            webEngine.load("https://www.codeforces.com");
        }
        else if (ContestController.ContestControllerCounter==2) {
            WebEngine webEngine = webpage2.getEngine();
            webEngine.load(("https://www.codechef.com"));
        }
        else if (ContestController.ContestControllerCounter==3) {
            WebEngine webEngine = webpage2.getEngine();
            webEngine.load(("https://vjudge.net/"));
        }

    }
}
