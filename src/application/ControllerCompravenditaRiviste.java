package application;


import factoryBook.Factory;


public class ControllerCompravenditaRiviste {
	private Factory f;
	
	public ControllerCompravenditaRiviste()
	{
		f=new Factory();

	}
	/*
	public ObservableList<Raccolta> getLibri() throws SQLException
	{
		
		ObservableList<Raccolta> catalogo=FXCollections.observableArrayList();
		 
			//ConnToDb.connection();
            ResultSet rs=c.createStatement().executeQuery("SELECT * FROM libro");

            while(rs.next())
            {
               // System.out.println("res :"+rs);

        		try {
					catalogo.add(f.createLibro("libro",rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getDate(8),rs.getString(9),rs.getInt(10),rs.getString(11),rs.getInt(12),rs.getFloat(13),rs.getInt(14),rs.getBinaryStream(15)));
					//rs=rs.next();
        		} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

            }
		
		//catalogo.add(new Libro("pippo","pluto","it","fantasy","8004163529","paperino","avventura",100,11,11,5252020,18,null,true));
		
		System.out.println(catalogo);
		return catalogo;
		
	}*/



}

