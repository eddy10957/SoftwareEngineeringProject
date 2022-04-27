
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import DAO.DAOException;
import DAO.TransactionManager;
import Entity.TuristaRegistrato;


public class TuristaRegistratoDAO {

    public TuristaRegistratoDAO() {
    }

   
    public static void createTurista(TransactionManager tm, TuristaRegistrato t) {
        // TODO implement here
    }

    public static TuristaRegistrato readTurista(TransactionManager tm, String email) throws DAOException{
        // TODO implement here
    
    	}
    
    

   
    public static void updateTurista(TransactionManager tm, Integer codice, String nome, String cognome, String username,String password ) {
        // TODO implement here
    }

   
    public static void deleteTurista(TransactionManager tm, String email) {
        // TODO implement here
    }
    
    
    
 

}