package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import DAO.DAOException;
import DAO.TransactionManager;
import Entity.OperatoreTuristico;


public class OperatoreTuristicoDAO {

    public OperatoreTuristicoDAO() {
    }

   
    public static void createOperatore(TransactionManager tm, OperatoreTuristico o) {
        // TODO implement here
    }

    public static OperatoreTuristico readOperatore(TransactionManager tm, Integer codice) throws DAOException{
        // TODO implement here
    
    	}
    
    

   
    public static void updateOperatore(TransactionManager tm, Integer codice, String nomeSocietà, String partitaIva, String username,String password ) {
        // TODO implement here
    }

   
    public static void deletePacchetto(TransactionManager tm, Integer codice) {
        // TODO implement here
    }
    
    
    
 

}