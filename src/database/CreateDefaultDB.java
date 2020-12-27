package database;

import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDefaultDB 
{
	private static boolean status ;
	private static Statement st = null ;
	private static Statement stmt = null ;
	private static String query ;
	private static String qSelect ;
	private static String qInsert ;
	private static PreparedStatement prepQ = null;
    private BufferedImage slate;


	//private static CallableStatement cStmt;

	
	public static void createDefaultDB () throws SQLException, ClassNotFoundException, FileNotFoundException
	{
		try 
		{
			
			if(ConnToDb.InitailConnection() && !ConnToDb.connection()) 
			{
				System.out.println("Connesso a mysql workbench, ma non ho torvato il database 'ispw' ");
				System.out.println("Creo il database 'ispw' ");
				st = ConnToDb.conn.createStatement();
				query="CREATE DATABASE IF NOT EXISTS ispw ";
				st.execute(query);
				query = "USE ispw ";
				st.execute(query);
				System.out.println("Database creato");
				System.out.println("Chiamo la Stored Procedure, per creare le tabelle");
				//cStmt = ConnToDb.conn.prepareCall("call createTableDB");
				
				query=	"CREATE TABLE if not exists ADMIN "
						+ "	( Nome Varchar(20),Cognome Varchar(20),"
						+ "	  id INT primary key auto_increment not null,"
						+ "      email Varchar(30), pwd varchar(20)"
						+ "	);";
				st.executeUpdate(query);
				System.out.println("Creata tabella Admin");
				
				query=	"Create table  if not exists LIBRO "
						+ "	( titolo VARCHAR(200), numeroPagine int, "
						+ "    Cod_isbn varchar(10) primary key, editore varchar(200) ,"
						+ "    autore varchar(200), lingua varchar(10),"
						+ "    categoria Varchar(60), dataPubblicazione date,"
						+ "    recensione text, copieVendute int, breveDescrizione text,"
						+ "    disp int, prezzo float,"
						+ "    copieRimanenti int,img longblob);";
				st.executeUpdate(query);
				System.out.println("Creata tabella Libro");
				
				query=	"Create table  if not exists EDITORE "
						+ "	( Nome Varchar(20) ,Cognome Varchar(20), "
						+ "	  id int primary key auto_increment, "
						+ "      email Varchar(30), password Varchar(20), "
						+ "      casaEditrice Varchar(200),"
						+ "      NumeroPublicazioni int,"
						+ "      listaScritottoriAssociati varchar(200),"
						+ "      LibriPubblicati Varchar(200)"
						+ "      ); ";
				st.executeUpdate(query);				
				System.out.println("Creata tabella Editore");
				
				query=	"Create table  if not exists SCRITTORI"
						+ "	( Nome Varchar(20),Cognome Varchar(20),"
						+ "	  id int primary key auto_increment not null,"
						+ "      email Varchar(30), pwd Varchar(20),"
						+ "      nickName Varchar(20), descrizione text,"
						+ "      dataDiNascita Date, ListaDeiPreferiti Varchar(200),"
						+ "      ListaColleghiAssociati Varchar(200), "
						+ "      editore int,"
						+ "      libriPubblicati varchar(20), numeroPublicazioni int);";
				st.executeUpdate(query);
				System.out.println("Creata tabella Scrittori");
				
				query=	"Create table if not exists USER "
						+ "	( Nome Varchar(20),Cognome Varchar(20),"
						+ "     id int primary key auto_increment not null, "
						+ "     email Varchar(30), password Varchar(20), "
						+ "     nickName Varchar(20), descrizione text,"
						+ "     dataDiNascita Date, listDeiPreferiti Varchar(200)"
						+ "     );";
				st.executeUpdate(query);
				System.out.println("Creata tabella User");
				
				query=	"create table if not exists pagamento(id_op int primary key auto_increment,metodo varchar(10),esito int ,nomeUtente varchar(10),spesaTotale float ) ";
						st.executeUpdate(query);
				System.out.println("Creata tabella Pagamento");
				
				query=	"Create table if not exists RIVISTA "
						+ "	( titolo VARCHAR(200),tipologia Varchar(60),"
						+ "	autore varchar(200), lingua varchar(10),"
						+ "	 editore varchar(200) ,"
						+ "	Descrizione text, dataPubblicazione date,"
						+ " disp int,"
						+ "	prezzo float,"
						+ "	copieRimanenti int,img longblob,"
						+ "id int primary key not null auto_increment);";
				st.executeUpdate(query);
				System.out.println("Creata tabella RIVISTA");
				
				query=	"Create table if not exists GIORNALE "
						+ "	( titolo VARCHAR(200),tipologia Varchar(60),"
						+ "	lingua varchar(10),"
						+ "	editore varchar(200) ,"
						+ "	dataPubblicazione date,"
						+ " copiRim int, "
						+ "	disp int,"
						+ "	prezzo float,"
						+ " img longblob,"
						+ " id int primary key not null auto_increment);";
				st.executeUpdate(query);
				System.out.println("Creata tabella GIORNALE");
				
				query=	"Create table if not exists cartacredito "
						+ "	( nomeP VARCHAR(10),cognomeP  Varchar(20),"
						+ "	codiceCarta varchar(20),"
						+ "	scad date ,"
						+ "	codicePin varchar(5) ,"
						+ " ammontare float );";
				st.executeUpdate(query);
				System.out.println("Creata tabella CARTACREDITO");
				
				query=	"Create table if not exists FATTURA "
						+ "	( nome varchar(10),cognome varchar(10),"
						+ "	via varchar(50),"
						+ "	comunicazoni text,"
						+ " id int auto_increment not null  primary key);";
				st.executeUpdate(query);
				System.out.println("Creata tabella FATTURA");
				
				
				System.out.println("Tabelle create!");
				PopulateDefaultDb.populateDefaultDb();
				System.out.println("Tabella populata con valori di default");
				ConnToDb.conn.close();
				System.out.println("Connesione chiusa col db");
				
				
			}
			else if (ConnToDb.InitailConnection() && ConnToDb.connection())
			{
				/*
				System.out.println("Connesso a mysql workbench e al database 'ispw' ");
				qInsert="INSERT INTO `ispw`.`libro` "
						+ "(`titolo`, "
						+ "`numeroPagine`, "
						+ "`Cod_isbn`, "
						+ "`editore`, "
						+ "`autore`, "
						+ "`lingua`, "
						+ "`categoria`, "
						+ "`dataPubblicazione`, "
						+ "`recensione`, "
						+ "`copieVendute`, "
						+ "`breveDescrizione`, "
						+ "`disponibilita`, "
						+ "`prezzo`, "
						+ "`copieRimanenti`) "
						
						+ "VALUES "
						+ "('Kobane calling. Oggi: ',312,8832734591,'Bao Publishing','Zerocalcare','Italiana','FumettiEManga', "
						+ "'2020-05-14','assurdo',2000,'compralo',1,22,10), "
						+ "('A babbo morto. Una storia di Natale ',0,8832735512,'Bao Publishing','Zerocalcare','Italiana','FumettiEManga', "
						+ "'2020-11-12','ottimo',100,'compralo',1,11,10), "
						+ "('Scheletri',240,8832734893,'Bao Publishing','Zerocalcare','Italiana','FumettiEManga', "
						+ "'2020-10-15','ottimo',1000,'compralo',1,20,15), "
						+ "('La scuola di pizze in faccia del professor Calcare',298 ,8832733250,'Bao Publishing','Zerocalcare','Italiana','FumettiEManga', "
						+ "'2019-10-21','ottimo',1070,'compralo',1,20,48), "
						+ "('Dodici',95,8865431806,'Bao Publishing','Zerocalcare','Italiana','FumettiEManga', "
						+ "'2013-10-17','ottimo',1000,'compralo',1,11,11), "
						+ "('Tecniche proibite di persuasione, manipolazione e influenza utilizzando schemi di linguaggio e tecniche di PNL', "
						+ "226 ,1722235608,'CreateSpace Independent Publishing Platform','Zerocalcare','Italiana','SelfHelp', "
						+ "'2018-07-01','ottimo',1000,'compralo se vuoi vievere da re',1,15.40,3), "
						+ "('CiccioGamer89 Presenta Fortnite. Trucchi e Segreti',135,8893675056,'Magazzini Salani','CiccioGamer89','Italiana','ComputerEgiochi', "
						+ "'2018-09-27','evita dai ',10,'non compralo',1,11,2), "
						+ "('In cucina con ciccio',120 ,8893678683,'Magazzini Salani','Cicciogamer89','Italiana','FumettiEManga', "
						+ "'2013-10-17','ottimo',1,'compralo',1,16.50,20); "
						+ "";
				// popolo il db con utenti e dati 
				st.executeUpdate(qInsert);
				*/
				ConnToDb.conn.close();		
			}
			else 
			{
				System.err.println("Errore di connesione al db");
			}
		}
		catch(SQLException e1) 
		{
			e1.printStackTrace();
			System.err.println("ERRORE DI SQL ");
		}
		
		
	}
}
