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

public class BuondaryCompravenditaGiornali implements Initializable {

	@FXML
	private Pane panel;
	@FXML
	private Label header;
	@FXML
	private TableView<Raccolta> table;
	@FXML
	private TableColumn<Raccolta,SimpleStringProperty> titolo=new TableColumn<>("Titolo");
	@FXML
	private TableColumn<Raccolta,SimpleStringProperty> lingua=new TableColumn<>("Lingua");
	@FXML
	private TableColumn<Raccolta,SimpleStringProperty> editore=new TableColumn<>("Editore");	
	@FXML	
	private TableColumn<Raccolta,SimpleStringProperty> dataPubb=new TableColumn<>("DataPubblicazione");
	@FXML
	private TableColumn<Raccolta,SimpleIntegerProperty> copie=new TableColumn<>("CopieRimanenti");
	@FXML	
	private TableColumn<Raccolta,SimpleFloatProperty> prezzo=new TableColumn<>("Prezzo");
	@FXML
	private TableColumn<Raccolta,Image>foto=new TableColumn<>("Foto");
	
	@FXML
	private TableColumn<Raccolta,SimpleIntegerProperty> disponibilita=new TableColumn<>("Disponibilita");
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
	private Button buttonI;
	@FXML
	private Button buttonA;
	
	
	
	private ControllerCompravenditaGiornali CCG;
	
	
	
	@FXML
	private void prendiGiornali() throws SQLException
	{
	   
	   
	 	   table.setItems(CCG.getGiornali());   
	 
	}
	
	public BuondaryCompravenditaGiornali()
	{
		CCG=new ControllerCompravenditaGiornali();
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		titolo.setCellValueFactory(new PropertyValueFactory<>("titolo"));
	    lingua.setCellValueFactory(new PropertyValueFactory<>("lingua"));
	    editore.setCellValueFactory(new PropertyValueFactory<>("editore"));
	    dataPubb.setCellValueFactory(new PropertyValueFactory<>("dataPubb"));
	    copie.setCellValueFactory(new PropertyValueFactory<>("copieRimanenti"));
	    prezzo.setCellValueFactory(new PropertyValueFactory<>("prezzo"));
	    foto.setCellValueFactory(new PropertyValueFactory<>("foto"));
	    disponibilita.setCellValueFactory(new PropertyValueFactory<>("disponibilita"));

	    	

	}
	@FXML
	private void torna() throws IOException
	{
		Stage stage;
		Parent root;
		stage=(Stage)buttonI.getScene().getWindow();
		root=FXMLLoader.load(getClass().getResource("homePage.fxml"));
		stage.setTitle("Benvenuto nella schermata del riepilogo ordine");


		
		// Parent root = FXMLLoader.load(getClass().getResource("compravendita.fxml"));
		
	        Scene scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
	}
	@FXML
	public void verifica()
	{
		CCG.disponibilitaGiornale(entryText.getText());
	}
	
	@FXML
	public void procedi() throws IOException
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

	}
	
	

}
