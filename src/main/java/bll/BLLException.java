package bll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLLException extends Exception{
	private static final long serialVersionUID = 1L;
	
	private List<String>erreurs;
	
	public BLLException() {
		erreurs = new ArrayList<String>();
	}
	
	public void ajouterErreur(String message) {
		erreurs.add(message);
		
	}
	
	public List <String>getErreurs(){
		return erreurs;
	}
	
	@Override
	public String getMessage() {
		return Arrays.toString(erreurs.toArray());
		
	}
	
	

}
