package application;

import java.io.IOException;

import b.s.o.Libro;
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
	private TableView<Libro> table;
	@FXML
	private TableColumn<Libro,String> titolo=new TableColumn<>("Titolo");
	@FXML
	private TableColumn<Libro,String> autore=new TableColumn<>("Autore");
	@FXML
	private TableColumn<Libro,String> lingua=new TableColumn<>("Lingua");
	@FXML
	private TableColumn<Libro,String> categoria=new TableColumn<>("Categoria");
	@FXML
	private TableColumn<Libro,String> isbn=new TableColumn<>("CodiceIsbn");
	@FXML
	private TableColumn<Libro,String> editore=new TableColumn<>("Editore");
	@FXML
	private TableColumn<Libro,String> desc=new TableColumn<>("Descrizione");
	@FXML
	private TableColumn<Libro,String> pagine=new TableColumn<>("Pagine");
	@FXML
	private TableColumn<Libro,String> acquisti=new TableColumn<>("Acquisti");
	@FXML
	private TableColumn<Libro,String> data=new TableColumn<>("DataPubb");
	@FXML
	private TableColumn<Libro,String> prezzo=new TableColumn<>("Prezzo");
	@FXML
	private TableColumn<Libro,Boolean> disponibilita=new TableColumn<>("Disponibilita");
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
	
	@FXML
	private void verifica()
	{
		
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
	    data.setCellValueFactory(new PropertyValueFactory<>("DataPubb"));
	    prezzo.setCellValueFactory(new PropertyValueFactory<>("Prezzo"));
	    disponibilita.setCellValueFactory(new PropertyValueFactory<>("Disponibilita"));
	    
	   /* table.getColumns().add(titolo);
	    table.getColumns().add(autore);
	    table.getColumns().add(lingua);
	    table.getColumns().add(categoria);
	    table.getColumns().add(isbn);
	    table.getColumns().add(editore);
	    table.getColumns().add(desc);
	    table.getColumns().add(pagine);
	    table.getColumns().add(acquisti);
	    table.getColumns().add(data);
	    table.getColumns().add(prezzo);
	    table.getColumns().add(disponibilita);
	    */
	    
	//    Libro l=new Libro("pippo","pluto","it","fantasy","8004163529","paperino","fanstasy ambientato a cani gatti",300,50,2018514,(float) 25.65,null,true);
	    
	   // table.getColumns().add(data);

	   // table.getItems().add(new Libro("pippo","pluto","it","fantasy","8004163529","paperino","fanstasy ","2018514","50.00","300.00","25.65",null,true));
	    

	}
	

}
