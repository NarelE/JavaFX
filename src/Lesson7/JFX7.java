package Lesson7;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class JFX7 extends Application {
    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Урок 7- Корректное закрытие");

        window.setOnCloseRequest(e ->{
            e.consume();// указывает что закроем окно сами
            closeProgram();
        });// для закрытия через крестик в правом углу

        button = new Button("Closed");
        button.setPrefSize(100,50);
        button.setOnAction(e ->closeProgram());//действие кнопки при ее нажатии

        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);
        Scene scene = new Scene(layout,400,300);
        window.setScene(scene);
        window.show();
    }
    private void closeProgram(){//само действие, печать в кансоль и выход
        System.out.println("Game saved");
        window.close();
    }
}
