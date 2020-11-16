package application;
import java.awt.Label;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.*;

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
	private void pagaCC() {
		
	}
	@FXML
	private void pagaCash()
	{
		
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
	
	
	
	

}
