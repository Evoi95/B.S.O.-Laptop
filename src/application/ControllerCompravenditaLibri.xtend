package application

import java.sql.SQLException
import database.LibroDao
import factoryBook.Libro
import factoryBook.Raccolta
import javafx.collections.ObservableList

class ControllerCompravenditaLibri {
	LibroDao lD
	Libro l

	def void disponibilitaLibro(String isbn) throws SQLException {
		l.setCodIsbn(isbn)
		lD.getDesc(l)
	}

	new() {
		lD = new LibroDao()
		l = new Libro()
	}

	def ObservableList<Raccolta> getLibri() throws SQLException {
		return lD.getLibri()
	}
}
