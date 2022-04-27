
package Entity;


public class VisitaMuseale extends Servizio {

	public VisitaMuseale(){codice = null;};
	
	public VisitaMuseale(VisitaMuseale entry){
		super(entry);
		this.museo=entry.museo;
		this.durataVisita=entry.durataVisita;
	};	
	
	public VisitaMuseale(Integer codice, Float prezzoPersona, String operatoreTuristico, Integer codicePacchetto, String museo, Integer durataVisita){
		super(codice, prezzoPersona, operatoreTuristico, codicePacchetto);
		this.museo=museo;
		this.durataVisita=durataVisita;
	};

	private String museo;
	public final String getMuseo(){return museo;};
	public void setMuseo(String entry){museo=entry;};
	
	private Integer durataVisita;
	public final Integer getDurataVisita(){return durataVisita;};
	public void setDurataVisita(Integer entry){durataVisita=entry;};

}