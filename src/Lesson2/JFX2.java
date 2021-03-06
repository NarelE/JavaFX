package Lesson2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// СЛУШАТЕЛЬ

public class JFX2 extends Application implements EventHandler<ActionEvent>{
    Button button;//объект класса Button

    public static void main(String[] args) {
        launch(args);// метод для того чтобы Java поняла что мы работаем с JFX
    }

    @Override
    public void start(Stage primaryStage) throws Exception { //метод для начала работы с окном
        primaryStage.setTitle("Второй урок на JavaFX!!"); // название окна
        button = new Button("Нажми на меня))");// название кнопки
        button.setOnAction(this);// обозначает что когда пользователь нажмет на ЭТУ кнопку будет использован метод который заключен в этом классе
        StackPane layout = new StackPane();//создаем разметку
        layout.getChildren().add(button);//в разметку помещаем кнопку
        Scene scene = new Scene(layout,300,300);//задаем место действия с разметкой и параметрами окна
        primaryStage.setScene(scene);//указщываем в каком окне будет место действия scene
        primaryStage.show();//отображаем в окне
    }

    @Override
    public void handle(ActionEvent event) {//метод будет использован при нажатии на кнопку
    if(event.getSource()==button){
        System.out.println("Консоль");
}
    }
}
