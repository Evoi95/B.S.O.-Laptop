package application

import java.io.IOException
import com.itextpdf.text.DocumentException
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.*
import javafx.scene.image.ImageView
import javafx.scene.layout.*
import javafx.stage.Stage

class BoundaryDownload {
	@FXML SplitPane split
	@FXML AnchorPane ap1
	@FXML Label header
	@FXML AnchorPane ap2
	@FXML ImageView image
	@FXML Button buttonI
	@FXML Button buttonA
	ControllerDownload CD

	@FXML def private void scarica() throws IOException, DocumentException {
		CD.scaricaLibro()
		/*
		 * TODO
		 * modifico alert
		 */
		var Stage stage
		var Parent root
		stage = buttonI.getScene().getWindow() as Stage
		root = FXMLLoader.load(getClass().getResource("homePage.fxml"))
		// stage.setTitle("Schermata download");
		// Parent root = FXMLLoader.load(getClass().getResource("compravendita.fxml"));
		var Scene scene = new Scene(root)
		stage.setScene(scene)
		stage.show()
	}

	@FXML def private void pulisci() throws IOException {
		CD.annullaOrdine()
		var Stage stage
		var Parent root
		stage = buttonA.getScene().getWindow() as Stage
		root = FXMLLoader.load(getClass().getResource("homePage.fxml"))
		/*
		 * TODO 
		 * modificio alert
		 */
		// Parent root = FXMLLoader.load(getClass().getResource("compravendita.fxml"));
		var Scene scene = new Scene(root)
		stage.setScene(scene)
		stage.show()
	}

	new() {
		CD = new ControllerDownload()
	}
}
