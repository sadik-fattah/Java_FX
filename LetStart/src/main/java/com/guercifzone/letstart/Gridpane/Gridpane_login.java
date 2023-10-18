package com.guercifzone.letstart.Gridpane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Gridpane_login extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
primaryStage.setTitle(" login form ");
GridPane gridPane = new GridPane();
gridPane.setAlignment(Pos.CENTER);
gridPane.setVgap(10);
gridPane.setHgap(10);
gridPane.setPadding(new Insets(25,25,25,25));

Text scenceTitle = new Text("welocm");
    scenceTitle.setFont(Font.font("Tahoma",FontWeight.NORMAL,20));
    gridPane.add(scenceTitle,0,0,2,1);

    Label lblUsername = new Label("Username:");
    gridPane.add(lblUsername,0,1);
    TextField txtUser = new TextField();
    gridPane.add(txtUser,1,1);
    Label lblPWD = new Label("Password:");
    gridPane.add(lblPWD,0,2);
    PasswordField pwdField = new PasswordField();
    gridPane.add(pwdField,1,2);

    Button btn = new Button("sing in ");
    HBox hBox = new HBox(10);
    hBox.setAlignment(Pos.BOTTOM_RIGHT);
    hBox.getChildren().add(btn);

    gridPane.add(hBox,1,4);
    final Text actiontarget = new Text();
    gridPane.add(actiontarget,1,6);

    btn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            actiontarget.setFill(Color.FIREBRICK);
            actiontarget.setText("Sing in  Button pressed");
        }
    });
    Scene scene = new Scene(gridPane,300,275);
    primaryStage.setScene(scene);
primaryStage.show();
    }
    public static void main(String[] args) {
      Application.launch(args);
    }
}
