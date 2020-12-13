package bso;

public class Fattura {
	private String nome,cognome, via, com;

	public String getNome() {
		return this.nome;
	}

	public String getCognome() {
		return this.cognome;
	}

	public String getVia() {
		return this.via;
	}

	public String getCom() {
		return this.com;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public void setCom(String com) {
		this.com = com;
	}

	public Fattura(String nome, String cognome, String via, String com) {
		//super();
		this.nome = nome;
		this.cognome = cognome;
		this.via = via;
		this.com = com;
	}
	public Fattura()
	{
		this.nome=null;
		this.cognome=null;
		this.via=null;
		this.com=null;
	}
	

}
