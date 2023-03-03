package dal;

import java.util.ArrayList;

import bo.Enchere;

public interface EnchereDAO {

		//Sélectionner toutes les enchères 
		public ArrayList<Enchere> selectAll() throws DALException;
			
		//Sélectionner une enchère par son no_enchere
		public Enchere selectByNo(int id) throws DALException;
		
		//Modifier les attributs d'une enchère connu en BD
		public void update(Enchere data) throws DALException;
		
		//Supprimer une enchère
		public void delete(int id) throws DALException;

}
