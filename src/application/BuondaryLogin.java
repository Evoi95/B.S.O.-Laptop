package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
	private Controller cL;
	
	//private Stage stage;
	
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		cL=new Controller();
		
	}
	
	@FXML
	private void controlla() throws IOException
	{
		
		System.out.println("Controllo button");
		String u;
		 String p;
		u=textFieldusername.getText();
		p=pwdField.getText();
		
		cL.controlla(u, p);
		
		
		
	
		
		// carico seconda schermata
		Parent root = FXMLLoader.load(getClass().getResource("compravendita.fxml"));

        Scene scene = new Scene(root);       
       

        Stage primaryStage = new Stage();
        primaryStage.setTitle("Ecco il riepilogo");
		primaryStage.setScene(scene);
        primaryStage.show();

		
		
		
	}
	@FXML
	private void annulla()
	{
		textFieldusername.setText("");
		pwdField.setText("");}
	}
