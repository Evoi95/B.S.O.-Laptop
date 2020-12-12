package application;

import java.sql.Date;
import java.sql.SQLException;

import bso.CartaCredito;
import database.CartaCreditoDao;
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
		cDao.daiPrivilegi();
		//cDao.daiPrivilegi();//SingletonPagamento.getInstance().decidiPagemento(0);
	}

	public void aggiungiCartaDB(String n,String c,String cod,java.util.Date data,String civ) throws SQLException {
		CartaCredito cc=new CartaCredito(n,c,cod,(Date) data,civ);
		//System.out.println("cc :"+cc);
		cDao.insCC(cc);
		
		//Alert
		/*
		 * todo inserire carta
		 */
		// TODO Auto-generated method stub
		//Store carta in db
		//riuso funzione tasto invio senza salvare
		
	}

	public ObservableList<CartaCredito> ritornaElencoCC(String nomeU) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("Chiamata nel controller :"+cDao.getCarteCredito(nomeU));
		return cDao.getCarteCredito(nomeU);
	}
	
	
	

}
