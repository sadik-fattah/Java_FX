package com.guercifzone.letstart;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBOX_PaddingSpacing extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("HBox Test");

        // HBox
        HBox hb = new HBox();
        hb.setPadding(new Insets(15, 12, 15, 12));
        hb.setSpacing(10);

        // Buttons
        Button btn1 = new Button();
        btn1.setText("Button1");
        hb.getChildren().add(btn1);

        Button btn2 = new Button();
        btn2.setText("Button2");
        hb.getChildren().add(btn2);

        Button btn3 = new Button();
        btn3.setText("Button3");
        hb.getChildren().add(btn3);

        Button btn4 = new Button();
        btn4.setText("Button4");
        hb.getChildren().add(btn4);

        // Adding HBox to the scene
        Scene scene = new Scene(hb);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
