package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import DAO.DAOException;
import DAO.TransactionManager;
import Entity.PacchettoTuristico;
import Entity.Servizio;
import Entity.ServizioHotel;
import Entity.ServizioTrasporto;
import Entity.ServizioRistorazione;
import Entity.VisitaMuseale;


public class ServizioDAO {

    public ServizioDAO() {
    }

   
    public static void createServizioHotel(TransactionManager tm, Servizio s) {
        // TODO implement here
    }
    public static void createServizioTrasporto(TransactionManager tm, Servizio s) {
        // TODO implement here
    }
    public static void createServizioRistorazione(TransactionManager tm, Servizio s) {
        // TODO implement here
    }
    public static void createServizioVisitaMuseale(TransactionManager tm, Servizio s) {
        // TODO implement here
    }

    public static List<Servizio> readServiziPacchetto(TransactionManager tm, Integer codice) throws DAOException{
        // TODO implement here
    	tm.assertInTransaction();
    	List<Servizio> l = new ArrayList<Servizio>();
    	String query=new String ("SELECT * FROM SERVIZI WHERE codicePacchetto = ? AND tipoServizio=?");

    	try (PreparedStatement ps = tm.getConnection().prepareStatement(query)){
    		ps.setInt(1, codice);
    		ps.setString(2, "H");
    	
			try (ResultSet rs = ps.executeQuery()) {
    			while (rs.next() == true) {
    				ServizioHotel servizioTemp=new ServizioHotel();
    				servizioTemp.setCodice(rs.getInt(1));
    				servizioTemp.setPrezzoPersona(rs.getFloat(2));
    				servizioTemp.setNomeHotel(rs.getString(3));
    				servizioTemp.setCategoriaHotel(rs.getString(4));
    				servizioTemp.setDescrizioneHotel(rs.getString(5));
    				l.add(servizioTemp);
    			}
    		}
    		ps.setString(2, "T");
			try (ResultSet rs = ps.executeQuery()) {
    			while (rs.next() == true) {
    				ServizioTrasporto servizioTemp = new ServizioTrasporto();
    				servizioTemp.setCodice(rs.getInt(1));
    				servizioTemp.setPrezzoPersona(rs.getFloat(2));
    				servizioTemp.setLocalitaPartenza(rs.getString(6));
    				servizioTemp.setLocalitaArrivo(rs.getString(7)); 		
    				l.add(servizioTemp);
    			}
			}
			ps.setString(2, "R");
			try (ResultSet rs = ps.executeQuery()) {
    			while (rs.next() == true) {
    				ServizioRistorazione servizioTemp=new ServizioRistorazione();
    				servizioTemp.setCodice(rs.getInt(1));
    				servizioTemp.setPrezzoPersona(rs.getFloat(2));				
    				servizioTemp.setDescrizioneMenu(rs.getString(8));
    				servizioTemp.setTipoPasto(rs.getString(9));
    				l.add(servizioTemp);
    			}
			}
			ps.setString(2, "V");
			try (ResultSet rs = ps.executeQuery()) {
    			while (rs.next() == true) {
    				VisitaMuseale servizioTemp=new VisitaMuseale();
    				servizioTemp.setCodice(rs.getInt(1));
    				servizioTemp.setPrezzoPersona(rs.getFloat(2));
    				servizioTemp.setMuseo(rs.getString(10));
    				servizioTemp.setDurataVisita(rs.getInt(11));
    				l.add(servizioTemp);
    			}
			}
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new DAOException("Impossibile leggere pacchetto "+codice,e);
		}
    	if(l==null)
    	{
    		throw new DAOException("Pacchetto inesistente");
    	}
    	return l;
    	
    	}
    
    

   
    public static void deleteServizio(TransactionManager tm, Integer codice) {
        // TODO implement here
    }
    
    
    
 

}