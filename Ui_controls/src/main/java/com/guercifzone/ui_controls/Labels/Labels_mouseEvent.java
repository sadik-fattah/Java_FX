package com.guercifzone.ui_controls.Labels;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Labels_mouseEvent extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Label Mouse Event");
        stage.setWidth(400);
        stage.setHeight(180);
        HBox hbox = new HBox();

        final Label lbl  = new Label("Search long long long long long long long long long ");
        lbl.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                lbl.setScaleX(2);
                lbl.setLayoutY(2);
            }
        });
        lbl.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                lbl.setScaleX(1);
                lbl.setLayoutY(1);
            }
        });

        hbox.setSpacing(10);
        hbox.getChildren().add((lbl));
        ((Group) scene.getRoot()).getChildren().add(hbox);

        stage.setScene(scene);
        stage.show();
    }
    }

