package bll;

import java.util.Date;
import java.util.List;

import bo.ArticleVendu;
import bo.Categorie;
import bo.Enchere;
import bo.Utilisateur;
import dal.DALException;
import dal.DAOFactory;
import dal.EnchereDAO;

public class EnchereManager {
private EnchereDAO enchereDAO;
	
	public EnchereManager(EnchereDAO enchereDAO) {
		this.enchereDAO = DAOFactory.getEnchereDAO();
	}
	
	public Enchere addEnchere(Date dateEnchere, int montantEnchere, Utilisateur utilisateur, ArticleVendu article) {
		
		Enchere enchere = null;
		
			enchere = new Enchere();
			enchere.setDateEnchere(dateEnchere);
			enchere.setMontant_enchere(montantEnchere);
			enchere.setUtilisateur(utilisateur);
			enchere.setArticleVendu(article);
			
			this.enchereDAO.addEnchere(dateEnchere, montantEnchere, utilisateur, article);
	
		return enchere;		
	}
	
	public void  deleteEnchere(int noArticle, int noUtilisateur) {
		Enchere enchere = select(noArticle, noUtilisateur);
			if(enchere != null) {
				this.enchereDAO.deleteEnchere(enchere);
			} else {
				System.out.println("L'enchère n'existe pas.");
			}		
	}
	
	public Enchere select(int noArticle, int noUtilisateur) {		
		return enchereDAO.selectByNoEnchere(noArticle, noUtilisateur);		
}
	public Enchere select(int noEnchere) {		
		return enchereDAO.selectByNoEnchere(noEnchere);		
}
	public Enchere insert(Enchere enchere) {	
		enchereDAO.insert(enchere);
	return enchere;	
}
	
	public Enchere update(Enchere enchere) {	
		enchereDAO.updateEnchere(enchere);
	return enchere;	
}

	public List<Enchere> getAllEnchere() throws DALException {
        return enchereDAO.selectAll();
    }

}
	