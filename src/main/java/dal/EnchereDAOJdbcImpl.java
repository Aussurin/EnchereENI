package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import bo.Enchere;

public class EnchereDAOJdbcImpl implements EnchereDAO {
	private Connection con;
	private static String URL="jdbc:sqlserver://localhost:1433;databaseName=ENCHERE_ENI";
	private static String USER="sa";
	private static String PSWD="Pa$$w0rd";
	
	private static final String SELECT_ALL = "SELECT * FROM ENCHERES";
	private static final String SELECT_BY_NO = "SELECT * FROM ENCHERES WHERE no_enchere=? ";

	@Override
	public ArrayList<Enchere> selectAll() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enchere selectByNo(int id) throws DALException {
		ArrayList<Enchere>resultat=new ArrayList<Enchere>();
		try {
			con = DriverManager.getConnection(URL, USER, PSWD);
			
			PreparedStatement ps = con.prepareStatement("SELECT_ALL");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int noEnchere = rs.getInt("no_enchere");
				Date dateEnchere = rs.getDate("date_enchere");
				int montantEnchere = rs.getInt("montant_enchere");
				int noArticle = rs.getInt("no_article");
				int noUtilisateur = rs.getInt("no_utilisateur");					
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
	public void update(Enchere data) throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) throws DALException {
		// TODO Auto-generated method stub
		
	}

}
