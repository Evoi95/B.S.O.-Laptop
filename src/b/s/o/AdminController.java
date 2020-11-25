package b.s.o;

public class AdminController {
	
	private Admin admin = new Admin();
	
	public String getNome() {
		return admin.nome;
	}
	public void setNome(String nome) {
		admin.nome = nome;
	}
	public String getCognome() {
		return admin.cognome;
	}
	public void setCognome(String cognome) {
		admin.cognome = cognome;
	}
	public String getEmail() {
		return admin.email;
	}
	public void setEmail(String email) {
		admin.email = email;
	}
	public String getPass() {
		return admin.pass;
	}
	public void setPass(String pass) {
		admin.pass = pass;
	}
	public int getIdAmm() {
		return admin.idAmm;
	}
	public void setIdAmm(int idAmm) {
		admin.idAmm = idAmm;
	}

	
	

}
