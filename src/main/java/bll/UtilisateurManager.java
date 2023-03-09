package bll;


import java.util.List;


import bo.Utilisateur;
import dal.DALException;
import dal.DAOFactory;
import dal.UtilisateurDAO;

public class UtilisateurManager {
	
	private UtilisateurDAO utilisateurDAO;
	
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
		String tel = user.getTelephone();
		if (tel.toString().length() > 15 || tel.toString().length() == 0 ) {
			err.ajouterErreur("Téléphone trop long ou vide");
		}
		if (user.getRue().length() > 30 || user.getRue().length() == 0) {
			err.ajouterErreur("Rue trop long ou vide");
		}
		String codepostal = user.getCodePostal();
		if (codepostal.toString().length() > 10 || codepostal.toString().length() == 0) {
			err.ajouterErreur("Code postal invalide");
		}
		if (user.getVille().length() > 50 || user.getVille().length() == 0) {
			err.ajouterErreur("Ville invalide");
		}
		if (user.getMotDePasse().length() > 30 || user.getMotDePasse().length() == 0) {
			err.ajouterErreur("Mot de passe trop long ou vide");
		}
		
		if (utilisateurDAO.selectByPseudo(user.getPseudo()).getNoUtilisateur() != null) {
            err.ajouterErreur("Ce pseudo existe déjà. Veuillez en choisir un autre.");
        }
		if (utilisateurDAO.selectByEmail(user.getEmail()).getEmail() != null) {
            err.ajouterErreur("Cet email est déjà utilisé.");
        }
		if(err.getMessage() == null) {
			return user;
		}
		throw err;
	}

	public Utilisateur recupUtilisateur(String pseudo) throws Exception{
		Utilisateur user;
		user = selectByPseudo(pseudo);
		return user;
	}
	
	public Utilisateur MAJUtilisateur(Utilisateur user) throws Exception{
		try {
		checkUtilisateur(user);
		}catch (Exception err){
			throw err;
		}
		update(user);		
		return user;		
}
	
	public Utilisateur insérerUtilisateur(Utilisateur user) throws Exception{
		
		checkUtilisateur(user);
		
		insert(user);		
		return user;		
}
	

	public UtilisateurManager() {
		utilisateurDAO = DAOFactory.getUtilisateurDAO();
}
	
	public List<Utilisateur> selectAll() throws DALException{
		return  utilisateurDAO.selectAll();
}
	public Utilisateur selectById(int noUtilisateur) throws BLLException, DALException {
		return this.utilisateurDAO.selectByNo(noUtilisateur);
	}
	
	public Utilisateur selectByPseudo(String pseudo) throws DALException {
		return utilisateurDAO.selectByPseudo(pseudo);
}
	public Utilisateur selectByEmail(String email) throws BLLException, DALException {
		email = email.trim();
		return this.utilisateurDAO.selectByEmail(email);
	}
	
	public void insert(Utilisateur utilisateur) throws DALException {
		if(utilisateur.getPseudo() !=null && utilisateur.getPseudo() != "") {	
			utilisateurDAO.insert(utilisateur);
		}else {
			DALException err = new DALException("Pseudo obligatoire");
			throw err;
		}
		
}
	
	public void update(Utilisateur utilisateur) throws DALException {
		utilisateurDAO.update(utilisateur);
}	
	

		utilisateurDAO.delete(utilisateurId);	
}
	public void delete(int id) throws DALException {
		utilisateurDAO.delete(id);	
}
}
