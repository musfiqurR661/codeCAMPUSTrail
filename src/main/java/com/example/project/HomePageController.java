//package com.example.project;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.input.MouseEvent;
//import javafx.stage.Stage;
//
//
//import java.net.URL;
//import java.util.ResourceBundle;
//
//public class HomePageController {
//    @FXML
//    private Button contest;
//
//    @FXML
//    private Button learPort;
//
//    @FXML
//    private Label moto;
//
//    @FXML
//    private Button newsFeed;
//
//    @FXML
//    private Button student;
//
//    @FXML
//    private Button teachers;
//
//    @FXML
//    private Label welcome;
//
//
//    @FXML
//    void gotoContestPage(ActionEvent event) {
//        try {
//            Parent root = FXMLLoader.load(getClass().getResource("contest.fxml"));
//            Scene scene = new Scene(root);
//            Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
//            stage.setScene(scene);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @FXML
//    void gotoLearningPortal(ActionEvent event) {
//
//        try {
//            Parent root = FXMLLoader.load(getClass().getResource("LearningPort.fxml"));
//            Scene scene = new Scene(root);
//            Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
//            stage.setScene(scene);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @FXML
//    void gotoNewsFeed(ActionEvent event) {
//        try {
//            Parent root = FXMLLoader.load(getClass().getResource("newsFeed.fxml"));
//            Scene scene = new Scene(root);
//            Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
//            stage.setScene(scene);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//
//    @FXML
//    void gotoStudentsPortal(ActionEvent event) {
//        try {
//            Parent root = FXMLLoader.load(getClass().getResource("Student.fxml"));
//            Scene scene = new Scene(root);
//            Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
//            stage.setScene(scene);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//
//    @FXML
//    void gotoTeachersPortal(ActionEvent event) {
//        try {
//            Parent root = FXMLLoader.load(getClass().getResource("Teacher.fxml"));
//            Scene scene = new Scene(root);
//            Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
//            stage.setScene(scene);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//    }
////---------------New Musfiq Hover color change-------------------//
///*
//    @FXML
//    void gotoContestPage(MouseEvent event) {
//        contest.setOnMouseEntered(e -> contest.setStyle("-fx-background-color: #008CBA;"));
//        contest.setOnMouseExited(e -> contest.setStyle("-fx-background-color: #4CAF50;"));
//
//    }
//
//    @FXML
//    void gotoLearningPortal(MouseEvent event) {
//        learPort.setOnMouseEntered(e -> learPort.setStyle("-fx-background-color: #008CBA;"));
//        learPort.setOnMouseExited(e -> learPort.setStyle("-fx-background-color: #4CAF50;"));
//
//    }
//
//    @FXML
//    void gotoNewsFeed(MouseEvent event) {
//        newsFeed.setOnMouseEntered(e -> newsFeed.setStyle("-fx-background-color: #008CBA;"));
//        newsFeed.setOnMouseExited(e -> newsFeed.setStyle("-fx-background-color: #4CAF50;"));
//    }
//
//    @FXML
//    void gotoStudentsPortal(MouseEvent event) {
//        student.setOnMouseEntered(e -> student.setStyle("-fx-background-color: #008CBA;"));
//        student.setOnMouseExited(e -> student.setStyle("-fx-background-color: #4CAF50;"));
//
//    }
//
//    @FXML
//    void gotoTeachersPortal(MouseEvent event) {
//        teachers.setOnMouseEntered(e -> teachers.setStyle("-fx-background-color: #008CBA;"));
//        teachers.setOnMouseExited(e -> teachers.setStyle("-fx-background-color: #4CAF50;"));
//
//    }
//
//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
////        contest.setOnMouseEntered(e -> contest.setStyle("-fx-background-color: #008CBA;"));
////        contest.setOnMouseExited(e -> contest.setStyle("-fx-background-color: #4CAF50;"));
////
////        learPort.setOnMouseEntered(e -> learPort.setStyle("-fx-background-color: #008CBA;"));
////        learPort.setOnMouseExited(e -> learPort.setStyle("-fx-background-color: #4CAF50;"));
////
////        newsFeed.setOnMouseEntered(e -> newsFeed.setStyle("-fx-background-color: #008CBA;"));
////        newsFeed.setOnMouseExited(e -> newsFeed.setStyle("-fx-background-color: #4CAF50;"));
////
////        student.setOnMouseEntered(e -> student.setStyle("-fx-background-color: #008CBA;"));
////        student.setOnMouseExited(e -> student.setStyle("-fx-background-color: #4CAF50;"));
////
////        teachers.setOnMouseEntered(e -> teachers.setStyle("-fx-background-color: #008CBA;"));
////        teachers.setOnMouseExited(e -> teachers.setStyle("-fx-background-color: #4CAF50;"));
//    }
//
// */
//}
//
//
//
//--------------------------------2nd Check---------------------------------//

/*
package com.example.project;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;
import static javafx.util.Duration.*;


public class HomePageController implements Initializable {
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

    private String typingText = "Welcome to codeCAMPUS.";
    private int currentIndex = 0;

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




    //-----------------Changing code of initiable methode----------//




    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Timeline timeline = new Timeline(new KeyFrame(millis(300), event -> {
            if (currentIndex > typingText.length()) {
                currentIndex = 0;
                typingText = "Hello World!";
            }

            moto.setText(typingText.substring(0, currentIndex));
            currentIndex++;
        }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

}

 */



//3rd c
package com.example.project;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import static com.example.project.Start.*;
import static javafx.util.Duration.*;

public class HomePageController implements Initializable {
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

    private String typingText = "Welcome to codeCAMPUS.";
    private int currentIndex = 0;
    private boolean isWelcomeDisplayed = true;

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Timeline timeline = new Timeline(new KeyFrame(millis(300), event -> {
            if (isWelcomeDisplayed) {
                if (currentIndex <= typingText.length()) {
                    moto.setText(typingText.substring(0, currentIndex));
                    currentIndex++;
                } else {
                    isWelcomeDisplayed = false;
                    currentIndex = 0;
                }
            } else {
                typingText = "Build & Run your destination.";
                if (currentIndex <= typingText.length()) {
                    moto.setText(typingText.substring(0, currentIndex));
                    currentIndex++;
                } else {
                    currentIndex = 0;
                }
            }
        }));

        System.out.println(currentUserName);

        System.out.println(currentUserType);


        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }


}