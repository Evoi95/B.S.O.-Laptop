package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PagamentoDao {
	//private boolean esito=false;
	
	public void inserisciFattura(String nome,String cognome,String via,String com,int id)
	{
		//boolean state =false;
		 Connection conn = ConnToDb.generalConnection();
		 try {
         String query="insert into fatture (nome,cognome,via,comunicazioni,id) values (?,?,?,?,?)";
         
             PreparedStatement stmt = conn.prepareStatement(query);
             stmt.setString(1,nome);
             stmt.setString(2, cognome);
             stmt.setString(3,via);
             stmt.setString(4,com );
             stmt.setInt(5, id);
             stmt.executeUpdate();
             stmt.close();
          //   esito=true;
             
            
         }catch(SQLException e)
         {
        	// esito=false;
        	e.getMessage();

         }
				//return esito;
         
         
        	 
	}  
         

}
