package application;

import java.sql.SQLException;

import bso.Pagamento;
import database.GiornaleDao;
import database.LibroDao;
import database.PagamentoDao;
import database.RivistaDao;
import factoryBook.Giornale;
import factoryBook.Libro;
import factoryBook.Rivista;

public class ControllerAcquista  {
	//private Thread t;
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private LibroDao lD;
	private GiornaleDao gD;
	private RivistaDao rD;
	private PagamentoDao pagD;
	private Libro l;
	private Giornale  g;
	private Rivista r;
	private Pagamento p;
	public float totale(String isbn,int disp)
	{
		float x=(float) 0.0;
		//lD.
		//calcolo qui il toatale
		try {			
			lD.daiPrivilegi();

			l.setCodIsbn(isbn);
			l.setDisponibilita(disp);
			x=lD.getCosto(l);
			
			//Thread t=new Thread();
			System.out.println("ControllerAcquist");
			lD.aggiornaDisponibilita(l);
			

		//t.start();
		//	t.run();

			
			//l.compra();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
	
	public float totaleG(String titolo,int disp)
	{
		float y=(float)0.0;
		g.setTitolo(titolo);
		g.setDisponibilita(disp);
		try {
			gD.daiPrivilegi();
			y=gD.getCosto(g);
			gD.aggiornaDisponibilita(g);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return y;


	}
	
	public float totaleR(String titolo,int disp)
	{
		float z=(float)0.0;
		r.setTitolo(titolo);
		r.setCopieRim(disp);
		try {
			rD.daiPrivilegi();
			z=rD.getCosto(r);
			rD.aggiornaDisponibilita(r);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return z;

		
	}
	
	public ControllerAcquista()
	{
		lD=new LibroDao();
		gD=new GiornaleDao();
		rD=new RivistaDao();
		l=new Libro();
		g=new Giornale();
		r=new Rivista();
		p=new Pagamento(0);
		pagD=new PagamentoDao();
		//t=new Thread();
		
	}
	public void retAmmontare(String amm)
	{
		p.setAmmontare(Float.parseFloat(amm));
		try {
			pagD.daiPrivilegi();
			pagD.inserisciPagamento(p);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//pagamentoDAo.ad();
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
