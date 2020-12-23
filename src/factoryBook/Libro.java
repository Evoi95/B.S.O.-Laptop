package factoryBook;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

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
	private Desktop desktop;
	private File dirToOpen;
	private String filename;
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
	public void scarica() throws DocumentException, FileNotFoundException {
		
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
	         System.out.println("Sorry could not create specified directory");
	      }
	      
	      
	      
		  desktop = Desktop.getDesktop();
	         dirToOpen = null;
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
	        	        	       		
	}
	@Override
	public void leggi() {
		 filename= "C:\\libriScaricati\\prova2.pdf";

	      //definiamo il nome del nostro file di prova
	        // Creiamo un Document
	        Document document = new Document();
	        // otteniamo una istanza di PdfWriter passando il document ed uno stream file
	        try {
				PdfWriter.getInstance(document, new FileOutputStream(filename));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        // apriamo il documento
	        document.open();
	        // aggiungiamo un paragrafo
	        try {
				document.add(new Paragraph("Lorem ipsum dolor sit amet, consectetur adipiscing elit. In sed nisi non mi vulputate vestibulum. In hac habitasse platea dictumst. Aenean pellentesque est eget tortor blandit pulvinar. Donec in finibus ante. Phasellus molestie pretium magna, non cursus tortor. Ut malesuada consequat lectus, et laoreet dui eleifend vel. In sit amet luctus quam. Sed laoreet tellus at imperdiet pulvinar. Vestibulum ut erat et nunc aliquet interdum.\r\n"
						+ "\n"
						+ "In commodo nisl velit, a egestas nunc consectetur vitae. Sed vulputate eros eget massa blandit ornare. Donec semper bibendum lacus, at pharetra enim pharetra sed. Mauris tempus tellus nec nulla molestie, faucibus semper nibh consequat. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec iaculis purus nisi, vel volutpat sapien vulputate a. Aenean blandit non nibh in finibus. Integer ac tempus dui, laoreet gravida ex. Integer vitae orci vel nulla commodo cursus quis et nisi. Nulla sit amet nibh sed justo dapibus vulputate ut et nisi. Mauris efficitur commodo iaculis. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus blandit urna eros, sed cursus mauris blandit ut. Lorem ipsum dolor sit amet, consectetur adipiscing elit.\r\n"
						+ "\n"
						+ "Vestibulum eros tellus, rhoncus vel fringilla nec, vehicula in velit. Nam malesuada eget tellus ut viverra. Aenean iaculis gravida urna, eu convallis leo dapibus vel. Nullam et suscipit diam. Sed tincidunt ipsum sed placerat consequat. Vestibulum lacinia lacinia commodo. Vestibulum lacus erat, pellentesque sed rhoncus id, tincidunt eget ante. Phasellus vulputate urna sit amet dolor rhoncus bibendum eu feugiat nisl. Proin ipsum libero, consectetur sit amet sagittis nec, feugiat nec quam. In dictum massa quis ligula semper, eget dignissim turpis blandit.\r\n"
						+ "\n"
						+ "Sed congue laoreet diam vel iaculis. Maecenas tempor convallis dolor nec laoreet. Quisque vitae dui vitae erat tempor volutpat aliquam ac ipsum. Nulla nulla erat, iaculis eu vulputate in, fermentum sed est. Ut ac enim ac felis molestie fringilla at a lectus. Donec porttitor a elit eget tempus. Morbi molestie libero lorem, et fringilla mi pharetra scelerisque. Fusce ut nunc sit amet odio dapibus tristique. Phasellus ultrices, nisl sit amet faucibus ultrices, odio nisl dictum enim, at sollicitudin arcu metus a risus. Duis suscipit, mi sed mollis euismod, erat justo pellentesque orci, vitae finibus nunc est vitae felis. Ut venenatis commodo eros sed fermentum. Fusce feugiat pellentesque justo. Ut finibus, lacus quis ornare consectetur, sapien urna placerat mauris, non ultricies justo nunc sed ante. Phasellus sodales dui a ex gravida, a tempor mi eleifend.\r\n"
						+ "\n"
						+ "Aenean pharetra tortor semper, laoreet dui sed, porta lacus. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque interdum purus cursus venenatis mollis. Donec venenatis bibendum ullamcorper. Phasellus porttitor, mauris eget placerat imperdiet, tellus purus aliquet mauris, eget laoreet quam nibh eget nisi. Nam volutpat urna vitae eros porttitor efficitur. Etiam mi velit, vulputate sed lacinia rutrum, viverra sed nulla. Sed sem mi, tempus ut lacus faucibus, congue dignissim dolor. Praesent sed quam feugiat, condimentum eros non, luctus dui."));
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        // chiudiamo il documento
	        document.close();
	        

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
