module com.guercifzone.letstart {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.guercifzone.letstart to javafx.fxml;
    exports com.guercifzone.letstart;
    exports com.guercifzone.letstart.hbox;

    opens com.guercifzone.letstart.hbox to javafx.fxml;
    exports com.guercifzone.letstart.vbox;
    opens com.guercifzone.letstart.vbox to javafx.fxml;


    exports com.guercifzone.letstart.flowpane;
    opens com.guercifzone.letstart.flowpane to javafx.fxml;
}