package application;

import java.io.IOException;

import b.s.o.Libro;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
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
	private TableColumn<Libro,Integer> pagine=new TableColumn<>("Pagine");
	@FXML
	private TableColumn<Libro,Integer> acquisti=new TableColumn<>("Acquisti");
	@FXML
	private TableColumn<Libro,Integer> data=new TableColumn<>("DataPubb");
	@FXML
	private TableColumn<Libro,Float> prezzo=new TableColumn<>("Prezzo");
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
		
	}

}
