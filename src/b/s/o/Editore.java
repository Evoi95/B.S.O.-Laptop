package b.s.o;

public class Editore {

	private String nome,cognome,email,pass,casaEditrice,libriPubb;
	//listaScrittoriAsociati ???
	private int idEditore;
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
	public String getPass() {
		return this.pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getCasaEditrice() {
		return this.casaEditrice;
	}
	public void setCasaEditrice(String casaEditrice) {
		this.casaEditrice = casaEditrice;
	}
	public String getLibriPubb() {
		return this.libriPubb;
	}
	public void setLibriPubb(String libriPubb) {
		this.libriPubb = libriPubb;
	}
	public int getIdEditore() {
		return this.idEditore;
	}
	public void setIdEditore(int idEditore) {
		this.idEditore = idEditore;
	}
	public Editore(String nome, String cognome, String email, String pass, String casaEditrice, String libriPubb,
			int idEditore) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.pass = pass;
		this.casaEditrice = casaEditrice;
		this.libriPubb = libriPubb;
		this.idEditore = idEditore;
	}
	
	
	
}
