package application

import java.io.IOException
import java.net.URL
import java.sql.SQLException
import java.util.ResourceBundle
import factoryBook.Raccolta
import javafx.beans.property.SimpleFloatProperty
import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.*
import javafx.scene.control.cell.PropertyValueFactory
import javafx.scene.image.Image
import javafx.scene.layout.*
import javafx.stage.Stage

class BuondaryCompravenditaLibri implements Initializable {
	@FXML Pane panel
	@FXML Label header
	@FXML TableView<Raccolta> table
	@FXML TableColumn<Raccolta, SimpleStringProperty> titolo = new TableColumn("Titolo")
	@FXML TableColumn<Raccolta, SimpleIntegerProperty> numPag = new TableColumn("NumPag")
	@FXML TableColumn<Raccolta, SimpleStringProperty> isbn = new TableColumn("CodiceIsbn")
	@FXML TableColumn<Raccolta, SimpleStringProperty> editore = new TableColumn("Editore")
	@FXML TableColumn<Raccolta, SimpleStringProperty> autore = new TableColumn("Autore")
	@FXML TableColumn<Raccolta, SimpleStringProperty> lingua = new TableColumn("Lingua")
	@FXML TableColumn<Raccolta, SimpleStringProperty> categoria = new TableColumn("Categoria")
	@FXML TableColumn<Raccolta, SimpleStringProperty> data = new TableColumn("DataPubblicazione")
	@FXML TableColumn<Raccolta, SimpleStringProperty> recensione = new TableColumn("Recensione")
	@FXML TableColumn<Raccolta, SimpleIntegerProperty> nrCopie = new TableColumn("Copie Vendute")
	@FXML package TableColumn<Raccolta, SimpleStringProperty> desc = new TableColumn("Descrizione")
	@FXML TableColumn<Raccolta, SimpleIntegerProperty> disponibilita = new TableColumn("Disponibilita")
	@FXML TableColumn<Raccolta, SimpleFloatProperty> prezzo = new TableColumn("Prezzo")
	@FXML TableColumn<Raccolta, SimpleIntegerProperty> copie = new TableColumn("CopieRimanenti")
	@FXML TableColumn<Raccolta, Image> img = new TableColumn("Image")
	/*
	 * TODO
	 * sistemare altre righe tabella dal db
	 */
	@FXML Button buttonL
	@FXML TextField entryText
	@FXML Button buttonV
	@FXML Button buttonA
	@FXML Button buttonI
	ControllerCompravenditaLibri CCV

	@FXML def private void verifica() throws SQLException {
		CCV.disponibilitaLibro(entryText.getText()) // verifico se libro e presente
		// String libro=entryText.getText();
		// return CCV.disponibilitaLibro( libro);
	}

	@FXML def private void procedi() throws IOException {
		var Stage stage
		var Parent root
		stage = buttonA.getScene().getWindow() as Stage
		root = FXMLLoader.load(getClass().getResource("acquista.fxml"))
		stage.setTitle("Benvenuto nella schermata del riepilogo ordine")
		var Scene scene = new Scene(root)
		stage.setScene(scene)
		stage.show()
	}

	@FXML def private void vediListaLibri() throws SQLException {
		table.setItems(CCV.getLibri())
	}

	new() {
		CCV = new ControllerCompravenditaLibri()
	}

	override void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		titolo.setCellValueFactory(new PropertyValueFactory("titolo"))
		numPag.setCellValueFactory(new PropertyValueFactory("numPag"))
		isbn.setCellValueFactory(new PropertyValueFactory("codIsbn"))
		editore.setCellValueFactory(new PropertyValueFactory("editore"))
		autore.setCellValueFactory(new PropertyValueFactory("autore"))
		lingua.setCellValueFactory(new PropertyValueFactory("lingua"))
		categoria.setCellValueFactory(new PropertyValueFactory("categoria"))
		data.setCellValueFactory(new PropertyValueFactory("dataPubb"))
		recensione.setCellValueFactory(new PropertyValueFactory("recensione"))
		nrCopie.setCellValueFactory(new PropertyValueFactory("nrCopie"))
		desc.setCellValueFactory(new PropertyValueFactory("desc"))
		disponibilita.setCellValueFactory(new PropertyValueFactory("disponibilita"))
		prezzo.setCellValueFactory(new PropertyValueFactory("prezzo"))
		copie.setCellValueFactory(new PropertyValueFactory("copieRim"))
		img.setCellValueFactory(new PropertyValueFactory("Img"))
	}

	@FXML def private void torna() throws IOException {
		var Stage stage
		var Parent root
		stage = buttonA.getScene().getWindow() as Stage
		root = FXMLLoader.load(getClass().getResource("homePage.fxml"))
		stage.setTitle("Benvenuto nella schermata della home page")
		var Scene scene = new Scene(root)
		stage.setScene(scene)
		stage.show()
	}
}
