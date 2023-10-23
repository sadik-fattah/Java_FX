package com.guercifzone.ui_controls.Labels;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Labels_img extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new Group());
        stage.setTitle("Label Sample");
        stage.setWidth(400);
        stage.setHeight(180);

        HBox hbox = new HBox();
        Image image = new Image("https://png.pngtree.com/png-vector/20190115/ourmid/pngtree-vector-search-icon-png-image_320926.jpg");
        Label label1 = new Label("Search");
        label1.setGraphic(new ImageView(image));

        hbox.setSpacing(10);
        hbox.getChildren().add((label1));
        ((Group) scene.getRoot()).getChildren().add(hbox);

        stage.setScene(scene);
        stage.show();

    }
}
