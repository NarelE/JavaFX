package Work;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Fasad extends Application {
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        window.setTitle("Расчет площади, S");
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(10);// вертикальный отступ
        gridPane.setHgap(12);//горизонтальный отступ

        Label heightLabel = new Label("Высота стены, м:");
        GridPane.setConstraints(heightLabel, 0, 0);// координаты расположение по сетке
        TextField heightInput = new TextField();
        GridPane.setConstraints(heightInput, 1, 0);

        Label widthLabel = new Label("Ширина стены, м:");
        GridPane.setConstraints(widthLabel, 0, 1);// координаты расположение по сетке
        TextField widthInput = new TextField();
        // passInput.setPromptText("Пароль");//подсказка которая будет ичезать при нажатии на поле
        GridPane.setConstraints(widthInput, 1, 1);

        Label widthWindowLabel = new Label("Ширина первого окна, м:");
        GridPane.setConstraints(widthWindowLabel, 0, 2);// координаты расположение по сетке
        TextField widthWindowInput = new TextField();
        GridPane.setConstraints(widthWindowInput, 1, 2);

        Label heightWindowLabel = new Label("Высота первого окна, м:");
        GridPane.setConstraints(heightWindowLabel, 0, 3);// координаты расположение по сетке
        TextField heightWindowInput = new TextField();
        GridPane.setConstraints(heightWindowInput, 1, 3);

        Label quantityWindowLabel = new Label("Количество окон, шт:");
        GridPane.setConstraints(quantityWindowLabel, 0, 4);// координаты расположение по сетке
        TextField quantityWindowInput = new TextField();
        GridPane.setConstraints(quantityWindowInput, 1, 4);


        Label slopeWindowLabel = new Label("Ширина откоса, м:");
        GridPane.setConstraints(slopeWindowLabel, 0, 5);// координаты расположение по сетке
        TextField slopeWindowInput = new TextField();
        GridPane.setConstraints(slopeWindowInput, 1, 5);

        Button loginButton = new Button("Расчитать");
        loginButton.setOnAction(e ->isNumber(heightInput,widthInput,widthWindowInput,heightWindowInput,quantityWindowInput,slopeWindowInput));


        GridPane.setConstraints(loginButton, 1, 6);

        gridPane.getChildren().addAll(heightInput, heightLabel, widthInput, widthLabel, widthWindowLabel, widthWindowInput, heightWindowLabel, heightWindowInput, quantityWindowLabel, quantityWindowInput, slopeWindowLabel, slopeWindowInput, loginButton);

        Scene scene = new Scene(gridPane, 350, 250);
        window.setScene(scene);

        window.show();
    }

    private void isNumber(TextField input, TextField input2,TextField input3,TextField input4,TextField input5, TextField input6) {
    try {
        double a = Double.parseDouble(input.getText());
        double b = Double.parseDouble(input2.getText());
        double c = Double.parseDouble(input3.getText());
        double d = Double.parseDouble(input4.getText());
        int n = Integer.parseInt(input5.getText());
        double e = Double.parseDouble(input6.getText());

        double S = (a * b) - (c * d * n) + n*((e * 2 * d) + (e * c));

        System.out.println("Полеезная площадь, м2: " + S);
    }
    catch(NumberFormatException e){
        System.out.println("Некорректный вводх данны!!!");

        }
    }
}



