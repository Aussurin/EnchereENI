package dal;

import java.util.ArrayList;
import java.util.List;
import bo.Utilisateur;
import dal.UtilisateurDAOJdbcImpl;

public class AppliTestDal {

	public static void main(String[] args) throws DALException {
		
		UtilisateurDAO dao = new UtilisateurDAOJdbcImpl();
			ArrayList<Utilisateur> utilisateur = new ArrayList<>();
			utilisateur = dao.selectAll();
			
		
			if(utilisateur.size()!=0) for (Utilisateur currentUtilisateur : utilisateur) {
			System.out.println(currentUtilisateur);
		}

	}

}
