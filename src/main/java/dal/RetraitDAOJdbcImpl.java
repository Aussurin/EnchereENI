package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bo.Retrait;


public class RetraitDAOJdbcImpl implements RetraitDAO {

	private static final String SELECT_ALL = "SELECT * FROM RETRAITS";
	private static final String SELECT_BY_NO = "SELECT * FROM RETRAITS WHERE no_article=? ";
	
	@Override
	public ArrayList<Retrait> selectAll() throws DALException {
		return null;
	}
	
	@Override
	public Retrait selectByNo(int id) throws DALException {
		Retrait resultat = new Retrait();
		try {
			PreparedStatement ps = JdbcTools.getConnection().prepareStatement(SELECT_BY_NO);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				resultat.setRue(rs.getString("rue").trim());
				resultat.setCode_postal(rs.getString("code_postal").trim());
				resultat.setVille(rs.getString("ville").trim());
				resultat.setNoArticle(id);
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		}JdbcTools.closeConnection();
		return resultat;
	}
	
	
	@Override
	public void update(Retrait data) throws DALException {
		
	}

}
