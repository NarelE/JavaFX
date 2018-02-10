package Lesson8; //разметка BorderPane

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class JFX8 extends Application{
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFX Урок 8 - BorderPane");

        HBox topMenu = new HBox(5);
        Button button1= new Button("Файл");
        Button button2= new Button("Вид");
        Button button3= new Button("Правка");
        topMenu.setAlignment(Pos.CENTER);
        topMenu.getChildren().addAll(button1,button2,button3);

        VBox leftMenu = new VBox(5);
        Button button4= new Button("Скопировать");
        Button button5= new Button("Вырезать");
        Button button6= new Button("Вставить");
        leftMenu.setAlignment(Pos.CENTER_LEFT);
        leftMenu.getChildren().addAll(button4,button5,button6);

        VBox rightMenu = new VBox(5);
        Button button7= new Button("Покрасить");
        Button button8= new Button("Залить");
        Button button9= new Button("Отменить");
        rightMenu.setAlignment(Pos.CENTER_RIGHT);
        rightMenu.getChildren().addAll(button7,button8,button9);

        HBox bottomMenu = new HBox(5);
        Button button10 = new Button("Закрыть");
        bottomMenu.setAlignment(Pos.CENTER);
        bottomMenu.setStyle("-fx-background-color: #c0eef3");
        bottomMenu.getChildren().add(button10);

        BorderPane borderPane  = new BorderPane();
        borderPane.setTop(topMenu);
        borderPane.setLeft(leftMenu);
        borderPane.setRight(rightMenu);
        borderPane.setBottom(bottomMenu);

        Scene scene = new Scene(borderPane,400,250);
        window.setScene(scene);
        window.show();

    }
}
