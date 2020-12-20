package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class BoundaryAcquista implements Initializable {
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
	private Label labelT;
	@FXML
	private TextField nome;
	@FXML
	private Label costo;
	@FXML
	private TextField quantita;
	
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
	@FXML
	private Button link;
	
	
	private ControllerAcquista CA;
	private Scanner input;
	private String scelta;
	//private String 
	
	
	@FXML
	private void pagaCC() throws IOException {
		

	        
		Stage stage;
		Parent root;
		stage=(Stage)buttonCC.getScene().getWindow();
		root=FXMLLoader.load(getClass().getResource("pagamentoCC.fxml"));
		stage.setTitle("Benvenuto nella schermata dell'acquisto con carta credito");


		
		// Parent root = FXMLLoader.load(getClass().getResource("compravendita.fxml"));
		
	        Scene scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
		
		
	}
	@FXML
	private void pagaCash() throws IOException
	{
		 String tot=totale.getText();
	        System.out.println("totale :"+tot);
		
		Stage stage;
		Parent root;
		stage=(Stage)buttonCash.getScene().getWindow();
		root=FXMLLoader.load(getClass().getResource("pagamentoContrassegno.fxml"));
		stage.setTitle("Benvenuto nella schermata dell'acquisto in contanti");


		
		// Parent root = FXMLLoader.load(getClass().getResource("compravendita.fxml"));
		
	        Scene scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
	        
	       /*
		Parent root = FXMLLoader.load(getClass().getResource("pagamentoContrassegno.fxml"));

        Scene scene = new Scene(root);       
       

        Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
        primaryStage.show();
        buttonCC.setDisable(true);
        */

		
	}
	@FXML 
	private void initialize()
	{
		//nome.setText("");
		costo.setText("");
		quantita.setText("");
		totale.setText("");
	}
	
	@FXML
	//prendere importo in query
	private void importo() throws IOException
	{
		if (!nome.getText().equals(""))
		{
			buttonCC.setDisable(false);
			buttonCash.setDisable(false);
			
		if (scelta.equals("libro")) {
			float x=CA.totale(nome.getText(),Integer.parseInt(quantita.getText()));
		costo.setText(""+x);
		float tot;
			tot=x*(Float.parseFloat(quantita.getText()));
			totale.setText(""+tot);
			CA.retAmmontare(totale.getText()); // mette nel pagamento;

		}
		else if(scelta.equals("giornale"))
		{
			float y=CA.totaleG(nome.getText(),Integer.parseInt(quantita.getText()));
		costo.setText(""+y);

		float tot1;
		tot1=y*(Float.parseFloat(quantita.getText()));
		totale.setText(""+tot1);
		CA.retAmmontare(totale.getText()); // mette nel pagamento;

		
		}
		else if(scelta.equals("rivista"))
		{
			float z=CA.totaleR(nome.getText(),Integer.parseInt(quantita.getText()));
			costo.setText(""+z);
			float tot2;
			tot2=z*(Float.parseFloat(quantita.getText()));
			totale.setText(""+tot2);
			CA.retAmmontare(totale.getText()); // mette nel pagamento;

		
		}
		else {
			throw new IOException();
		}

						
		
		
				
		
		
			
			
			
			
		}
		
		//settare in label import 
		//quantita * prezzo
	}
	public BoundaryAcquista()
	{
		CA=new ControllerAcquista();
	}
	@FXML
	private void indietro() throws IOException
	{
		
		Stage stage;
		Parent root;
		stage=(Stage)link.getScene().getWindow();
		root=FXMLLoader.load(getClass().getResource("homePage.fxml"));
		

		
		// Parent root = FXMLLoader.load(getClass().getResource("compravendita.fxml"));
		
	        Scene scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
	        
	       // primaryStage.setTitle("Benvenuto nella schermata di login");	
	       // primaryStage.setScene(newScene);
	       // primaryStage.show();

		
		
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		buttonCC.setDisable(true);
		buttonCash.setDisable(true);
		
		Alert a=new Alert(Alert.AlertType.INFORMATION);
		a.setTitle("Leggere input correttoDownload effettuato");
		//a.setContentText("Libro : titolo   scaricato con successo :"+titolo);
		//a.setContentText("nr odine acquito :"+this.nrOrdine);
		a.setContentText("Leggere da tastiera il tipo di rivista precedetemente scelta : "
				+ "\n scelte possibili:"
				+ "\n giornale - libro - rivista");
		a.setHeaderText(null);
		a.showAndWait();
		
		System.out.println("Leggi tipologia tra giornale - rivista - libro");
		 input = new Scanner(System.in);
		scelta= input.nextLine();
	}
	
	
	

}
