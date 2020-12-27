package database;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import src.factoryBook.Giornale;
import src.factoryBook.Raccolta;

public class GiornaleDao {
	private Factory f;
	
	public void getDesc(Giornale g) throws SQLException
	{	           
		Connection conn = ConnToDb.generalConnection();

		 try {
	            //String url = "jdbc:msql://200.210.220.1:1114/Demo";
	            Statement stmt = conn.createStatement();
	            ResultSet rs;
	 
	            rs = stmt.executeQuery("select * from giornale where titolo ='"+g.getTitolo()+"'");
	            while ( rs.next() ) {
	                String titolo = rs.getString("titolo");
	                String tipologia=rs.getString("tipologia");
	                String lingua=rs.getString("lingua");	       
	                String editore=rs.getString("editore");
	                Date data=rs.getDate("dataPubblicazione");	
	                int copieR=rs.getInt("copiRim");	
	                int disp=rs.getInt("disp");

	                float prezzo=rs.getFloat("prezzo");
	                InputStream img=rs.getBinaryStream("img");
	                //int id=rs.getInt("id");



	                
	                Alert alert = new Alert(AlertType.INFORMATION);
	    	        alert.setTitle("  Riepilogo  ");
	    	        alert.setHeaderText("Ecco il riepigolo del libro");
	    	        alert.setContentText("  Titolo : "+titolo+"\n"+"tipologia : "+tipologia+"\n"+"lingua : "+lingua+"\n"+"editore : "+editore+ "\n"+
	    	        "data pubblicazione : "+data+"\n"+"numero copie rimanenti :"+copieR+"\n"+"disponibilita :"+disp+"\n"+"prezzo :"+prezzo
	    	        		+"\n"+"foto copertina : "+img+"\n");
	    	        alert.showAndWait();
	    	       
	    	        
	            }
	        } catch (Exception e) {
	            System.err.println("Got an exception! ");
	            System.err.println(e.getMessage());
	        }
		 finally {
			 conn.close();
		 }
	    }
	
	public float getCosto(Giornale g) throws SQLException
	{		 Connection conn = ConnToDb.generalConnection();	
	float prezzo=(float) 0.0;


		try {
         Statement stmt = conn.createStatement();
         ResultSet rs;

         rs = stmt.executeQuery("select * from giornale where titolo  ='"+g.getTitolo()+"'");
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
	
	public void aggiornaDisponibilita(Giornale g) throws SQLException
	{
		Connection conn=null;
		PreparedStatement stmt=null;
		int d=g.getDisponibilita();
		//)g.getCopieRimanenti();

		 try {
			  conn = ConnToDb.generalConnection();
		      stmt = conn.prepareStatement("update giornale set copiRim=copiRim-'"+d+"' where titolo='"+g.getTitolo()+"'");
			  stmt.executeUpdate();

	            
	         }catch(SQLException e)
	         {
	        	// esito=false;
	        	e.getMessage();

	         }	
		 finally {
			// stmt.close();
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
			// stmt.close();
			 conn.close();
			 System.out.println("Ho chiuso tutto");
			 
		 }

		 System.out.println("LibroDao. privilegi");

}

	
	public ObservableList<Raccolta> getGiornali() throws SQLException {
		// TODO Auto-generated method stub
		
		Connection conn= ConnToDb.generalConnection();

		ObservableList<Raccolta> catalogo=FXCollections.observableArrayList();
		 
		//ConnToDb.connection();
        ResultSet rs=conn.createStatement().executeQuery("SELECT * FROM giornale");

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
        conn.close();
	
	//catalogo.add(new Libro("pippo","pluto","it","fantasy","8004163529","paperino","avventura",100,11,11,5252020,18,null,true));
	
	System.out.println(catalogo);
	return catalogo;
		}
		public GiornaleDao()
	{
		f=new Factory();
	}

	}


