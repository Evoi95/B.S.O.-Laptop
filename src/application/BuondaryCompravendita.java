package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import b.s.o.Libro;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
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

public class BuondaryCompravendita implements Initializable{
	@FXML
	private Pane panel;
	@FXML
	private Label header;
	@FXML
	private TableView<Libro> table;
	@FXML
	private TableColumn<Libro,SimpleStringProperty> titolo=new TableColumn<>("Titolo");
	@FXML
	private TableColumn<Libro,SimpleStringProperty> autore=new TableColumn<>("Autore");
	@FXML
	private TableColumn<Libro,SimpleStringProperty> lingua=new TableColumn<>("Lingua");
	@FXML
	private TableColumn<Libro,SimpleStringProperty> categoria=new TableColumn<>("Categoria");
	@FXML
	private TableColumn<Libro,SimpleStringProperty> isbn=new TableColumn<>("CodiceIsbn");
	@FXML
	private TableColumn<Libro,SimpleStringProperty> editore=new TableColumn<>("Editore");
	@FXML
	private TableColumn<Libro,SimpleStringProperty> desc=new TableColumn<>("Descrizione");
	@FXML
	private TableColumn<Libro,SimpleIntegerProperty> nrPagine=new TableColumn<>("PagineLibro");
	@FXML
	private TableColumn<Libro,SimpleIntegerProperty> nrAcquisti=new TableColumn<>("Acquistati");
	@FXML
	private TableColumn<Libro,SimpleStringProperty> data=new TableColumn<>("DataPubb");
	@FXML
	private TableColumn<Libro,SimpleIntegerProperty> prezzo=new TableColumn<>("Prezzo");
	@FXML
	private TableColumn<Libro,SimpleBooleanProperty> disponibilita=new TableColumn<>("Disponibilita");
	@FXML
	private TableColumn<Libro,SimpleIntegerProperty> copie=new TableColumn<>("CopieRimanenti");
	/*
	 * TODO
	 * sistemare altre righe tabella dal db
	 */
	@FXML
	private Button buttonL;
	@FXML
	private TextField entryText;
	@FXML
	private Button buttonV;
	@FXML
	private Button buttonA;
	
	private ControllerCompravendita CCV;
	
	@FXML
	private boolean verifica()
	{
		return false;
		//verifico se libro e presente
		//String libro=entryText.getText();
		//return CCV.disponibilitaLibro( libro);
	}
	@FXML
	private void procedi() throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("acquista.fxml"));

        Scene scene = new Scene(root);       
       

        Stage primaryStage = new Stage();
		primaryStage.setScene(scene);
        primaryStage.show();

		
	}
	@FXML
	private void vediLista()
	{
	   
	    System.out.println("Vedi lista");
	    
	    

	    
	    table.setItems(CCV.getLibri());

	   

	}
	
	public BuondaryCompravendita()
	{
		CCV=new ControllerCompravendita();
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		titolo.setCellValueFactory(new PropertyValueFactory<>("Titolo"));
	    autore.setCellValueFactory(new PropertyValueFactory<>("Autore"));
	    lingua.setCellValueFactory(new PropertyValueFactory<>("Lingua"));
	    categoria.setCellValueFactory(new PropertyValueFactory<>("Categoria"));
	    isbn.setCellValueFactory(new PropertyValueFactory<>("CodiceIsbn"));
	    editore.setCellValueFactory(new PropertyValueFactory<>("Editore"));
	    desc.setCellValueFactory(new PropertyValueFactory<>("Descrizione"));
	    copie.setCellValueFactory(new PropertyValueFactory<>("CopieRimanenti"));
	    nrPagine.setCellValueFactory(new PropertyValueFactory<>("numPag"));
	    nrAcquisti.setCellValueFactory(new PropertyValueFactory<>("numAcq"));
	    data.setCellValueFactory(new PropertyValueFactory<>("DataPubb"));
	    prezzo.setCellValueFactory(new PropertyValueFactory<>("Prezzo"));
	    disponibilita.setCellValueFactory(new PropertyValueFactory<>("Disponibilita"));
	    
		
	}
	
	

}
