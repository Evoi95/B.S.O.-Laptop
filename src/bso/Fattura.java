package bso;

public class Fattura {
	private String nome,cognome, via, com;
	private float ammontare;

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

	public float getAmmontare() {
		return this.ammontare;
	}

	public void setAmmontare(float ammontare) {
		this.ammontare = ammontare;
	}

	public Fattura(String nome, String cognome, String via, String com, float ammontare) {
		//super();
		this.nome = nome;
		this.cognome = cognome;
		this.via = via;
		this.com = com;
		this.ammontare=ammontare;
	}
	public Fattura()
	{
		this.nome=null;
		this.cognome=null;
		this.via=null;
		this.com=null;
		this.ammontare=0;
	}
	

}
