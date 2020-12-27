package src.application

import java.io.IOException
import java.net.URL
import java.sql.SQLException
import java.text.SimpleDateFormat
import java.util.ResourceBundle
import bso.CartaCredito
import javafx.beans.property.SimpleStringProperty
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.*
import javafx.scene.control.cell.PropertyValueFactory
import javafx.scene.layout.*
import javafx.stage.Stage

class BoundaryPagamentoCC implements Initializable {
	// private   Stage primaryStage;
	@FXML Pane panel
	@FXML GridPane grid
	@FXML Label header
	@FXML Label labelN
	@FXML Label labelC
	@FXML Label cartaC
	@FXML Label labelS
	@FXML TextField nomeTF
	@FXML TextField cognomeTF
	@FXML TextField codiceTF
	@FXML TextField scadTF
	@FXML Button buttonI
	@FXML Button buttonA
	@FXML Label labelCiv
	@FXML Button buttonReg
	@FXML TextField nomeInput
	@FXML RadioButton buttonPrendi
	@FXML PasswordField codiceTFCiv
	@FXML TableView<CartaCredito> tableCC
	@FXML TableColumn<CartaCredito, SimpleStringProperty> codiceCC = new TableColumn("CodiceCarta")
	@FXML Label labelNU
	application.ControllerPagamentoCC CPCC
	Boolean esito

	@FXML def private void procediCC() throws IOException {
		var String cod = codiceTF.getText()
		esito = CPCC.controllaPag(scadTF.getText(), cod)
		if (esito.equals(true)) {
			var Stage stage
			var Parent root
			stage = buttonI.getScene().getWindow() as Stage
			root = FXMLLoader.load(getClass().getResource("download.fxml"))
			stage.setTitle("Benvenuto nella schermata per il download")
			var Scene scene = new Scene(root)
			stage.setScene(scene)
			stage.show()
		} else {
			System::out.println("riprovare")
			var Stage stage
			var Parent root
			stage = buttonI.getScene().getWindow() as Stage
			root = FXMLLoader.load(getClass().getResource("PagamentoCC.fxml"))
			stage.setTitle("Benvenuto nella schermata per il pagamento")
			var Scene scene = new Scene(root)
			stage.setScene(scene)
			stage.show()
		}
	}

	@FXML def private void annullaCC() throws IOException {
		var Stage stage
		var Parent root
		stage = buttonA.getScene().getWindow() as Stage
		root = FXMLLoader.load(getClass().getResource("acquista.fxml"))
		stage.setTitle("benvenuto nella schermata del riepilogo ordine")
		var Scene scene = new Scene(root)
		stage.setScene(scene)
		stage.show()
	}

	new() throws Exception {
		CPCC = new application.ControllerPagamentoCC()
	}

	@FXML def void registraCC() throws java.text.ParseException, SQLException {
		var java.util.Date data = null
		var String nome = nomeTF.getText()
		var String cognome = cognomeTF.getText()
		var String codice = codiceTF.getText()
		var String d = scadTF.getText()
		var SimpleDateFormat formatter = new SimpleDateFormat("yyyy/mm/dd")
		data = formatter.parse(d)
		var java.sql.Date sql = new java.sql.Date(data.getTime())
		var String civ = codiceTFCiv.getText()
		CPCC.aggiungiCartaDB(nome, cognome, codice, sql, civ, (0.0 as float))
	}

	override void initialize(URL location, ResourceBundle resources) {
		codiceCC.setCellValueFactory(new PropertyValueFactory("numeroCC"))
	}

	@FXML def private void popolaTabella() throws SQLException {
		try {
			var String nomeUt = nomeInput.getText()
			System::out.println('''Nome utemte :«nomeUt»'''.toString)
			if (nomeUt.equals("") || nomeUt.equals(null)) {
				buttonPrendi.setDisable(true)
				throw new IOException()
			} else {
				buttonPrendi.setDisable(false)
				tableCC.setItems(CPCC.ritornaElencoCC(nomeUt))
			}
		} catch (IOException e) {
			e.getMessage()
		}

		buttonPrendi.setDisable(false)
	}
}
