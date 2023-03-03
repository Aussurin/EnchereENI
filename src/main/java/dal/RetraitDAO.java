package dal;

import java.util.ArrayList;

import bo.Retrait;

public interface RetraitDAO {
	
			//Sélectionner tous les retraits 
			public ArrayList<Retrait> selectAll() throws DALException;
				
			//Sélectionner un retrait par son no_article
			public Retrait selectByNo(int id) throws DALException;
			
			//Modifier les attributs d'un retrait connu en BD
			public void update(Retrait data) throws DALException;

}
