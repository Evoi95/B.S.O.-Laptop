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

class BuondaryCompravenditaGiornali implements Initializable {
	@FXML Pane panel
	@FXML Label header
	@FXML TableView<Raccolta> table
	@FXML TableColumn<Raccolta, SimpleStringProperty> titolo = new TableColumn("Titolo")
	@FXML TableColumn<Raccolta, SimpleStringProperty> lingua = new TableColumn("Lingua")
	@FXML TableColumn<Raccolta, SimpleStringProperty> editore = new TableColumn("Editore")
	@FXML TableColumn<Raccolta, SimpleStringProperty> dataPubb = new TableColumn("DataPubblicazione")
	@FXML TableColumn<Raccolta, SimpleIntegerProperty> copie = new TableColumn("CopieRimanenti")
	@FXML TableColumn<Raccolta, SimpleFloatProperty> prezzo = new TableColumn("Prezzo")
	@FXML TableColumn<Raccolta, Image> foto = new TableColumn("Foto")
	@FXML TableColumn<Raccolta, SimpleIntegerProperty> disponibilita = new TableColumn("Disponibilita")
	/*
	 * TODO
	 * sistemare altre righe tabella dal db
	 */
	@FXML Button buttonL
	@FXML TextField entryText
	@FXML Button buttonV
	@FXML Button buttonI
	@FXML Button buttonA
	ControllerCompravenditaGiornali CCG

	@FXML def private void prendiGiornali() throws SQLException {
		table.setItems(CCG.getGiornali())
	}

	new() {
		CCG = new ControllerCompravenditaGiornali()
	}

	override void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		titolo.setCellValueFactory(new PropertyValueFactory("titolo"))
		lingua.setCellValueFactory(new PropertyValueFactory("lingua"))
		editore.setCellValueFactory(new PropertyValueFactory("editore"))
		dataPubb.setCellValueFactory(new PropertyValueFactory("dataPubb"))
		copie.setCellValueFactory(new PropertyValueFactory("copieRimanenti"))
		prezzo.setCellValueFactory(new PropertyValueFactory("prezzo"))
		foto.setCellValueFactory(new PropertyValueFactory("foto"))
		disponibilita.setCellValueFactory(new PropertyValueFactory("disponibilita"))
	}

	@FXML def private void torna() throws IOException {
		var Stage stage
		var Parent root
		stage = buttonI.getScene().getWindow() as Stage
		root = FXMLLoader.load(getClass().getResource("homePage.fxml"))
		stage.setTitle("Benvenuto nella schermata del riepilogo ordine")
		var Scene scene = new Scene(root)
		stage.setScene(scene)
		stage.show()
	}

	@FXML def void verifica() throws SQLException {
		CCG.disponibilitaGiornale(entryText.getText())
	}

	@FXML def void procedi() throws IOException {
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
