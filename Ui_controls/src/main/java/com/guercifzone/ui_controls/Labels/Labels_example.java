package com.guercifzone.ui_controls.Labels;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Labels_example extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("ComboBoxSample");
        Scene scene = new Scene(new Group(), 450, 250);

        Label label1 = new Label ("Label 1");
        Label label2 = new Label ("Label 2");
        label2.setFont(new Font("Arial", 30));
        Label label3 = new Label ("Label 3");
        label3.setTextFill(Color.web("#0076a3"));
        Label label4 = new Label("Label 4");
        label4.setRotate(270);
            Label label5  =new Label("Label5");
            label5.setTranslateY(50);


        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(5, 5, 5, 5));

        grid.add(new Label(" example 1: "), 0, 0);
        grid.add(label1, 1, 0);
        grid.add(new Label(" example  2: "), 0, 1);
        grid.add(label2, 1, 1);
        grid.add(new Label(" example  3: "), 0, 2);
        grid.add(label3, 1, 2);
        grid.add(new Label(" example 4: "), 0, 3);
        grid.add(label4, 1, 3);
        grid.add(new Label(" example  5: "), 0, 4);
        grid.add(label5, 1, 4);

        Group root = (Group) scene.getRoot();
        root.getChildren().add(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
