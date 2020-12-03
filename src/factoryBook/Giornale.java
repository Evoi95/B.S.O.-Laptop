package factoryBook;

import java.sql.Date;

import javafx.scene.image.Image;

public class Giornale implements Raccolta {
	
	private String  titolo,tipologia,lingua,editore;
	private Date dataPubb;
	private int copieRimanenti;
	private Boolean disponibilita;
	private float prezzo;
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

	public Date getDataPubb() {
		return dataPubb;
	}

	public void setDataPubb(Date dataPubb) {
		this.dataPubb = dataPubb;
	}

	public int getCopieRimanenti() {
		return copieRimanenti;
	}

	public void setCopieRimanenti(int copieRimanenti) {
		this.copieRimanenti = copieRimanenti;
	}

	public Boolean getDisponibilita() {
		return disponibilita;
	}

	public void setDisponibilita(Boolean disponibilita) {
		this.disponibilita = disponibilita;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
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

	public Giornale(String titolo, String tipologia, String lingua, String editore, Date dataPubb, int copieRimanenti,
			Boolean disponibilita, float prezzo, Image foto) {
	//	super();
		this.titolo = titolo;
		this.tipologia = tipologia;
		this.lingua = lingua;
		this.editore = editore;
		this.dataPubb = dataPubb;
		this.copieRimanenti = copieRimanenti;
		this.disponibilita = disponibilita;
		this.prezzo = prezzo;
		this.foto = foto;
	}

	
	
}
