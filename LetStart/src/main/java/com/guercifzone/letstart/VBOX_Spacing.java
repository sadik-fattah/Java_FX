package com.guercifzone.letstart;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBOX_Spacing extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("HTML");
        stage.setWidth(500);
        stage.setHeight(500);
        Scene scene = new Scene(new Group());

        VBox vbox = new VBox(8); // spacing = 8
        vbox.getChildren().addAll(new Button("Cut"), new Button("Copy"), new Button("Paste"));

        scene.setRoot(vbox);

        stage.setScene(scene);
        stage.show();
    }
}
