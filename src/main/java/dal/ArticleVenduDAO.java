package dal;

import java.util.ArrayList;

import bo.ArticleVendu;

public interface ArticleVenduDAO {
	
			//Sélectionner tous les articles vendus 
			public ArrayList<ArticleVendu> selectAll() throws DALException;
				
			//Sélectionner un article vendu par son no_article
			public ArticleVendu selectByNo(int id) throws DALException;
}
