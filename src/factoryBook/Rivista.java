package factoryBook;

import java.sql.Date;
import java.io.InputStream;
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
	
	
	
	private String titolo,tipologia,autore,lingua,editore,descrizione;
	private Date dataPubb;
	private float prezzo;
	private Boolean disponibilita;
	private Image foto;
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getLingua() {
		return lingua;
	}

	public void setLingua(String lingua) {
		this.lingua = lingua;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Date getDataPubb() {
		return dataPubb;
	}

	public void setDataPubb(Date dataPubb) {
		this.dataPubb = dataPubb;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public Boolean getDisponibilita() {
		return disponibilita;
	}

	public void setDisponibilita(Boolean disponibilita) {
		this.disponibilita = disponibilita;
	}

	public Image getFoto() {
		return foto;
	}

	public void setFoto(Image foto) {
		this.foto = foto;
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

	public Rivista(String titolo, String tipologia, String autore, String lingua, String editore, String descrizione,
			Date dataPubb, int numPag, float prezzo, Boolean disponibilita, Image foto) {
		this.titolo = titolo;
		this.tipologia = tipologia;
		this.autore = autore;
		this.lingua = lingua;
		this.editore = editore;
		this.descrizione = descrizione;
		this.dataPubb = dataPubb;
		this.prezzo = prezzo;
		this.disponibilita = disponibilita;
		this.foto = foto;
	}
	
	
}
