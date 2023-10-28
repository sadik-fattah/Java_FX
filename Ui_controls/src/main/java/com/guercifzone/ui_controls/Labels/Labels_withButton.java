package com.guercifzone.ui_controls.Labels;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Labels_withButton extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button  btn = new Button();
        final  Label lbl = new Label();
        primaryStage.setTitle("Labels button");

        lbl.setLayoutX(70);
        lbl.setLayoutY(150);

        btn.setLayoutX(100);
        btn.setLayoutY(100);
        btn.setText("click on me");

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lbl.setText("welcom  to  guercifzone");
            }
        });
        Group group = new Group();
        group.getChildren().add(btn);
        group.getChildren().add(lbl);
        primaryStage.setScene(new Scene(group, 300, 250));
        primaryStage.show();
    }
}
