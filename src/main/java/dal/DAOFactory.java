package dal;

public class DAOFactory {
	UtilisateurDAO utilisateurDAO;
	RetraitDAO retraitDAO;
	CategorieDAO categorieDAO;
	ArticleVenduDAO articleVenduDAO;

	public static UtilisateurDAO getUtilisateurDAO() {
		UtilisateurDAO utilisateurDAO = null;
		try {
			utilisateurDAO = new UtilisateurDAOJdbcImpl();
		} catch (Exception e) {
			e.printStackTrace();		
		}
		return utilisateurDAO;
}


	public static RetraitDAO getRetraitDAO() {
		RetraitDAO retraitDAO = null;
		try {
			retraitDAO = new RetraitDAOJdbcImpl();
		} catch (Exception e) {
			e.printStackTrace();	
		}
		return retraitDAO;
}
	
	public static CategorieDAO getCategorieDAO() {
		CategorieDAO categorieDAO = null;
		try {
		categorieDAO = new CategorieDAOJdbcImpl();
		} catch (Exception e) {
		e.printStackTrace();	
	}
	return categorieDAO;
}
	
	public static ArticleVenduDAO getArticleVenduDAO() {
		ArticleVenduDAO articleVenduDAO = null;
		try {
		articleVenduDAO = new ArticleVenduDAOJdbcImpl();
		} catch (Exception e) {
		e.printStackTrace();	
	}
	return articleVenduDAO;
}
	
	
}
