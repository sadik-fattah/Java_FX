package com.guercifzone.letstart.ScrollPane;

import javafx.application.Application;
import javafx.scene.control.ScrollPane;
import javafx.scene.web.WebEngine;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
public class ScrollPane_fit extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("HTML");
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        Scene scene = new Scene(new Group());

        VBox root = new VBox();

    final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();


        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setFitToWidth(true);

      scrollPane.setContent(browser);
     webEngine.loadContent("<b>asdf</b>");


        root.getChildren().addAll(scrollPane);
        scene.setRoot(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
