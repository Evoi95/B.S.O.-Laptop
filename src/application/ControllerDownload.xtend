package application

import java.io.FileNotFoundException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.UUID
import com.itextpdf.text.DocumentException
import factoryBook.Libro
import javafx.scene.control.Alert

class ControllerDownload {
	String nrOrdine
	static Libro l

	def void scaricaLibro() throws FileNotFoundException, DocumentException {
		// String titolo="prova";
		var DateTimeFormatter dtf = DateTimeFormatter::ofPattern("yyyy/MM/dd")
		var LocalDate localDate = LocalDate::now()
		// System.out.println(dtf.format(localDate)); //2016/11/16
		var Alert a = new Alert(Alert.AlertType.CONFIRMATION)
		a.setTitle("Download effettuato")
		// a.setContentText("Libro : titolo   scaricato con successo :"+titolo);
		// a.setContentText("nr odine acquito :"+this.nrOrdine);
		a.setContentText('''Libro : 	 scaricato correttamente in data:	 «dtf.format(localDate)»
 numero ordine : 	 «this.nrOrdine»'''.toString)
		a.setHeaderText(null)
		a.showAndWait()
		l.scarica()
		l.leggi()
	}

	def void annullaOrdine() {
		var Alert a = new Alert(Alert.AlertType.WARNING)
		a.setTitle("Annulla ordine")
		a.setContentText("Stai annullando l'ordine")
		a.setContentText('''nr ordine in annullamento «this.nrOrdine»'''.toString)
		a.setHeaderText(null)
		a.showAndWait()
	}

	new() {
		this.nrOrdine = UUID::randomUUID().toString()
		l = new Libro()
	}
}
