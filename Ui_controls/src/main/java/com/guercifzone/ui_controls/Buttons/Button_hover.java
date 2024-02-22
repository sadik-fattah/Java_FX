package com.guercifzone.ui_controls.Buttons;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Button_hover extends Application {
    DropShadow shadow = new DropShadow();
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Button Hover");
        stage.setWidth(300);
        stage.setHeight(190);

        VBox vbox = new VBox();
        vbox.setLayoutX(20);
        vbox.setLayoutY(20);

        final Button button1 = new Button("hovret");

        button1.addEventHandler(MouseEvent.MOUSE_ENTERED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        button1.setEffect(shadow);
button1.setScaleX(1.5);
button1.setScaleY(1.5);
                    }
                });

        button1.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        button1.setEffect(null);
                        button1.setScaleX(1);
                        button1.setScaleY(1);
                    }
                });

        vbox.getChildren().add(button1);
        vbox.setSpacing(10);
        ((Group) scene.getRoot()).getChildren().add(vbox);

        stage.setScene(scene);
        stage.show();
    }
}
