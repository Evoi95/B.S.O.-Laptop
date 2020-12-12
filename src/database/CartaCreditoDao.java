package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import bso.CartaCredito;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class CartaCreditoDao {
	
	
	public ObservableList<CartaCredito> getCarteCredito(String nome) throws SQLException
	{
		Connection c= ConnToDb.generalConnection();
		/*
		 * uare funzione internet
		 */
		ObservableList<CartaCredito> catalogo=FXCollections.observableArrayList();
		 
			//ConnToDb.connection();
            ResultSet rs=c.createStatement().executeQuery("select nomeP,cognomeP,codiceCarta from cartaCredito where nomeP='"+nome+"'");

            while(rs.next())
            {
            	String n=rs.getString(1);
            	String cog=rs.getString(2);
            	String cod=rs.getString(3);
            	
            	

        		try {             
        			System.out.println("Stringhe : "+n+cog+cod);
        			// System.out.println("res :"+rs.getString(1));

					catalogo.add(new CartaCredito(n,cog,cod, null, cod));
					//rs=rs.next();
        		} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		
            }
		
		//catalogo.add(new Libro("pippo","pluto","it","fantasy","8004163529","paperino","avventura",100,11,11,5252020,18,null,true));
		
		System.out.println(catalogo);
		return catalogo;
		
	}	public void daiPrivilegi() throws SQLException
	{
		Connection conn=null;
		PreparedStatement stmt=null;
	//	Double d=(double) disp;

		 try {
			  conn = ConnToDb.generalConnection();
			  stmt = conn.prepareStatement(" SET SQL_SAFE_UPDATES=0");
			         stmt.executeUpdate();

	            
	         }catch(SQLException e)
	         {
	        	// esito=false;
	        	e.getMessage();

	         }	
		 finally {
			 stmt.close();
			 conn.close();
			 System.out.println("Ho chiuso tutto");
			 
		 }

		 System.out.println("LibroDao. privilegi");

}
	
	public void insCC(CartaCredito cc) throws SQLException
	{
		
		Connection conn=null;
		PreparedStatement stmt=null;
		
		//String nome=cc.getUserNome();
		 try {
			 
			// System.out.println("nome in insCC :"+cc.getUserNome());
			  conn = ConnToDb.generalConnection();
			  
			  
			 // stmt = conn.prepareStatement("insert into cartaCredito values(?,?,?,?,?)");
				stmt = conn.prepareStatement("insert into cartaCredito values(?,?,?,?,?)");
				stmt.setString(1, cc.getUserNome());
				stmt.setString(2, cc.getUserCognome());
				stmt.setString(3, cc.getNumeroCC());
				//String sc=cc.getScadenza().toString();
				//Date d=new SimpleDateFormat("yyyy/mm").parse(cc.getScadenza());

				stmt.setDate(4,cc.getScadenza());
				stmt.setString(5,cc.getCodicePin());
			    stmt.executeUpdate();
			    
			   
    	       

	            
	         }catch(SQLException e)
	         {
	        	// esito=false;
	        	e.getMessage();

	         }	
		 finally {
			 stmt.close();
			 conn.close();
			 System.out.println("Ho chiuso tutto");
			 
		 } Alert alert = new Alert(AlertType.INFORMATION);
    	        alert.setTitle("  Riepilogo inserimento carta ");
    	        alert.setHeaderText("Risultato ");
    	        alert.setContentText(" Inserimento avvenuto con successo!!\n\n Digitare nome utente in apposito spazio sottostante ");
    	        alert.showAndWait();

		 System.out.println("LibroDao. questy");

		}
	
	  

		
	//	System.out.println(cc.getAmmontare());
		/*todo
		 * ins 
		 */
		//System.out.println("cc in dao"+cc.getNumeroCC());
	

}
