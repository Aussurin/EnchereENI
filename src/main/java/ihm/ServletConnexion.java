package ihm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bll.UtilisateurManager;
import bo.Utilisateur;
import dal.DALException;

/**
 * Servlet implementation class ServletConnexion
 */
@WebServlet("/ServletConnexion")
public class ServletConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
	
		String pseudo = request.getParameter("pseudo");
		String mdp = request.getParameter("mdp");
		Utilisateur currentUser = null;
		boolean error = false; 
	
		UtilisateurManager utilisateurManager = new UtilisateurManager();

		try {
			currentUser = utilisateurManager.LoginByPseudo(pseudo, mdp);	
			if (currentUser.getPseudo() == null) {	
				error = true;
				session.setAttribute("ErrorLogin", "Une erreur est survenue veuillez recommencer");
			} else {
				error = false;
			}
			
		System.out.println(session.getAttribute("idUtilisateur"));
		} catch (DALException e) {
			e.printStackTrace();
		}
		if (error == false) {
			session.setAttribute("idUtilisateur", currentUser.getNoUtilisateur());
			response.sendRedirect(request.getContextPath() + "/PageAccueil");
		}	
	}
}