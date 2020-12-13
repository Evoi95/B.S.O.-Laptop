package factoryBook;

import java.io.InputStream;
import java.sql.Date;


public class Giornale implements Raccolta {
	
	private String  titolo,tipologia,lingua,editore;
	private Date dataPubb;
	private int copieRimanenti;
	private int disponibilita;
	private float prezzo;
	private InputStream foto;

	

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

	public int getDisponibilita() {
		return this.disponibilita;
	}

	public void setDisponibilita(int disponibilita) {
		this.disponibilita = disponibilita;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public InputStream getFoto() {
		return this.foto;
	}

	public void setFoto(InputStream foto) {
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
			int disponibilita, float prezzo, InputStream foto) {
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
	
	public Giornale()
	{
		this.titolo=null;
		this.tipologia=null;
		this.lingua=null;
		this.editore=null;
		this.dataPubb=null;
		this.copieRimanenti=0;
		this.disponibilita=0;
		this.prezzo=0;
		this.foto=null;
		
		
	}

	
	
}
