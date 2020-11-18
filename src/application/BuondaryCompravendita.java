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
	private TableColumn<Libro,String> col1=new TableColumn<>("Titolo");
	@FXML
	private TableColumn<Libro,String> col2=new TableColumn<>("Autore");
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
