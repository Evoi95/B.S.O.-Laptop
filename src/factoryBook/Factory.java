package factoryBook;

public class Factory {
	
	
	public  Raccolta getTipo(String tipo)
	{
		if(tipo.equals(null))
		{
			return null;
		}
		else if(tipo.equalsIgnoreCase("LIBRO"))
		{
			return new Libro();
		}
		else if(tipo.equalsIgnoreCase("GIORNALE"))
		{
			return new Giornale();
		}
		else if(tipo.equalsIgnoreCase("RIVISTA"))
		{
			return new Rivista();
		}
		return null;
		
		
	}

}
