package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;



public class BoundaryPagamentoCC {
	
	//private   Stage primaryStage;

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
	private Label cartaC;
	@FXML
	private Label labelS;
	@FXML
	private TextField nomeTF;
	@FXML
	private TextField cognomeTF;
	@FXML
	private TextField codiceTF;
	@FXML
	private TextField scadTF;
	@FXML
	private Button buttonI;
	@FXML
	private Button buttonA;
	
	@FXML
	private Label labelCiv;
	@FXML
	private Button buttonReg;
	
	@FXML
	private PasswordField codiceTFCiv;
	
	private ControllerPagamentoCC CPCC;
	@FXML
	private void procediCC() throws IOException
	{
		
		CPCC.controllaPag(/* codice,dataScad*/);
		Stage stage;
		Parent root;
		stage=(Stage)buttonI.getScene().getWindow();
		root=FXMLLoader.load(getClass().getResource("download.fxml"));
		
		stage.setTitle("Benvenuto nella schermata per pagare contrassegno");
		
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
       // buttonCC.setDisable(true);
        
        */

	}
	@FXML
	private void annullaCC() throws IOException
	{
		Stage stage;
		Parent root;
		stage=(Stage)buttonA.getScene().getWindow();
		root=FXMLLoader.load(getClass().getResource("acquista.fxml"));
		

		
		// Parent root = FXMLLoader.load(getClass().getResource("compravendita.fxml"));
		
	        Scene scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
	//	this.primaryStage.close();
	}
	public BoundaryPagamentoCC() throws Exception
	{
		CPCC=new ControllerPagamentoCC();
	
	}
	@FXML
	public void registraCC()
	{
		CPCC.aggiungiCartaDB();
	}

}
