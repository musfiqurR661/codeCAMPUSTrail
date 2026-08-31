package com.example.project;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public final class SceneNavigator {
    private SceneNavigator() {
    }

    public static void switchTo(Event event, String fxml) {
        try {
            URL resource = Objects.requireNonNull(
                    SceneNavigator.class.getResource(fxml),
                    "Missing FXML resource: " + fxml);
            Parent root = FXMLLoader.load(resource);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            throw new RuntimeException("Failed to load " + fxml, e);
        }
    }
}
