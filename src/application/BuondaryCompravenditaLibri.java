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
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class BuondaryCompravenditaLibri implements Initializable {
	@FXML
	private Pane panel;
	@FXML
	private Label header;
	@FXML
	private TableView<Raccolta> table;
	@FXML
	private TableColumn<Raccolta, SimpleStringProperty> titolo = new TableColumn<>("Titolo");
	@FXML
	private TableColumn<Raccolta, SimpleIntegerProperty> numPag = new TableColumn<>("NumPag");
	@FXML
	private TableColumn<Raccolta, SimpleStringProperty> isbn = new TableColumn<>("CodiceIsbn");
	@FXML
	private TableColumn<Raccolta, SimpleStringProperty> editore = new TableColumn<>("Editore");
	@FXML
	private TableColumn<Raccolta, SimpleStringProperty> autore = new TableColumn<>("Autore");
	@FXML
	private TableColumn<Raccolta, SimpleStringProperty> lingua = new TableColumn<>("Lingua");
	@FXML
	private TableColumn<Raccolta, SimpleStringProperty> categoria = new TableColumn<>("Categoria");
	@FXML
	private TableColumn<Raccolta, SimpleStringProperty> data = new TableColumn<>("DataPubblicazione");
	@FXML
	private TableColumn<Raccolta, SimpleStringProperty> recensione = new TableColumn<>("Recensione");
	@FXML
	private TableColumn<Raccolta, SimpleIntegerProperty> nrCopie = new TableColumn<>("Copie Vendute");
	@FXML
	TableColumn<Raccolta, SimpleStringProperty> desc = new TableColumn<>("Descrizione");
	@FXML
	private TableColumn<Raccolta, SimpleIntegerProperty> disponibilita = new TableColumn<>("Disponibilita");
	@FXML
	private TableColumn<Raccolta, SimpleFloatProperty> prezzo = new TableColumn<>("Prezzo");
	@FXML
	private TableColumn<Raccolta, SimpleIntegerProperty> copie = new TableColumn<>("CopieRimanenti");
	@FXML
	private TableColumn<Raccolta, Image> img = new TableColumn<>("Image");
	/*
	 * TODO sistemare altre righe tabella dal db
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
	private Button buttonI;

	private ControllerCompravenditaLibri CCV;

	@FXML
	private void verifica() throws SQLException {
		CCV.disponibilitaLibro(entryText.getText());// verifico se libro e presente
		// String libro=entryText.getText();
		// return CCV.disponibilitaLibro( libro);
	}

	@FXML
	private void procedi() throws IOException {

		Stage stage;
		Parent root;
		stage = (Stage) buttonA.getScene().getWindow();
		root = FXMLLoader.load(getClass().getResource("acquista.fxml"));
		stage.setTitle("Benvenuto nella schermata del riepilogo ordine");

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

	}

	@FXML
	private void vediListaLibri() throws SQLException {

		table.setItems(CCV.getLibri());

	}

	public BuondaryCompravenditaLibri() {
		CCV = new ControllerCompravenditaLibri();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		titolo.setCellValueFactory(new PropertyValueFactory<>("titolo"));
		numPag.setCellValueFactory(new PropertyValueFactory<>("numPag"));
		isbn.setCellValueFactory(new PropertyValueFactory<>("codIsbn"));
		editore.setCellValueFactory(new PropertyValueFactory<>("editore"));
		autore.setCellValueFactory(new PropertyValueFactory<>("autore"));
		lingua.setCellValueFactory(new PropertyValueFactory<>("lingua"));
		categoria.setCellValueFactory(new PropertyValueFactory<>("categoria"));
		data.setCellValueFactory(new PropertyValueFactory<>("dataPubb"));
		recensione.setCellValueFactory(new PropertyValueFactory<>("recensione"));
		nrCopie.setCellValueFactory(new PropertyValueFactory<>("nrCopie"));

		desc.setCellValueFactory(new PropertyValueFactory<>("desc"));
		disponibilita.setCellValueFactory(new PropertyValueFactory<>("disponibilita"));
		prezzo.setCellValueFactory(new PropertyValueFactory<>("prezzo"));
		copie.setCellValueFactory(new PropertyValueFactory<>("copieRim"));

		img.setCellValueFactory(new PropertyValueFactory<>("Img"));

	}

	@FXML
	private void torna() throws IOException {
		Stage stage;
		Parent root;
		stage = (Stage) buttonA.getScene().getWindow();
		root = FXMLLoader.load(getClass().getResource("homePage.fxml"));
		stage.setTitle("Benvenuto nella schermata della home page");

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}
