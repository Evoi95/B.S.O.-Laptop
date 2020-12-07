package application;

import java.sql.SQLException;

import database.LibroDao;

public class ControllerAcquista  {
	//private Thread t;
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private LibroDao lD;
	
	public float totale(String isbn,int disp)
	{
		float x=(float) 0.0;
		//lD.
		//calcolo qui il toatale
		try {
			x=lD.getCosto(isbn);
			//Thread t=new Thread();
			System.out.println("ControllerAcquist");
			lD.daiPrivilegi();
			lD.aggiornaDisponibilita(isbn, disp);
			

		//t.start();
		//	t.run();

			
			//l.compra();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
	
	public ControllerAcquista()
	{
		lD=new LibroDao();
		//t=new Thread();
		
	}
	/*
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Thread t=new Thread();
		
		lD.aggiornaDisponibilita("8832734591",4);
		System.out.println("run del thread");
		//t.start();
		
	}*/
	
}
