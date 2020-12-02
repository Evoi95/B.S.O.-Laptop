package application;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import factoryBook.Raccolta;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class BuondaryCompravendita implements Initializable{
	@FXML
	private Pane panel;
	@FXML
	private Label header;
	@FXML
	private TableView<Raccolta> table;
	@FXML
	private TableColumn<Raccolta,SimpleStringProperty> titolo=new TableColumn<>("Titolo");
	@FXML
	private TableColumn<Raccolta,SimpleIntegerProperty> numPag=new TableColumn<>("NumPag");
	@FXML
	private TableColumn<Raccolta,SimpleStringProperty> codIsbn=new TableColumn<>("CodiceIsbn");
	@FXML
	private TableColumn<Raccolta,SimpleStringProperty> editore=new TableColumn<>("Autore");	
	@FXML
	private TableColumn<Raccolta,SimpleStringProperty> autore=new TableColumn<>("Editore");
	@FXML
	private TableColumn<Raccolta,SimpleStringProperty> lingua=new TableColumn<>("Lingua");
	@FXML
	private TableColumn<Raccolta,SimpleStringProperty> categoria=new TableColumn<>("Categoria");
	@FXML	
	private TableColumn<Raccolta,SimpleStringProperty> dataPubb=new TableColumn<>("DataPubb");
	@FXML
	private TableColumn<Raccolta,SimpleStringProperty> recensione=new TableColumn<>("Recensione");
	@FXML
	private TableColumn<Raccolta,SimpleIntegerProperty> nrCopie=new TableColumn<>("Acquistati");
	@FXML	
	TableColumn<Raccolta,SimpleStringProperty> desc=new TableColumn<>("Descrizione");
	@FXML
	private TableColumn<Raccolta,SimpleIntegerProperty> disponibilita=new TableColumn<>("Disponibilita");
	@FXML	
	private TableColumn<Raccolta,SimpleFloatProperty> prezzo=new TableColumn<>("Prezzo");
	@FXML
	private TableColumn<Raccolta,SimpleIntegerProperty> copieRim=new TableColumn<>("CopieRimanenti");
	@FXML
	private TableColumn<Raccolta,Image>img=new TableColumn<>("Image");
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
	private Button buttonR;
	@FXML
	private Button buttonG;
	
	
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
	@FXML
	private void vediListaLibri() throws SQLException
	{
	   
	   
	 	   table.setItems(CCV.getLibri());   
	 
	}
	@FXML
	private void vediListaRiviste()
	{
		table.setItems(CCV.getRiviste());
	}
	 @FXML
	 private void vediListaGiornali()
	 {
			table.setItems(CCV.getGiornali());

	 }
	
	public BuondaryCompravendita()
	{
		CCV=new ControllerCompravendita();
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		titolo.setCellValueFactory(new PropertyValueFactory<>("Titolo"));
	    numPag.setCellValueFactory(new PropertyValueFactory<>("NumeroPagine"));
	    codIsbn.setCellValueFactory(new PropertyValueFactory<>("CodiceIsbn"));
	    editore.setCellValueFactory(new PropertyValueFactory<>("Editore"));
	    autore.setCellValueFactory(new PropertyValueFactory<>("Autore"));
	    lingua.setCellValueFactory(new PropertyValueFactory<>("Lingua"));
	    categoria.setCellValueFactory(new PropertyValueFactory<>("Categoria"));
	    dataPubb.setCellValueFactory(new PropertyValueFactory<>("DataPubblicazione"));
	    recensione.setCellValueFactory(new PropertyValueFactory<>("Recensione"));
	    nrCopie.setCellValueFactory(new PropertyValueFactory<>("CopieVendute"));

	    desc.setCellValueFactory(new PropertyValueFactory<>("Descrizione"));
	    disponibilita.setCellValueFactory(new PropertyValueFactory<>("Disponibilita"));
	    prezzo.setCellValueFactory(new PropertyValueFactory<>("Prezzo"));
	    copieRim.setCellValueFactory(new PropertyValueFactory<>("CopieRimanenti"));
	    
	    img.setCellValueFactory(new PropertyValueFactory<>("Images"));

	    

	}
	
	

}
