package application;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class BoundaryDownload {
	@FXML
	private SplitPane split;
	@FXML
	private AnchorPane ap1;
	@FXML
	private Label header;
	@FXML
	private AnchorPane ap2;
	@FXML
	private ImageView image;
	@FXML
	private Button buttonI;
	@FXML
	private Button buttonA;
	
	@FXML
	private void scarica()
	{
		Alert a=new Alert(Alert.AlertType.CONFIRMATION);
		a.setTitle("Download ");
		a.setContentText("Libro scaricato con successo");
		a.setHeaderText(null);
		a.showAndWait();
	}
	@FXML
	private void pulisci()
	{
		Alert a=new Alert(Alert.AlertType.WARNING);
		a.setTitle("Annulla ordine");
		a.setContentText("Stai annullando l'ordine");
		a.setHeaderText(null);
		a.showAndWait();
	}
	

}
