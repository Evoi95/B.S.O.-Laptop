package b.s.o;
import java.awt.*;
public class Libro {
	private String titolo,autore,lingua,categoria,codiceIsbn,editore,descrizione;
	private int numPag,numAcq,dataPub;
	private float prezzo;
	private Image foto;
	private boolean disponibilita;
	
	public String getTitolo() {
		return this.titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return this.autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getLingua() {
		return this.lingua;
	}
	public void setLingua(String lingua) {
		this.lingua = lingua;
	}
	public String getCategoria() {
		return this.categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getCodiceIsbn() {
		return this.codiceIsbn;
	}
	public void setCodiceIsbn(String codiceIsbn) {
		this.codiceIsbn = codiceIsbn;
	}
	public String getEditore() {
		return this.editore;
	}
	public void setEditore(String editore) {
		this.editore = editore;
	}
	public String getDescrizione() {
		return this.descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public int getNumPag() {
		return this.numPag;
	}
	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}
	public int getNumAcq() {
		return this.numAcq;
	}
	public void setNumAcq(int numAcq) {
		this.numAcq = numAcq;
	}
	public int getDataPub() {
		return this.dataPub;
	}
	public void setDataPub(int dataPub) {
		this.dataPub = dataPub;
	}
	public float getPrezzo() {
		return this.prezzo;
	}
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	public Image getFoto() {
		return this.foto;
	}
	public void setFoto(Image foto) {
		this.foto = foto;
	}
	public boolean isDisponibilita() {
		return this.disponibilita;
	}
	public void setDisponibilita(boolean disponibilita) {
		this.disponibilita = disponibilita;
	}
	public Libro(String titolo, String autore, String lingua, String categoria, String codiceIsbn, String editore,
			String descrizione, int numPag, int numAcq, int dataPub, float prezzo, Image foto, boolean disponibilita) {
		this.titolo = titolo;
		this.autore = autore;
		this.lingua = lingua;
		this.categoria = categoria;
		this.codiceIsbn = codiceIsbn;
		this.editore = editore;
		this.descrizione = descrizione;
		this.numPag = numPag;
		this.numAcq = numAcq;
		this.dataPub = dataPub;
		this.prezzo = prezzo;
		this.foto = foto;
		this.disponibilita = disponibilita;
		
		/*
		 * Factory per generare utente
		 */
	}
	

}
