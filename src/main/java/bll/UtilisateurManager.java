package bll;


import java.util.List;


import bo.Utilisateur;

import dal.DAOFactory;

public class UtilisateurManager {
	
	private UtilisateurDAO utilisateurDao;
	
	public UtilisateurManager() {
		utilisateurDao = DAOFactory.getUtilisateurDAO();
	}
	
	public List<Utilisateur> selectAll(){
		
		return  utilisateurDao.selectAll();

	}
	
	public Utilisateur selectById(int id) {
		
		return utilisateurDao.selectById(id);
		
	}
	
	public void insert(Utilisateur utilisateur) {
		if(utilisateur.getPseudo() ==null || utilisateur.getPseudo("")) {
			
		}
		
		utilisateurDao.insert(utilisateur);
		
	}
	
	public void update (Utilisateur utilisateur) {
		
		utilisateurDAO.update(utilisateur);
		
		
		
	}
	
	public void delete (int id) {
		utilisateurDao.delete(id);
		
	}
	

}
