package application;


import java.io.IOException;
import java.sql.SQLException;

import database.PagamentoDao;

public class ControllerPagamentoCash {
	private PagamentoDao pD;
	
	public void controlla(String nome,String cognome,String via,String com,int id) throws IOException, SQLException {
	try {
		pD.daiPrivilegi();
	pD.inserisciFattura(nome, cognome, via, com, id);
	}catch(Exception e)
	{
		e.getCause();
	}
	//state=true;
	//state=true;

	
		//return state;
	}
	
	public ControllerPagamentoCash() throws Exception
	{
		pD=new PagamentoDao();
	}
	
	

}
