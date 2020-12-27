package application

import java.sql.SQLException
import database.RivistaDao
import factoryBook.Raccolta
import factoryBook.Rivista
import javafx.collections.ObservableList

class ControllerCompravenditaRiviste {
	RivistaDao rD
	Rivista r

	new() {
		rD = new RivistaDao()
		r = new Rivista()
	}

	def ObservableList<Raccolta> getRivisteE() throws SQLException {
		return rD.getRiviste()
	}

	def void disponibilitaRiviste(String titolo) {
		r.setTitolo(titolo)
		rD.getDesc(r)
	}
}
