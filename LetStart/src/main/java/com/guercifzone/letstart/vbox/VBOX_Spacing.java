package com.guercifzone.letstart.vbox;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBOX_Spacing extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("JAVA");
        stage.setWidth(500);
       stage.setHeight(500);
       Scene scene = new Scene(new Group());
       VBox vBox = new VBox(8);
       vBox.getChildren().addAll(new Button("cut"),new Button("Copy"),new Button("Paste"));
       scene.setRoot(vBox);
       stage.setScene(scene);
       stage.show();
    }
}
