package application;


import java.sql.SQLException;

import database.RivistaDao;
import factoryBook.Raccolta;
import factoryBook.Rivista;
import javafx.collections.ObservableList;


public class ControllerCompravenditaRiviste {
	private RivistaDao rD;
	private Rivista r;
	
	public ControllerCompravenditaRiviste()
	{
		rD=new RivistaDao();
		r=new Rivista();

	}
	
	public ObservableList<Raccolta> getRivisteE() throws SQLException
	{
		//System.out.println("Riviste"+lD.getRiviste());
		return rD.getRiviste();
	}

	public void disponibilitaRiviste(String titolo) {
		r.setTitolo(titolo);
		
		rD.getDesc(r);
		
		
		
	}

	

}

