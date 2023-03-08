package dal;

import java.util.List;

import bo.Categorie;

public interface CategorieDAO {
	
	//Sélectionner une catégorie par son libelle
	public Categorie selectByLibelle(String libelle) throws DALException;
	
	//Sélectionner une catégorie par son no_categorie
	public Categorie selectByNo(int id) throws DALException;

	public List<Categorie> selectAll();

	public void updateCategorie(Categorie cat);

	public Categorie insert(String libelle);

	public void deleteCategorie(Categorie cat);
	
}
