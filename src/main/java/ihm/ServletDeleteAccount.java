package ihm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import BusinessException.BusinessException;
import bll.UtilisateurManager;
import bo.Utilisateur;
import dal.DALException;

/**
 * Servlet implementation class ServletDeleteAccount
 */
@WebServlet("/ServletDeleteAccount")
public class ServletDeleteAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		UtilisateurManager utilisateurManager = new UtilisateurManager(); 
		String pseudo = (String) request.getAttribute("pseudo");
		try {
			utilisateurManager.delete(pseudo);
		} catch (DALException e) {
			e.printStackTrace();
		}
		response.sendRedirect(request.getContextPath() + "/logout");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
