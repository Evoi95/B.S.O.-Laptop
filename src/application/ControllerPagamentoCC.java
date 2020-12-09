package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import bso.CartaCredito;
import database.CartaCreditoDao;
import database.ConnToDb;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ControllerPagamentoCC {
	private CartaCreditoDao cDao;
	
	//private SingletonPagamento sP;

	

	public boolean controllaPag() {
		return false;
		// TODO Auto-generated method stub
		
	}
	
	public ControllerPagamentoCC() throws Exception
	{
		cDao=new CartaCreditoDao();
		cDao.daiPrivilegi();//SingletonPagamento.getInstance().decidiPagemento(0);
	}

	public void aggiungiCartaDB() {
		// TODO Auto-generated method stub
		//Store carta in db
		//riuso funzione tasto invio senza salvare
		
	}
	
	public ObservableList<CartaCredito> getCarteCredito(String nome) throws SQLException
	{
		Connection c= ConnToDb.generalConnection();
		/*
		 * uare funzione internet
		 */
		ObservableList<CartaCredito> catalogo=FXCollections.observableArrayList();
		 
			//ConnToDb.connection();
            ResultSet rs=c.createStatement().executeQuery("select nomeP,cognomeP,codiceCarta from cartaCredito where nomeP='"+nome+"'");

            while(rs.next())
            {

        		try {             
        			// System.out.println("res :"+rs.getString(1));

					catalogo.add(new CartaCredito(rs.getString(1),rs.getString(2),rs.getString(3)));
					//rs=rs.next();
        		} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

            }
		
		//catalogo.add(new Libro("pippo","pluto","it","fantasy","8004163529","paperino","avventura",100,11,11,5252020,18,null,true));
		
		System.out.println(catalogo);
		return catalogo;
		
	}

}
