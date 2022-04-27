package Entity;

import java.util.Date;

public class ServizioTrasporto extends Servizio {

	public ServizioTrasporto(){codice = null;};
	
	public ServizioTrasporto(ServizioTrasporto entry){
		super(entry);
		this.localitaPartenza=entry.localitaPartenza;
		this.localitaArrivo=entry.localitaArrivo;
	};	
	
	public ServizioTrasporto(Integer codice, Float prezzoPersona, String operatoreTuristico, Integer codicePacchetto,
			String Partenza, String Arrivo) {
		super(codice, prezzoPersona, operatoreTuristico,codicePacchetto);
		localitaPartenza=Partenza;
		localitaArrivo=Arrivo;
	};

	private String localitaPartenza;
	public final String getLocalitaPartenza(){return localitaPartenza;};
	public void setLocalitaPartenza(String entry){localitaPartenza=entry;};
	
	private String localitaArrivo;
	public final String getLocalitaArrivo(){return localitaArrivo;};
	public void setLocalitaArrivo(String entry){localitaArrivo=entry;};

}