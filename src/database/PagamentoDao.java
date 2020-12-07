package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PagamentoDao {
	//private boolean esito=false;
	
	public void inserisciFattura(String nome,String cognome,String via,String com,int id) throws SQLException
	{
		Connection conn=null;
		PreparedStatement stmt=null;
        String query="insert into fatture (nome,cognome,via,comunicazioni,id) values (?,?,?,?,?)";

		//boolean state =false;
		 try {

		  conn = ConnToDb.generalConnection();
         
             stmt = conn.prepareStatement(query);
             stmt.setString(1,nome);
             stmt.setString(2, cognome);
             stmt.setString(3,via);
             stmt.setString(4,com );
             stmt.setInt(5, id);
             stmt.executeUpdate();
          //   esito=true;
             
            
         }catch(SQLException e)
         {
        	// esito=false;
        	e.getMessage();

         }
		 finally {
             stmt.close();
             conn.close();

		 }
				//return esito;
         
         
        	 
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

		 System.out.println("PagamentoDao. privilegi");

}
	
	
	
		
	}
         


