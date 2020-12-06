package application;


import java.io.IOException;

import database.PagamentoDao;

public class ControllerPagamentoCash {
	private PagamentoDao pD;
	
	public void controlla(String nome,String cognome,String via,String com,int id) throws IOException {
	pD.inserisciFattura(nome, cognome, via, com, id);
	//state=true;
	//state=true;

	
		//return state;
	}
	
	public ControllerPagamentoCash() throws Exception
	{
		pD=new PagamentoDao();
	}
	
	

}
