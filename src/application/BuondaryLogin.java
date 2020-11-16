package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class BuondaryLogin implements Initializable {
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
	@FXML
	private ImageView image;
	private ControllerLogin cL;
	
	// @FXML
	  //  private void handleButtonAction(ActionEvent event) {
	      //  label.setText("Hello World!");
	    //}
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		cL=new ControllerLogin();
		
	}
	@FXML
	private void controlla()
	{
		
		System.out.println("Controllo button");
		String u;
		 String p;
		u=textFieldusername.getText();
		p=pwdField.getText();
		
		cL.controlla(u, p,"user","pwd");
	}
	@FXML
	private void annulla()
	{
textFieldusername.setText("");
pwdField.setText("");}
}
