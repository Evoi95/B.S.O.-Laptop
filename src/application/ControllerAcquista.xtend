package application

import java.sql.SQLException
import bso.Pagamento
import database.GiornaleDao
import database.LibroDao
import database.PagamentoDao
import database.RivistaDao
import factoryBook.Giornale
import factoryBook.Libro
import factoryBook.Rivista

class ControllerAcquista {
	LibroDao lD
	GiornaleDao gD
	RivistaDao rD
	PagamentoDao pagD
	Libro l
	Giornale g
	Rivista r
	Pagamento p

	def float totale(String isbn, int disp) {
		var float x = (0.0 as float)
		try {
			lD.daiPrivilegi()
			l.setCodIsbn(isbn)
			l.setDisponibilita(disp)
			x = lD.getCosto(l)
			System::out.println("ControllerAcquist")
			lD.aggiornaDisponibilita(l)
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace()
		}

		return x
	}

	def float totaleG(String titolo, int disp) {
		var float y = (0.0 as float)
		g.setTitolo(titolo)
		g.setDisponibilita(disp)
		try {
			gD.daiPrivilegi()
			y = gD.getCosto(g)
			gD.aggiornaDisponibilita(g)
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace()
		}

		return y
	}

	def float totaleR(String titolo, int disp) {
		var float z = (0.0 as float)
		r.setTitolo(titolo)
		r.setCopieRim(disp)
		try {
			rD.daiPrivilegi()
			z = rD.getCosto(r)
			rD.aggiornaDisponibilita(r)
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace()
		}

		return z
	}

	new() throws SQLException {
		lD = new LibroDao()
		gD = new GiornaleDao()
		rD = new RivistaDao()
		l = new Libro()
		g = new Giornale()
		r = new Rivista()
		pagD = new PagamentoDao()
		pagD.daiPrivilegi()
		p = new Pagamento(0)
	}

	def void returnSpesa(String amm) throws SQLException {
		var float totale = Float::parseFloat(amm)
		p.setMetodo(null)
		p.setEsito(-1)
		p.setNomeUtente(null)
		p.setAmmontare(totale)
		pagD.inserisciPagamento(p)
	}
}
