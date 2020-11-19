package b.s.o;

import javafx.scene.image.Image;
public class Libro {
	private String  titolo,autore,lingua,categoria,codiceIsbn,editore,descrizione,numPag,numAcq,dataPubb,prezzo;
	
	private Image foto;
	private Boolean disponibilita;
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
		return numAcq;
	}
	public void setNumAcq(String numAcq) {
		this.numAcq = numAcq;
	}
	public String getDataPub() {
		return this.dataPubb;
	}
	public void setDataPub(String dataPub) {
		this.dataPubb = dataPub;
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
	public Boolean getDisponibilita() {
		return this.disponibilita;
	}
	public void setDisponibilita(Boolean disponibilita) {
		this.disponibilita = disponibilita;
	}
	public Libro(String titolo, String autore, String lingua, String categoria, String codiceIsbn, String editore,
			String descrizione, String numPag, String numAcq, String dataPub, String prezzo, Image foto,
			Boolean disponibilita) {
		//super();
		this.titolo = titolo;
		this.autore = autore;
		this.lingua = lingua;
		this.categoria = categoria;
		this.codiceIsbn = codiceIsbn;
		this.editore = editore;
		this.descrizione = descrizione;
		this.numPag = numPag;
		this.numAcq = numAcq;
		this.dataPubb= dataPub;
		this.prezzo = prezzo;
		this.foto = foto;
		this.disponibilita = disponibilita;
	}
	
	
}
