package com.guercifzone.letstart.flowpane;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;



public class Flowpane_AddButton extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Guercifzone");
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        Scene scene = new Scene(new Group());

        FlowPane flowPane =new FlowPane();
        flowPane.setHgap(4);
        flowPane.setVgap(8);
        flowPane.setPrefWrapLength(300);

        for (int i = 0; i< 10;i++){
            flowPane.getChildren().add(new Button("Abcd"));
        }

       scene.setRoot(flowPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
