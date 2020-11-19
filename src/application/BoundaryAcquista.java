package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class BoundaryAcquista {
	@FXML
	private SplitPane split;
	@FXML
	private AnchorPane ap1;
	@FXML
	private AnchorPane ap2;
	@FXML
	private Label header;
	
	@FXML
	private Label labelN;
	@FXML
	private Label labelCosto;
	@FXML
	private Label labelQ;
	@FXML
	private Label labelP;
	@FXML
	private Label labelT;
	@FXML
	private Label nome;
	@FXML
	private Label costo;
	@FXML
	private TextField quantita;
	@FXML
	private Label prezzo;
	@FXML
	private Label totale;
	@FXML
	private Label labelPag;
	@FXML
	private RadioButton buttonCC;
	@FXML
	private RadioButton buttonCash;
	@FXML
	private Button calcola;
	
	private ControllerAcquista CA;
	
	@FXML
	private void pagaCC() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("pagamentoCC.fxml"));

        Scene scene = new Scene(root);       
       

        Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
        primaryStage.show();
        buttonCash.setDisable(true);

		
	}
	@FXML
	private void pagaCash() throws IOException
	{
		Parent root = FXMLLoader.load(getClass().getResource("pagamentoContrassegno.fxml"));

        Scene scene = new Scene(root);       
       

        Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
        primaryStage.show();
        buttonCC.setDisable(true);

		
	}
	@FXML 
	private void initialize()
	{
		nome.setText("");
		costo.setText("");
		quantita.setText("");
		prezzo.setText("");
		totale.setText("");
	}
	
	@FXML
	//prendere importo in query
	private void importo()
	{
		
		CA.totale();
		//settare in label import 
		//quantita * prezzo
	}
	public BoundaryAcquista()
	{
		CA=new ControllerAcquista();
	}
	
	
	

}
