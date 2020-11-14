package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class ControllerLogin {
	@FXML
	private Label labelUser,labelPwd,labelB;
	@FXML 
	private javafx.scene.layout.GridPane grid;
	@FXML
	private TextField textFieldusername;
	@FXML
	private PasswordField pwdField;
	@FXML
	private Button buttonI,buttonA;
	@FXML
	private Pane panel;
	
	// @FXML
	  //  private void handleButtonAction(ActionEvent event) {
	      //  label.setText("Hello World!");
	    //}
	@FXML
	public void initialize()
	{
		System.out.println("CIAO");
	}
}
