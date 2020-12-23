package factoryBook;

import java.io.FileNotFoundException;

import com.itextpdf.text.DocumentException;

public interface Raccolta {
	
	void compra(); //vedere acquista libro button
	void scarica() throws DocumentException, FileNotFoundException;//stampo messsaggio libro scaricato 
	void leggi();//stampo messaggio libro in lettura

}
