package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import bo.Utilisateur;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;


public class UtilisateurDAOJdbcImpl implements UtilisateurDAO {

	private static final String SELECT_ALL = "SELECT * FROM UTILISATEURS";
	private static final String SELECT_BY_NO = "SELECT * FROM UTILISATEURS WHERE no_utilisateur=? ";
	private static final String SELECT_BY_PSEUDO = "SELECT * FROM UTILISATEURS WHERE pseudo=? ";
	private static final String DELETE = "DELETE FROM UTILISATEUR WHERE no_utilisateur =? ";
	
	public UtilisateurDAOJdbcImpl() {
	}

	@Override
	public Utilisateur selectByNo(int id) throws DALException {
		Utilisateur resultat=null;
		try {
			PreparedStatement ps = JdbcTools.getConnection().prepareStatement("SELECT_BY_NO");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				//int id = rs.getInt("no_utilisateur");
				String pseudo = rs.getString("pseudo").trim();
				String nom = rs.getString("nom").trim();
				String prenom = rs.getString("prenom").trim();
				String email = rs.getString("email").trim();
				String telephone = rs.getString("telephone").trim();
				String rue = rs.getString("rue").trim();
				String codePostal = rs.getString("code_postal").trim();
				String ville = rs.getString("ville").trim();
				String mDP = rs.getString("mot_de_passe").trim();
				int credit = rs.getInt("credit");
				float administrateur = rs.getFloat("administrateur");				
			}					
		} catch (SQLException e) {
			e.printStackTrace();
		}JdbcTools.closeConnection();
		return resultat;
	}

	@Override
	public ArrayList<Utilisateur> selectAll() throws DALException {
		ArrayList<Utilisateur>resultat=new ArrayList<Utilisateur>();
		try {
			PreparedStatement ps = JdbcTools.getConnection().prepareStatement("SELECT_ALL");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("no_utilisateur");
				String pseudo = rs.getString("pseudo").trim();
				String nom = rs.getString("nom").trim();
				String prenom = rs.getString("prenom").trim();
				String email = rs.getString("email").trim();
				String telephone = rs.getString("telephone").trim();
				String rue = rs.getString("rue").trim();
				String codePostal = rs.getString("code_postal").trim();
				String ville = rs.getString("ville").trim();
				String mDP = rs.getString("mot_de_passe").trim();
				int credit = rs.getInt("credit");
				float administrateur = rs.getFloat("administrateur");			
			}		
		} catch (SQLException e) {
			e.printStackTrace();}
		
			JdbcTools.closeConnection();
			return resultat;
			}
		
		
	@Override
	public void update(Utilisateur data) throws DALException {
		
	}


	@Override
	public void delete(int id) throws DALException {
		try {
			PreparedStatement ps = JdbcTools.getConnection().prepareStatement(DELETE);
			ps.setInt(1, id);
			ps.executeUpdate();		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}JdbcTools.closeConnection();
		
	}
}
	