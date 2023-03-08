package bll;

import java.util.List;

import bo.Categorie;
import dal.CategorieDAO;
import dal.DALException;
import dal.DAOFactory;

public class CategorieManager {
	private CategorieDAO categorieDAO;

	public CategorieManager(CategorieDAO categorieDAO) {
		categorieDAO = DAOFactory.getCategorieDAO();
	}

	public void addCategorie(String libelle) throws Exception {
		BLLException err = new BLLException();

		if (libelle.length() > 30 || libelle.length() == 0) {
			err.ajouterErreur("Libelle de la catégorie trop longue ou vide");
		}
		if (!categorieDAO.selectByLibelle(libelle).getLibelle().isEmpty()) {
			err.ajouterErreur("Cette catégorie existe déjà");
			if (err.getMessage() == null) {
				insert(libelle);
			}
			throw err;
		}
	}

	public void deleteCategorie(Categorie cat) {
		if (cat != null) {
			this.categorieDAO.deleteCategorie(cat);
		} else {
			System.out.println("Impossible de supprimer cette catégorie !");
		}
	}

	public Categorie insert(String libelle) {
		return categorieDAO.insert(libelle);
	}

	public Categorie select(int noCategorie) throws DALException {
		return categorieDAO.selectByNo(noCategorie);
	}

	public Categorie update(Categorie cat) {
		categorieDAO.updateCategorie(cat);
		return cat;
	}

	public List<Categorie> getAllCategories() throws DALException {
		return categorieDAO.selectAll();
	}
}
