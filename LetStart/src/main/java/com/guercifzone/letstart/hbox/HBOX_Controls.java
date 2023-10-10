package com.guercifzone.letstart.hbox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBOX_Controls extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
primaryStage.setTitle("hbox_controls");
        HBox hb = new HBox();
        hb.setPadding(new Insets(15,12,15,12));
        hb.setSpacing(10);

        Button btn1 = new Button();
        btn1.setText("button1");
        hb.getChildren().add(btn1);

        Button btn2 = new Button();
        btn2.setText("button2");
        hb.getChildren().add(btn2);

        Button btn3 = new Button();
        btn3.setText("button3");
        hb.getChildren().add(btn3);

        Button btn4 = new Button();
        btn4.setText("button4");
        hb.getChildren().add(btn4);

        Scene scene = new Scene(hb);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
