package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../view/Loggin.fxml"));

        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root, 1024 , 700));
        primaryStage.setResizable(false);

        primaryStage.show();



//        Text t = TextBuilder.create().text("This is a text sample").build();
//        t.setText("This is a text sample");
//        t.setFont(Font.font ("Verdana", 20));
//        t.setFill(Color.RED);



    }


    public static void main(String[] args) {
        launch(args);
    }
}
