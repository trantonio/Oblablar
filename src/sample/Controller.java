package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


//    @FXML private TextArea taWords;
//    public void btCheck(ActionEvent event){
//
//    }
    @FXML private Text txWords;
    public void btCheck(ActionEvent event){
        txWords.setText("Words");
//        taWords.setText("Area");

    }

    @FXML
    private void btPlay(ActionEvent event) throws IOException {

        System.out.println("Boton del play");
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        Scene scene = new Scene(root);
//        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        appStage.setScene(scene);
//        appStage.toFront();
//        appStage.show();
    }
    //Le da la funcion de cerrar la ventana al boton
    @FXML
    private void btClose(ActionEvent event) {
        Platform.exit();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
