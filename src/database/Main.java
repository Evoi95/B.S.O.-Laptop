package database;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Main {
	

	public static void main(String[] args) throws SQLException, FileNotFoundException {
		// TODO Auto-generated method stub
		
		System.out.print("Sono bravo a rompere le cose infomartiche");
		
		try {
			CreateDefaultDB.createDefaultDB();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	}
}
