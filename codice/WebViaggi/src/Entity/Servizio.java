package Entity;


public  class Servizio {
	
	public Servizio(){};
	
	public Servizio(Integer codice,Float prezzoPersona, String OperatoreTuristico, Integer codicePacchetto ) {
		this.codice=codice;
		this.prezzoPersona=prezzoPersona;
		this.operatoreTuristico=OperatoreTuristico;
		this.codicePacchetto=codicePacchetto;
	};
	
	public Servizio(Servizio entry){
		this.codice=entry.codice;
		this.operatoreTuristico=entry.operatoreTuristico;
		this.codicePacchetto=entry.codicePacchetto;
	};
	
	protected Integer codice;
	public final Integer getCodice(){return codice;};
	
	protected Integer codicePacchetto;
	public final Integer getCodicePacchetto(){return codicePacchetto;};

	protected Float prezzoPersona;
	public final Float getPrezzoPersona(){return prezzoPersona;};
	public void setPrezzoPersona(Float entry){prezzoPersona=entry;}
	
	protected String operatoreTuristico;
	public final String getOperatoreTuristico(){return operatoreTuristico;}

	public void setCodice(Integer codice) {
		this.codice = codice;
	}

	public void setCodicePacchetto(Integer codicePacchetto) {
		this.codicePacchetto = codicePacchetto;
	}

	public void setOperatoreTuristico(String operatoreTuristico) {
		this.operatoreTuristico = operatoreTuristico;
	};

}