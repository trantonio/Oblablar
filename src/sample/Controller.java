package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    private void btClose(ActionEvent event)
    {
        System.out.close();
    }
}
