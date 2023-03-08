package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import bo.Enchere;
import bo.Utilisateur;

public class EnchereDAOJdbcImpl implements EnchereDAO {

	private static final String SELECT_BY_UTILISATEUR = "SELECT * FROM ENCHERES WHERE no_utilisateur = ?";
	private static final String SELECT_BY_NO = "SELECT * FROM ENCHERES WHERE no_enchere=? ";

	@Override
	public ArrayList<Enchere> selectAll() throws DALException {
		return null;
	}

	@Override
	public ArrayList<Enchere> selectByUtilisateur(Utilisateur user) throws DALException {
		ArrayList<Enchere>resultat=new ArrayList<Enchere>();
		try {
			PreparedStatement ps = JdbcTools.getConnection().prepareStatement(SELECT_BY_UTILISATEUR);
			ps.setInt(1, user.getNoUtilisateur());
			ResultSet rs = ps.executeQuery();
			Enchere enc = new Enchere();
			while(rs.next()) {
				enc = null;
				enc.setDateEnchere(rs.getDate("date_enchere"));
				int montantEnchere = rs.getInt("montant_enchere");
				int noArticle = rs.getInt("no_article");
				int noUtilisateur = rs.getInt("no_utilisateur");					
			}			
			
		} catch (SQLException e) {
			e.printStackTrace();}
		
		JdbcTools.closeConnection();return resultat;
	}

	@Override
	public void update(Enchere data) throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Enchere> selectByNo(int id) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

}
