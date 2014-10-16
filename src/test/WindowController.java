package test;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class WindowController implements Initializable {
	private List<Integer> list_t = new ArrayList<>();//time
	private List<String> list_s = new ArrayList<>();//schedule

	/* Schedule Timer */
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

    /* Schedule Text */
    @FXML
    private TextField schedule1_t;
    @FXML
    private TextField schedule2_t;
    @FXML
    private TextField schedule3_t;
    @FXML
    private TextField schedule4_t;
    @FXML
    private TextField schedule5_t;
    @FXML
    private TextField schedule6_t;

    @FXML
    private Button generate;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
    //Generate Button Click Event!!
    @FXML
    public void onClick(ActionEvent event) throws Throwable{
       	generate.setDisable(true);
       	/* generate schedule time */
       	list_t.add(schedule1_h.getValue());
       	list_t.add(schedule1_m.getValue());
       	list_t.add(schedule2_h.getValue());
       	list_t.add(schedule2_m.getValue());
       	list_t.add(schedule3_h.getValue());
       	list_t.add(schedule3_m.getValue());
       	list_t.add(schedule4_h.getValue());
       	list_t.add(schedule4_m.getValue());
       	list_t.add(schedule5_h.getValue());
       	list_t.add(schedule5_m.getValue());
       	list_t.add(schedule6_h.getValue());
       	list_t.add(schedule6_m.getValue());

       	/* generate schedule text */
        list_s.add(schedule1_t.getText());
        list_s.add(schedule2_t.getText());
        list_s.add(schedule3_t.getText());
        list_s.add(schedule4_t.getText());
        list_s.add(schedule5_t.getText());
        list_s.add(schedule6_t.getText());

        Main.GenerateMain(list_t, list_s);
       	generate.setDisable(false);
    }
}