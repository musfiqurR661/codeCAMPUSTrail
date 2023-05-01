package com.example.project;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ContestController implements Initializable{
    @FXML
    private AnchorPane backButtonInContestPage;

    @FXML
    void gotoHomePage(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            stage.setScene(scene);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @FXML
    void gotoContestPage(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("contest.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            stage.setScene(scene);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void gotoLearningPortal(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("LearningPort.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            stage.setScene(scene);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void gotoNewsFeed(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("newsFeed01.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            stage.setScene(scene);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void gotoStudentsPortal(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Student.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            stage.setScene(scene);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void gotoTeachersPortal(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Teacher.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            stage.setScene(scene);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // codeforces
    public static int ContestControllerCounter = 0;

    @FXML
    void gotoCodeforces(ActionEvent event) throws IOException {
        ContestControllerCounter = 1;
        clickEvent(event);
    }

    @FXML
    void gotoCodeChef(ActionEvent event) throws IOException {
        ContestControllerCounter = 2;
        clickEvent(event);
    }

    @FXML
    void gotoVJudge(ActionEvent event) throws IOException {
        ContestControllerCounter = 3;
        clickEvent(event);
    }

    void clickEvent(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("webview.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }

    private Parent root;
    private Stage stage;
    private Scene scene;

    //go back
    public void goBack(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("contest.fxml")));
        scene = new Scene(root);
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    //Next Page
    public void nextScene(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("NextScene.fxml")));
        scene = new Scene(root);
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
// ranking code
    @FXML
    private TableColumn<Ranking, String> rank;
    @FXML
    private TableColumn<Ranking, String> userName;
    @FXML
    private TableColumn<Ranking, String> rating;
    @FXML
    private TableView<Ranking> rankTable;

    ObservableList<Ranking> list = FXCollections.observableArrayList(
           new Ranking("01","tarek200","1200"),
            new Ranking("02","musfiq2","1180"),
            new Ranking("03","noman5","1050"),
            new Ranking("04","parvaze25","870"),
            new Ranking("05","liza","600"),
            new Ranking("06","rakib","1200")
    );
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        rank.setCellValueFactory(new PropertyValueFactory<Ranking, String>("rank"));
        userName.setCellValueFactory(new PropertyValueFactory<Ranking, String>("userName"));
        rating.setCellValueFactory(new PropertyValueFactory<Ranking, String>("rating"));
        rankTable.setItems(list);
    }

}

