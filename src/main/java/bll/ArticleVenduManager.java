package bll;

import java.text.SimpleDateFormat;

import bo.ArticleVendu;
import bo.Utilisateur;

public class ArticleVenduManager {
	
	private static ArticleVenduDAO articleVenduDAO;
	
	public ArticleVendu checkArticleVendu(ArticleVendu art) throws Exception{
		BLLException err = new BLLException();
		if (art.getNomArticle().length() > 30 || art.getNomArticle().length() == 0) {
			err.ajouterErreur("Nom de l'article trop long ou vide");
		}
		if (art.getDescription().length() > 300 || art.getDescription().length() == 0) {
			err.ajouterErreur("Description de l'article trop longue ou vide");
		}
		if (art.getCategorie() == null) {
			err.ajouterErreur("Catégorie incorrecte");
		}
	    if (art.getDateDebutEncheres().after(art.getDateFinEncheres()) || art.getDateDebutEncheres().equals(art.getDateFinEncheres())) {
	    	err.ajouterErreur("La date de fin de l'enchère doit être ultérieur à la date de début de l'enchere");
	    }
	    if(err.getMessage() == null) {
			return art;
	    }
	    throw err;
	}
	
	public ArticleVendu ajouterArticleVendu(ArticleVendu art) throws Exception{
		try {
		checkArticleVendu(art);
		}catch (Exception err){
			throw err;
		}
		insert(art);		
		return art;		
	}
	public ArticleVendu MAJArticleVendu(ArticleVendu art) throws Exception{
		try {
		checkArticleVendu(art);
		}catch (Exception err){
			throw err;
		}
		update(art);		
		return art;		
	}
	public ArticleVendu recupArticleVendu(int noArt) throws Exception{
		ArticleVendu art;
		art = select(noArt);
		return art;
	}
		
	public ArticleVendu select(int noArticle) {		
		return articleVenduDAO.selectByNoArticle(noArticle);		
	}
	public ArticleVendu update(ArticleVendu art) {	
		articleVenduDAO.updateArticleVendu(art);
		return art;	
	}
	public ArticleVendu insert(ArticleVendu art) {	
		articleVenduDAO.insertArticleVendu(art);
		return art;	
	}
}
