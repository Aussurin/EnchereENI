package ihm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bll.UtilisateurManager;
import bo.Utilisateur;

// Servlet implementation class CreerCompte

@WebServlet("/src/main/java/ihm/CreerCompte.java")
public class CreerCompte extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

 //création d'une instance d'utilisateur avec les données correspondantes à celles du formulaire.
		Utilisateur user = new Utilisateur();
		String mdp = (String)request.getParameter("Mdp");
		String confirmMdp = (String)request.getParameter("ConfirmMdp");
		if(mdp == confirmMdp) {
			user.setPseudo(request.getParameter("Pseudo"));
			user.setNom((String) request.getParameter("Nom"));
			user.setPrenom((String) request.getParameter("Prenom"));
			user.setEmail((String) request.getParameter("Email"));
			user.setRue((String) request.getParameter("Rue"));
			user.setCodePostal((String) request.getParameter("CodePostal"));
			user.setVille((String) request.getParameter("Ville"));
			user.setMotDePasse(mdp);
			user.setCredit(0);
			if(request.getParameter("Telephone").equals(null)) {
				user.setTelephone((String) request.getParameter("Telephone"));
			}
			try {
				UtilisateurManager utilisateurManager = new UtilisateurManager();
				utilisateurManager.insérerUtilisateur(user); // Vérification que tout est conforme aux condition de création de compte.
			}catch (Exception exception){
				String messageErreur = exception.getMessage();
				request.setAttribute("Erreurs", messageErreur);
				request.getRequestDispatcher("/ErreurCreationCompte.jsp").forward(request, response); //Orientation vers une page d'erreur si non conforme.		
			}
			
			request.setAttribute("CreationReussie", "Creation Reussie");
		}else {
			request.setAttribute("Erreurs", "Les mots de passe doivent être identiques.");
		}
		request.getRequestDispatcher("PageAccueil").forward(request, response); //Redirection vers la page d'acceuil si la création du compte est réussie.
}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
