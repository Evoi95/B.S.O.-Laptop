package bso;
import java.util.ArrayList;
public class Scrittore {
	
	/*  Create table  if not exists scrittori
	( Nome Varchar(20),Cognome Varchar(20),
	  id int primary key auto_increment not null,
      email Varchar(20), pwd Varchar(20),
      nickName Varchar(20), descrizione text,
      dataDiNascita Date, ListaDeiPreferiti Varchar(200),
      ListaColleghiAssociati Varchar(200), 
      editore int,
      foreign key (editore) references editore(id), 
      libriPubblicati varchar(20), numeroPublicazioni int);
      */
	private String nome,cognome,email,user,pass,descrizione,listaPref,libriPubb;
	//lista colleghi associati??
	private ArrayList<Scrittore> coleghi=new ArrayList<Scrittore>();
	private int idScrittore,dataN,editore;

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

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getListaPref() {
		return this.listaPref;
	}

	public void setListaPref(String listaPref) {
		this.listaPref = listaPref;
	}

	public String getLibriPubb() {
		return this.libriPubb;
	}

	public void setLibriPubb(String libriPubb) {
		this.libriPubb = libriPubb;
	}

	public int getIdScrittore() {
		return this.idScrittore;
	}

	public void setIdScrittore(int idScrittore) {
		this.idScrittore = idScrittore;
	}

	public int getDataN() {
		return this.dataN;
	}

	public void setDataN(int dataN) {
		this.dataN = dataN;
	}

	public int getEditore() {
		return this.editore;
	}

	public void setEditore(int editore) {
		this.editore = editore;
	}

	public Scrittore(String nome, String cognome, String email, String user, String pass, String descrizione,
			String listaPref, String libriPubb, int idScrittore, int dataN, int editore) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.user = user;
		this.pass = pass;
		this.descrizione = descrizione;
		this.listaPref = listaPref;
		this.libriPubb = libriPubb;
		this.idScrittore = idScrittore;
		this.dataN = dataN;
		this.editore = editore;
	}
	
	
	

}
