package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bo.Retrait;


public class RetraitDAOJdbcImpl implements RetraitDAO {
	private Connection con;
	private static String URL="jdbc:sqlserver://localhost:1433;databaseName=ENCHERE_ENI";
	private static String USER="sa";
	private static String PSWD="Pa$$w0rd";
	
	private static final String SELECT_ALL = "SELECT * FROM RETRAITS";
	private static final String SELECT_BY_NO = "SELECT * FROM RETRAITS WHERE no_article=? ";
	
	@Override
	public ArrayList<Retrait> selectAll() throws DALException {
		ArrayList<Retrait>resultat=new ArrayList<Retrait>();
		try {
			con = DriverManager.getConnection(URL, USER, PSWD);
			
			PreparedStatement ps = con.prepareStatement("SELECT_ALL");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("no_article");
				String rue = rs.getString("rue").trim();
				String codePostal = rs.getString("code_postal").trim();
				String ville = rs.getString("ville").trim();		
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
	public Retrait selectByNo(int id) throws DALException {
		Retrait resultat=null;
		try {
			con = DriverManager.getConnection(URL, USER, PSWD);
			
			PreparedStatement ps = con.prepareStatement("SELECT_BY_NO");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				String rue = rs.getString("rue").trim();
				String codePostal = rs.getString("code_postal").trim();
				String ville = rs.getString("ville").trim();
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
	
	
	@Override
	public void update(Retrait data) throws DALException {
		// TODO Auto-generated method stub
		
	}

}
