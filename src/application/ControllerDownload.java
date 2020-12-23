package application;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import com.itextpdf.text.DocumentException;

import factoryBook.Libro;
import javafx.scene.control.Alert;

public class ControllerDownload {
	private String nrOrdine;
	private static Libro l;
	
	
	public void scaricaLibro() throws FileNotFoundException, DocumentException
	{
		//String titolo="prova";
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		 LocalDate localDate = LocalDate.now();
		 //System.out.println(dtf.format(localDate)); //2016/11/16
		Alert a=new Alert(Alert.AlertType.CONFIRMATION);
		a.setTitle("Download effettuato");
		//a.setContentText("Libro : titolo   scaricato con successo :"+titolo);
		//a.setContentText("nr odine acquito :"+this.nrOrdine);
		a.setContentText("Libro : \t scaricato correttamente in data:\t " + dtf.format(localDate) +
				"\n numero ordine : \t "+this.nrOrdine);
		a.setHeaderText(null);
		a.showAndWait();
		
		l.scarica();
		l.leggi();
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
		l=new Libro();
	}

}
