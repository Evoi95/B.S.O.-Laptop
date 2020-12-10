package application;


import java.sql.SQLException;

import database.LibroDao;
import factoryBook.Raccolta;
import javafx.collections.ObservableList;

public class ControllerCompravenditaGiornali {
	private LibroDao lD;

	public ControllerCompravenditaGiornali()
	{
		lD=new LibroDao();
		
	}

	public ObservableList<Raccolta> getGiornali() throws SQLException {
		// TODO Auto-generated method stub
		
		return lD.getGiornali();
		
		
	}

}
