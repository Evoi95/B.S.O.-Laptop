package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import javafx.scene.control.Alert;

public class ControllerDownload {
	private String nrOrdine;
	
	
	public void scaricaLibro()
	{
		String titolo="prova";
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		    LocalDate localDate = LocalDate.now();
		    //System.out.println(dtf.format(localDate)); //2016/11/16
		Alert a=new Alert(Alert.AlertType.CONFIRMATION);
		a.setTitle("Download effettuato");
		//a.setContentText("Libro : titolo   scaricato con successo :"+titolo);
		//a.setContentText("nr odine acquito :"+this.nrOrdine);
		a.setContentText("Libro : \t"+ titolo +
				"\nscaricato correttamente in data:\t " + dtf.format(localDate) +
				"\n numero ordine : \t "+this.nrOrdine);
		a.setHeaderText(null);
		a.showAndWait();
	}
	
	public void annullaOrdine()
	{
		Alert a=new Alert(Alert.AlertType.WARNING);
		a.setTitle("Annulla ordine");
		a.setContentText("Stai annullando l'ordine");
		a.setContentText("nr ordine in annullamento "+this.nrOrdine);

		a.setHeaderText(null);
		a.showAndWait();
	}
	
	public ControllerDownload()
	{
		this.nrOrdine=UUID.randomUUID().toString();
	}

}
