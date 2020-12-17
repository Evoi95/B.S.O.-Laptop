package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bso.Pagamento;

public class PagamentoDao {
	private static String qInsert ;
	private static PreparedStatement prepQ = null;
	private Connection conn;
    

	public void inserisciPagamento(Pagamento p) throws SQLException {
		
		System.out.println("VAlore ammontare in pagDAo : "+p.getAmmontare());
		conn=ConnToDb.generalConnection();
		try {
			
			//p.setMetodo("CC");
		// TODO Auto-generated method stub
		 qInsert="INSERT INTO pagamentov1 (metodo,esito,nomeUtente,spesaTotale) values (?,?,?,?)";
		prepQ = conn.prepareStatement(qInsert);
		prepQ.setString(1,null); // numero pagine int
		prepQ.setInt(2,0); // 
		prepQ.setString(3,null);
		prepQ.setFloat(4,p.getAmmontare());
		prepQ.executeUpdate();
		}catch(SQLException s)
		{
			s.getStackTrace();
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
