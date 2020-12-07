package bso;

import java.sql.Date;
import java.util.List;

import factoryBook.Libro;

public class User {
	
	private String nome,cognome,email,password,nickname,descrizione;
	private Date dataDiNascita;
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
