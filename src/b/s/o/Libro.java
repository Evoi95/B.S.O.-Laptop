package b.s.o;
import java.awt.*;
public class Libro {
	private String titolo,autore,lingua,categoria,codiceIsbn,editore,descrizione,dataPub,numPag,numAcq,prezzo;
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
	public String getNumPag() {
		return this.numPag;
	}
	public void setNumPag(String numPag) {
		this.numPag = numPag;
	}
	public String getNumAcq() {
		return this.numAcq;
	}
	public void setNumAcq(String numAcq) {
		this.numAcq = numAcq;
	}
	public String getDataPub() {
		return this.dataPub;
	}
	public void setDataPub(String dataPub) {
		this.dataPub = dataPub;
	}
	public String getPrezzo() {
		return this.prezzo;
	}
	public void setPrezzo(String prezzo) {
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
			String descrizione, String dataPub, String numPag, String numAcq, String prezzo, Image foto,
			boolean disponibilita) {
	//	super();
		this.titolo = titolo;
		this.autore = autore;
		this.lingua = lingua;
		this.categoria = categoria;
		this.codiceIsbn = codiceIsbn;
		this.editore = editore;
		this.descrizione = descrizione;
		this.dataPub = dataPub;
		this.numPag = numPag;
		this.numAcq = numAcq;
		this.prezzo = prezzo;
		this.foto = foto;
		this.disponibilita = disponibilita;
	}
	
	

}
