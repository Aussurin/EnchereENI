package ihm;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bll.ArticleVenduManager;
import bll.CategorieManager;
import bo.ArticleVendu;


@WebServlet("/Bienvenue")
public class BienvenueCategorie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String categorie = request.getParameter("categorie");
		ArticleVenduManager aVM = new ArticleVenduManager();
		CategorieManager catM = new CategorieManager();
		try {
			ArrayList<ArticleVendu> liste = aVM.recupParCat(catM.selectId(categorie));
			request.setAttribute("liste", liste);
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("PageAccueil").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
