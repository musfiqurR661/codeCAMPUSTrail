package com.example.project;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.example.project.Start.currentUserName;
import static com.example.project.Start.currentUserType;
import static com.example.project.Start.currentUserUsername;

public class LogInPageController {

    @FXML
    private TextField inputbox;

    @FXML
    private Button login;

    @FXML
    private PasswordField passwordbox;

    @FXML
    void goToSignUpPage(ActionEvent event) {
        SceneNavigator.switchTo(event, "SignUpPage.fxml");
    }

    @FXML
    void loginClickedByMouseClicked(MouseEvent event) {
        loginEventMethod(event);
    }

    @FXML
    void loginClickedByEnterKeyInPasswordeField(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            loginEventMethod(event);
        }
    }

    @FXML
    void loginClickedByEnterKeyInUsernameField(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            loginEventMethod(event);
        }
    }

    void loginEventMethod(Event event) {
        String input = inputbox.getText() == null ? "" : inputbox.getText().trim();
        String pas = passwordbox.getText() == null ? "" : passwordbox.getText();

        if (input.isEmpty() || pas.isEmpty()) {
            showError("Missing credentials", "Please enter your email/username and password.");
            return;
        }

        try (Connection connection = Database.connect()) {
            String query = "SELECT fullName, userType, password, username FROM useraccounts WHERE email = ? OR username = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, input);
            statement.setString(2, input);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                String storedPassword = rs.getString("password");
                if (pas.equals(storedPassword)) {
                    currentUserUsername = rs.getString("username");
                    currentUserName = rs.getString("fullName");
                    currentUserType = rs.getString("userType");
                    SceneNavigator.switchTo(event, "HomePage.fxml");
                } else {
                    showError("Wrong password", "Please enter your password correctly!");
                }
            } else {
                showError("Wrong email/username", "Please enter your email or username correctly!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            showError("Database error", "Cannot connect to the database. Make sure MySQL is running and the musfiq schema is imported.");
        }
    }

    private void showError(String header, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
