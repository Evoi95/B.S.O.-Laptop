package b.s.o;

public class Admin {
	protected String nome,cognome,email,pass;
	protected int idAmm;

	public Admin() 
	{
		nome = null;
		cognome = null ;
		email = null;
		pass = null;
		idAmm = -1;
	}

	public Admin(String nome, String cognome, String email, String pass, int idAmm) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.pass = pass;
		this.idAmm = idAmm;
	}
	
	

}
