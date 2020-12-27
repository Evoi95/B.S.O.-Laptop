package application

import java.io.IOException
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.*
import javafx.scene.control.Alert.AlertType
import javafx.scene.layout.*
import javafx.stage.Stage

class BoundaryPagamentoCash {
	@FXML Pane panel
	@FXML GridPane grid
	@FXML Label header
	@FXML Label labelN
	@FXML Label labelC
	@FXML Label labelVP
	@FXML Label labelCom
	@FXML TextField nomeTF
	@FXML TextField cognomeTF
	@FXML TextField viaTF
	@FXML TextArea eventualiArea
	@FXML Button buttonI
	@FXML Button buttonA
	ControllerPagamentoCash CPC
	String nString
	cString vString
	com

	@FXML def private void procediCash() throws IOException {
		try {
			n = nomeTF.getText()
			c = cognomeTF.getText()
			v = viaTF.getText()
			com = eventualiArea.getText()
			if (n.equals("") || c.equals("") || v.equals("")) {
				var Alert alert = new Alert(AlertType.ERROR)
				alert.setTitle("  Riepilogo pagamento  ")
				alert.setHeaderText("Esito pagamento contanti:")
				alert.setContentText("Non eseguito")
				alert.showAndWait()
				var Stage stage
				var Parent root
				stage = buttonI.getScene().getWindow() as Stage
				root = FXMLLoader.load(getClass().getResource("pagamentoContrassegno.fxml"))
				stage.setTitle("Benvenuto nella schermata del riepilogo ordine")
				// Parent root = FXMLLoader.load(getClass().getResource("compravendita.fxml"));
				var Scene scene = new Scene(root)
				stage.setScene(scene)
				stage.show()
				throw new IOException()
			} else {
				CPC.controlla(n, c, v, com)
				var Alert alert = new Alert(AlertType.INFORMATION)
				alert.setTitle("  Riepilogo pagamento  ")
				alert.setHeaderText("Esito pagamento contanti:")
				alert.setContentText("eseguito")
				alert.showAndWait()
				var Stage stage
				var Parent root
				stage = buttonI.getScene().getWindow() as Stage
				root = FXMLLoader.load(getClass().getResource("download.fxml"))
				stage.setTitle("Benvenuto nella schermata del download")
				var Scene scene = new Scene(root)
				stage.setScene(scene)
				stage.show()
			}
		} catch (Exception e) {
			e.getCause()
		}

	}

	@FXML def private void annullaCash() throws IOException {
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
		CPC = new ControllerPagamentoCash()
	}
}
