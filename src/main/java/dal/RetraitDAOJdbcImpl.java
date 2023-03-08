package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bo.Retrait;


public class RetraitDAOJdbcImpl implements RetraitDAO {

	private static final String SELECT_BY_NO = "SELECT * FROM RETRAITS WHERE no_article=?";
	private static final String INSERT = "INSERT INTO RETRAITS (rue,code_postal,ville,no_article) VALUES (?,?,?,?)";
	
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
	public void insert(Retrait data) throws DALException {
		PreparedStatement ps;
		try {
			ps = JdbcTools.getConnection().prepareStatement(INSERT);
		
		ps.setString(1, data.getRue());
		ps.setString(2, data.getCode_postal());
		ps.setString(3, data.getVille());
		ps.setInt(4, data.getNoArticle());
		ps.executeQuery();
		
		}catch (Exception e) {
			e = new DALException("Erreur lors de l'enregistrement dans la base de données");
		}
	}

	@Override
	public void update(Retrait data) throws DALException {
		// TODO Auto-generated method stub
		
	}

}
