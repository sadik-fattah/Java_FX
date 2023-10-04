package com.guercifzone.letstart;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HBOX_OneControlGrow extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("");
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250, Color.WHITE);

        HBox hbox = new HBox();
        TextField field = new TextField();
        HBox.setHgrow(field, Priority.ALWAYS);
        hbox.getChildren().addAll(new Label("Search:"), field, new Button("Go"));


        root.getChildren().add(hbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
