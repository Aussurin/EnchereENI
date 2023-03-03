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
	private Connection con;
	private static String URL="jdbc:sqlserver://localhost:1433;databaseName=ENCHERE_ENI";
	private static String USER="sa";
	private static String PSWD="Pa$$w0rd";
	
	private static final String SELECT_ALL = "SELECT * FROM UTILISATEURS";
	private static final String SELECT_BY_NO = "SELECT * FROM UTILISATEURS WHERE no_utilisateur=? ";
	private static final String SELECT_BY_PSEUDO = "SELECT * FROM UTILISATEURS WHERE pseudo=? ";
	private static final String DELETE = "DELETE FROM UTILISATEUR WHERE no_utilisateur =? ";
	
	public UtilisateurDAOJdbcImpl() {
			try {
				DriverManager.registerDriver(new SQLServerDriver());
				con = DriverManager.getConnection(URL, "sa","Pa$$w0rd");
			} catch (SQLException e) {
				e.printStackTrace();
			}			
	}
	

	@Override
	public Utilisateur selectByNo(int id) throws DALException {
		Utilisateur resultat=null;
		try {
			con = DriverManager.getConnection(URL, USER, PSWD);
			
			PreparedStatement ps = con.prepareStatement("SELECT_BY_NO");
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
		}try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultat;
	}

	@Override
	public ArrayList<Utilisateur> selectAll() throws DALException {
		ArrayList<Utilisateur>resultat=new ArrayList<Utilisateur>();
		try {
			con = DriverManager.getConnection(URL, USER, PSWD);
			
			PreparedStatement ps = con.prepareStatement("SELECT_ALL");
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
		
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}return resultat;
		}
		
	@Override
	public void update(Utilisateur data) throws DALException {
		try {
			con = DriverManager.getConnection(URL, USER, PSWD);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	@Override
	public void delete(int id) throws DALException {
		try {
			con = DriverManager.getConnection(URL, USER, PSWD);
			PreparedStatement ps = con.prepareStatement(DELETE);
			ps.setInt(1, id);
			ps.executeUpdate();		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
	