package com.example.project;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Start extends Application {

    @Override
    public void start(Stage stage) throws Exception {
       Parent root= FXMLLoader.load(getClass().getResource("LogInPage.fxml"));
       Scene scene=new Scene(root);
       stage.setScene(scene);

       //---------
//       stage.minHeightProperty().bind(stage.widthProperty().multiply(0.6));
//       stage.maxHeightProperty().bind(stage.widthProperty().multiply(0.6));

//        stage.iconifiedProperty().addListener(new ChangeListener<Boolean>() {
//
//            @Override
//            public void changed(ObservableValue<? extends Boolean> ov, Boolean t, Boolean t1) {
//                System.out.println("minimized:" + t1.booleanValue());
//            }
//        });

//        stage.maximizedProperty().addListener(new ChangeListener<Boolean>() {/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//            @Override
//            public void changed(ObservableValue<? extends Boolean> ov, Boolean t, Boolean t1) {
//                t1.booleanValue();
//            }
//        });
       //----------
       stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

    public static int counterForMenuOpenClose = 0;
}
