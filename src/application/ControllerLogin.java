package application;

public class ControllerLogin {
	
	boolean controlla(String u,String p,String user, String pwd)
	{
		boolean esito=false;
		if(u.equals(user))
		{
			if(p.equals(pwd))
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
