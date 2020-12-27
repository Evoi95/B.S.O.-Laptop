package application

import java.sql.Date
import java.sql.SQLException
import bso.CartaCredito
import database.CartaCreditoDao
import javafx.collections.ObservableList

class ControllerPagamentoCC {
	CartaCreditoDao cDao
	String appoggio = ""
	Boolean state
	CartaCredito cc

	def boolean controllaPag(String d, String c) {
		appoggio = appoggio + d
		// System.out.println("appoggio : "+appoggio);
		var int anno = Integer::parseInt((appoggio.subSequence(0, 4) as String))
		var int mese = Integer::parseInt((appoggio.subSequence(5, 7) as String))
		var int giorno = Integer::parseInt((appoggio.subSequence(8, 10) as String))
		// System.out.println("anno : \t"+anno +"\n mese : \t"+mese+"\ngiorno : \t"+giorno);
		if (anno > 2020 && (mese >= 1 && mese <= 12) && (giorno >= 1 && giorno <= 31) && c.length() <= 20) {
			state = true
		} else {
			state = false
		}
		return state
	}

	new() throws Exception {
		cDao = new CartaCreditoDao()
		cDao.daiPrivilegi()
	}

	def void aggiungiCartaDB(String n, String c, String cod, java.util.Date data, String civ,
		float prezzo) throws SQLException {
		try {
			cc = new CartaCredito(n, c, cod, (data as Date), civ, 0)
			cc.setPrezzoTransazine(cDao.prendiSpesa())
			cDao.insCC(cc)
		} catch (SQLException e) {
			e.getCause()
		}

	}

	def ObservableList<CartaCredito> ritornaElencoCC(String nomeU) throws SQLException {
		// TODO Auto-generated method stub
		// System.out.println("Chiamata nel controller :"+cDao.getCarteCredito(nomeU));
		return cDao.getCarteCredito(nomeU)
	}
}
