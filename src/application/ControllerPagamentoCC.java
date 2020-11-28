package application;

import singletonPagamento.SingletonPagamento;

public class ControllerPagamentoCC {
	
	//private SingletonPagamento sP;

	

	public boolean controllaPag() {
		return false;
		// TODO Auto-generated method stub
		
	}
	
	public ControllerPagamentoCC() throws Exception
	{
		SingletonPagamento.getInstance().decidiPagemento(0);
	}

}
