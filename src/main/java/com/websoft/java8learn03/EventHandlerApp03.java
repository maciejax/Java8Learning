package com.websoft.java8learn03;

/**
 * Created by Maciej on 2015-09-25.
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class EventHandlerApp03 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Button button = new Button("Trigger Action event...");
        //button.setOnAction(e -> System.out.println(e.toString()));
        button.setOnAction(System.out::println);
        stage.setScene(new Scene(button));
        stage.show();
    }


}
