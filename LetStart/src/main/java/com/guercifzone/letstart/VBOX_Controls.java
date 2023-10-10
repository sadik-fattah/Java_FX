package com.guercifzone.letstart;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class VBOX_Controls extends Application {
    @Override
    public void start(Stage stage){
stage.initStyle(StageStyle.UNDECORATED);
Text text = new Text("Guercif zone");
text.setFont(  new Font(40));
VBox vBox =new VBox();
vBox.getChildren().add(text);
final Scene scene = new Scene(vBox,300,250);
scene.setFill(null);
stage.setScene(scene);
stage.show();
    }
public static void  main (String[]args){
        launch(args);
}
}
