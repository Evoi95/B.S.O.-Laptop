package factoryBook;

import javafx.scene.image.Image;

public class Giornale implements Raccolta {
	
	private String  tipologia,titolo,lingua,editore,dataPubb;
	public String getTipologia() {
		return this.tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	private int copieRimanenti,prezzo;	
	private Image foto;
	private Boolean disponibilita; 

	public String getTitolo() {
		return this.titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
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
		return this. disponibilita;
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

	public Giornale(String tipologia,String titolo, String lingua, String editore, String dataPubb, int copieRimanenti, int prezzo,
			Image foto, Boolean disponibilita) {
		//super();
		this.tipologia=tipologia;

		this.titolo = titolo;
		this.lingua = lingua;
		this.editore = editore;
		this.dataPubb = dataPubb;
		this.copieRimanenti = copieRimanenti;
		this.prezzo = prezzo;
		this.foto = foto;
		this.disponibilita = disponibilita;
	}

	
}
