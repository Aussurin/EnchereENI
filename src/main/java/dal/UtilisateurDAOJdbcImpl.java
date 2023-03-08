package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import bo.Utilisateur;

public class UtilisateurDAOJdbcImpl implements UtilisateurDAO {

	private static final String SELECT_ALL = "SELECT * FROM UTILISATEURS";
	private static final String SELECT_BY_NO = "SELECT * FROM UTILISATEURS WHERE no_utilisateur= ?";
	private static final String SELECT_BY_PSEUDO = "SELECT * FROM UTILISATEURS WHERE pseudo= ?";
	private static final String DELETE = "DELETE FROM UTILISATEUR WHERE no_utilisateur = ?";
	private static final String CONNECTION = "SELECT * FROM UTILISATEUR WHERE pseudo = ? AND mot_de_passe = ?";
	private static final String ENREGISTREMENT = "INSERT INTO UTILISATEUR (pseudo,nom,prenom,email,telephone,rue,code_postal,ville,mot_de_passe,credit) VALUES (?,?,?,?,?,?,?,?,?,?)";
	private static final String MODIFICATION = "UPDATE table UTILISATEUR SET pseudo = ?, nom = ?, prenom = ?, email = ?, telephone = ?, rue = ?, code_postal = ?, ville = ?, mot_de_passe = ?, credit = ? WHERE no_utilisateur = ?";
	
	
	public UtilisateurDAOJdbcImpl() {
	}	
	
	@Override	
	public Utilisateur selectByNo(int id) throws DALException {
		Utilisateur user = new Utilisateur();
		try {
			PreparedStatement ps = JdbcTools.getConnection().prepareStatement(SELECT_BY_NO);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				user.setNom(rs.getString("nom").trim());
				user.setPrenom(rs.getString("prenom").trim());
				user.setEmail(rs.getString("email").trim());
				user.setAdministrateur(rs.getBoolean("administrateur"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		JdbcTools.closeConnection();
		return user;
	}
	
	@Override
	public Utilisateur selectConnection(String pseudo, String mdp) throws DALException {
		Utilisateur resultat = null;
		try {
			PreparedStatement ps = JdbcTools.getConnection().prepareStatement(CONNECTION);
			ps.setString(1, pseudo);
			ps.setString(1, mdp);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				resultat.setNoUtilisateur(rs.getInt("no_utilisateur"));
				resultat.setNom(rs.getString("nom").trim());
				resultat.setPrenom(rs.getString("prenom").trim());
				resultat.setEmail(rs.getString("email").trim());
				resultat.setTelephone(rs.getString("telephone").trim());
				resultat.setRue(rs.getString("rue").trim());
				resultat.setCodePostal(rs.getString("code_postal").trim());
				resultat.setVille(rs.getString("ville").trim());
				resultat.setCredit(rs.getInt("credit"));
				resultat.setAdministrateur(rs.getBoolean("administrateur"));
			} else {
				DALException e = new DALException("Pseudo ou mot de passe incorrecte");
				throw e;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		JdbcTools.closeConnection();
		return resultat;
	}
	
	@Override
	public ArrayList<Utilisateur> selectAll() throws DALException {
		ArrayList<Utilisateur> resultat = new ArrayList<Utilisateur>();
		try {
			PreparedStatement ps = JdbcTools.getConnection().prepareStatement(SELECT_ALL);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				Utilisateur user = new Utilisateur();
				user.setNom(rs.getString("nom").trim());
				user.setPrenom(rs.getString("prenom").trim());
				user.setEmail(rs.getString("email").trim());
				user.setTelephone(rs.getString("telephone").trim());
				user.setRue(rs.getString("rue").trim());
				user.setCodePostal(rs.getString("code_postal").trim());
				user.setVille(rs.getString("ville").trim());
				user.setCredit(rs.getInt("credit"));
				user.setAdministrateur(rs.getBoolean("administrateur"));
				
				resultat.add(user);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		JdbcTools.closeConnection();
		return resultat;
	}

	@Override
	public void update(Utilisateur user) throws DALException {
		try {
			PreparedStatement ps = JdbcTools.getConnection().prepareStatement(MODIFICATION);
			ps.setString(1, user.getPseudo());
			ps.setString(2, user.getNom());
			ps.setString(3, user.getPrenom());
			ps.setString(4, user.getEmail());
			if(!user.getTelephone().isEmpty()) {
				ps.setString(5, user.getTelephone());
			}else {
				ps.setString(5, null);
			}
			ps.setString(6, user.getRue());
			ps.setString(7, user.getCodePostal());
			ps.setString(8, user.getVille());
			ps.setString(9, user.getMotDePasse());
			ps.setInt(10, user.getCredit());
			ps.setInt(11, user.getNoUtilisateur());
			
			ps.executeQuery();			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return;
	}

	@Override
	public void delete(int id) throws DALException {
		try {
			PreparedStatement ps = JdbcTools.getConnection().prepareStatement(DELETE);
			ps.setInt(1, id);
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		JdbcTools.closeConnection();

	}
	
	@Override
	public Utilisateur insert(Utilisateur user) throws DALException {
				try {
			PreparedStatement ps = JdbcTools.getConnection().prepareStatement(ENREGISTREMENT);
			ps.setString(1, user.getPseudo());
			ps.setString(2, user.getNom());
			ps.setString(3, user.getPrenom());
			ps.setString(4, user.getEmail());			
			if(!user.getTelephone().isEmpty()) {
				ps.setString(5, user.getTelephone());
			}else {
				ps.setString(5, null);
			}			
			ps.setString(6, user.getRue());
			ps.setString(7, user.getCodePostal());
			ps.setString(8, user.getVille());
			ps.setString(9, user.getMotDePasse());
			
			ResultSet rs = ps.executeQuery();			
			 if(rs.next())
		        {
		            user.setNoUtilisateur(rs.getInt(1));
		        }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return user;
	}

	public int selectByPseudo(String pseudo) throws DALException {
		int resultat = 0;
		try {
			PreparedStatement ps = JdbcTools.getConnection().prepareStatement(SELECT_BY_PSEUDO);
			ps.setString(1, pseudo);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				resultat = rs.getInt("no_utilisateur");				
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		JdbcTools.closeConnection();
		return resultat;
	}
	
	public int selectByEmail(String email) throws DALException {
		int resultat = 0;
		try {
			PreparedStatement ps = JdbcTools.getConnection().prepareStatement(SELECT_BY_PSEUDO);
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				String email2 = rs.getString("email");	
				if (!email2.isEmpty()) {
					resultat = 1;
				}
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		JdbcTools.closeConnection();
		return resultat;
	}
}
