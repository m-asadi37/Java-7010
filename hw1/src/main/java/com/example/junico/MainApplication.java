package com.example.junico;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/junico/view/main-view.fxml"));
        Scene scene = new Scene(loader.load());

        stage.setTitle("Simple Social Media");
        stage.setScene(scene);
        stage.setWidth(700);
        stage.setHeight(600);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(MainApplication.class, args);
    }
}