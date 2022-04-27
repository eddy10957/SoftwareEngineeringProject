package Boundary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import Controller.WebViaggi;
import Controller.PersistanceException;
import Entity.PacchettoTuristico;
import Entity.PacchettoTuristico;
import Entity.Servizio;





/**
 * 
 */
public class TuristaRegistratoB {
	private final BufferedReader consoleReader;
	private final PrintWriter consoleWriter;
	
	
    
    public TuristaRegistratoB(PrintWriter consoleWriter, BufferedReader consoleReader) {
    	
    	this.consoleWriter=consoleWriter;
    	this.consoleReader=consoleReader;
    	
    }

    
    private static enum SelectionOptions{
    	REGISTRATI,
    	VISUALIZZA_LISTA_PACCHETTI_VISITE_TURISTICHE,
    	ACQUISTA_PACCHETTO,
    	ESCI
    }
    
    
    private SelectionOptions chooseOption() throws IOException {
    	consoleWriter.format("Salve! Scrivi il numero dell'operazione da effettuare:\n");
        while (true) {
            consoleWriter.format("0. Esci dal programma\n");
            consoleWriter.format("1. Visualizza pacchetti visite turistiche\n");
            consoleWriter.format("2. Acquista pacchetto visita turistica\n");
            consoleWriter.format("3. Registrati\n");

            try {
                int optionValue = Integer.parseInt(consoleReader.readLine());
                switch (optionValue) {
                    case 0: return SelectionOptions.ESCI;
                    case 1: return SelectionOptions.VISUALIZZA_LISTA_PACCHETTI_VISITE_TURISTICHE;
                    case 2: return SelectionOptions.ACQUISTA_PACCHETTO;
                    case 3: return SelectionOptions.REGISTRATI;
                    default: 
                    	consoleWriter.format("ERRORE: Il numero inserito non corrisponde a nessuna tra le opzioni.\n");
                }
            } catch (NumberFormatException e) {
            	consoleWriter.format("Carattere non valido\n");
            }
        }
    }
    
    
    
    /**
     * 
     */
    private void registrazioneTurista() {
        // TODO implement here
    	System.out.println("TODO");
    }

    /**
     * 
     */
    private void visualizzaPacchetti() {
        // TODO implement here
    	System.out.println("TODO");
    }

    private void acquistaPacchetto() throws IOException {
        // TODO implement here
    	
    	Boolean err=true;
    	Integer codice = null;
    	String codiceString;
    	String selezione;
    	List<Servizio> l =new ArrayList<Servizio>();
    	List<Servizio> serviziScelti= new ArrayList<Servizio>();
    	Servizio s=new Servizio();
    	
    	try{
    		consoleWriter.format("Inserisci codice del pacchetto da Acquistare 0 per tornare indietro\n");
    		
    		codiceString=consoleReader.readLine();
    		codice=codice.parseInt(codiceString);
    		l=WebViaggi.getInstance().visualizzaServizi(codice);
    		
    		
    		consoleWriter.format("Seleziona i servizi desiderati tra quelli disponibili inserendo (y) o inserisci qualsiasi altro input per continuare a scorrere tra i servizi offerti ");
    		for(Iterator i=l.iterator();i.hasNext();) {
    			 s=(Servizio) i.next();
    			consoleWriter.format(s.getClass().toString());
    			selezione=consoleReader.readLine();
    			if(selezione.equals("y")) {
    				serviziScelti.add(s);
    			}
    		}
    		WebViaggi.getInstance().creaOrdine(codice,serviziScelti);
    	}
    	catch(PersistanceException e){
    		handleException(e);
    		err=true;
    		if(codice==0)
    			return;
    	}	
    }
 
  


    /**
     * 
     */
    public void showBoundary() throws IOException{
    	SelectionOptions selected=null;
    	while (true) {
            selected = chooseOption();
            
            
                if (selected == SelectionOptions.VISUALIZZA_LISTA_PACCHETTI_VISITE_TURISTICHE) {
                    visualizzaPacchetti();
                } else if (selected == SelectionOptions.ACQUISTA_PACCHETTO) {
                    acquistaPacchetto();
                } else if (selected == SelectionOptions.REGISTRATI) {
                    registrazioneTurista();
                } else {
            		consoleWriter.format("Chiusura Applicazione");
                    return;
                }
            
        }   
    }
    
    private void handleException(Exception e) {
        consoleWriter.format("Errore: %s\nImpossibile Completare l'operazione, Riprova!.\n", e.getLocalizedMessage());
        consoleWriter.flush();
    }
    
}