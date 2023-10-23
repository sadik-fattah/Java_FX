package com.guercifzone.letstart.ScrollPane;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
public class ScrollPane_fit extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("ScrollPane fit");
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        Scene scene = new Scene(new Group());

        VBox root = new VBox();
final WebView webView = new WebView();
final WebEngine webEngine = webView.getEngine();
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setFitToWidth(true);

        scrollPane.setContent(webView);
webEngine.loadContent("<b>guercifzone</b>");

        root.getChildren().addAll(scrollPane);
        scene.setRoot(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
