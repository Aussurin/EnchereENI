package dal;

import bo.Categorie;

public interface CategorieDAO {
	
	//Sélectionner une catégorie par son libelle
	public Categorie selectByLibelle(String libelle) throws DALException;
	
	//Sélectionner une catégorie par son no_categorie
	public Categorie selectByNo(int id) throws DALException;
	
}
