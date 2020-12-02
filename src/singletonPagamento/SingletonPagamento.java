package singletonPagamento;

public class SingletonPagamento {
	
	private static SingletonPagamento instance=new SingletonPagamento();
	
	private SingletonPagamento()
	{}
	
	public static SingletonPagamento getInstance()
	{
		return instance;
	}

	public void decidiPagemento(int metodo) throws Exception
	{
		//metodo 0 cc, 1 cash ,-1 errore
		
		switch(metodo)
		{
		case 0:
			{
				System.out.println(" pagamento carta credito istance:"+instance);
				break;

			}
		case 1:
		{
			System.out.println(" pagamento contanti istance: "+instance);
			break;

		}
		case -1:
		{
			System.out.println(" errore nel pagamento");
			
			break;

		}
		default:
			throw new Exception();
		
		}
	}
}
