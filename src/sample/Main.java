package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextBuilder;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));


//        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root, 1024 , 700));
        primaryStage.setResizable(false);
        primaryStage.show();

        Text t = TextBuilder.create().text("This is a text sample").build();
        t.setText("This is a text sample");
        t.setFont(Font.font ("Verdana", 20));
        t.setFill(Color.RED);



    }


    public static void main(String[] args) {
        launch(args);
    }
}
