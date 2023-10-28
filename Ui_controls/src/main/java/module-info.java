module com.guercifzone.ui_controls {
    requires javafx.controls;
    requires javafx.fxml;
   requires javafx.graphics;

    opens com.guercifzone.ui_controls to javafx.fxml;
    exports com.guercifzone.ui_controls;

    opens com.guercifzone.ui_controls.Labels to javafx.fxml;
    exports  com.guercifzone.ui_controls.Labels;

    opens  com.guercifzone.ui_controls.Buttons to javafx.fxml;
    exports  com.guercifzone.ui_controls.Buttons;
}