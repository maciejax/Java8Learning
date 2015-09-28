package com.websoft.java8.learn02;

/**
 * Created by Maciej on 2015-09-25.
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
    Simple JavaFX app, prints output on event handle
 */

public class EventHandlerApp01 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Button button = new Button("Trigger Action event...");
        button.setOnAction(new DemoEventHandler());
        stage.setScene(new Scene(button));
        stage.show();
    }

    class DemoEventHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            System.out.println(event.toString());
        }
    }
}
