package ihm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.Enchere;

//Servlet implementation class RechercherEnchere

@WebServlet("/RechercherEnchere")
public class RechercherEnchere extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Enchere> liste = new ArrayList<Enchere>();
		String categorie = request.getParameter("Categorie");
		
		liste = CategorieManager.getListeCategorie(categorie);
		request.setAttribute("EnchereCategorie", liste);
		request.getRequestDispatcher("/PageAcceuil.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
