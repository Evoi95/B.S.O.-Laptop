package application;

public class Controller {
	
	boolean controlla(String u,String p)
	{
		boolean esito=false;
		if(u.equals("admin"))
		{
			if(p.equals("admin"))
			{
				System.out.println("Accesso autorizzato ");
				esito=true;
			}
		}
		else {
			System.out.println("Errore nelle credenziali");
		}
		return esito;
		
	}
}
