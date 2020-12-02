package factoryBook;

import java.io.InputStream;
import java.sql.Date;


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
	
	
	public String getTitolo() {
		return this.titolo;
	}
	public int getNumPag() {
		return this.numPag;
	}
	public String getCodIsbn() {
		return this.codIsbn;
	}
	public String getEditore() {
		return this.editore;
	}
	public String getAutore() {
		return this.autore;
	}
	public String getLingua() {
		return this.lingua;
	}
	public String getCategoria() {
		return this.categoria;
	}
	public Date getDataPubb() {
		return this.dataPubb;
	}
	public String getRecensione() {
		return this.recensione;
	}
	public int getNrCopie() {
		return this.nrCopie;
	}
	public String getDesc() {
		return this.desc;
	}
	public int getDisponibilita() {
		return this.disponibilita;
	}
	public float getPrezzo() {
		return this.prezzo;
	}
	public int getCopieRim() {
		return this.copieRim;
	}
	public InputStream getImg() {
		return this.Img;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}
	public void setCodIsbn(String codIsbn) {
		this.codIsbn = codIsbn;
	}
	public void setEditore(String editore) {
		this.editore = editore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public void setLingua(String lingua) {
		this.lingua = lingua;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public void setDataPubb(Date dataPubb) {
		this.dataPubb = dataPubb;
	}
	public void setRecensione(String recensione) {
		this.recensione = recensione;
	}
	public void setNrCopie(int nrCopie) {
		this.nrCopie = nrCopie;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public void setDisponibilita(int disponibilita) {
		this.disponibilita = disponibilita;
	}
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	public void setCopieRim(int copieRim) {
		this.copieRim = copieRim;
	}
	public void setImg(InputStream img) {
		this.Img = img;
	}
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
