package application;

import java.io.IOException;

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
	private TableView table;
	@FXML
	private TableColumn col1;
	@FXML
	private TableColumn col2;
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
