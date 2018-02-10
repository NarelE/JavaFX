package Lesson9;//GridPane - по виду  Сетка

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class JFX9 extends Application{
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFX Урок 9 - GridPane");
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(10);// вертикальный отступ
        gridPane.setHgap(12);//горизонтальный отступ

        Label nameLabel = new Label("Имя пользователя");
        GridPane.setConstraints(nameLabel,0,0);// координаты расположение по сетке

        TextField nameInput = new TextField("Евгений");
        GridPane.setConstraints(nameInput,1,0);

        Label passLabel = new Label("Пароль");
        GridPane.setConstraints(passLabel,0,1);// координаты расположение по сетке

        TextField passInput = new TextField();
        passInput.setPromptText("Пароль");//подсказка которая будет ичезать при нажатии на поле
        GridPane.setConstraints(passInput,1,1);

        Button loginButton = new Button("Войти");
        GridPane.setConstraints(loginButton,1,2);

        gridPane.getChildren().addAll(nameInput,nameLabel,passInput,passLabel,loginButton);

        Scene scene = new Scene(gridPane,350,200);
        window.setScene(scene);

        window.show();

    }
}
