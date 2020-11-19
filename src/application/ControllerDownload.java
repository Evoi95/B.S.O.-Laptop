package application;

import javafx.scene.control.Alert;

public class ControllerDownload {
	
	public void scaricaLibro()
	{
		Alert a=new Alert(Alert.AlertType.CONFIRMATION);
		a.setTitle("Download ");
		a.setContentText("Libro scaricato con successo");
		a.setHeaderText(null);
		a.showAndWait();
	}
	
	public void annullaOrdine()
	{
		Alert a=new Alert(Alert.AlertType.WARNING);
		a.setTitle("Annulla ordine");
		a.setContentText("Stai annullando l'ordine");
		a.setHeaderText(null);
		a.showAndWait();
	}

}
