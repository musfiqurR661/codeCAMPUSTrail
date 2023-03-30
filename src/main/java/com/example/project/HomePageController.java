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
 public static int flag = 0;

    @FXML
    private Button codeforWin;

    @FXML
    private Button cpAlgorithm;

    @FXML
    private Button geekFgeeks;

    @FXML
    private Button programiz;

    @FXML
    private Button stackoverFlow;

    @FXML
    private Button w3School;

    @FXML
    void gotoCPalgorithm(ActionEvent event) {

    }

    @FXML
    void gotoCodeforWin(ActionEvent event) {

    }


    @FXML
    void gotoGeekforGeeks(ActionEvent event) {

    }

    @FXML
    void gotoHomePage(ActionEvent event) {

    }





    @FXML
    void gotoStackoverFlow(ActionEvent event) {

    }




    @FXML
    void gotoW3school(ActionEvent event) {

    }

    @FXML
    void gotoprogramiz(ActionEvent event) {

    }



    }



