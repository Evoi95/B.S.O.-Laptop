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
import factoryBook.Raccolta;
import factoryBook.Rivista;

public class RivistaDao {
	private Factory f;
	
	
	public void getDesc(Rivista r)
	{
		 try {
	            //String url = "jdbc:msql://200.210.220.1:1114/Demo";
	            Connection conn = ConnToDb.generalConnection();
	            Statement stmt = conn.createStatement();
	            ResultSet rs;
	 
	            rs = stmt.executeQuery("select * from rivista where titolo ='"+r.getTitolo()+"'");
	            while ( rs.next() ) {
	                String titolo = rs.getString("titolo");
	                String tipologia=rs.getString("tipologia");
	                String autore=rs.getString("autore");
	                String lingua=rs.getString("lingua");	   
	                String editore=rs.getString("editore");
	                String desc=rs.getString("Descrizione");

	                Date data=rs.getDate("dataPubblicazione");
	               
	                int disp=rs.getInt("disp");
	                float prezzo=rs.getFloat("prezzo");
	                int copieR=rs.getInt("copieRimanenti");
	                InputStream img=rs.getBinaryStream("img");


	                
	                Alert alert = new Alert(AlertType.INFORMATION);
	    	        alert.setTitle("  Riepilogo  ");
	    	        alert.setHeaderText("Ecco il riepigolo del libro");
	    	        alert.setContentText("  Titolo : "+titolo+"\n"+"tipologia : "+tipologia+"\n"+"codice isbn :"+ "\n"+"autore :"+autore+"\n"+"lingua :"+lingua+"\n"+
	    	        "\n"+"editore : "+editore+"\n"+"descrizione :"+desc+"\n"+"data pubblicazione : "+data+"\n"+"disponibilita :"+ disp
	    	        		+"\n"+"prezzo :"+prezzo+"\n"+"copieRimanenti : "+copieR+"\n"+"foto copertina : "+img);
	    	        alert.showAndWait();
	    	        
	            }
	            conn.close();
	        } catch (Exception e) {
	            System.err.println("Got an exception! ");
	            System.err.println(e.getMessage());
	        }
	    }
	
	public float getCosto(Rivista r) throws SQLException
	{
		float prezzo=(float) 0.0;
		 Connection conn = ConnToDb.generalConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs;

         rs = stmt.executeQuery("select * from rivista  where titolo='"+r.getTitolo()+"'");
         while ( rs.next() ) {
              prezzo=rs.getFloat("prezzo");

         }
		return prezzo;
		
	}
	
	public void aggiornaDisponibilita(Rivista r) throws SQLException
	{
		Connection conn=null;
		PreparedStatement stmt=null;
		int d=r.getCopieRim();

		 try {
			  conn = ConnToDb.generalConnection();
		      stmt = conn.prepareStatement("update rivista set copieRimanenti=copieRimanenti-'"+d+"' where titolo='"+r.getTitolo()+"'");
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
					catalogo.add(f.createRivista("rivista",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getDate(7), rs.getInt(8),rs.getFloat(9),rs.getInt(10),rs.getBinaryStream(11),rs.getInt(12)));
					
					//titolo,tipo,autore,lingua,editore,descrizione,dataPubb,disp,prezzo,copieRim,foto,id//rs=rs.next();
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

	public RivistaDao()
	{
		f=new Factory();
	}

}
