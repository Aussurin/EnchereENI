package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import bo.Retrait;

public class RetraitDAOJdbcImpl implements RetraitDAO {

	private static final String SELECT_BY_NO = "SELECT * FROM RETRAITS WHERE no_article=?";
	private static final String INSERT = "INSERT INTO RETRAITS (rue,code_postal,ville,no_article) VALUES (?,?,?,?)";
	private static final String DELETE = "DELETE FROM RETRAITS WHERE no_article = ?";
	private static final String UPDATE = "UPDATE RETRAITS SET rue = ?, code_postal =?, ville=? WHERE no_article = ?";

	@Override
	public Retrait selectByNo(int id) throws DALException {
		Retrait resultat = new Retrait();
		try {
			PreparedStatement ps = JdbcTools.getConnection().prepareStatement(SELECT_BY_NO);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				resultat.setRue(rs.getString("rue").trim());
				resultat.setCode_postal(rs.getString("code_postal").trim());
				resultat.setVille(rs.getString("ville").trim());
				resultat.setNoArticle(id);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		JdbcTools.closeConnection();
		return resultat;
	}

	@Override
	public void insert(Retrait data) throws DALException {
		try {
			PreparedStatement ps = JdbcTools.getConnection().prepareStatement(INSERT);

			ps.setString(1, data.getRue());
			ps.setString(2, data.getCode_postal());
			ps.setString(3, data.getVille());
			ps.setInt(4, data.getNoArticle());
			ps.executeQuery();

		} catch (Exception e) {
			e = new DALException("Erreur lors de l'enregistrement dans la base de données");
		}
	}

	@Override
	public void update(Retrait retrait) throws DALException {
		try {
			PreparedStatement ps = JdbcTools.getConnection().prepareStatement(UPDATE);
			ps.setString(1, retrait.getRue());
			ps.setString(2, retrait.getCode_postal());
			ps.setString(3, retrait.getVille());
			ps.setInt(4, retrait.getNoArticle());
			ps.executeQuery();
		} catch (Exception e) {
			e = new DALException("Erreur lors de la modification du point de retrait.");
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Retrait data) throws DALException {
		try {
			PreparedStatement ps = JdbcTools.getConnection().prepareStatement(DELETE);
			ps.setInt(1, data.getNoArticle());
		} catch (Exception e) {
			e = new DALException("Erreur lors de la suppression du point de retrait.");
			e.printStackTrace();
		}
	}

	@Override
	public Retrait selectByLibelle(String libelle) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}
}
