package application;


import java.sql.SQLException;

import database.LibroDao;
import factoryBook.Raccolta;
import javafx.collections.ObservableList;

public class ControllerCompravenditaLibri {
	private LibroDao lD;

	
	
	public void disponibilitaLibro(String isbn) {
		lD.getDesc(isbn);
		
		
		
	}

	public ControllerCompravenditaLibri()
	{
		lD=new LibroDao();
	}
	public void catalogo()
	{
		
	}
	
	public ObservableList<Raccolta> getLibri() throws SQLException
	{
		return lD.getLibri();
	}
		
	

}
