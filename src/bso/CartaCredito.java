package bso;

import java.sql.Date;

public class CartaCredito {
	private int tipo;
	private String numeroCC;
	private double limite;
	private double ammontare;
	private Date scadenza;
	private String nomeUser; 
	private float prezzoTransazine;
	public float getPrezzoTransazine() {
		return this.prezzoTransazine;
	}
	public void setNomeUser(String nomeUser) {
		this.nomeUser = nomeUser;
	}
	public void setPrezzoTransazine(float prezzoTransazine) {
		this.prezzoTransazine = prezzoTransazine;
	}
	public void setCognomeUser(String cognomeUser) {
		this.cognomeUser = cognomeUser;
	}
	public String getCiv() {
		return this.civ;
	}
	public void setCiv(String civ) {
		this.civ = civ;
	}

	private String cognomeUser; 
	private String civ;

	private static final String[] types = {"No Card:Cash Only","DINER'S","JCB","MASTER","VISA"};

	public int getTipo() {
		return this.tipo;
	}
	public String getNumeroCC() {
		return this.numeroCC;
	}
	public double getLimite() {
		return this.limite;
	}
	public double getAmmontare() {
		return this.ammontare;
	}
	public Date getScadenza() {
		return this.scadenza;
	}
	public String getUserNome() {
		return this.nomeUser;
	}
	public String getUserCognome() {
		return this.cognomeUser;
	}
	public static String[] getTypes() {
		return types;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public void setNumeroCC(String numeroCC) {
		this.numeroCC = numeroCC;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public void setAmmontare(double ammontare) {
		this.ammontare = ammontare;
	}
	public void setScadenza(Date scadenza) {
		this.scadenza = scadenza;
	}
	public void setUserNome(String nomeUser) {
		this.nomeUser= nomeUser;
	}
	public void setUserCognome(String cognomeUser) {
		this.cognomeUser= cognomeUser;
	}
	
	public CartaCredito()
	{
		this.tipo=0;
		this.numeroCC=null;
		this.limite=0;
		this.ammontare=0;
		this.scadenza=null;
		this.nomeUser=null;//tutto a null
		this.cognomeUser=null;
		this.civ=null;
		this.prezzoTransazine=0;
	}
	public CartaCredito(int tipo,String numero,double lim,double amm,Date scad,String nU,String cU,String civ)
	{
		this.tipo=tipo;
		this.numeroCC=numero;
		this.limite=amm;
		this.scadenza=scad;
		this.nomeUser=nU;
		this.cognomeUser=cU;
		this.civ=civ;
	}
	
	
	public CartaCredito(String n,String c,String cod,Date data,String civ,float prezzo)
			{
				//String scadenza;
				this.nomeUser=n;
				this.cognomeUser=c;
				this.numeroCC=cod;
				this.ammontare=1000.0;
				this.scadenza=data;//scadenza=data;
				this.civ=civ;
				this.prezzoTransazine=prezzo;
			}
	public String getCodicePin() {
		// TODO Auto-generated method stub
		return this.civ;
	}
	public void setCodicePin(String pin)
	{
		this.civ=pin;
	}
	
}