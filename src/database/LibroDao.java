package database;

import java.io.InputStream;
import java.sql.*;


import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class LibroDao {
	
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
	
	public float getCosto(String nome) throws SQLException
	{
		float prezzo=(float) 0.0;
		 Connection conn = ConnToDb.generalConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs;

         rs = stmt.executeQuery("select * from libro where titolo ='"+nome+"'");
         while ( rs.next() ) {
              prezzo=rs.getFloat("prezzo");

         }
		return prezzo;
		
	}
}
	


