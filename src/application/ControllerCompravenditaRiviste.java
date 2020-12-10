package application;


import java.sql.SQLException;

import database.LibroDao;
import factoryBook.Raccolta;
import javafx.collections.ObservableList;


public class ControllerCompravenditaRiviste {
	private LibroDao lD;
	
	public ControllerCompravenditaRiviste()
	{
		lD=new LibroDao();

	}
	
	public ObservableList<Raccolta> getRivisteE() throws SQLException
	{
		return lD.getRivisteE();
	}

}

