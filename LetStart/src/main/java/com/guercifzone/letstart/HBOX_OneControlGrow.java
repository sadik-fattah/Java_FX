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

public class HBOX_OneControlGrow extends Application{
    @Override
    public void start(Stage primarystage) throws Exception {
primarystage.setTitle("One Control Grow");
Group group = new Group();
Scene scene = new Scene(group,300,250,Color.WHITE);

HBox hBox = new HBox();
TextField field =new TextField();
HBox.setHgrow(field,Priority.ALWAYS);
hBox.getChildren().addAll(new Label("search:"),field,new Button("GO"));

group.getChildren().add(hBox);
primarystage.setScene(scene);
primarystage.show();
    }
}

