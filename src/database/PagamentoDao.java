package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PagamentoDao {
	//private boolean esito=false;
	
	public void inserisciFattura(String nome,String cognome,String via,String com) throws SQLException
	{
		Connection conn=null;
		PreparedStatement stmt=null;
		
		/*System.out.println("\n\n");
 		System.out.println("n vale :"+nome);
 		System.out.println("c vale :"+cognome);

 		System.out.println("via vale :"+via);
 		System.out.println("com vale :"+com);
 		*/
 		String par1=nome;
 		String par2=cognome;
 		String par3=via;
 		String par4=com;
       
		 try {

			 conn = ConnToDb.generalConnection();
         
             stmt = conn.prepareStatement("insert into fatture (nome,cognome,via,comunicazioni) values (?,?,?,?);");
             stmt.setString(1,par1);
             stmt.setString(2, par2);
             stmt.setString(3,par3);
             stmt.setString(4,par4 );
             stmt.executeUpdate();
             

     		
             
            
         }catch(SQLException e)
         {
        	e.getMessage();

         }
		 finally {


             stmt.close();
             conn.close();

		 }
		 
		 System.out.println("effettuo inserimento pagaentoDao");
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
         


