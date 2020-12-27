package application

import java.sql.SQLException
import database.GiornaleDao
import factoryBook.Giornale
import factoryBook.Raccolta
import javafx.collections.ObservableList

class ControllerCompravenditaGiornali {
	GiornaleDao gD
	Giornale g

	new() {
		gD = new GiornaleDao()
		g = new Giornale()
	}

	def ObservableList<Raccolta> getGiornali() throws SQLException {
		// TODO Auto-generated method stub
		return gD.getGiornali()
	}

	def void disponibilitaGiornale(String titolo) throws SQLException {
		g.setTitolo(titolo)
		gD.getDesc(g)
	}
}
