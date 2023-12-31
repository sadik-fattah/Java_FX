package com.guercifzone.letstart;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBOX_HBOX extends Application {
    final Float[] values = new Float[] { -1.0f, 0f, 0.6f, 1.0f };
    final Label[] labels = new Label[values.length];
    final ProgressBar[] pbs = new ProgressBar[values.length];
    final ProgressIndicator[] pins = new ProgressIndicator[values.length];
    final HBox hbs[] = new HBox[values.length];
    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group, 300, 150);
        stage.setScene(scene);
        stage.setTitle("Hbox Vbox");

        for (int i = 0;i<values.length;i++){
            final Label label = labels[i] = new Label();
            label.setText("progress"+values[i]);

            final ProgressBar pg = pbs[i] = new ProgressBar();
            pg.setProgress(values[i]);

            final ProgressIndicator pin = pins[i] = new ProgressIndicator();
            pin.setProgress(values[i]);

            final  HBox hb  = hbs[i] =  new HBox();
           hb.setSpacing(5);
           hb.setAlignment(Pos.CENTER);
           hb.getChildren().addAll(label,pg,pin);
        }


        final VBox vb = new VBox();
        vb.setSpacing(5);
        vb.getChildren().addAll(hbs);
        scene.setRoot(vb);
        stage.show();
    }
}
