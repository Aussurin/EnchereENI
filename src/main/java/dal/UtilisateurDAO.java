package dal;

import java.util.ArrayList;
import bo.Utilisateur;

public interface UtilisateurDAO {
	
	//Sélectionner un utilisateur par son no_utilisateur
	public Utilisateur selectByNo(int id) throws DALException;
	
	//Sélectionner tous les utilisateurs 
	public ArrayList<Utilisateur> selectAll() throws DALException;
	
	//Modifier les attributs d'un utilisateur connu en BD
	public void update(Utilisateur data) throws DALException;
	
	//Supprimer un utilisateur
	public void delete(int id) throws DALException;
	
	//Se connecter
	public Utilisateur selectConnection(String pseudo, String mdp) throws DALException;
	
	//S'enregistrer
	public Utilisateur insert(Utilisateur user) throws DALException;
	
	public Utilisateur selectByPseudo(String pseudo) throws DALException;

	public Utilisateur selectByEmail(String email) throws DALException;


}