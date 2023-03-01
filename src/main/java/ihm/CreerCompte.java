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
		user.setPseudo(request.Pseudo);
		user.setNom(request.Nom);
		user.setPrenom(request.Prenom);
		user.setEmail(request.Email);
		user.setRue(request.Rue);
		user.setCodePostal(request.CodePostal);
		user.setVille(request.Ville);
		user.setMotDePasse(request.MotDePasse);
		user.setCredit(0);
		if(request.Telephone != null) {
			user.setTelephone(request.Telephone);
		}
		try {
			CompteManager.checkCompte(user); // Vérification que tout est conforme aux condition de création de compte.
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
