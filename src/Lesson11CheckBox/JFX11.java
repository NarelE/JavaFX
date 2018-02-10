package Lesson11CheckBox;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JFX11 extends Application {

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFX Урок 11 - CheckBox");

        //CheckBox
        CheckBox box1= new CheckBox("Стен");
        CheckBox box2= new CheckBox("Картмен");
        CheckBox box3= new CheckBox("Кени");
        CheckBox box4= new CheckBox("Каил");

       // box1.setSelected(true); // изночально box1 будет выбран

        //кнопка
        button = new Button("Голосовать!");
        button.setOnAction(e-> hendlerOption(box1,box2,box3,box4));

        //разметка
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(button,box1,box2,box3,box4);

        Scene scene = new Scene(layout,350,200);
        window.setScene(scene);
        window.show();
    }
    private void hendlerOption(CheckBox box1,CheckBox box2,CheckBox box3,CheckBox box4){
        String message = "Вы проголосавали за:\n";
        if(box1.isSelected()){
            message +="Стена\n";
        if(box2.isSelected())
            message +="Картмена\n";
        if(box3.isSelected())
            message +="Кени\n";
        if(box4.isSelected())
            message +="Каила\n";
        System.out.println(message);}
        else System.out.println("Вы не проголосовали!!!!");

    }
}
