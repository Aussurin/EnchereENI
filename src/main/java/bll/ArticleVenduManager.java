package bll;

import java.text.SimpleDateFormat;

import bo.ArticleVendu;

public class ArticleVenduManager {
	
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
			insertArticleVendu(art);
			return art;
	    }
	    throw err;
	}
}
