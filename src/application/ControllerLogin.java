package application;


public class ControllerLogin {
	

	
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
		else if( u.equals("") && p.equals(""))
		{
			System.out.println("Errore nelle credenziali");
					
			return false;

		}
		else {
			System.out.println("Errore nelle credenziali");
		}
		return esito;
	}
}
