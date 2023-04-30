package com.example.project;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class HelloController implements Initializable {
    @FXML
    private TableView<Announcement> TableView;
    @FXML
    private TableColumn<Announcement, String> CFNAME;
    @FXML
    private TableColumn<Announcement, String> CFDATE;
    @FXML
    private TableColumn<Announcement, String> CCNAME;
    @FXML
    private TableColumn<Announcement,String> CCDATE;
    @FXML
    private TableColumn<Announcement, String> VJNAME;
    @FXML
    private TableColumn<Announcement, String> VJDATE;
    ObservableList<Announcement> list = FXCollections.observableArrayList(
            new Announcement("DIV 1","01-05-2023","Str 1","01-05-2023","UIU LONG 1","01-05-2023")
    );

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        CFNAME.setCellValueFactory(new PropertyValueFactory<Announcement,String>("CFNAME"));
        CFDATE.setCellValueFactory(new PropertyValueFactory<Announcement,String>("CFDATE"));
        CCNAME.setCellValueFactory(new PropertyValueFactory<Announcement,String>("CCNAME"));
        CCDATE.setCellValueFactory(new PropertyValueFactory<Announcement,String>("CFDATE"));
        VJNAME.setCellValueFactory(new PropertyValueFactory<Announcement,String>("VJNAME"));
        VJDATE.setCellValueFactory(new PropertyValueFactory<Announcement,String>("VJDATE"));
        TableView.setItems(list);

    }
    private Parent root;
    private Stage stage;
    private Scene scene;
    public void nextScene(ActionEvent e) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("NextScene.fxml")));
        scene = new Scene(root);
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    public void gotoContestPage(ActionEvent e) throws IOException {
        root=FXMLLoader.load(Objects.requireNonNull(getClass().getResource("contest.fxml")));
        scene=new Scene(root);
        stage=(Stage)((Node) e.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
}