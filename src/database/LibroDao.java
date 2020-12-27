package database;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import factoryBook.Factory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import factoryBook.Libro;
import factoryBook.Raccolta;

public class LibroDao  {
	private Factory f;
	
	//getIstance 
	//select * from libro where codice=isbn;
	
	public void getDesc(factoryBook.Libro l) throws SQLException
	{	           
		Connection conn = ConnToDb.generalConnection();

		 try {
	            //String url = "jdbc:msql://200.210.220.1:1114/Demo";
	            Statement stmt = conn.createStatement();
	            ResultSet rs;
	 
	            rs = stmt.executeQuery("select * from libro where Cod_isbn ='"+l.getCodIsbn()+"'");
	            while ( rs.next() ) {
	                String titolo = rs.getString("titolo");
	                int pagine=rs.getInt("numeroPagine");
	                String codice=rs.getString("Cod_isbn");
	                String editore=rs.getString("editore");
	                String autore=rs.getString("autore");
	                String lingua=rs.getString("lingua");
	                String categoria=rs.getString("categoria");
	                Date data=rs.getDate("dataPubblicazione");
	                String recensione=rs.getString("recensione");
	                int copie=rs.getInt("copieVendute");
	                String desc=rs.getString("breveDescrizione");
	                int disp=rs.getInt("disp");
	                float prezzo=rs.getFloat("prezzo");
	                int copieR=rs.getInt("copieRimanenti");
	                InputStream img=rs.getBinaryStream("img");


	                
	                Alert alert = new Alert(AlertType.INFORMATION);
	    	        alert.setTitle("  Riepilogo  ");
	    	        alert.setHeaderText("Ecco il riepigolo del libro");
	    	        alert.setContentText("  Titolo : "+titolo+"\n"+"numero pagine : "+pagine+"\n"+"codice isbn :"+codice
	    	        		+"\n"+"editore : "+editore+ "\n"+"autore :"+autore+"\n"+"lingua :"+lingua+"\n"+"categoria :"+categoria+
	    	        		"\n"+"data pubblicazione : "+data+"\n"+"recensione :"+recensione+"\n"+"numero copie vendute :"+copie
	    	        		+"\n"+"descrizione :"+desc+"\n"+"copie disponibili :"+disp+"\n"+"prezzo :"+prezzo
	    	        		+"\n"+"copieRimanenti : "+copieR+"\n"+"foto copertina : "+img);
	    	        alert.showAndWait();
	    	        
	            }
	            conn.close();
	        } catch (Exception e) {
	            System.err.println("Got an exception! ");
	            System.err.println(e.getMessage());
	        }
		 finally {
			 conn.close();
		 }
	    }
	
	public float getCosto(Libro l) throws SQLException
	{
		float prezzo=(float) 0.0;
		 Connection conn = ConnToDb.generalConnection();
		 try {
         Statement stmt = conn.createStatement();
         ResultSet rs;

         rs = stmt.executeQuery("select * from libro where Cod_isbn ='"+l.getCodIsbn()+"'");
         while ( rs.next() ) {
              prezzo=rs.getFloat("prezzo");

         }
		 }catch(SQLException e)
		 {
			 e.getCause();
		 }
		 finally {
			 conn.close();
		 }
		return prezzo;
		
	}
	
	public void aggiornaDisponibilita(Libro l) throws SQLException
	{
		Connection conn=null;
		PreparedStatement stmt=null;
		Double d=(double)l.getDisponibilita();

		 try {
			  conn = ConnToDb.generalConnection();
		      stmt = conn.prepareStatement("update libro set copieRimanenti=copieRimanenti-'"+d+"' where Cod_isbn='"+l.getAutore()+"'");
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

		 System.out.println("LibroDao. questy");

		}
	public void daiPrivilegi() throws SQLException
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
	
			public LibroDao()
	{
		f=new Factory();
	}

	}
	


