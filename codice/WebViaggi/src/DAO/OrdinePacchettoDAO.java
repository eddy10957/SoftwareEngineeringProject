package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import DAO.DAOException;
import DAO.TransactionManager;
import Entity.OrdinePacchetto;
import Entity.Servizio;


public class OrdinePacchettoDAO {

    public OrdinePacchettoDAO() {
    }

   
    public static void createOrdine(TransactionManager tm, OrdinePacchetto ordine) throws DAOException {
    	tm.assertInTransaction();
    	String query=new String ("INSERT INTO ORDINI VALUES (?,?,?)");
    	
    	try( PreparedStatement ps=tm.getConnection() .prepareStatement(query)) {
    		StringJoiner servizi= new StringJoiner(",");
    		for(Servizio s :ordine.getServizi()) {
    			servizi.add(s.getCodice().toString());
    		}
    		ps.setInt(1, ordine.getCodice());
    		ps.setString(2, servizi.toString());
    		ps.setFloat(3, ordine.getPrezzoTotale());
    		ps.executeUpdate();
            
        } catch (SQLException e) {
            throw new DAOException("Impossibile inserire Ordine", e);
        }
    }

    public static OrdinePacchetto readPacchetto(TransactionManager tm, Integer codice) throws DAOException{
        // TODO implement here
    
    	}
    
    

   
    public static void updateOrdine(TransactionManager tm, Integer codice, String descrizione, String città, Integer numeroPartecipanti ) {
        // TODO implement here
    }

   
    public static void deleteOrdine(TransactionManager tm, Integer codice) {
        // TODO implement here
    }
    
    
    
 

}