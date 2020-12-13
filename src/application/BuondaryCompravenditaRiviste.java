package application;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import factoryBook.Raccolta;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class BuondaryCompravenditaRiviste implements Initializable{
	
	private ControllerCompravenditaRiviste CCR;
	
	@FXML
	private Pane panel;
	@FXML
	private Label header;
	@FXML
	private TableView<Raccolta> table;
	@FXML
	private TableColumn<Raccolta,SimpleStringProperty> titolo=new TableColumn<>("Titolo");
	@FXML
	private TableColumn<Raccolta,SimpleStringProperty> tipologia=new TableColumn<>("Tipologia");
	@FXML
	private TableColumn<Raccolta,SimpleStringProperty> autore=new TableColumn<>("Autore");
	@FXML
	private TableColumn<Raccolta,SimpleStringProperty> lingua=new TableColumn<>("Lingua");	
	@FXML
	private TableColumn<Raccolta,SimpleStringProperty> editore=new TableColumn<>("Editore");
	@FXML	
	TableColumn<Raccolta,SimpleStringProperty> descrizione=new TableColumn<>("Descrizione");
	@FXML	
	private TableColumn<Raccolta,SimpleStringProperty> dataPubb=new TableColumn<>("DataPubblicazione");
	@FXML
	private TableColumn<Raccolta,SimpleIntegerProperty> disponibilita=new TableColumn<>("Disponibilita");
	@FXML	
	private TableColumn<Raccolta,SimpleFloatProperty> prezzo=new TableColumn<>("Prezzo");
	@FXML
	private TableColumn<Raccolta,SimpleIntegerProperty> copieRim=new TableColumn<>("CopieRimanenti");
	@FXML
	private TableColumn<Raccolta,Image>foto=new TableColumn<>("Foto");
	@FXML
	private TableColumn<Raccolta,SimpleIntegerProperty>id=new TableColumn<>("ID");
	@FXML
	private Button buttonL;
	@FXML
	private Button buttonI;
	@FXML
	private Button buttonA;
	@FXML
	private Button buttonV;
	@FXML
	private TextField dataTF;
	
	@FXML
	private void getRiviste() throws SQLException
	{
		//System.out.println(CCR.getRivisteE());
		table.setItems(CCR.getRivisteE());
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		titolo.setCellValueFactory(new PropertyValueFactory<>("titolo"));
	    tipologia.setCellValueFactory(new PropertyValueFactory<>("tipologia"));

	     autore.setCellValueFactory(new PropertyValueFactory<>("autore"));	
	     editore.setCellValueFactory(new PropertyValueFactory<>("editore"));
	    lingua.setCellValueFactory(new PropertyValueFactory<>("lingua"));
	    descrizione.setCellValueFactory(new PropertyValueFactory<>("descrizione"));
	    dataPubb.setCellValueFactory(new PropertyValueFactory<>("dataPubb"));
	    disponibilita.setCellValueFactory(new PropertyValueFactory<>("disp"));
	   prezzo.setCellValueFactory(new PropertyValueFactory<>("prezzo"));	    

	   copieRim.setCellValueFactory(new PropertyValueFactory<>("copieRim"));
	    foto.setCellValueFactory(new PropertyValueFactory<>("foto"));
	    id.setCellValueFactory(new PropertyValueFactory<>("id"));

		
	}
	
	public BuondaryCompravenditaRiviste()
	{
		CCR=new ControllerCompravenditaRiviste();
	}
	@FXML
	private void torna() throws IOException
	{
		Stage stage;
		Parent root;
		stage=(Stage)buttonI.getScene().getWindow();
		root=FXMLLoader.load(getClass().getResource("homePage.fxml"));
		stage.setTitle("Benvenuto nella schermata della homePage");


		
		// Parent root = FXMLLoader.load(getClass().getResource("compravendita.fxml"));
		
	        Scene scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
	}
	
	@FXML
	private void verifica()
	{
		CCR.disponibilitaRiviste(dataTF.getText());//verifico se libro e presente

	}
	@FXML
	private void procedi() throws IOException
	{
		Stage stage;
		Parent root;
		stage=(Stage)buttonA.getScene().getWindow();
		root=FXMLLoader.load(getClass().getResource("acquista.fxml"));
		stage.setTitle("Benvenuto nella schermata del riepilogo ordine");


		
		// Parent root = FXMLLoader.load(getClass().getResource("compravendita.fxml"));
		
	        Scene scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
		
		/*
		Parent root = FXMLLoader.load(getClass().getResource("acquista.fxml"));

        Scene scene = new Scene(root);       
       

        Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
        primaryStage.show();
        */

        
        

	}
	
	
	
	
	
	

}
