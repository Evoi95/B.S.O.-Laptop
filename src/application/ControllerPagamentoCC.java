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
	private CartaCredito cc;

	public boolean controllaPag(String d, String c) {

		appoggio = appoggio + d;
		// System.out.println("appoggio : "+appoggio);
		int anno = Integer.parseInt((String) appoggio.subSequence(0, 4));
		int mese = Integer.parseInt((String) appoggio.subSequence(5, 7));
		int giorno = Integer.parseInt((String) appoggio.subSequence(8, 10));
		// System.out.println("anno : \t"+anno +"\n mese : \t"+mese+"\ngiorno :
		// \t"+giorno);

		if (anno > 2020 && (mese >= 1 && mese <= 12) && (giorno >= 1 && giorno <= 31) && c.length() <= 20) {
			state = true;

		} else {
			state = false;

		}
		return state;

	}

	public ControllerPagamentoCC() throws Exception {
		cDao = new CartaCreditoDao();
		cDao.daiPrivilegi();
	}

	public void aggiungiCartaDB(String n, String c, String cod, java.util.Date data, String civ, float prezzo)
			throws SQLException {
		try {
			cc = new CartaCredito(n, c, cod, (Date) data, civ, 0);

			cc.setPrezzoTransazine(cDao.prendiSpesa());
			cDao.insCC(cc);

		} catch (SQLException e) {
			e.getCause();
		}

	}

	public ObservableList<CartaCredito> ritornaElencoCC(String nomeU) throws SQLException {
		// TODO Auto-generated method stub
		// System.out.println("Chiamata nel controller :"+cDao.getCarteCredito(nomeU));
		return cDao.getCarteCredito(nomeU);
	}

}
