package com.example.project;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Start extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root= FXMLLoader.load(getClass().getResource("Start1.fxml"));

     //Image image = new Image("G:\\codeCAMPUSTrail\\src\\logo.png");
        stage.setTitle("codeCampus");
        Scene scene=new Scene(root);
        stage.setScene(scene);


        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
//        //--------------Chat system-------------------------//
//
//        Server.main(new String[]{"m"});



    }


    //**** ............ All static variable ........................***///
    public static String currentUserName;
    public static String currentUserUsername;
    public static String currentUserType;
    public static int counterForMenuOpenClose = 0;
    public static int counterForShowingPostTypeWise = 0;
    /**
     *  All -> 0
     *  Announcement -> 1
     *  Contest Announcement -> 2
     *  Query -> 3
     */

    //public static ArrayList<String> allPost = new ArrayList<>();
    //**** ............ ...................... ........................***///

    //--------------Chat system-------------------------//




}

//
/////--------check---------------------///
//
//package com.example.project;
//
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.image.Image;
//import javafx.stage.Stage;
//
//import java.io.IOException;
//import java.net.Socket;
//
//public class Start extends Application {
//    private Socket socket;
//
//    @Override
//    public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("Start1.fxml"));
//
//        Image image = new Image("G:\\codeCAMPUSTrail\\src\\logo.png");
//        stage.setTitle("codeCampus");
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//
//        stage.show();
//
//        // Connect to server
//        try {
//            socket = new Socket("localhost", 8878);
//            System.out.println("Connected to server");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void stop() throws Exception {
//        super.stop();
//        // Close socket connection when application stops
//        try {
//            socket.close();
//            System.out.println("Connection to server closed");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    //**** ............ All static variable ........................***///
//    public static String currentUserName;
//    public static String currentUserUsername;
//    public static String currentUserType;
//    public static int counterForMenuOpenClose = 0;
//    public static int counterForShowingPostTypeWise = 0;
//}
