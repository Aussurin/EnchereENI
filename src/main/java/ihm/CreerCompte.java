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
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
