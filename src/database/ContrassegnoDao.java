package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bso.Fattura;

public class ContrassegnoDao {
	//private boolean esito=false;
	
	public void inserisciFattura(Fattura f) throws SQLException
	{
		Connection conn=null;
		PreparedStatement stmt=null;
		
		/*System.out.println("\n\n");
 		System.out.println("n vale :"+nome);
 		System.out.println("c vale :"+cognome);

 		System.out.println("via vale :"+via);
 		System.out.println("com vale :"+com);
 		*/
 		String par1=f.getNome();
 		String par2=f.getCognome();
 		String par3=f.getVia();
 		String par4=f.getCom();
 		
 		System.out.println(par1+par2+par3+par4);
       
		 try {

			 conn = ConnToDb.generalConnection();
         
             stmt = conn.prepareStatement("insert into fattura  values (?,?,?,?,?);");
             stmt.setString(1,par1);
             stmt.setString(2, par2);
             stmt.setString(3,par3);
             stmt.setString(4,par4 );
             stmt.setInt(5, 0);
             stmt.executeUpdate();
             

     		
             
            
         }catch(SQLException e)
         {
        	e.getMessage();

         }
		 finally {


             //stmt.close();
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
			// stmt.close();
			 conn.close();
			 System.out.println("Ho chiuso tutto");
			 
		 }

		 System.out.println("PagamentoDao. privilegi");

		}
	
	
	
	
	
}
         


