package database;

import java.io.InputStream;
import java.sql.*;

import factoryBook.Factory;
import factoryBook.Raccolta;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class LibroDao  {
	private Factory f;
	
	//getIstance 
	//select * from libro where codice=isbn;
	
	public void getDesc(String isbn)
	{
		 try {
	            //String url = "jdbc:msql://200.210.220.1:1114/Demo";
	            Connection conn = ConnToDb.generalConnection();
	            Statement stmt = conn.createStatement();
	            ResultSet rs;
	 
	            rs = stmt.executeQuery("select * from libro where Cod_isbn ='"+isbn+"'");
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
	    }
	
	public float getCosto(String isbn) throws SQLException
	{
		float prezzo=(float) 0.0;
		 Connection conn = ConnToDb.generalConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs;

         rs = stmt.executeQuery("select * from libro where Cod_isbn ='"+isbn+"'");
         while ( rs.next() ) {
              prezzo=rs.getFloat("prezzo");

         }
		return prezzo;
		
	}
	
	public void aggiornaDisponibilita(String isbn,int disp) throws SQLException
	{
		Connection conn=null;
		PreparedStatement stmt=null;
		Double d=(double) disp;

		 try {
			  conn = ConnToDb.generalConnection();
						         stmt = conn.prepareStatement("update libro set copieRimanenti=copieRimanenti-'"+d+"' where Cod_isbn='"+isbn+"'");
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
	
	public ObservableList<Raccolta> getGiornali() throws SQLException {
		// TODO Auto-generated method stub
		
		Connection c= ConnToDb.generalConnection();

		ObservableList<Raccolta> catalogo=FXCollections.observableArrayList();
		 
		//ConnToDb.connection();
        ResultSet rs=c.createStatement().executeQuery("SELECT * FROM giornale");

        while(rs.next())
        {
           // System.out.println("res :"+rs);

    		try {
				catalogo.add(f.createGiornale("giornale",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5),rs.getInt(6),rs.getInt(7),rs.getFloat(8),rs.getBinaryStream(9)));
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
	public ObservableList<Raccolta> getRiviste() throws SQLException
	{
		Connection c= ConnToDb.generalConnection();

		
		ObservableList<Raccolta> catalogo=FXCollections.observableArrayList();
		 
			//ConnToDb.connection();
            ResultSet rs=c.createStatement().executeQuery("SELECT * FROM rivista");
           // int i=0;
            while(rs.next())
            {
               // System.out.println("res :"+rs);

        		try {
					catalogo.add(f.createRivista("rivista",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getDate(7),rs.getInt(8),rs.getFloat(9),rs.getInt(10),rs.getBinaryStream(11),rs.getInt(12)));
					//rs=rs.next();
					//System.out.println("res: "+rs[i]);
        		} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		//System.out.println("rivista nome"+rs.getString(1));

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
	


