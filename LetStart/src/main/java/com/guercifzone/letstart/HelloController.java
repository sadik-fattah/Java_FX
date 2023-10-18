package com.guercifzone.letstart;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class HelloController {


    public void onclicktop(ActionEvent actionEvent) {
        System.out.println("btn top clicked");
    }

    public void onclickleft(ActionEvent actionEvent) {
        System.out.println("btn left clicked");
    }

    public void onclickcenter(ActionEvent actionEvent) {
        System.out.println("btn center clicked");
    }

    public void onclickright(ActionEvent actionEvent) {
        System.out.println("btn right clicked");
    }

    public void onclickbuttom(ActionEvent actionEvent) {
        System.out.println("btn buttom clicked");
    }
}
