package bso;

import java.sql.Date;

public class CartaCredito {
	private int tipo;
	private String numeroCC;
	private double limite;
	private double ammontare;
	private Date scadenza;
	private String nomeUser; 
	private String cognomeUser; 

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
	}
	public CartaCredito(int tipo,String numero,double lim,double amm,Date scad,String nU,String cU)
	{
		this.tipo=tipo;
		this.numeroCC=numero;
		this.limite=amm;
		this.scadenza=scad;
		this.nomeUser=nU;
		this.cognomeUser=cU;
	}
	
	public CartaCredito(String nU,String cU ,String numero)
	{
		this.nomeUser=nU;
		this.cognomeUser=cU;
		this.numeroCC=numero;
	}
	
}