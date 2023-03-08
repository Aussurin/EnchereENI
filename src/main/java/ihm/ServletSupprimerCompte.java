package ihm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * Servlet implementation class ServletSupprimerCompte
 */
@WebServlet("/ServletSupprimerCompte")
public class ServletSupprimerCompte extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.getRequestDispatcher("/WEB-INF/supprimerCompte.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	        try {
	        	removeUser(request, response);
	        } catch (BusinessException e) {
	            throw new RuntimeException(e);
	        }


	        if(BusinessException == null) {
	            request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request,response);

	        } else {
	            HttpSession session = request.getSession();
	            session.removeAttribute("connecte");
	            session.removeAttribute("utilisateur");
	            session.setAttribute("succes" ,"Utilisateur supprimer avec succes");
	            response.sendRedirect(request.getContextPath()+"/accueil");
	        }

	    }

	    private void removeUser(HttpServletRequest request, HttpServletResponse response) throws BusinessException {
	        UtilisateurManager utilisateurManager = new UtilisateurManager();
	        HttpSession session = request.getSession();
	        Utilisateur utilisateurSession = (Utilisateur) session.getAttribute("utilisateur");

	        String motDePasse = request.getParameter("mot_de_passe");
	        String confirm_mot_de_passe = request.getParameter("confirm_mot_de_passe");

	        if (!motDePasse.equals(confirm_mot_de_passe)) {
	            System.out.println("Les 2 mots de passe ne correspondent pas, veuillez réesayer.");;
	        }

	        if (motDePasse.equals(confirm_mot_de_passe)) {
	            if(confirm_mot_de_passe.equals(utilisateurSession.getMotDePasse())){
	                utilisateurManager.delete(utilisateurSession);
	            }
	        }

	    }

	}