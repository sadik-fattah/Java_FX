package com.guercifzone.ui_controls.Labels;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Labels_wrap extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
Scene scene = new Scene(new Group());
stage.setTitle(" label wrap");
stage.setWidth(400);
stage.setHeight(180);

HBox  hBox = new HBox();

        Label lbl1 = new Label("Search guercifzone guercifzone guercifzone guercifzone guercifzone  guercifzone  guercifzone  guercifzone ");

       lbl1.setPrefWidth(300);
       lbl1.setWrapText(true);

       hBox.setSpacing(10);
       hBox.getChildren().add(lbl1);
        ((Group) scene.getRoot()).getChildren().add(hBox);
stage.setScene(scene);
stage.show();
    }
}
