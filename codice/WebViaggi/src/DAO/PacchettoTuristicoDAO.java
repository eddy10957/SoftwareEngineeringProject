package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import DAO.DAOException;
import DAO.TransactionManager;
import Entity.PacchettoTuristico;


public class PacchettoTuristicoDAO {

    public PacchettoTuristicoDAO() {
    }

   
    public static void createPacchetto(TransactionManager tm, PacchettoTuristico p) {
        // TODO implement here
    }

    public static PacchettoTuristico readPacchetto(TransactionManager tm, Integer codice) throws DAOException{
        // TODO implement here
    
    	}
    
    

   
    public static void updatePacchetto(TransactionManager tm, Integer codice, String descrizione, String città, Integer numeroPartecipanti ) {
        // TODO implement here
    }

   
    public static void deletePacchetto(TransactionManager tm, Integer codice) {
        // TODO implement here
    }
    
    
    
 

}