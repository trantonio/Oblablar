package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerPlay implements Initializable {


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

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
