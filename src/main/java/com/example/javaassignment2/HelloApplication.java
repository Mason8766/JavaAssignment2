package com.example.javaassignment2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.javaassignment2.APIUtility.getGamesFromJSON;
import static com.example.javaassignment2.APIUtility.getMoviesFromAPI;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, InterruptedException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        getMoviesFromAPI("blah");
        RAWGResponse test = getGamesFromJSON();
        System.out.println(test);
    }

    public static void main(String[] args) {
        launch();
    }
}