package factoryBook;

import java.io.InputStream;
import java.sql.Date;


public class Factory {
	
	
	public  Raccolta createRaccolta(String tipologia,String titolo, int numPag, String codIsbn, String editore, String autore, String lingua,
			String categoria, Date dataPubb, String recensione, int nrCopie, String desc, int disponibilita,
			float prezzo, int copieRim, InputStream img) throws Exception
	{
		
		switch(tipologia)
		{
		case "libro": return new Libro(titolo,numPag,codIsbn,editore,autore,lingua,categoria,dataPubb,recensione,nrCopie,desc,disponibilita,prezzo,copieRim,img); 
		
		//case "giornale" :return new Giornale(tipologia,titolo,lingua,editore,dataPubb,copieRimanenti,prezzo,foto,disponibilita);
		
		//case "rivista": return new Rivista(tipologia,titolo,autore,lingua,editore,descrizione,dataPubb,numPag,prezzo,foto,disponibilita);//autore, dataPubb, dataPubb, dataPubb, dataPubb, dataPubb, prezzo, prezzo, foto, disponibilita);
		
		
		default : throw new Exception();
		
		}
		

	}	public Raccolta createLibro(String tipologia,String titolo, int numPag, String codIsbn, String editore, String autore, String lingua,
			String categoria, Date dataPubb, String recensione, int nrCopie, String desc, int disponibilita,
			float prezzo, int copieRim, InputStream img)
	{
	 return new Libro(titolo,numPag,codIsbn,editore,autore,lingua,categoria,dataPubb,recensione,nrCopie,desc,disponibilita,prezzo,copieRim,img); 
	}
	
	
	/*public Raccolta createRivista( String tipologia,String titolo,String autore, String lingua,String editore,String descrizione,String dataPubb,int numPag,int prezzo, Image foto, Boolean disponibilita)
	{
		return new Rivista(tipologia,titolo,autore,lingua,editore,descrizione,dataPubb,numPag,prezzo,foto,disponibilita);
	}
	
	public Raccolta creaGiornale(String tipologia,String titolo, String lingua, String editore, String dataPubb, int copieRimanenti, int prezzo,
			Image foto, Boolean disponibilita)
	{
		return new Giornale(tipologia,titolo,lingua,editore,dataPubb,copieRimanenti,prezzo,foto,  disponibilita);
	}
	*/
	

}
