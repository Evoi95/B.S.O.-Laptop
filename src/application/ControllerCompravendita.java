package application;

import factoryBook.Factory;
import factoryBook.Giornale;
import factoryBook.Libro;
import factoryBook.Raccolta;
import factoryBook.Rivista;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ControllerCompravendita {
	private Factory f;

	
	
	//public boolean disponibilitaLibro(String libro) {
		// TODO Auto-generated method stub
	//	boolean state =false;
		//disp=select quantita from libreo
		//if (disp>0)
			//state=true;
		//else state=false;
		//return state;
	//}

	public ControllerCompravendita()
	{
		f=new Factory();
	}
	public void catalogo()
	{
		
	}
	
	public ObservableList<Raccolta> getLibri()
	{
		ObservableList<Raccolta> catalogo=FXCollections.observableArrayList();
		catalogo.add((Libro) f.createLibro("libro","pippo", "pluto","it","fantasy","8055613","paperino","thriller", "5/25/2020", 100, 150, 20, 30, null, true));
		//catalogo.add(new Libro("pippo","pluto","it","fantasy","8004163529","paperino","avventura",100,11,11,5252020,18,null,true));
		
		System.out.println(catalogo);
		return catalogo;
		
	}
	
	public ObservableList<Raccolta> getRiviste()
	{
		ObservableList<Raccolta> catalogo=FXCollections.observableArrayList();
		catalogo.add((Rivista) f.createRivista("rivista", "rivista1","dddd","it","paperino","sport","6/9/2020",20,50,null,true));
		System.out.println(catalogo);
		return catalogo;
		
	}
	
	public ObservableList<Raccolta> getGiornali()
	{
		ObservableList<Raccolta> catalogo=FXCollections.observableArrayList();
		catalogo.add((Giornale)f.creaGiornale("giornale","il sole 24 ore","it","il sole 24 ore","2/5/2020",300,2,null,true));
	    System.out.println(catalogo);
		return catalogo;
		
	}
	
	
	
	

}
