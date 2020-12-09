package application;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import bso.CartaCredito;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.Stage;



public class BoundaryPagamentoCC implements Initializable {
	
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
	private TextField nomeInput;
	@FXML
	private RadioButton buttonPrendi;
	
	@FXML
	private PasswordField codiceTFCiv;
	
	@FXML
	private TableView<CartaCredito> tableCC;
	@FXML
	private TableColumn<CartaCredito,SimpleStringProperty>nomeUtenteTF=new TableColumn<>("NomeUtente");
	@FXML
	private TableColumn<CartaCredito,SimpleStringProperty>cognomeUtenteTF=new TableColumn<>("CognomeUtente");
	@FXML
	private TableColumn<CartaCredito,SimpleStringProperty>codiceCC=new TableColumn<>("CodiceCarta");
	
	private ControllerPagamentoCC CPCC;
	@FXML
	private void procediCC() throws IOException
	{
		
		CPCC.controllaPag(/* codice,dataScad*/);
		Stage stage;
		Parent root;
		stage=(Stage)buttonI.getScene().getWindow();
		root=FXMLLoader.load(getClass().getResource("download.fxml"));
		
		stage.setTitle("Benvenuto nella schermata per il download");
		
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
		stage.setTitle("benvenuto nella schermata del riepilogo ordine");
		

		
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
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		nomeUtenteTF.setCellValueFactory(new PropertyValueFactory<>("nomeUser"));
		cognomeUtenteTF.setCellValueFactory(new PropertyValueFactory<>("cognomeUser"));
		codiceCC.setCellValueFactory(new PropertyValueFactory<>("numeroCC"));



		//8832734893
	}
	@FXML
	private void popolaTabella() throws SQLException
	{try {
		
	
		String nomeUt=nomeInput.getText();
		if (nomeUt.equals("")|| nomeUt.equals(null))
		{
			buttonPrendi.setDisable(true);
			throw new IOException();
		}
		else {
			buttonPrendi.setDisable(false);
			tableCC.setItems(CPCC.getCarteCredito(nomeUt));
		}
	}catch(IOException e)
	{
		e.getMessage();
	}
	buttonPrendi.setDisable(false);
	}

}
