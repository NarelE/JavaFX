package Lesson4;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// Многоокнность

public class JFX4 extends Application {
    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window=primaryStage;
        Label label1 = new Label("Приветствую вас. Вы в первом окне!!");
        Button button1 = new Button("Портал во второе окно!");
        button1.setOnAction(e ->window.setScene(scene2));
        VBox layout1 = new VBox(20);//разметка вертикальная, растояние между ними 20 пикселей
        layout1.getChildren().addAll(label1,button1);
        scene1 = new Scene(layout1,500,300);

        Label label2 = new Label("Приветствую вас вы во втором окне!");
        Button butto2 = new Button("Это окно отстой пошли назад в первое");
        butto2.setOnAction(e ->window.setScene(scene1));
        HBox layout2 = new HBox(20);
        layout2.getChildren().addAll(label2,butto2);
        scene2 = new Scene(layout2,500,300);
        window.setScene(scene1);
        window.setTitle("Урок 4");
        window.show();
    }
}