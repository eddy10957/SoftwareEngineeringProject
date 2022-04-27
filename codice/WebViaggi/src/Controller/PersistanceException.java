package Controller;

public class PersistanceException extends Exception {
	public PersistanceException() {
    }

    public PersistanceException(String message) {
        super(message);
    }

    public PersistanceException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersistanceException(Throwable cause) {
        super(cause);
    }
    

}