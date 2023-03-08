package bll;

import bo.ArticleVendu;
import bo.Retrait;
import dal.DALException;
import dal.DAOFactory;
import dal.RetraitDAO;

public class RetraitManager {
	private RetraitDAO retraitDao;

	public RetraitManager(RetraitDAO retraitDao) {
		this.retraitDao = DAOFactory.getRetraitDAO();
	}
			
	public void addRetrait(Retrait retrait) throws Exception{
		retraitDao.insert(retrait);
	}

	public void deleteRetrait(Retrait retrait) throws DALException {
		if (retrait != null) {
			retraitDao.delete(retrait);
		} else {
			System.out.println("Impossible de supprimer ce point de retrait");
		}
	}

	public Retrait select(ArticleVendu art) throws DALException {		
		return retraitDao.selectByNo(art.getNoArticle());
	}


	public Retrait update(Retrait retrait) throws DALException {
		retraitDao.update(retrait);
		return retrait;
	}


}