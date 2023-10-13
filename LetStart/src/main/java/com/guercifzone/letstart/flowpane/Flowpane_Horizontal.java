package com.guercifzone.letstart.flowpane;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Flowpane_Horizontal extends Application {

    public void start(Stage stage) throws Exception {
        stage.setTitle("HTML");
        stage.setWidth(500);
        stage.setHeight(500);
        Scene scene = new Scene(new Group());

        FlowPane flow = new FlowPane(Orientation.VERTICAL);
        flow.setVgap(8);
        flow.setHgap(4);
        flow.setPrefWrapLength(300);
        for (int i = 0; i < 10; i++) {
            flow.getChildren().add(new Button("abcd"));
        }
        scene.setRoot(flow);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
