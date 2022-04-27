package Entity;

import java.util.List;

public class OrdinePacchetto {
	
		public OrdinePacchetto() {
		}
	
		public OrdinePacchetto(Integer codicePacchetto, List<Servizio> serviziScelti, Float prezzoTotale){
			this.codicePacchetto=codicePacchetto;
			this.serviziScelti=serviziScelti;
			this.prezzoTotale=prezzoTotale;
		}
		
		public Integer getCodice() {return codicePacchetto;}
	
		public void setCodice(Integer codice) {this.codicePacchetto = codicePacchetto;}
	
		
		public List<Servizio> getServizi() {return serviziScelti;}
		
		public Float getPrezzoTotale() {return prezzoTotale;}
	
		public void setPrezzoTotale( List<Servizio> serviziScelti) {
			//TODO
			}
	
		private Integer codicePacchetto;
	
		private List<Servizio> serviziScelti;
		
		private Float prezzoTotale;
	
	}

