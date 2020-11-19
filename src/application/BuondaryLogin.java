package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

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
	
	//private Stage stage;
	
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		cL=new ControllerLogin();
		
	}
	
	@FXML
	private void controlla() throws IOException
	{
		
		System.out.println("Controllo button");
		String u;
		 String p;
		 Boolean v;//validazone
		u=textFieldusername.getText();
		p=pwdField.getText();
		
		v=cL.controlla(u, p);
		
		//System.out.println("v vale :"+v);
		if(v)
		{			//System.out.println("v in if vale :"+v);

			// carico seconda schermata

			Parent root = FXMLLoader.load(getClass().getResource("compravendita.fxml"));

	        Scene scene = new Scene(root);  	       

	        Stage primaryStage = new Stage();
			primaryStage.setScene(scene);
	        primaryStage.show();

			
			

		}
		else {
			Alert a=new Alert(Alert.AlertType.ERROR);
			a.setTitle("Errore nelle credenziali");
			a.setContentText("Credenizali immesse sbagliate");
			a.setHeaderText(null);
			a.showAndWait();
		}
		
		
		
	
		
				
	}
	@FXML
	private void annulla()
	{
		textFieldusername.setText("");
		pwdField.setText("");}
	}
