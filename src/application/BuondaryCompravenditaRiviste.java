package application;

import java.net.URL;
import java.util.ResourceBundle;

import factoryBook.Raccolta;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

public class BuondaryCompravenditaRiviste implements Initializable{
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
	private void getLibri()
	{
		
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
	
	
	
	
	
	

}
