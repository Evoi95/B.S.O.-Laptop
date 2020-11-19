package application;

import java.io.IOException;

import b.s.o.Libro;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class BuondaryCompravendita {
	@FXML
	private Pane panel;
	@FXML
	private Label header;
	@FXML
	private TableView<Libro> table=new TableView<Libro>();
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
	private TableColumn<Libro,SimpleStringProperty> pagine=new TableColumn<>("Pagine");
	@FXML
	private TableColumn<Libro,SimpleStringProperty> acquisti=new TableColumn<>("Acquisti");
	@FXML
	private TableColumn<Libro,SimpleStringProperty> data=new TableColumn<>("DataPubb");
	@FXML
	private TableColumn<Libro,SimpleStringProperty> prezzo=new TableColumn<>("Prezzo");
	@FXML
	private TableColumn<Libro,SimpleBooleanProperty> disponibilita=new TableColumn<>("Disponibilita");
	@FXML
	private TableColumn<Libro,Integer> copie=new TableColumn<>("CopieRimanenti");
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
		//verifico se libro è presente
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
	    
	    titolo.setCellValueFactory(new PropertyValueFactory<>("Titolo"));
	    autore.setCellValueFactory(new PropertyValueFactory<>("Autore"));
	    lingua.setCellValueFactory(new PropertyValueFactory<>("Lingua"));
	    categoria.setCellValueFactory(new PropertyValueFactory<>("Categoria"));
	    isbn.setCellValueFactory(new PropertyValueFactory<>("CodiceIsbn"));
	    editore.setCellValueFactory(new PropertyValueFactory<>("Editore"));
	    desc.setCellValueFactory(new PropertyValueFactory<>("Descrizione"));
	    pagine.setCellValueFactory(new PropertyValueFactory<>("Pagine"));
	    acquisti.setCellValueFactory(new PropertyValueFactory<>("Acquisti"));
	    data.setCellValueFactory(new PropertyValueFactory<>("DataPubblicazione"));
	    prezzo.setCellValueFactory(new PropertyValueFactory<>("Prezzo"));
	    disponibilita.setCellValueFactory(new PropertyValueFactory<>("Disponibilita"));
	    
	   CCV.catalogo();
	   // table.getItems().add(new Libro("pippo","pluto","it","fantasy","8004163529","paperino","fanstasy","100","50","5-5-2020","74",0, null, true,15));


	}
	
	public BuondaryCompravendita()
	{
		CCV=new ControllerCompravendita();
	}
	

}
