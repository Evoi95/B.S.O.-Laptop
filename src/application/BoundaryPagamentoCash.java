package application;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class BoundaryPagamentoCash {
	@FXML
	private Pane panel;
	@FXML
	private GridPane grid;
	@FXML
	private Label header;
	@FXML
	private Label labelN;
	@FXML
	private Label labelC;
	@FXML
	private Label labelVP;
	@FXML
	private Label labelCom;
	@FXML
	private TextField nomeTF;
	@FXML
	private TextField cognomeTF;
	@FXML
	private TextField viaTF;
	@FXML
	private TextArea eventualiArea;
	@FXML
	private Button buttonI;
	@FXML 
	private Button buttonA;	
	
	private ControllerPagamentoCash CPC;
	@FXML
	private void procediCash() throws IOException
	{
		CPC.controlla();
		Stage stage;
		Parent root;
		stage=(Stage)buttonI.getScene().getWindow();
		root=FXMLLoader.load(getClass().getResource("download.fxml"));
		

		
		// Parent root = FXMLLoader.load(getClass().getResource("compravendita.fxml"));
		
	        Scene scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
		/*
		Parent root = FXMLLoader.load(getClass().getResource("download.fxml"));

        Scene scene = new Scene(root);       
       

        Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
        primaryStage.show();
        //buttonCC.setDisable(true);
         * 
         */

	}
	@FXML
	private void annullaCash() throws IOException
	{
		Stage stage;
		Parent root;
		stage=(Stage)buttonA.getScene().getWindow();
		root=FXMLLoader.load(getClass().getResource("acquista.fxml"));
		

		
		// Parent root = FXMLLoader.load(getClass().getResource("compravendita.fxml"));
		
	        Scene scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
	}
	
	public BoundaryPagamentoCash()
	{
		CPC=new ControllerPagamentoCash();
	}
	
	
	
	
	

}
