package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CartaCreditoDao {
	
	
	@SuppressWarnings("null")
	public void popolaTabella(String nome)
	{
		try {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs;
		rs=	stmt.executeQuery(" select nomeP,cognomeP,codiceCarta from cartaCredito where nomeP='"+nome+"'");
		while(rs.next())
		{
			rs.getString("nomeP");
			rs.getString("cognomwP");
			rs.getString("codiceCarta");
		}
		 
		conn.close();

	            
	         }catch(SQLException e)
	         {
	        	// esito=false;
	        	e.getMessage();

	         }	
			
	

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

}
