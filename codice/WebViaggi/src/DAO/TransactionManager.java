package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;



public  class TransactionManager {
	private final String DATABASE_PATH="jdbc:h2:~/WebViaggiDB";
    private final String DATABASE_USERNAME="eddo"; 
    private final String DATABASE_PASSWORD="";
    private Connection connection;
    private boolean inTransaction;
   
    	public TransactionManager() {
      
    }
    
    
    public static class TransactionStateException extends RuntimeException {
        public TransactionStateException(String message) {
            super(message);
        }
    }

    /**
     * 
     */
    public void beginTransaction() throws TransactionStateException {
        assertNotInTransaction();
        
        try {
        	connection = DriverManager.getConnection(DATABASE_PATH, DATABASE_USERNAME, DATABASE_PASSWORD);
            connection.setAutoCommit(false);
            
            inTransaction = true;
        } catch (SQLException e) {
            throw new RuntimeException("connessione non riuscita", e);
        }
    }
    /**
     * @return
     */
    public Connection getConnection() {
        return connection;
    }

    /**
     * 
     */
    public void assertInTransaction() throws TransactionStateException {
        if (isInTransaction() == false) {
            throw new TransactionStateException("transazione non attiva");
        }
    }
    
    public void assertNotInTransaction() throws TransactionStateException {
        if (isInTransaction() == true) {
            throw new TransactionStateException("transazione attiva");
        }
    }

    /**
     * @return
     */
    public boolean isInTransaction() {
        return inTransaction;
    }

    /**
     * 
     */
    public void clearPersistanceContext() {
        // TODO implement here
    }

    public void commitTransaction() throws TransactionStateException, DAOException {
        try {
            assertInTransaction();

            connection.commit();
            connection.close();
            connection = null;
            inTransaction = false;
            clearPersistanceContext();
        } catch (SQLException e) {
            throw new DAOException("Impossibile commit", e);
        }
    }
    
    public void rollbackTransaction() throws TransactionStateException {
        try {
            assertInTransaction();

            connection.rollback();
            connection.close();
            connection = null;
            inTransaction = false;
            clearPersistanceContext();
        } catch (SQLException e) {
            throw new RuntimeException("impossibile fare il rollback", e);
        }
    }
        
}
