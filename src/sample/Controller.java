package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    //Creamos la clase juego que controla el juego principal
    Juego j = new Juego();
    // String que controla la parabra aleatoria que aparece.
    private String word = j.randomWord();
    //Controlamos que el juego ha empezado
    private boolean start = true;
    //Ventana emergente de ajustes
    static Stage settingWindows = new Stage();


    @FXML
    private TextField tfLoggin;

    @FXML
    private TextField tfPassword;

    @FXML
    ImageView imgIcon;
    @FXML
    private void btLoggin(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/principal.fxml"));
        Scene scene = new Scene(root, 1024, 720);
        Stage appStage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.toFront();
        appStage.show();
    }

    @FXML
    private TextField tfWords;

    @FXML
    private Text txWords;

    public void btCheck(ActionEvent event) {
        checkCorrect();
    }

    @FXML
    public void onEnter(ActionEvent event) {
        checkCorrect();
    }

    @FXML
    private void btPlay(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("../view/Player.fxml"));
        Scene scene = new Scene(root, 1024, 720);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.toFront();
        appStage.show();

    }
    //Abre la ventana de los ajustes
    @FXML
    private void btSettings(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/settings.fxml"));
        settingWindows.setScene(new Scene(root, 450, 400));
        settingWindows.show();

    }

    //Le da la funcion de cerrar la ventana al boton
    @FXML
    private void btClose(ActionEvent event) {
        Platform.exit();
    }

    //Comprueba que la palabra esta correcta y añade una nueva
    public void checkCorrect() {


        String wordField = tfWords.getText();
        if (start) {
            start = false;
        } else {
            System.out.println(wordField + "-------" + word);
            if (wordField.equals(word)) {
                System.out.println("Same");
            } else {
                System.out.println("Fake");
            }
        }
        word = j.randomWord();
        txWords.setText(word);
        tfWords.setText("");

    }
    @FXML
    private void btReturn(ActionEvent e) {
        settingWindows.close();
    }

    public void newWindows() {
//        btnOpenNewWindow.setOnAction(new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent event) {
//                Parent root;
//                try {
//                    root = FXMLLoader.load(getClass().getClassLoader().getResource("path/to/other/view.fxml"), resources);
//                    Stage stage = new Stage();
//                    stage.setTitle("My New Stage Title");
//                    stage.setScene(new Scene(root, 450, 450));
//                    stage.show();
//                    // Hide this current window (if this is what you want)
//                    ((Node)(event.getSource())).getScene().getWindow().hide();
//                }
//                catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}
