package factoryBook;

import javafx.scene.image.Image;

public class Factory {
	
	
	public  Raccolta createRaccolta(String tipologia,String  titolo,String autore, String lingua, String categoria, String codiceIsbn, String editore,String descrizione,String dataPubb, int copieRimanenti, int numPag,int numAcq, int prezzo,Image foto, Boolean disponibilita) throws Exception
	{
		
		switch(tipologia)
		{
		//case "libro": return new Libro(tipologia,titolo,autore,lingua,categoria,codiceIsbn,editore,descrizione,dataPubb,copieRimanenti,numPag,numAcq,prezzo,foto, disponibilita); 
		
		case "giornale" :return new Giornale(tipologia,titolo,lingua,editore,dataPubb,copieRimanenti,prezzo,foto,disponibilita);
		
		case "rivista": return new Rivista(tipologia,titolo,autore,lingua,editore,descrizione,dataPubb,numPag,prezzo,foto,disponibilita);//autore, dataPubb, dataPubb, dataPubb, dataPubb, dataPubb, prezzo, prezzo, foto, disponibilita);
		
		
		default : throw new Exception();
		
		}
		

	}
/*	public Raccolta createLibro(String  tipologia, String titolo, String autore,String lingua,String categoria,String codiceIsbn,String editore,String descrizione, String dataPubb,int copieRimanenti,int 	numPag, int numAcq,int prezzo,Image foto, Boolean disponibilita)
	{
		return new Libro(tipologia,titolo,autore,lingua,categoria,codiceIsbn,editore,descrizione,dataPubb,copieRimanenti,numPag,numAcq,prezzo,foto, disponibilita);
	}
	*/
	
	public Raccolta createRivista( String tipologia,String titolo,String autore, String lingua,String editore,String descrizione,String dataPubb,int numPag,int prezzo, Image foto, Boolean disponibilita)
	{
		return new Rivista(tipologia,titolo,autore,lingua,editore,descrizione,dataPubb,numPag,prezzo,foto,disponibilita);
	}
	
	public Raccolta creaGiornale(String tipologia,String titolo, String lingua, String editore, String dataPubb, int copieRimanenti, int prezzo,
			Image foto, Boolean disponibilita)
	{
		return new Giornale(tipologia,titolo,lingua,editore,dataPubb,copieRimanenti,prezzo,foto,  disponibilita);
	}
	
	

}
