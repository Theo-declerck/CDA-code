package com.example.javafxdemo;

import javafx.application.Application;

import java.io.IOException;
import com.example.javafxdemo.PrimaryController;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(App.class.getResource("primary.fxml"));
        Parent root = (Parent) loader.load();
        PrimaryController controller = loader.getController();
        controller.setStage(stage);

        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("TableViews");
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        FXMLLoader loader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        Parent root = loader.load();
        scene.setRoot(root);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
