package bll;

import java.util.List;

import bo.ArticleVendu;
import bo.Enchere;
import bo.Retrait;
import dal.DALException;
import dal.DAOFactory;
import dal.RetraitDAO;

public class RetraitManager {
private RetraitDAO retraitDao;

public RetraitManager(RetraitDAO retraitDao) {
	this.retraitDao = DAOFactory.getRetraitDAO();
}

	public void addRetrait(int noArticle, String rue, String codePostal, String ville, ArticleVendu article) {
	Retrait retrait = null;
	
	retrait = new Retrait();
	retrait.setNoArticle(noArticle);
	retrait.setRue(rue);
	retrait.setCodePostal(codePostal);
	retrait.setVille(ville);
	retrait.setArticle(article);
	
	this.retraitDao.addRetrait(retrait);
}
	
	public void deleteRetrait (Retrait retrait) {
		if (retrait !=null) {
			this.retraitDao.deleteRetrait(retrait);
		} else {
			System.out.println("Impossible de supprimer ce point de retrait");
		}
}

	public Retrait select(Retrait retrait) {		
		return retraitDao.selectByNoEnchere(retrait);		
}
	
}
	public Retrait insert(Retrait retrait) {	
		retraitDao.insert(retrait);
	return retrait;	
}
	
	public Retrait update(Retrait retrait) {	
		retraitDao.updateEnchere(retrait);
	return retrait;	
}

	public List<Retrait> getAllRetrait() throws DALException {
        return retraitDao.selectAll();
    }

}