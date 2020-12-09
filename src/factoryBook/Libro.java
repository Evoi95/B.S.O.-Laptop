package factoryBook;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;



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
	//private PagamentoDao pD;
	
	
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
		//pD=new PagamentoDao();
	}
	@Override
	public void compra() {
		Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("  Riepilogo download  ");
        alert.setHeaderText("RIsultato download:");
        alert.setContentText("Libro Acquistato");
        alert.showAndWait();
	}
	@Override
	public void scarica() {
		
		Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("  Riepilogo download  ");
        alert.setHeaderText("RIsultato download:");
        alert.setContentText("Scaricato nella cartella C:\\libriScaricati");
        alert.showAndWait();
		
	      File file = new File("C:\\libriScaricati");
	      boolean bool = file.mkdir();
	      if(bool){
	         System.out.println("Directory created successfully");
	      }else{
	         System.out.println("Sorry couldn’t create specified directory");
	      }
	      
	      
	      
		 Desktop desktop = Desktop.getDesktop();
	        File dirToOpen = null;
	        try {
	        //	File folder=new File("C:\\");
	            dirToOpen = new File("C:\\libriScaricati");
	            try {
					desktop.open(dirToOpen);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        } catch (IllegalArgumentException iae) {
	            System.out.println("File Not Found");
	        }
		/*
		 * implements file.io -> file.pdf(?)
		 */
		
	}
	@Override
	public void leggi() {
		// TODO Auto-generated method stub
		/*
		 * apertutra file pdf(p.d.)
		 */
		
	}
	public Libro() {
		//super();
		this.titolo =null;
		this.numPag = 0;
		this.codIsbn = null;
		this.editore = null;
		this.autore = null;
		this.lingua = null;
		this.categoria = null;
		this.dataPubb = null;
		this.recensione = null;
		this.nrCopie = 0;
		this.desc = null;
		this.disponibilita = 0;
		this.prezzo = 0;
		this.copieRim = 0;
		this.Img = null;
		//pD=new PagamentoDao();
	}
	
	
	
	
}
