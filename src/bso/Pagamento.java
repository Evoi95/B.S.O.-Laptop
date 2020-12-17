package bso;

public class Pagamento {
	private int id;
	private String metodo;
	private int esito; //0 ok 1 fallito
	private String nomeUtente;
	private float ammontare;
	public int getId() {
		return this.id;
	}
	public String getMetodo() {
		return this.metodo;
	}
	public int getEsito() {
		return this.esito;
	}
	public String getNomeUtente() {
		return this.nomeUtente;
	}
	public float getAmmontare() {
		return this.ammontare;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}
	public void setEsito(int esito) {
		this.esito = esito;
	}
	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}
	public void setAmmontare(float ammontare) {
		this.ammontare = ammontare;
	}
	public Pagamento(int id, String metodo, int esito, String nomeUtente, float ammontare) {
		//super();
		this.id = id;
		this.metodo = metodo;
		this.esito = esito;
		this.nomeUtente = nomeUtente;
		this.ammontare = ammontare;
	}
	public Pagamento(float ammontare)
	{
		this.id=0;
		this.metodo=null;
		this.esito=0;
		this.nomeUtente=null;
		this.ammontare=ammontare;
		
	}
	
}
