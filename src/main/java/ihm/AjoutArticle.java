package ihm;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bll.CategorieManager;
import bo.ArticleVendu;
import bo.Categorie;


@WebServlet("/AjoutArticle")
public class AjoutArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArticleVendu art = new ArticleVendu();
		CategorieManager catM = new CategorieManager();
		Categorie cat = new Categorie();
		cat.setLibelle(request.getParameter("categorie"));
		try {
			cat.setNoCategorie(catM.selectId(cat.getLibelle()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		art.setCategorie(cat);
		try {
			
			Date date = new SimpleDateFormat("jj/mm/aaaa").parse(request.getParameter("DebutEnchere"));
			art.setDateDebutEncheres(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}try {
			
			Date date = new SimpleDateFormat("jj/mm/aaaa").parse(request.getParameter("FinEnchere"));
			art.setDateFinEncheres(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		art.setDescription(request.getParameter("Description"));
		art.setMiseAPrix(Integer. parseInt(request.getParameter("MiseAPrix")));
		art.setNomArticle(request.getParameter("Article"));
		art.setUtilisateur(request.getParameter(""));
		
		request.setAttribute("CreationReussie", "Creation Reussie");
		request.getRequestDispatcher("PageAccueil").forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
