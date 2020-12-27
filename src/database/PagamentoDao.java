package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PagamentoDao {
	private static String qInsert ;
	private static PreparedStatement prepQ = null;
	private Connection connPag;
    

	public void inserisciPagamento(bso.Pagamento p) throws SQLException {
		
		String m=p.getMetodo();
		int esito=p.getEsito();
		String nomeU=p.getNomeUtente();
		float amm=p.getAmmontare();
		
		try {
					connPag=ConnToDb.generalConnection();

		// TODO Auto-generated method stub
		 qInsert="INSERT INTO pagamento (metodo,esito,nomeUtente,spesaTotale) values (?,?,?,?)";
		prepQ = connPag.prepareStatement(qInsert);
		//prepQ.setInt(1,p.getEsito()); // numero pagine int
		prepQ.setString(1,m); // 
		prepQ.setInt(2,esito);
		prepQ.setString(3, nomeU);
		prepQ.setFloat(4,amm);
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
		
		 System.out.println("LibroDao. privilegi");

}

}
