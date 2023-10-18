package com.guercifzone.letstart.Gridpane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class GridPane_DialogLogin extends Application {

    public static void main(String[] args) {
       Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
primaryStage.setTitle("dialog login");
BorderPane borderPane = new BorderPane();
borderPane.setPadding(new Insets(10,50,50,50));

HBox hBox = new HBox();
hBox.setPadding(new Insets(20,20,20,30));


GridPane gridPane = new GridPane();
gridPane.setPadding(new Insets(20,20,20,20));
gridPane.setHgap(5);
gridPane.setVgap(5);

Label lblUser = new Label("Username: ");
final TextField txtUser = new TextField();
Label lblpwd = new Label("Password: ");
final PasswordField txtPWD = new PasswordField();
Button btnLogin = new Button("Login");
final Label lblMSG = new Label();

         gridPane.add(lblUser,0,0);
        gridPane.add(txtUser,1,0);
        gridPane.add(lblpwd,0,1);
        gridPane.add(txtPWD,1,1);
        gridPane.add(btnLogin,2,1);
        gridPane.add(lblMSG,1,2);

        btnLogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });
        borderPane.setTop(hBox);
        borderPane.setCenter(gridPane);

        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    }

