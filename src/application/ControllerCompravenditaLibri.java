package application;


import java.sql.SQLException;

import database.LibroDao;
import factoryBook.Libro;
import factoryBook.Raccolta;
import javafx.collections.ObservableList;

public class ControllerCompravenditaLibri {
	private LibroDao lD;
	private Libro l;

	
	
	public void disponibilitaLibro(String isbn) {
		l.setCodIsbn(isbn);
		
		lD.getDesc(l);
		
		
		
	}

	public ControllerCompravenditaLibri()
	{
		lD=new LibroDao();
	     l=new Libro();

	}
	
	public ObservableList<Raccolta> getLibri() throws SQLException
	{
		return lD.getLibri();
	}
		
	

}
