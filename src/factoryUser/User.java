package factoryUser;

import java.sql.Date;
import java.util.List;

import factoryBook.Libro;

public class User {
	
	private String nome,cognome,email,password,nickname,descrizione;
	private Date dataDiNascita;
	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return this.cognome;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPassword() {
		return this.password;
	}

	public String getNickname() {
		return this.nickname;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public Date getDataDiNascita() {
		return this.dataDiNascita;
	}

	public List<Libro> getPreferiti() {
		return this.preferiti;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public void setPreferiti(List<Libro> preferiti) {
		this.preferiti = preferiti;
	}

	private List<Libro> preferiti; //lista dei preferiti

	public User() 
	{
		this.nome = null;
		this.cognome = null; 
		this.email = null;
		this.password = null; 
		this.nickname = null;
		this.descrizione = null;
		this.dataDiNascita = null;
		this.preferiti = null;
	}
	
	public User (String nome, String cognome, String email, String password, String nickname, String desc, Date dataDinascita,List<Libro> preferiti)
	{
		this.nome = nome;
		this.cognome = cognome; 
		this.email = email;
		this.password = password; 
		this.nickname = nickname;
		this.descrizione = desc;
		this.dataDiNascita = dataDinascita;
		this.preferiti = preferiti;
		
	}
	

	

}
