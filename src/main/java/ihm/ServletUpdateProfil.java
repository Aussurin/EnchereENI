package ihm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import BusinessException.BusinessException;
import bll.UtilisateurManager;
import bo.Utilisateur;

/**
 * Servlet implementation class ServletUpdateProfil
 */
@WebServlet("/ServletUpdateProfil")
public class ServletUpdateProfil extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/Connexion/UpdateProfil.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pseudo = request.getParameter("Pseudo").trim();
		String nom = request.getParameter("Nom").trim();
		String prenom = request.getParameter("Prenom").trim();
		String email = request.getParameter("Email").trim();
		String rue = request.getParameter("Rue").trim();
		String telephone = request.getParameter("tel").trim();
		String codePostal = request.getParameter("codePostal").trim();
		String ville = request.getParameter("Ville").trim();
		String mdp = request.getParameter("Mdp");
		String confirmMdp = request.getParameter("ConfirmMdp");
		
		HttpSession user = request.getSession();
		Utilisateur utilisateur = (Utilisateur) user.getAttribute("utilisateur");
		String ancienMdp = utilisateur.getMotDePasse();
		
		try {
			if (mdp.isEmpty()) {
				mdp = ancienMdp;
				confirmMdp = mdp;
			}
			
			UtilisateurManager utilisateurManager = UtilisateurManager.getInstance();
			Utilisateur updateUtilisateur = utilisateurManager.update(user, pseudo, nom, prenom, email, rue, telephone, codePostal, ville,
					mdp, confirmMdp);

			user.setAttribute("utilisateur", updateUtilisateur);

			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/Connexion/Profil.jsp");
			rd.forward(request, response);
		
			}catch (BusinessException e) {
			StringBuffer sb = new StringBuffer();
			sb.append("Une erreur s'est produite");
			
			PrintWriter out = response.getWriter();
			request.getRequestDispatcher("WEB-INF/jsp/Connexion/CreationCompte.jsp").include(request, response);
			out.print(sb.toString());
		}
	}
	
}
	
	
	
	
	