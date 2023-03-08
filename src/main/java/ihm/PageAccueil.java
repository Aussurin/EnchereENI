package ihm;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.Utilisateur;


@WebServlet("/PageAccueil")
public class PageAccueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PageAccueil() {
        super();
        
        
        
    }

	
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*Article article = new Article();
		
		
		String article = (String)request.getAttribute("Le nom de l'article contient");
		if(article.length() == 0) {
			request.setAttribute("Erreurs", "Veuillez saisir le nom d'un article");
		}
		
		article.setArticle((String)request.getAttribute("Article"));
		
		
		
		
		Categorie categorie = new Categorie();
		
		
		String categorie = (String)request.getAttribute("Categories");
		
		article.setToutes((String) request.getAttribute("Toutes"));
		article.setInformatique((String) request.getAttribute("Informatiaue"));
		article.setAmeublement((String) request.getAttribute("Ameublement"));
		article.setSportLoisir((String) request.getAttribute("Sport&Loisir"));
	
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/PageAccueil.jsp").forward(request, response);*/
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
