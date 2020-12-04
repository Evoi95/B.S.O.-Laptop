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
		
		case "giornale" :return new Giornale(titolo,tipologia,lingua,editore,dataPubb,nrCopie,disponibilita,prezzo,img);
		
		case "rivista": return new Rivista(titolo,tipologia,autore,lingua,editore,desc,dataPubb,prezzo,disponibilita,img);//autore, dataPubb, dataPubb, dataPubb, dataPubb, dataPubb, prezzo, prezzo, foto, disponibilita);
		
		
		default : throw new Exception();
		
		}
		

	}	public Raccolta createLibro(String tipologia,String titolo, int numPag, String codIsbn, String editore, String autore, String lingua,
			String categoria, Date dataPubb, String recensione, int nrCopie, String desc, int disponibilita,
			float prezzo, int copieRim, InputStream img)
	{
	 return new Libro(titolo,numPag,codIsbn,editore,autore,lingua,categoria,dataPubb,recensione,nrCopie,desc,disponibilita,prezzo,copieRim,img); 
	}
	
	
	public Raccolta createRivista(String Type, String tipologia,String titolo,String autore, String lingua,String editore,String descrizione,Date dataPubb,float prezzo,int disponibilita,InputStream foto)
	{
		return new Rivista(titolo,tipologia,autore,lingua,editore,descrizione,dataPubb,prezzo,disponibilita,foto);//autore, dataPubb, dataPubb, dataPubb, dataPubb, dataPubb, prezzo, prezzo, foto, disponibilita);
	}
	
	
	public Raccolta createGiornale(String type,String titolo,String tipologia, String lingua, String editore, Date dataPubb, int copieRimanenti, int disponibilita,
			float prezzo,InputStream img)
	{
		return new Giornale(titolo,tipologia,lingua,editore,dataPubb,copieRimanenti,disponibilita,prezzo,img);
			}
	
	

}
