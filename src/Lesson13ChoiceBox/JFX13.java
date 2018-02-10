package Lesson13ChoiceBox;  // Прослушивание событий
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class JFX13 extends Application{

    Stage window;
    Scene scene;
    Button button;
    public static void main(String[] args){launch (args);}

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFX Урок 13 - ChoiceBox - прослушивание событий");

        //кнопка
        button = new Button("Выбрать");

        //ChoiceBox
        ChoiceBox<String> choiceBox = new ChoiceBox<>(); // создаем выдвижной список со Строковыми параметрами(String)

        choiceBox.getItems().add("Форрест"); // добовляем элементы в список
        choiceBox.getItems().addAll("Джон Уик","Эйс","Мия"); // добовляем нескорлько элементов

        choiceBox.getSelectionModel().select(0); // делаем для того что бы в списке стоял первый элемент
        button.setOnAction(e -> getChoice(choiceBox)); // кнопке задали действие, при нажатии выполняется метод getChoice
        // следим за изменением choiceBox
        choiceBox.getSelectionModel().selectedItemProperty().addListener(
                (v,oldValue,newValue) -> System.out.println("Старое значение: "+oldValue+" Заменилось на новое: " + newValue)); // v - весь список, oldValue - старое значение, newValue - новое значение
        // getSelectionModel - отвечает за тип выподающего списка
        //selectedItemProperty - это тот элемент который мы выбрали в списке

        //разметка
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(choiceBox,button);

        Scene scene = new Scene(layout,350,200);
        window.setScene(scene);
        window.show();
    }
    private void getChoice(ChoiceBox<String> choiceBox) {
        String hero = choiceBox.getValue(); // в переменную hero помещаем значение которое было выбрано
        System.out.println("Кнопка: " + hero); // выводит на консоль при нажатии кнопки
        }
    }
