package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import bo.ArticleVendu;

public class ArticleVenduDAOJdbcImpl implements ArticleVenduDAO{
	private Connection con;
	private static String URL="jdbc:sqlserver://localhost:1433;databaseName=ENCHERE_ENI";
	private static String USER="sa";
	private static String PSWD="Pa$$w0rd";
	
	private static final String SELECT_ALL = "SELECT * FROM ARTICLES_VENDUS";
	private static final String SELECT_BY_NO = "SELECT * FROM ARTICLES_VENDUS WHERE no_article=? ";

	@Override
	public ArrayList<ArticleVendu> selectAll() throws DALException {
		ArrayList<ArticleVendu>resultat=new ArrayList<ArticleVendu>();
		try {
			con = DriverManager.getConnection(URL, USER, PSWD);
			
			PreparedStatement ps = con.prepareStatement("SELECT_ALL");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("no_article");
				String nomArticle = rs.getString("nom_article").trim();
				String description = rs.getString("descritption").trim();
				Date dateDebut = rs.getDate("date_debut_enchere");
				Date dateFin = rs.getDate("date_fin_enchere");
				int prixInitial  = rs.getInt("prix_initial");
				int prixVente  = rs.getInt("prix_vente");
				int noUtilisateur  = rs.getInt("no_utilisateur");
				int noCategorie  = rs.getInt("no_categorie");			
			}					
		} catch (SQLException e) {
			e.printStackTrace();}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}return resultat;
}

	@Override
	public ArticleVendu selectByNo(int id) throws DALException {
		ArticleVendu resultat=null;
		try {
			con = DriverManager.getConnection(URL, USER, PSWD);
			
			PreparedStatement ps = con.prepareStatement("SELECT_BY_NO");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				String nomArticle = rs.getString("nom_article").trim();
				String description = rs.getString("descritption").trim();
				Date dateDebut = rs.getDate("date_debut_enchere");
				Date dateFin = rs.getDate("date_fin_enchere");
				int prixInitial  = rs.getInt("prix_initial");
				int prixVente  = rs.getInt("prix_vente");
				int noUtilisateur  = rs.getInt("no_utilisateur");
				int noCategorie  = rs.getInt("no_categorie");
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		}try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultat;
	}

}
