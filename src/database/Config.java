package database;

public class Config {
	
	private String host,user,pwd,database,port,driver,url;


	
	public Config()
	{
		host="localhost";
		user="root";
		pwd="root";
		database="ispw";
		port="3306";
		driver="com.mysql.cj.jdbc.Driver";
		url="jdbc:mysql://localhost/sys?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	}
	
	
	public Config(String host, String user, String pwd, String database, String port, String driver, String url) {
		super();
		this.host = host;
		this.user = user;
		this.pwd = pwd;
		this.database = database;
		this.port = port;
		this.driver = driver;
		this.url = url;
	}


	public String getHost()
	{
		return this.host;
	}
	public String getUser()
	{
		return this.user;
	}
	public String getPwd()
	{
		return this.pwd;
	}
	public String getDB()
	{
		return this.database;
	}
	public String getPort()
	{
		return this.port;
	}
	public String getDriver()
	{
		return this.driver;
	}
	
	public String getUrl()
	{
		return this.url;
	}
	
	
}
