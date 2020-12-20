package factoryUser;

public class Utente {
	private String nome,cognome,email,user,pass,descr,listaPref;
	private int id, dataN;

	public String getNome() {
		return this.nome;
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
	public String getUser() {
		return this.user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return this.pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getDescr() {
		return this.descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getListaPref() {
		return this.listaPref;
	}
	public void setListaPref(String listaPref) {
		this.listaPref = listaPref;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDataN() {
		return this.dataN;
	}
	public void setDataN(int dataN) {
		this.dataN = dataN;
	}
	public Utente(String nome, String cognome, String email, String user, String pass, String descr, String listaPref,
			int id, int dataN) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.user = user;
		this.pass = pass;
		this.descr = descr;
		this.listaPref = listaPref;
		this.id = id;
		this.dataN = dataN;
	}
	
	/*
	 * Generare con factory
	 */

}
