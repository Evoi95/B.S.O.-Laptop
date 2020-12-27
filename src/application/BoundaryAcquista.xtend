package application

import java.io.IOException
import java.net.URL
import java.sql.SQLException
import java.util.ResourceBundle
import java.util.Scanner
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.*
import javafx.scene.layout.*
import javafx.stage.Stage

class BoundaryAcquista implements Initializable {
	@FXML SplitPane split
	@FXML AnchorPane ap1
	@FXML AnchorPane ap2
	@FXML Label header
	@FXML Label labelN
	@FXML Label labelCosto
	@FXML Label labelQ
	@FXML Label labelT
	@FXML TextField nome
	@FXML Label costo
	@FXML TextField quantita
	@FXML Label totale
	@FXML Label labelPag
	@FXML RadioButton buttonCC
	@FXML RadioButton buttonCash
	@FXML Button calcola
	@FXML Button link
	ControllerAcquista CA
	Scanner input
	String scelta

	@FXML def private void pagaCC() throws IOException {
		var Stage stage
		var Parent root
		stage = buttonCC.getScene().getWindow() as Stage
		root = FXMLLoader.load(getClass().getResource("pagamentoCC.fxml"))
		stage.setTitle("Benvenuto nella schermata dell'acquisto con carta credito")
		var Scene scene = new Scene(root)
		stage.setScene(scene)
		stage.show()
	}

	@FXML def private void pagaCash() throws IOException, SQLException {
		// String tot=totale.getText();
		// System.out.println("totale :"+tot);
		var Stage stage
		var Parent root
		stage = buttonCash.getScene().getWindow() as Stage
		root = FXMLLoader.load(getClass().getResource("pagamentoContrassegno.fxml"))
		stage.setTitle("Benvenuto nella schermata dell'acquisto in contanti")
		var Scene scene = new Scene(root)
		stage.setScene(scene)
		stage.show()
	}

	@FXML def private void initialize() {
		costo.setText("")
		quantita.setText("")
		totale.setText("")
	}

	@FXML def private void importo() throws IOException, SQLException {
		if (!nome.getText().equals("")) {
			buttonCC.setDisable(false)
			buttonCash.setDisable(false)
			if (scelta.equals("libro")) {
				var float x = CA.totale(nome.getText(), Integer::parseInt(quantita.getText()))
				costo.setText('''«x»'''.toString)
				var float tot
				tot = x * (Float::parseFloat(quantita.getText()))
				totale.setText('''«tot»'''.toString) // CA.retAmmontare(totale.getText()); 
			} else if (scelta.equals("giornale")) {
				labelN.setText("Leggere nome giornale")
				var float y = CA.totaleG(nome.getText(), Integer::parseInt(quantita.getText()))
				costo.setText('''«y»'''.toString)
				var float tot1
				tot1 = y * (Float::parseFloat(quantita.getText()))
				totale.setText('''«tot1»'''.toString) // CA.retAmmontare(totale.getText()); 
			} else if (scelta.equals("rivista")) {
				var float z = CA.totaleR(nome.getText(), Integer::parseInt(quantita.getText()))
				costo.setText('''«z»'''.toString)
				var float tot2
				tot2 = z * (Float::parseFloat(quantita.getText()))
				totale.setText('''«tot2»'''.toString)
			} else {
				throw new IOException()
			}
		}
		CA.returnSpesa(totale.getText())
	}

	new() throws SQLException {
		CA = new ControllerAcquista()
	}

	@FXML def private void indietro() throws IOException {
		var Stage stage
		var Parent root
		stage = link.getScene().getWindow() as Stage
		root = FXMLLoader.load(getClass().getResource("homePage.fxml"))
		var Scene scene = new Scene(root)
		stage.setScene(scene)
		stage.show()
	}

	override void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		buttonCC.setDisable(true)
		buttonCash.setDisable(true)
		var Alert a = new Alert(Alert.AlertType.INFORMATION)
		a.setTitle("Leggere input corretto")
		a.setContentText('''Leggere da tastiera il tipo di rivista precedetemente scelta : 
 scelte possibili:
 giornale - libro - rivista'''.toString)
		a.setHeaderText(null)
		a.showAndWait()
		System::out.println("\n\n\t-----Leggi tipologia tra giornale - rivista - libro ----- \n\n")
		input = new Scanner(System::in)
		scelta = input.nextLine()
		if (scelta.equals("libro")) {
			labelN.setText("Inserire  id del libro")
		} else if (scelta.equals("giornale")) {
			labelN.setText("Inserire titolo del giornale")
		} else if (scelta.equals("rivista")) {
			labelN.setText("Inserire titolo rivista")
		}
	}
}
