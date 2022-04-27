package Boundary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

/**
 * 
 */
public class ApplicationB {

    private BufferedReader consoleReader;
	private PrintWriter consoleWriter;
	/**
     * Default constructor
     */
    public ApplicationB() {
    	final boolean AUTO_FLUSH_FLAG = true;
        this.consoleReader = new BufferedReader(new InputStreamReader(System.in));
        this.consoleWriter = new PrintWriter(System.out, AUTO_FLUSH_FLAG);
    }

   
    private void logIn(){
        // TODO implement here

    }
   
    private void logOut(){
        // TODO implement here
    }
    
    public void runApplication() {
    	
    	TuristaRegistratoB turistaRegistratoB=new TuristaRegistratoB(consoleWriter,consoleReader);
    	try {
    		turistaRegistratoB.showBoundary();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return;
    }

    /**
     * @param e
     */
    public void handleException(Exception e) {
        // TODO implement here
    }
   
}