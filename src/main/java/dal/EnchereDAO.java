package dal;

import java.util.ArrayList;

import bo.Enchere;
import bo.Utilisateur;

public interface EnchereDAO {

		//Sélectionner toutes les enchères 
		public ArrayList<Enchere> selectAll() throws DALException;
			
		//Sélectionner une enchère par son no_enchere
		public ArrayList<Enchere> selectByNo(int id) throws DALException;
		
		//Modifier les attributs d'une enchère connu en BD
		public void update(Enchere data) throws DALException;
		
		//Supprimer une enchère
		public void delete(int id) throws DALException;

		ArrayList<Enchere> selectByUtilisateur(Utilisateur user) throws DALException;

}
