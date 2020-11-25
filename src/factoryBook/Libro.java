package factoryBook;

import javafx.scene.image.Image;
public class Libro implements Raccolta {
	private String  tipologia,titolo,autore,lingua,categoria,codiceIsbn,editore,descrizione,dataPubb;
	
	private int copieRimanenti,	numPag,numAcq,prezzo;	
	private Image foto;
	private Boolean disponibilita;
	public String getTipologia() {
		return this.tipologia;
	}
	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
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
	public String getDataPubb() {
		return this.dataPubb;
	}
	public void setDataPubb(String dataPubb) {
		this.dataPubb = dataPubb;
	}
	public int getCopieRimanenti() {
		return this.copieRimanenti;
	}
	public void setCopieRimanenti(int copieRimanenti) {
		this.copieRimanenti = copieRimanenti;
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
	public int getPrezzo() {
		return this.prezzo;
	}
	public void setPrezzo(int prezzo) {
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
	public Libro(String tipologia,String titolo, String autore, String lingua, String categoria, String codiceIsbn, String editore,
			String descrizione, String dataPubb, int copieRimanenti, int numPag, int numAcq, int prezzo, Image foto,
			Boolean disponibilita) {
	//	super();
		this.tipologia=tipologia;
		this.titolo = titolo;
		this.autore = autore;
		this.lingua = lingua;
		this.categoria = categoria;
		this.codiceIsbn = codiceIsbn;
		this.editore = editore;
		this.descrizione = descrizione;
		this.dataPubb = dataPubb;
		this.copieRimanenti = copieRimanenti;
		this.numPag = numPag;
		this.numAcq = numAcq;
		this.prezzo = prezzo;
		this.foto = foto;
		this.disponibilita = disponibilita;
	}
	
	public void setDisponibilita(Boolean disponibilita) {
		this.disponibilita = disponibilita;
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
