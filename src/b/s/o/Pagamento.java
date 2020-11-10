package b.s.o;

public class Pagamento {
	private int id,idUtente;
	private boolean metodoPag,esito;
	private String riepilogo;
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdUtente() {
		return this.idUtente;
	}
	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}
	public boolean isMetodoPag() {
		return this.metodoPag;
	}
	public void setMetodoPag(boolean metodoPag) {
		this.metodoPag = metodoPag;
	}
	public boolean isEsito() {
		return this.esito;
	}
	public void setEsito(boolean esito) {
		this.esito = esito;
	}
	public String getRiepilogo() {
		return this.riepilogo;
	}
	public void setRiepilogo(String riepilogo) {
		this.riepilogo = riepilogo;
	}
	public Pagamento(int id, int idUtente, boolean metodoPag, boolean esito, String riepilogo) {
		super();
		this.id = id;
		this.idUtente = idUtente;
		this.metodoPag = metodoPag;
		this.esito = esito;
		this.riepilogo = riepilogo;
	}
	

}
