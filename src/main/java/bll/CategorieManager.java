package bll;

import java.util.List;

import bo.ArticleVendu;
import bo.Categorie;
import dal.ArticleVenduDAO;
import dal.CategorieDAO;
import dal.DALException;
import dal.DAOFactory;

public class CategorieManager {
private static CategorieDAO categorieDAO;

	public CategorieManager(CategorieDAO categorieDAO) {
	this.categorieDAO = DAOFactory.getCategorieDAO();
	}
	
	public Categorie addCategorie(int noCategorie, long libelle)throws Exception {
		BLLException err = new BLLException();
		
		Categorie cat = null;
		cat.setNoCategorie(noCategorie);
		cat.setLibelle(libelle);
		this.categorieDAO.addCategorie(cat);
		
		if (cat.getLibelle() > 30 || cat.getLibelle() == 0) {
			err.ajouterErreur("Libelle de la catégorie trop longue ou vide");
		}
		if (cat.getNoCategorie() > 300 || cat.getNoCategorie() == 0) {
			err.ajouterErreur("Description de la catégorie trop longue ou vide");
	    }
		 if (!categorieDAO.checkForUniqueCategorieLibelle(cat.getLibelle())) {
	            err.ajouterErreur("Cette catégorie existe déjà");
	    if(err.getMessage() == null) {
			return cat;
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
	
	public Categorie insert(int noCategorie) {		
		return categorieDAO.insert(noCategorie);		
	}
	
	public Categorie select(int noCategorie) {		
		return categorieDAO.selectByNoCategorie(noCategorie);		
	}
	
	public Categorie update(Categorie cat) {	
		categorieDAO.updateCategorie(cat);
		return cat;	
	}

	 public List<Categorie> getAllCategories() throws DALException {
	        return categorieDAO.selectAll();
	    }
}
