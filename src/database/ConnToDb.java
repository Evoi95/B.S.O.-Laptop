package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnToDb 
{

	protected static Connection conn = null;

	static Config c =new Config();
	

	public static  boolean InitailConnection()
	{

		try
		{
			Class.forName(c.getDriver());
			System.out.print("Tentativo di conessione al server..........\n");
			conn = DriverManager.getConnection(c.getUrl(), c.getUser(),c.getPwd());
			System.out.print("Connesso initial..........\n");
			return true;

		} 
		catch (SQLException e1)
		{
			e1.printStackTrace();
			System.err.println("ERRORE DI SQL");
		} 
		catch (ClassNotFoundException e2)
		{
			e2.printStackTrace();
			System.err.println("ERRORE ");
		}
		return false;
	}

	public static boolean connection() throws SQLException {

		try 
		{
			if(InitailConnection()) 
			{
				//actuac DB project

				String serverURL_2 = "jdbc:mysql://localhost/ispw?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
				Class.forName(c.getDriver());
				System.out.print("Tentativo di conessione al server..........\n");
				conn = DriverManager.getConnection(serverURL_2, c.getUser(),c.getPwd());
				System.out.print("Connesso standard..........\n");
				return true;
			}
			else
				return false;
		} 
		catch (SQLException e1) 
		{
			e1.printStackTrace();
			System.err.println("ERRORE DI SQL");
		} 
		catch (ClassNotFoundException e2) 
		{
			e2.printStackTrace();
			System.err.println("ERRORE");
		}			
		

		return false;
	}
	
	public static Connection generalConnection()
	{

		try
		{
			String serverURL_2 = "jdbc:mysql://localhost/ispw?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			Class.forName(c.getDriver());
			System.out.print("Tentativo di conessione al server..........\n");
			conn = DriverManager.getConnection(serverURL_2, c.getUser(),c.getPwd());
			System.out.print("Connesso standard..........\n");
			return conn;
		} 
		catch (SQLException e1)
		{
			e1.printStackTrace();
			System.err.println("ERRORE DI SQL");
		} 
		catch (ClassNotFoundException e2)
		{
			e2.printStackTrace();
			System.err.println("ERRORE ");
		}
		return null;			
			
	}


}

