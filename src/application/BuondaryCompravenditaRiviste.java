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
	private TableColumn<Raccolta,SimpleStringProperty> tipologia=new TableColumn<>("Tipologia");
	@FXML
	private TableColumn<Raccolta,SimpleStringProperty> titolo=new TableColumn<>("Titolo");
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
	private TableColumn<Raccolta,SimpleIntegerProperty> pagine=new TableColumn<>("NumeroPagine");
	@FXML	
	private TableColumn<Raccolta,SimpleFloatProperty> prezzo=new TableColumn<>("Prezzo");
	@FXML
	private TableColumn<Raccolta,Image>foto=new TableColumn<>("Foto");
	@FXML
	private TableColumn<Raccolta,SimpleIntegerProperty> disponibilita=new TableColumn<>("Disponibilita");
	@FXML
	private Button buttonL;
	@FXML
	private Button buttonI;
	@FXML
	private void getRiviste()
	{
		try {
			CCR.getLibri();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		titolo.setCellValueFactory(new PropertyValueFactory<>("titolo"));
	     autore.setCellValueFactory(new PropertyValueFactory<>("autore"));
	//    isbn.setCellValueFactory(new PropertyValueFactory<>("codIsbn"));
	    lingua.setCellValueFactory(new PropertyValueFactory<>("lingua"));
	    	 editore.setCellValueFactory(new PropertyValueFactory<>("editore"));
	    descrizione.setCellValueFactory(new PropertyValueFactory<>("descrizione"));
	    dataPubb.setCellValueFactory(new PropertyValueFactory<>("dataPubb"));
	   pagine.setCellValueFactory(new PropertyValueFactory<>("numPag"));

	    
	  

	    prezzo.setCellValueFactory(new PropertyValueFactory<>("prezzo"));
	    
	    foto.setCellValueFactory(new PropertyValueFactory<>("foto"));
	    disponibilita.setCellValueFactory(new PropertyValueFactory<>("disponibilita"));

		
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
	
	
	
	
	
	

}
