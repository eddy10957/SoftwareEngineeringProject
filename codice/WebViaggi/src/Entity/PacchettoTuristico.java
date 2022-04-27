package Entity;


/**
 * 
 */
public class PacchettoTuristico {

	public PacchettoTuristico() {
	}

	public PacchettoTuristico(Integer codice, String Descrizione, String Citta,Integer numeroPartecipanti){
		this.codice=codice;
		this.descrizione=Descrizione;
		this.citta=Citta;
		this.numeroPartecipanti=numeroPartecipanti;
	}
	
	public Integer getCodice() {return codice;}

	public void setCodice(Integer codice) {this.codice = codice;}

	public String getDescrizione() {return descrizione;}

	public void setDescrizione(String descrizione) {this.descrizione = descrizione;}

	public String getCitta() {return citta;}

	public void setCitta(String citta) {this.citta = citta;}
	
	public Integer getNumeroPartecipanti() {return numeroPartecipanti;}

	public void setNumeroPartecipanti(Integer numeroPartecipanti) {this.numeroPartecipanti = numeroPartecipanti;}

	private Integer codice;

	private String descrizione;

	private String citta;
	
	private Integer numeroPartecipanti;

}