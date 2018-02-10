package Lesson5;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;

public class JFX5 extends Application {
    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Урок 5");

        button = new Button("Нажми меня!");
        button.setPrefSize(120, 60);
        button.setOnAction(e ->AlertWindow.display("Свойства","Работае оно"));

        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);
        Scene scene = new Scene(layout,400,300);
        window.setScene(scene);
        window.show();
    }
}
