package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.ConnToDb;
import factoryBook.Factory;

import factoryBook.Raccolta;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ControllerCompravendita {
	private Factory f;

	
	
	//public boolean disponibilitaLibro(String libro) {
		// TODO Auto-generated method stub
	//	boolean state =false;
		//disp=select quantita from libreo
		//if (disp>0)
			//state=true;
		//else state=false;
		//return state;
	//}

	public ControllerCompravendita()
	{
		f=new Factory();
	}
	public void catalogo()
	{
		
	}
	
	public ObservableList<Raccolta> getLibri() throws SQLException
	{
		Connection c= ConnToDb.generalConnection();
		/*
		 * uare funzione internet
		 */
		ObservableList<Raccolta> catalogo=FXCollections.observableArrayList();
		 
			//ConnToDb.connection();
            ResultSet rs=c.createStatement().executeQuery("SELECT * FROM libro");

            while(rs.next())
            {
               // System.out.println("res :"+rs);

        		try {
					catalogo.add(f.createLibro("libro",rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getDate(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getInt(12),rs.getFloat(13),rs.getInt(14),rs.getBinaryStream(15)));
					//rs=rs.next();
        		} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

            }
		
		//catalogo.add(new Libro("pippo","pluto","it","fantasy","8004163529","paperino","avventura",100,11,11,5252020,18,null,true));
		
		System.out.println(catalogo);
		return catalogo;
		
	}
	
/*	public ObservableList<Raccolta> getRiviste()
	{
		ObservableList<Raccolta> catalogo=FXCollections.observableArrayList();
		catalogo.add((Rivista) f.createRivista("rivista", "rivista1","dddd","it","paperino","sport","6/9/2020",20,50,null,true));
		System.out.println(catalogo);
		return catalogo;
		
	}
	
	public ObservableList<Raccolta> getGiornali()
	{
		ObservableList<Raccolta> catalogo=FXCollections.observableArrayList();
		catalogo.add((Giornale)f.creaGiornale("giornale","il sole 24 ore","it","il sole 24 ore","2/5/2020",300,2,null,true));
	    System.out.println(catalogo);
		return catalogo;
		
	}
*/	
	
	
	

}
