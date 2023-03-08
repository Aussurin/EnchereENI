package ihm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.Utilisateur;

// Servlet implementation class CreerCompte

@WebServlet("/CreerCompte")
public class CreerCompte extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

 //création d'une instance d'utilisateur avec les données correspondantes à celles du formulaire.
		Utilisateur user = new Utilisateur();
		
		String mdp = (String)request.getAttribute("MotDePasse");
		String confirmMdp = (String)request.getAttribute("ConfirmMdp");
		if(mdp.length() == 0 || confirmMdp.length() == 0 || mdp != confirmMdp) {
			request.setAttribute("Erreurs", "Mots de passe vides ou différents");
		}
		user.setPseudo((String) request.getAttribute("Pseudo"));
		user.setNom((String) request.getAttribute("Nom"));
		user.setPrenom((String) request.getAttribute("Prenom"));
		user.setEmail((String) request.getAttribute("Email"));
		user.setRue((String) request.getAttribute("Rue"));
		user.setCodePostal((int) request.getAttribute("CodePostal"));
		user.setVille((String) request.getAttribute("Ville"));
		user.setMotDePasse(mdp);
		user.setCredit(0);
		if(request.getAttribute("Telephone").equals(null)) {
			user.setTelephone((int) request.getAttribute("Telephone"));
		}
		try {
			UtilisateurManager.insererUtilisateur(user); // Vérification que tout est conforme aux condition de création de compte.
		}catch (Exception exception){
			String messageErreur = exception.getMessage();
			request.setAttribute("Erreurs", messageErreur);
			request.getRequestDispatcher("ErreurCreationCompte.jsp").forward(request, response); //Orientation vers une page d'erreur si non conforme.		
		}
		
		request.setAttribute("CreationReussie", "Creation Reussie");
		request.getRequestDispatcher("PageAccueil").forward(request, response); //Redirection vers la page d'acceuil si la création du compte est réussie.
}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
