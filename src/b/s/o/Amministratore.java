package b.s.o;

public class Amministratore {
	private String nome,cognome,email,pass;
	private int idAmm;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return this.cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return this.pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getIdAmm() {
		return this.idAmm;
	}
	public void setIdAmm(int idAmm) {
		this.idAmm = idAmm;
	}
	public Amministratore(String nome, String cognome, String email, String pass, int idAmm) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.pass = pass;
		this.idAmm = idAmm;
	}
	
	

}
