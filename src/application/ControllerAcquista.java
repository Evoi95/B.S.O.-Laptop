package application;

import java.sql.SQLException;

import database.LibroDao;

public class ControllerAcquista {
	private LibroDao lD;
	
	public float totale(String nome)
	{
		float x=(float) 0.0;
		//lD.
		//calcolo qui il toatale
		try {
			x=lD.getCosto(nome);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
	
	public ControllerAcquista()
	{
		lD=new LibroDao();
	}
	
}
