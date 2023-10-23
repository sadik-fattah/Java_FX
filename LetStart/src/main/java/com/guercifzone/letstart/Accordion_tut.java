package com.guercifzone.letstart;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;

import javafx.scene.control.TitledPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Accordion_tut extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Accordion");
        Group group = new Group();
        Scene scene = new Scene(group, 550, 250, Color.web("0x0000FF", 1.0));

         TitledPane l1 = new TitledPane("T1", new Button("btn1"));
        TitledPane l2 = new TitledPane("T2", new Button("btn2"));
        TitledPane l3 = new TitledPane("T3", new Button("btn3"));
        Accordion accordion = new Accordion();
        accordion.getPanes().addAll(l1,l2,l3);
        group.getChildren().add(accordion);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
