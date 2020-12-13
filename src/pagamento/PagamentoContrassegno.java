package pagamento;

import database.ContrassegnoDao;

public class PagamentoContrassegno extends Pagamento implements Runnable
{
	private ContrassegnoDao pD;
	

	public Boolean inserisciFattura(String nome,String cognome,String via,String com,int id){
		return false;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
	//	pD.inserisciFattura(nome, cognome, via, com, id);
		
	}

	/*public boolean effettuaPagamento(String nome,String cognome,String via,String com,int id) {
		// TODO Auto-generated method stub
		pD.inserisciFattura(nome, cognome, via, com, id);
		return false;
	}
	
	public PagamentoContrassegno()
	{
		super();
		pD=new PagamentoDao();
	}
*/
}
