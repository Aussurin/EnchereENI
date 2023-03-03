package bll;


import java.util.List;


import bo.Utilisateur;

import dal.DAOFactory;

public class UtilisateurManager {
	
	private static UtilisateurDAO utilisateurDAO;
	
	public Utilisateur checkUtilisateur(Utilisateur user) throws Exception{
		BLLException err = new BLLException();
		if (user.getPseudo().length() > 30 || user.getPseudo().length() == 0) {
			err.ajouterErreur("Pseudo trop long ou vide");
		}
		if (user.getNom().length() > 30 || user.getNom().length() == 0) {
			err.ajouterErreur("Nom trop long ou vide");
		}
		if (user.getPrenom().length() > 30 || user.getPrenom().length() == 0) {
			err.ajouterErreur("Prenom trop long ou vide");
		}
		if (user.getEmail().length() > 50 || user.getEmail().length() == 0) {
			err.ajouterErreur("Email trop long ou vide");
		}
		Integer tel = user.getTelephone();
		if (tel.toString().length() > 15 || tel.toString().length() == 0 ) {
			err.ajouterErreur("Téléphone trop long ou vide");
		}
		if (user.getRue().length() > 30 || user.getRue().length() == 0) {
			err.ajouterErreur("Rue trop long ou vide");
		}
		Integer codepostal = user.getCodePostal();
		if (codepostal.toString().length() > 10 || codepostal.toString().length() == 0) {
			err.ajouterErreur("Code postal invalide");
		}
		if (user.getVille().length() > 50 || user.getVille().length() == 0) {
			err.ajouterErreur("Ville invalide");
		}
		if (user.getMotDePasse().length() > 30 || user.getMotDePasse().length() == 0) {
			err.ajouterErreur("Mot de passe trop long ou vide");
		}
		if(err.getMessage() == null) {
			insertUtilisateur(user);
			return user;
		}
		throw err;
	}
	
	public UtilisateurManager() {
		utilisateurDAO = DAOFactory.getUtilisateurDAO();
	}
	
	public List<Utilisateur> selectAll(){
		
		return  utilisateurDAO.selectAll();

	}
	
	public Utilisateur selectById(int id) {
		
		return utilisateurDAO.selectById(id);
		
	}
	
	public void insert(Utilisateur utilisateur) {
		if(utilisateur.getPseudo() ==null || utilisateur.getPseudo() == "") {
			
		}
		
		utilisateurDAO.insert(utilisateur);
		
	}
	
	public void update (Utilisateur utilisateur) {
		
		utilisateurDAO.update(utilisateur);
		
		
		
	}
	
	public void delete (int id) {
		utilisateurDAO.delete(id);
		
	}
	

}
