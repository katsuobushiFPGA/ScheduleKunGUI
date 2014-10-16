package test;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.text.Text;

public class WindowController implements Initializable {

    @FXML
    private ComboBox<Integer> schedule1_h;
    @FXML
    private ComboBox<Integer> schedule1_m;
    @FXML
    private ComboBox<Integer> schedule2_h;
    @FXML
    private ComboBox<Integer> schedule2_m;
    @FXML
    private ComboBox<Integer> schedule3_h;
    @FXML
    private ComboBox<Integer> schedule3_m;
    @FXML
    private ComboBox<Integer> schedule4_h;
    @FXML
    private ComboBox<Integer> schedule4_m;
    @FXML
    private ComboBox<Integer> schedule5_h;
    @FXML
    private ComboBox<Integer> schedule5_m;
    @FXML
    private ComboBox<Integer> schedule6_h;
    @FXML
    private ComboBox<Integer> schedule6_m;

    @FXML
    private Text schedule1_t;
    @FXML
    private Text schedule2_t;
    @FXML
    private Text schedule3_t;
    @FXML
    private Text schedule4_t;
    @FXML
    private Text schedule5_t;
    @FXML
    private Text schedule6_t;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // ëIëçÄñ⁄ÇéwíËÇ∑ÇÈ
    	schedule1_h.getSelectionModel().select(1);

    }
}