module com.guercifzone.letstart {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.guercifzone.letstart to javafx.fxml;
    exports com.guercifzone.letstart;
    exports com.guercifzone.letstart.hbox;

    opens com.guercifzone.letstart.hbox to javafx.fxml;
    exports com.guercifzone.letstart.vbox;
    opens com.guercifzone.letstart.vbox to javafx.fxml;

   exports com.guercifzone.letstart.flowpane;
    opens com.guercifzone.letstart.flowpane to javafx.fxml;

    exports com.guercifzone.letstart.Gridpane;
    opens com.guercifzone.letstart.Gridpane to javafx.fxml;

    exports com.guercifzone.letstart.ScrollPane;
    opens com.guercifzone.letstart.ScrollPane to javafx.fxml;
}