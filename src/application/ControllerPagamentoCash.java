package application;

import singletonPagamento.SingletonPagamento;

public class ControllerPagamentoCash {
	
	public void controlla() {
		
	}
	public ControllerPagamentoCash() throws Exception
	{
		SingletonPagamento.getInstance().decidiPagemento(1);

	}

}
