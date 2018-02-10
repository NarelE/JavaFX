package Lesson10;//Ввод данных

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class JFX10 extends Application {
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFX Урок 10 - Ввод данных");
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(10);// вертикальный отступ
        gridPane.setHgap(12);//горизонтальный отступ

        Label nameLabel = new Label("Имя пользователя");
        GridPane.setConstraints(nameLabel, 0, 0);// координаты расположение по сетке

        TextField nameInput = new TextField("Евгений");
        GridPane.setConstraints(nameInput, 1, 0);

        Label passLabel = new Label("Пароль");
        GridPane.setConstraints(passLabel, 0, 1);// координаты расположение по сетке

        TextField passInput = new TextField();
        passInput.setPromptText("Пароль");//подсказка которая будет ичезать при нажатии на поле
        GridPane.setConstraints(passInput, 1, 1);

        Label ageLabel = new Label("Возраст");
        GridPane.setConstraints(ageLabel, 0, 2);// координаты расположение по сетке

        TextField ageInput = new TextField();
        GridPane.setConstraints(ageInput, 1, 2);


        Button loginButton = new Button("Войти");
        loginButton.setOnAction(e -> isNumber(ageInput, ageInput.getText()));
        GridPane.setConstraints(loginButton, 1, 3);

        gridPane.getChildren().addAll(nameInput, nameLabel, passInput, passLabel, ageInput, ageLabel, loginButton);

        Scene scene = new Scene(gridPane, 350, 200);
        window.setScene(scene);

        window.show();
    }

    private boolean isNumber(TextField input, String message) {
        try {
            int age = Integer.parseInt(input.getText());

            if(age%10==1){
                System.out.println("Пользователю " + age + " год");
            }
            else if ((age >= 5 && age <= 20) || (age >= 25 && age <= 30) || (age >= 35 && age <= 40) || (age >= 45 && age <= 50) || (age >= 55 && age <= 60) || (age >= 65 && age <= 70) || (age >= 75 && age <= 80) || (age >= 85 && age <= 90) || (age >= 95 && age <= 100)) {
                System.out.println("Пользователю " + age + " лет");
            } else {
                System.out.println("Пользователю " + age + " года");
                return true;
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка " + message + " не является числом");
                    }

        return false;
    }
}



