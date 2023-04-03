package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HomePageController {
    @FXML
    private Button contest;

    @FXML
    private Button learPort;

    @FXML
    private Label moto;

    @FXML
    private Button newsFeed;

    @FXML
    private Button student;

    @FXML
    private Button teachers;

    @FXML
    private Label welcome;

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
            Parent root = FXMLLoader.load(getClass().getResource("newsFeed.fxml"));
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
}



