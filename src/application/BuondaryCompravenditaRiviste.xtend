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
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.control.TextField
import javafx.scene.control.cell.PropertyValueFactory
import javafx.scene.image.Image
import javafx.scene.layout.Pane
import javafx.stage.Stage

class BuondaryCompravenditaRiviste implements Initializable {
	ControllerCompravenditaRiviste CCR
	@FXML Pane panel
	@FXML Label header
	@FXML TableView<Raccolta> table
	@FXML TableColumn<Raccolta, SimpleStringProperty> titolo = new TableColumn("Titolo")
	@FXML TableColumn<Raccolta, SimpleStringProperty> autore = new TableColumn("Autore")
	@FXML TableColumn<Raccolta, SimpleStringProperty> lingua = new TableColumn("Lingua")
	@FXML TableColumn<Raccolta, SimpleStringProperty> editore = new TableColumn("Editore")
	@FXML package TableColumn<Raccolta, SimpleStringProperty> descrizione = new TableColumn("Descrizione")
	@FXML TableColumn<Raccolta, SimpleStringProperty> dataPubb = new TableColumn("DataPubblicazione")
	@FXML TableColumn<Raccolta, SimpleIntegerProperty> disponibilita = new TableColumn("Disponibilita")
	@FXML TableColumn<Raccolta, SimpleFloatProperty> prezzo = new TableColumn("Prezzo")
	@FXML TableColumn<Raccolta, SimpleIntegerProperty> copieRim = new TableColumn("CopieRimanenti")
	@FXML TableColumn<Raccolta, Image> foto = new TableColumn("Foto")
	@FXML TableColumn<Raccolta, SimpleIntegerProperty> id = new TableColumn("ID")
	@FXML Button buttonL
	@FXML Button buttonI
	@FXML Button buttonA
	@FXML Button buttonV
	@FXML TextField dataTF

	@FXML def private void getRiviste() throws SQLException {
		// System.out.println(CCR.getRivisteE());
		table.setItems(CCR.getRivisteE())
	}

	override void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		titolo.setCellValueFactory(new PropertyValueFactory("titolo"))
		autore.setCellValueFactory(new PropertyValueFactory("autore"))
		editore.setCellValueFactory(new PropertyValueFactory("editore"))
		lingua.setCellValueFactory(new PropertyValueFactory("lingua"))
		descrizione.setCellValueFactory(new PropertyValueFactory("descrizione"))
		dataPubb.setCellValueFactory(new PropertyValueFactory("dataPubb"))
		disponibilita.setCellValueFactory(new PropertyValueFactory("disp"))
		prezzo.setCellValueFactory(new PropertyValueFactory("prezzo"))
		copieRim.setCellValueFactory(new PropertyValueFactory("copieRim"))
		foto.setCellValueFactory(new PropertyValueFactory("foto"))
		id.setCellValueFactory(new PropertyValueFactory("id"))
	}

	new() {
		CCR = new ControllerCompravenditaRiviste()
	}

	@FXML def private void torna() throws IOException {
		var Stage stage
		var Parent root
		stage = buttonI.getScene().getWindow() as Stage
		root = FXMLLoader.load(getClass().getResource("homePage.fxml"))
		stage.setTitle("Benvenuto nella schermata della homePage")
		var Scene scene = new Scene(root)
		stage.setScene(scene)
		stage.show()
	}

	@FXML def private void verifica() {
		CCR.disponibilitaRiviste(dataTF.getText()) // verifico se libro e presente
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
}
