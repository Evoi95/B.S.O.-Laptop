package application;

import b.s.o.Libro;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ControllerCompravendita {
	
	
	//public boolean disponibilitaLibro(String libro) {
		// TODO Auto-generated method stub
	//	boolean state =false;
		//disp=select quantita from libreo
		//if (disp>0)
			//state=true;
		//else state=false;
		//return state;
	//}

	public void catalogo()
	{
		
	}
	
	public ObservableList<Libro> getLibri()
	{
		ObservableList<Libro> catalogo=FXCollections.observableArrayList();
		catalogo.add(new Libro("pippo", "pluto","it","fantasy","8055613","paperino","thriller", "5/25/2020", 100, 150, 20, 30, null, true));
		//catalogo.add(new Libro("pippo","pluto","it","fantasy","8004163529","paperino","avventura",100,11,11,5252020,18,null,true));
		
		return catalogo;
		
	}
}
