package application

import java.io.IOException
import java.net.URL
import java.util.ResourceBundle
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.Alert
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.PasswordField
import javafx.scene.control.TextField
import javafx.scene.image.ImageView
import javafx.scene.layout.Pane
import javafx.stage.Stage

class BuondaryLogin implements Initializable {
	@FXML Label labelUser
	@FXML Label labelPwd
	@FXML Label labelB
	@FXML javafx.scene.layout.GridPane grid
	@FXML TextField textFieldusername
	@FXML PasswordField pwdField
	@FXML Button buttonI
	@FXML Button buttonA
	@FXML Pane panel
	@FXML ImageView image
	ControllerLogin cL

	// private Stage stage;
	override void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		cL = new ControllerLogin()
	}

	@FXML def private void controlla() throws IOException {
		System::out.println("Controllo button")
		var String u
		var String p
		var Boolean v
		// validazone
		u = textFieldusername.getText()
		p = pwdField.getText()
		v = cL.controlla(u, p)
		if (v) {
			var Stage stage
			var Parent root
			stage = buttonI.getScene().getWindow() as Stage
			root = FXMLLoader.load(getClass().getResource("compravendita.fxml"))
			stage.setTitle("Benvenuto nella schermata del catalogo libri ")
			var Scene scene = new Scene(root)
			stage.setScene(scene)
			stage.show()
		} else {
			var Alert a = new Alert(Alert.AlertType.ERROR)
			a.setTitle("Errore nelle credenziali")
			a.setContentText("Credenizali immesse sbagliate")
			a.setHeaderText(null)
			a.showAndWait()
		}
	}

	@FXML def private void annulla() {
		textFieldusername.setText("")
		pwdField.setText("")
	}
}
