package factoryBook;

import java.io.InputStream;
import java.sql.Date;

import javax.imageio.stream.FileImageInputStream;
import javax.xml.crypto.Data;

import javafx.scene.image.Image;
public class Libro implements Raccolta {
	
	private String titolo;
	private int numPag;
	private String codIsbn,editore,autore,lingua,categoria;
	private Date dataPubb;
	private String recensione;
	private int nrCopie;
	private String desc;
	private int disponibilita;
	private float prezzo;
	private int copieRim;
	private InputStream Img;
	
	public Libro(String titolo, int numPag, String codIsbn, String editore, String autore, String lingua,
			String categoria, Date dataPubb, String recensione, int nrCopie, String desc, int disponibilita,
			float prezzo, int copieRim, InputStream img) {
		//super();
		this.titolo = titolo;
		this.numPag = numPag;
		this.codIsbn = codIsbn;
		this.editore = editore;
		this.autore = autore;
		this.lingua = lingua;
		this.categoria = categoria;
		this.dataPubb = dataPubb;
		this.recensione = recensione;
		this.nrCopie = nrCopie;
		this.desc = desc;
		this.disponibilita = disponibilita;
		this.prezzo = prezzo;
		this.copieRim = copieRim;
		this.Img = img;
	}
	
	@Override
	public void compra() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void scarica() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void leggi() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
