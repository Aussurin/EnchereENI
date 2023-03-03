package dal;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class AppliTestDal {

	//public static void main(String[] args) throws DALException {
	
	private static String URL="jdbc:sqlserver://localhost:1433;databaseName=ENCHERE_ENI";
	private static String USER="sa";
	private static String PSWD="Pa$$w0rd";
	
	private AppliTestDal() {
		
	}
	
	public static Connection getConnection() throws SQLException {
	
		Connection con = null;
		con = DriverManager.getConnection(URL,USER,PSWD);
		return con;
	
	}
}

	
	
	
	
	
	//	String URL="jdbc:sqlserver://localhost:1433;databaseName=ENCHERE_ENI;trustServerCertificate=true";
		
		
	/*	try {
			DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
			con = DriverManager.getConnection(URL, "sa","Pa$$w0rd");
			System.out.println("la connexion est ok");
		} catch (SQLException e) {
			e.printStackTrace();
		}			
	}	
}	
		UtilisateurDAO dao = new UtilisateurDAOJdbcImpl();
			ArrayList<Utilisateur> utilisateur = new ArrayList<>();
			utilisateur = dao.selectAll();
			
		
			if(utilisateur.size()!=0) for (Utilisateur currentUtilisateur : utilisateur) {
			System.out.println(currentUtilisateur);
		}

	}
}
*/

