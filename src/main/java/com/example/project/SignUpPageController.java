package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SignUpPageController {
    @FXML
    private PasswordField cpasswordbox;

    @FXML
    private TextField emailbox;

    @FXML
    private Button loginButtonInSignUpPage;

    @FXML
    private TextField namebox;

    @FXML
    private PasswordField passwordbox;

    @FXML
    private Button signUp;

    @FXML
    private TextField usernamebox;

    @FXML
    private RadioButton studentsRadioButton;

    @FXML
    private RadioButton teachersRadioButton;

    @FXML
    private ToggleGroup userTypeGroup;

    @FXML
    void initialize() {
        userTypeGroup = new ToggleGroup();
        studentsRadioButton.setToggleGroup(userTypeGroup);
        teachersRadioButton.setToggleGroup(userTypeGroup);
    }

    @FXML
    void goToLoginPage(ActionEvent event) {
        SceneNavigator.switchTo(event, "LogInPage.fxml");
    }

    @FXML
    void signUpClicked(ActionEvent event) {
        String userFullName = textOrEmpty(namebox);
        String userEmail = textOrEmpty(emailbox);
        String userUsername = textOrEmpty(usernamebox);
        String userPassword = passwordbox.getText() == null ? "" : passwordbox.getText();
        String confirmPassword = cpasswordbox.getText() == null ? "" : cpasswordbox.getText();

        String userType = null;
        if (studentsRadioButton.isSelected()) {
            userType = "Student";
        } else if (teachersRadioButton.isSelected()) {
            userType = "Teacher";
        }

        if (userFullName.isBlank() || userEmail.isBlank() || userUsername.isBlank()
                || userPassword.isBlank() || !userPassword.equals(confirmPassword) || userType == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Please enter all data correctly");
            alert.setContentText("Fill every field, choose Student or Teacher, and make sure both passwords match.");
            alert.showAndWait();
            return;
        }

        try (Connection con = Database.connect();
             PreparedStatement pst = con.prepareStatement(
                     "INSERT INTO useraccounts(fullName,email,username,password,userType) VALUES(?,?,?,?,?)")) {
            pst.setString(1, userFullName);
            pst.setString(2, userEmail);
            pst.setString(3, userUsername);
            pst.setString(4, userPassword);
            pst.setString(5, userType);
            pst.executeUpdate();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Welcome");
            alert.setHeaderText("Sign up successful");
            alert.setContentText("You can now log in with your username or email.");
            alert.showAndWait();
            SceneNavigator.switchTo(event, "LogInPage.fxml");
        } catch (SQLException e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Could not create account");
            alert.setContentText("The username or email may already exist, or the database is unavailable.");
            alert.showAndWait();
        }
    }

    private static String textOrEmpty(TextField field) {
        return field.getText() == null ? "" : field.getText().trim();
    }
}
