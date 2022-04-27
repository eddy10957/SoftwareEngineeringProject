package Entity;

import java.util.Date;


public class ServizioRistorazione extends Servizio {

	public ServizioRistorazione(){codice = null;};
	
	public ServizioRistorazione(ServizioRistorazione entry){
		super(entry);
		this.descrizioneMenu=entry.descrizioneMenu;
		this.tipologiaPasto=entry.tipologiaPasto;
	};
	
	public ServizioRistorazione(Integer codice, Float prezzoPersona, String operatoreTuristico, Integer codicePacchetto,
			String menu, String tipo) {
		super(codice,prezzoPersona,operatoreTuristico,codicePacchetto);
		this.descrizioneMenu=menu;
		this.tipologiaPasto=tipo;
	};
	
	private String descrizioneMenu;
	public final String getDescrizioneMenu(){return descrizioneMenu;}
	public void setDescrizioneMenu(String entry){descrizioneMenu=entry;}
	
	//private Pasto tipologiaPasto;
	//public final Pasto getTipoPasto(){return tipologiaPasto;}
	//public void setTipoPasto(Pasto entry){tipologiaPasto=entry;}
	private String tipologiaPasto;
	public void setTipoPasto(String entry){
		tipologiaPasto=entry;
		}
}