package b.s.o;

import java.lang.Enum;

enum BookCategory{
	AdolescentiEragazzi, Arte, CinemaEFotografia, Biografie,diariEMemorie, CalendariAgende, Diritto,
	DizionariEOpere, Economia, Famiglia, SaluteEBenessere, FantascienzaEFantasy, FumettiEManga,	GialliEThriller,SelfHelp,ComputerEgiochi,
	Humour,	Informatica, WebEDigitalMedia, LetteraturaENarrativa, LibriPerBambini, LibriScolastici,	LibriUniversitari, ricettariGgenerali,
	LinguisticaEScrittura,Politica,	Religione, RomanziRosa,	Scienze, TecnologiaEMedicina, Sport, Storia, TempoLibero, Viaggi, Altro
	};

public class categorieLibro {
	

	private BookCategory categoria;
	private Boolean isValid;
	
	
	
	public categorieLibro() {
		isValid = false;
	}
	
	public categorieLibro(String t) {
		categoria = BookCategory.valueOf(t); 
		isValid = true;
		
	}


	public String getCategoria() 
	{
		if (categoria.equals(BookCategory.AdolescentiEragazzi)) 
		{
			return "AdolescentiEragazzi";
		}	
		if (categoria.equals(BookCategory.ricettariGgenerali)) 
		{
			return "ricettariGgenerali";
		}
		if (categoria.equals(BookCategory.SelfHelp)) 
		{
			return "SelfHelp";
		}	
		if (categoria.equals(BookCategory.Arte)) 
		{
			return "Arte";
		}
		if (categoria.equals(BookCategory.CinemaEFotografia)) 
		{
			return "CinemaEFotografia";
		}	
		if (categoria.equals(BookCategory.Biografie)) 
		{
			return "Biografie";
		}
		if (categoria.equals(BookCategory.diariEMemorie)) 
		{
			return "diariEMemorie";
		}	
		if (categoria.equals(BookCategory.CalendariAgende)) 
		{
			return "CalendariAgende";
		}
		if (categoria.equals(BookCategory.Diritto)) 
		{
			return "Diritto";
		}	
		if (categoria.equals(BookCategory.DizionariEOpere)) 
		{
			return "DizionariEOpere";
		}
		if (categoria.equals(BookCategory.Humour)) 
		{
			return "Humour";
		}	
		if (categoria.equals(BookCategory.Economia)) 
		{
			return "Economia";
		}
		if (categoria.equals(BookCategory.Informatica)) 
		{
			return "Informatica";
		}	
		if (categoria.equals(BookCategory.Famiglia)) 
		{
			return "Famiglia";
		}
		if (categoria.equals(BookCategory.WebEDigitalMedia)) 
		{
			return "WebEDigitalMedia";
		}	
		if (categoria.equals(BookCategory.SaluteEBenessere)) 
		{
			return "SaluteEBenessere";
		}
		if (categoria.equals(BookCategory.LetteraturaENarrativa)) 
		{
			return "LetteraturaENarrativa";
		}	
		if (categoria.equals(BookCategory.FantascienzaEFantasy)) 
		{
			return "FantascienzaEFantasy";
		}
		if (categoria.equals(BookCategory.LibriPerBambini)) 
		{
			return "LibriPerBambini";
		}	
		if (categoria.equals(BookCategory.FumettiEManga)) 
		{
			return "FumettiEManga";
		}
		if (categoria.equals(BookCategory.LibriScolastici)) 
		{
			return "LibriScolastici";
		}	
		if (categoria.equals(BookCategory.GialliEThriller)) 
		{
			return "GialliEThriller";
		}
		if (categoria.equals(BookCategory.LinguisticaEScrittura)) 
		{
			return "LinguisticaEScrittura";
		}	
		if (categoria.equals(BookCategory.Religione)) 
		{
			return "Religione";
		}
		if (categoria.equals(BookCategory.Politica)) 
		{
			return "Politica";
		}	
		if (categoria.equals(BookCategory.RomanziRosa)) 
		{
			return "RomanziRosa";
		}
		if (categoria.equals(BookCategory.LibriUniversitari)) 
		{
			return "LibriUniversitari";
		}
		if (categoria.equals(BookCategory.Scienze)) 
		{
			return "Scienze";
		}
		if (categoria.equals(BookCategory.TecnologiaEMedicina)) 
		{
			return "TecnologiaEMedicina";
		}		
		if (categoria.equals(BookCategory.Sport)) 
		{
			return "Sport";
		}
		if (categoria.equals(BookCategory.Storia)) 
		{
			return "Storia";
		}
		if (categoria.equals(BookCategory.Viaggi)) 
		{
			return "Viaggi";
		}
		if (categoria.equals(BookCategory.TempoLibero)) 
		{
			return "TempoLibero";
		}	
		if (categoria.equals(BookCategory.Altro)) 
		{
			return "Altro";
		}
		if (categoria.equals(BookCategory.ComputerEgiochi)) 
		{
			return "ComputerEgiochi";
		}
		return null;
	}



}
