package application

import java.io.IOException
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.*
import javafx.scene.image.ImageView
import javafx.scene.layout.*
import javafx.stage.Stage

class BuondaryHomePage {
	@FXML Pane pane
	@FXML GridPane grid
	@FXML Label header
	@FXML Button buttonL
	@FXML Button buttonG
	@FXML Button buttonR
	@FXML ImageView imageL
	@FXML ImageView imageG
	@FXML ImageView imageR
	@FXML ImageView imageU
	@FXML Button buttonLogin

	// private ControllerHomePageLibri cHPL;
	@FXML def private void getListaGiornali() throws IOException {
		// stampa schermata giornali -> tabella;
		var Stage stage
		var Parent root
		stage = buttonL.getScene().getWindow() as Stage
		root = FXMLLoader.load(getClass().getResource("compravenditaGiornali.fxml"))
		stage.setTitle("Benvenuto nella schermata del riepilogo dei giornali")
		// Parent root = FXMLLoader.load(getClass().getResource("compravendita.fxml"));
		var Scene scene = new Scene(root)
		stage.setScene(scene)
		stage.show()
	}

	@FXML def private void getListaRiviste() throws IOException {
		// stampa schermata riviste -> tabella;
		var Stage stage
		var Parent root
		stage = buttonL.getScene().getWindow() as Stage
		root = FXMLLoader.load(getClass().getResource("compravenditaRivista.fxml"))
		stage.setTitle("Benvenuto nella schermata del riepilogo delle riviste")
		// Parent root = FXMLLoader.load(getClass().getResource("compravendita.fxml"));
		var Scene scene = new Scene(root)
		stage.setScene(scene)
		stage.show()
	}

	@FXML def private void getListaLibri() throws IOException {
		var Stage stage
		var Parent root
		stage = buttonL.getScene().getWindow() as Stage
		root = FXMLLoader.load(getClass().getResource("compravenditaLibri.fxml"))
		stage.setTitle("Benvenuto nella schermata del riepilogo dei libri")
		// Parent root = FXMLLoader.load(getClass().getResource("compravendita.fxml"));
		var Scene scene = new Scene(root)
		stage.setScene(scene)
		stage.show()
	}

	@FXML def private void login() throws IOException {
		// specificare controller ogico
		var Stage stage
		var Parent root
		stage = buttonL.getScene().getWindow() as Stage
		root = FXMLLoader.load(getClass().getResource("Login.fxml"))
		stage.setTitle("Benvenuto nella schermata del login")
		// Parent root = FXMLLoader.load(getClass().getResource("compravendita.fxml"));
		var Scene scene = new Scene(root)
		stage.setScene(scene)
		stage.show()
	}
}
