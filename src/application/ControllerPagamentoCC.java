package application;

import java.sql.Date;
import java.sql.SQLException;


import bso.CartaCredito;
import database.CartaCreditoDao;
import javafx.collections.ObservableList;
public class ControllerPagamentoCC {
	private CartaCreditoDao cDao;
	private String appoggio = "";
	private Boolean state;
	//private SingletonPagamento sP;

	

	public boolean controllaPag(String d,String c) {
		//System.out.println(d.getDay());
		//System.out.println("data :"+d.getTime());
		
		appoggio=appoggio+d;
		System.out.println("appoggio : "+appoggio);
		int anno=Integer.parseInt((String) appoggio.subSequence(0,4));
		int mese=Integer.parseInt((String) appoggio.subSequence(5,7));
		int giorno=Integer.parseInt((String) appoggio.subSequence(8,10));
		
		System.out.println("anno : \t"+anno +"\n mese : \t"+mese+"\ngiorno : \t"+giorno);

		if(anno>2020 && (mese >=1 && mese<=12) && (giorno>=1 && giorno<=31) && c.length()<=20)
			{
				System.out.println("datta corretta");
				System.out.println("anno-mese-giorno :" +anno +mese +giorno);
				state=true;

			}
		else {
			System.out.println("data incorretta");
			state=false;
			
		}
		return state;
		
		
		
		
				//System.out.println(appoggio[4]);

		
		//8832734893
		
		//String date = "2015-04-12";
		//java.sql.Date dat = java.sql.Date.valueOf("2020-08-15");
/*
		LocalDate localDate = dat.toLocalDate();
		System.out.println(localDate.getMonthValue());
		System.out.println(localDate.getYear());
		/*
		 * implementare qui 
		 */
		//return false;
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
