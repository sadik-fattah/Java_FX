package com.guercifzone.letstart;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Accordion;
public class Accordion_tut extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Text Fonts");

        Group g = new Group();
        Scene scene = new Scene(g, 550, 250, Color.web("0x0000FF", 1.0));

        TitledPane t1 = new TitledPane("T1", new Button("B1"));
        TitledPane t2 = new TitledPane("T2", new Button("B2"));
        TitledPane t3 = new TitledPane("T3", new Button("B3"));
     Accordion accordion = new Accordion();
        accordion.getPanes().addAll(t1, t2, t3);
        g.getChildren().add(accordion);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
