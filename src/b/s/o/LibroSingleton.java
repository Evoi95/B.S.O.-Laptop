package b.s.o;

public class LibroSingleton {
	
	private static LibroSingleton instance =new LibroSingleton();
	
	private LibroSingleton()
	{
		
	}
	
	public static  LibroSingleton getIstance()
	{
		return instance;
	}
	
	public void getLibro()
	{
		System.out.println("istanza libro");
	}

}
