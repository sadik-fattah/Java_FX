package com.guercifzone.letstart.Gridpane;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Gridpane_simple extends Application {

    public static void main(String[] args) {
       Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
primaryStage.setTitle("simple gridepane");
Group group = new Group();
Scene scene = new Scene(group,400,300,Color.WHITE);

GridPane gridPane = new GridPane();

ColumnConstraints cct1 = new ColumnConstraints();
cct1.setPercentWidth(25);

ColumnConstraints cct2 = new ColumnConstraints();
cct2.setPercentWidth(50);
ColumnConstraints cct3 = new ColumnConstraints();
cct3.setPercentWidth(25);
gridPane.getColumnConstraints().addAll(cct1,cct2,cct3);

        gridPane.add(new Label("C"),2,0);
        gridPane.add(new Label("B"),1,0);
        gridPane.add(new Label("A"),0,0);

        group.getChildren().add(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
