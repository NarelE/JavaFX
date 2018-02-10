package Lesson14ComboBox;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JFX14 extends Application{

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {launch(args);}

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFX Урок 14 - ComboBox");
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll();
        comboBox.setPromptText("Выбери своего исполнителя");
    }
}