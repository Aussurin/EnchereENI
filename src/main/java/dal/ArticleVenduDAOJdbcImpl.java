package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import bo.ArticleVendu;
import bo.Utilisateur;

public class ArticleVenduDAOJdbcImpl implements ArticleVenduDAO{

	private static final String SELECT_ALL = "SELECT * FROM ARTICLES_VENDUS";
	private static final String SELECT_BY_NO = "SELECT * FROM ARTICLES_VENDUS WHERE no_article=? ";
	private static final String INSERT = "INSERT INTO ARTICLES-VENDUS (no_article, nom_article, description, date_debut_encheres, date_fin_ encheres, prix_initial, prix_vente, no_utilisateur, no_catégorie) VALUES (?,?,?,?,?,?,?,?)";

	
	@Override
 	public ArrayList<ArticleVendu> selectAll() throws DALException {
		ArrayList<ArticleVendu>resultat=new ArrayList<ArticleVendu>();
		try {		
			
			PreparedStatement ps = JdbcTools.getConnection().prepareStatement("SELECT_ALL");
			ResultSet rs = ps.executeQuery();

			ArticleVendu art = new ArticleVendu();			
			while(rs.next()) {
				art.setNoArticle(rs.getInt("no_article"));
				art.setNomArticle(rs.getString("nom_article").trim());
				art.setDescription(rs.getString("descritption").trim());
				art.setDateDebutEncheres(rs.getDate("date_debut_enchere"));
				art.setDateFinEncheres(rs.getDate("date_fin_enchere"));
				art.setMiseAPrix(rs.getInt("prix_initial"));
				art.setPrixVente(rs.getInt("prix_vente"));
				art.setNoUtilisateur(rs.getInt("no_utilisateur"));
				int noCategorie  = rs.getInt("no_categorie");	
				resultat.add(art);
			}					
		} catch (SQLException e) {
			e.printStackTrace();}
		JdbcTools.closeConnection();
		return resultat;
}

	@Override
	public ArticleVendu selectByNo(int id) throws DALException {
		ArticleVendu art=null;
		try {
			PreparedStatement ps = JdbcTools.getConnection().prepareStatement("SELECT_BY_NO");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			UtilisateurDAO userDAO = DAOFactory.getUtilisateurDAO();
			if(rs.next()) {
				Utilisateur user = userDAO.selectByNo(rs.getInt("no_utilisateur"));
				art.setNoArticle(rs.getInt("no_article"));
				art.setNomArticle(rs.getString("nom_article").trim());
				art.setDescription(rs.getString("descritption").trim());
				art.setDateDebutEncheres(rs.getDate("date_debut_enchere"));
				art.setDateFinEncheres(rs.getDate("date_fin_enchere"));
				art.setMiseAPrix(rs.getInt("prix_initial"));
				art.setPrixVente(rs.getInt("prix_vente"));
				art.setUtilisateur(user);
				int noCategorie = rs.getInt("no_categorie");
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		JdbcTools.closeConnection();
		return art;
	}

	public ArticleVendu enregistrement(ArticleVendu art) {
		
		return art;
		
	}
}
