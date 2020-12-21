package application;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
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
	private TableColumn<CartaCredito,SimpleStringProperty>codiceCC=new TableColumn<>("CodiceCarta");
	
	private ControllerPagamentoCC CPCC;
	private Boolean esito;
	@FXML
	private void procediCC() throws IOException
	{
		
		String cod=codiceTF.getText();
		
		 esito=CPCC.controllaPag(scadTF.getText(),cod);
		if (esito.equals(true))
		{
		Stage stage;
		Parent root;
		stage=(Stage)buttonI.getScene().getWindow();
		root=FXMLLoader.load(getClass().getResource("download.fxml"));
		
		stage.setTitle("Benvenuto nella schermata per il download");
		
		
	        Scene scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
		}
		else {
			System.out.println("riprovare");
			Stage stage;
			Parent root;
			stage=(Stage)buttonI.getScene().getWindow();
			root=FXMLLoader.load(getClass().getResource("PagamentoCC.fxml"));
			
			stage.setTitle("Benvenuto nella schermata per il pagamento");
			
			
		        Scene scene = new Scene(root);
		        stage.setScene(scene);
		        stage.show();
		}
		
		

	}
	@FXML
	private void annullaCC() throws IOException
	{
		Stage stage;
		Parent root;
		stage=(Stage)buttonA.getScene().getWindow();
		root=FXMLLoader.load(getClass().getResource("acquista.fxml"));
		stage.setTitle("benvenuto nella schermata del riepilogo ordine");
		

		
		
	        Scene scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
	}
	public BoundaryPagamentoCC() throws Exception
	{
		CPCC=new ControllerPagamentoCC();
	
	}
	@FXML
	public void registraCC() throws java.text.ParseException, SQLException
	{
		java.util.Date data=null;

		String nome=nomeTF.getText();

		String cognome=cognomeTF.getText();
		String codice=codiceTF.getText();
		String d=scadTF.getText();
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/mm/dd");
		data =  formatter.parse(d);
		java.sql.Date sql=new java.sql.Date(data.getTime());
		 



		String civ=codiceTFCiv.getText();
		
		
		
			CPCC.aggiungiCartaDB(nome,cognome,codice,sql,civ,(float) 0.0);
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		codiceCC.setCellValueFactory(new PropertyValueFactory<>("numeroCC"));



	}
	@FXML
	private void popolaTabella() throws SQLException
	{try {
		
	
		String nomeUt=nomeInput.getText();
		System.out.println("Nome utemte :"+nomeUt);
		if (nomeUt.equals("")|| nomeUt.equals(null))
		{
			buttonPrendi.setDisable(true);
			throw new IOException();
		}
		else {
			buttonPrendi.setDisable(false);
			tableCC.setItems(CPCC.ritornaElencoCC(nomeUt));
		}
	}catch(IOException e)
	{
		e.getMessage();
	}
	buttonPrendi.setDisable(false);
	}

}
