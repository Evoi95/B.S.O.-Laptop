package factoryBook;

import javafx.scene.image.Image;


enum TipiRivista {
	
	settimanale,
	bisettimanale,
	mensile,
	bimestrale,
	trimestrale,
	annuale,
	estivo,
	invernale,
	sportivo,
	cinematografica,
	gossip,
	televisivo,
	militare,
	informatica
}
public class Rivista implements Raccolta  {
	
	private String  titolo,autore,lingua,editore,descrizione,dataPubb;
	private int numPag,prezzo;	
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

	public int getNumPag() {
		return this.numPag;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
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

	public Rivista(String titolo, String autore, String lingua, String editore, String descrizione, String dataPubb,
			int numPag, int prezzo, Image foto, Boolean disponibilita) {
		//super();
		this.titolo = titolo;
		this.autore = autore;
		this.lingua = lingua;
		this.editore = editore;
		this.descrizione = descrizione;
		this.dataPubb = dataPubb;
		this.numPag = numPag;
		this.prezzo = prezzo;
		this.foto = foto;
		this.disponibilita = disponibilita;
	}

	public Rivista() {
		// TODO Auto-generated constructor stub
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
