package Entity;

import java.util.Date;

public class ServizioHotel extends Servizio {
	
	public ServizioHotel(){codice = null;};

	public ServizioHotel(ServizioHotel entry){
		super(entry);
		this.nomeHotel=entry.nomeHotel;
		this.categoriaHotel=entry.categoriaHotel;
		this.descrizioneHotel=entry.descrizioneHotel;
	}	
	
	public ServizioHotel(Integer codice, Float prezzoPersona, String operatoreTuristico,Integer codicePacchetto,
			String nomeHotel, String categoriaHotel, String descrizioneHotel) {
		super(codice,prezzoPersona,operatoreTuristico, codicePacchetto);
		this.nomeHotel=nomeHotel;
		this.categoriaHotel=categoriaHotel;
		this.descrizioneHotel=descrizioneHotel;
	}
	
	private String nomeHotel;
	public final String getNomeHotel(){return nomeHotel;}
	public void setNomeHotel(String entry){nomeHotel=entry;}
	
	private String categoriaHotel;
	public final String getCategoriaHotel(){return categoriaHotel;}
	public void setCategoriaHotel(String entry){categoriaHotel=entry;}

	private String descrizioneHotel;
	public final String getDescrizioneHotel(){return descrizioneHotel;}
	public void setDescrizioneHotel(String entry){descrizioneHotel=entry;}

}