package database;

import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao {
	
	private static boolean status ;
	private static Statement st = null ;
	private static Statement stmt = null ;
	private static String query ;
	private static String qSelect ;
	private static String qInsert ;
	private static PreparedStatement prepQ = null;
    private BufferedImage slate;
    
    //public boolean 
    
    // add an user on db afret registration
    public boolean createUser()
    {
    	return false ;
    }
    
    //check User data for login 
    public boolean checkUser()
    {
    	return false;
    }
    
    // delete a user from db
    public boolean deleteUser(int userId)
    {
    	try 
		{
			if (ConnToDb.connection())
			{
	    		Connection conn = ConnToDb.generalConnection();
				st=conn.createStatement();
				query="USE ispw";
				st.executeQuery(query);
			 	query="DELETE FROM user WHERE "+
				"userId = "+ userId +";";
			 	st.executeUpdate(query);
			 	conn.close();
			 	
			 	
			}
		}
		catch (SQLException e1) {
			e1.printStackTrace();
			}
    	return false ;
    }
    
    
	

}
