package Controller;

import java.util.*;

import Controller.PersistanceException;
import DAO.DAOException;
import DAO.PacchettoTuristicoDAO;
import DAO.ServizioDAO;
import DAO.TransactionManager;
import Entity.PacchettoTuristico;
import Entity.PacchettoTuristico;
import Entity.Servizio;

/**
 * 
 */
public class WebViaggi {
	
		private static WebViaggi instance;
	    
	    public synchronized static WebViaggi getInstance() {
	        if (instance == null) {
	            instance = new WebViaggi();
	        }
	        return instance;
	    }


	    public void logIn(String username, String password) {
	        // TODO implement here
	    }

	    public void logOut() {
	        // TODO implement here
	    }

	    public void registrazioneTurista() {
	        // TODO implement here
	    }

	    public List<Servizio> visualizzaServizi(Integer codice) throws PersistanceException {
			TransactionManager tm = new TransactionManager();
			tm.beginTransaction();
			List<Servizio> l=new ArrayList<Servizio>();
			
			try {
				l = ServizioDAO.readServiziPacchetto(tm, codice);
			} catch (DAOException e) {
				// TODO Auto-generated catch block
				tm.rollbackTransaction();
				throw new PersistanceException("Pacchetto non trovato", e);
			}
			
			return l;
		}
 
	    public void creaOrdine(Integer codice,List<Servizio> serviziScelti) {
        // TODO implement here
    }


	    public void acquistaPacchetto(Integer codice) {
	        // TODO implement here
	    }
} 