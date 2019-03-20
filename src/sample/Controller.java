package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

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

    //Le da la funcion de cerrar la ventana al boton
    @FXML
    private void btClose(ActionEvent event) {
        Platform.exit();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
