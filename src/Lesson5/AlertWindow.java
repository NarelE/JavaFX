package Lesson5;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;  // модификация шрифта
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.geometry.*;

public class AlertWindow {
    public static void display(String title, String message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(350);
        window.setMinHeight(200);

        Label label = new Label(message);
        label.setFont(Font.font(20));

        Button closeButton = new Button("Закрыть!!!");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(20);
        layout.getChildren().addAll(label,closeButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }

}
