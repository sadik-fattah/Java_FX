package com.guercifzone.letstart.flowpane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Flowpane_Controls  extends  Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Flowpane_Controls");

        //Adding FlowPane
        FlowPane flowPane = new FlowPane();
        flowPane.setPadding(new Insets(10, 10, 10, 10));
        flowPane.setVgap(4);
        flowPane.setHgap(4);

        flowPane.setPrefWrapLength(210);

        Button btn = new Button();

        for (int i = 0; i < 8; i++) {

            btn = new Button("Button");
            btn.setPrefSize(100, 50);
            flowPane.getChildren().add(btn);
        }
        Scene scene = new Scene(flowPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}