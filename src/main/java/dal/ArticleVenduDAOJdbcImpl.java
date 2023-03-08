package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import bo.ArticleVendu;
import bo.Utilisateur;

public class ArticleVenduDAOJdbcImpl implements ArticleVenduDAO{

	private static final String SELECT_ALL = "SELECT * FROM ARTICLES_VENDUS";
	private static final String SELECT_BY_NO = "SELECT * FROM ARTICLES_VENDUS WHERE no_article=?";
	private static final String INSERT = "INSERT INTO ARTICLES-VENDUS (nom_article, description, date_debut_encheres, date_fin_ encheres, prix_initial, prix_vente, no_utilisateur, no_catégorie) VALUES (?,?,?,?,?,?,?,?)";
	private static final String UPDATE = "UPDATE table ARTICLE_VENDUS set nom_article = ?, description = ?, date_debut_encheres = ?, date_fin_ encheres = ?, prix_initial = ?, prix_vente = ?, no_catégorie = ?";
	private static final String SELECT_BY_CATEGORIE = "SELECT * FROM ARTICLES_VENDUS WHERE no_categorie=?";
	
	@Override
 	public ArrayList<ArticleVendu> selectAll() throws DALException {
		ArrayList<ArticleVendu>resultat=new ArrayList<ArticleVendu>();
		try {		
			
			PreparedStatement ps = JdbcTools.getConnection().prepareStatement(SELECT_ALL);
			ResultSet rs = ps.executeQuery();

			ArticleVendu art = new ArticleVendu();	
			UtilisateurDAO userDAO = DAOFactory.getUtilisateurDAO();
			while(rs.next()) {
				Utilisateur user = userDAO.selectByNo(rs.getInt("no_utilisateur"));
				art.setNoArticle(rs.getInt("no_article"));
				art.setNomArticle(rs.getString("nom_article").trim());
				art.setDescription(rs.getString("descritption").trim());
				art.setDateDebutEncheres(rs.getDate("date_debut_enchere"));
				art.setDateFinEncheres(rs.getDate("date_fin_enchere"));
				art.setMiseAPrix(rs.getInt("prix_initial"));
				art.setPrixVente(rs.getInt("prix_vente"));
				art.setUtilisateur(user);
				resultat.add(art);
			}					
		} catch (SQLException e) {
			e.printStackTrace();}
		JdbcTools.closeConnection();
		return resultat;
}
	
	public ArrayList<ArticleVendu> selectByCategorie(int cat) throws DALException {
		ArrayList<ArticleVendu>resultat=new ArrayList<ArticleVendu>();
		try {		
			
			PreparedStatement ps = JdbcTools.getConnection().prepareStatement(SELECT_BY_CATEGORIE);
			ps.setInt(1, cat);
			ResultSet rs = ps.executeQuery();

			ArticleVendu art = new ArticleVendu();	
			UtilisateurDAO userDAO = DAOFactory.getUtilisateurDAO();
			while(rs.next()) {
				Utilisateur user = userDAO.selectByNo(rs.getInt("no_utilisateur"));
				art.setNoArticle(rs.getInt("no_article"));
				art.setNomArticle(rs.getString("nom_article").trim());
				art.setDescription(rs.getString("descritption").trim());
				art.setDateDebutEncheres(rs.getDate("date_debut_enchere"));
				art.setDateFinEncheres(rs.getDate("date_fin_enchere"));
				art.setMiseAPrix(rs.getInt("prix_initial"));
				art.setPrixVente(rs.getInt("prix_vente"));
				art.setUtilisateur(user);
				resultat.add(art);
			}					
		} catch (SQLException e) {
			e.printStackTrace();}
		JdbcTools.closeConnection();
		return resultat;
}

	@Override
	public ArticleVendu selectByNo(int id) throws DALException {
		ArticleVendu art = new ArticleVendu();
		try {
			PreparedStatement ps = JdbcTools.getConnection().prepareStatement(SELECT_BY_NO);
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
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		JdbcTools.closeConnection();
		return art;
	}

	public ArticleVendu enregistrement(ArticleVendu art) throws DALException {
		try {
			PreparedStatement ps = JdbcTools.getConnection().prepareStatement(INSERT);
		
			ps.setString(1, art.getNomArticle());
			ps.setString(2, art.getDescription());
			ps.setDate(3, (java.sql.Date) art.getDateDebutEncheres());
			ps.setDate(4, (java.sql.Date) art.getDateFinEncheres());
			ps.setInt(5, art.getMiseAPrix());
			ps.setInt(6, art.getPrixVente());
			ps.setInt(7, art.getUtilisateur().getNoUtilisateur());
			ps.setInt(8,  art.getCategorie().getNoCategorie());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				art.setNoArticle(rs.getInt("no_article"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			}
		
		JdbcTools.closeConnection();
		return art;		
	}
	
	public ArticleVendu update(ArticleVendu art) throws DALException {
		try {
			PreparedStatement ps = JdbcTools.getConnection().prepareStatement(UPDATE);
		
			ps.setString(1, art.getNomArticle());
			ps.setString(2, art.getDescription());
			ps.setDate(3, (java.sql.Date) art.getDateDebutEncheres());
			ps.setDate(4, (java.sql.Date) art.getDateFinEncheres());
			ps.setInt(5, art.getMiseAPrix());
			ps.setInt(6, art.getPrixVente());
			ps.setInt(7,  art.getCategorie().getNoCategorie());
			ps.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
			}
		
		JdbcTools.closeConnection();
		return art;
	}
}
