package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EnchereENI {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		
		//Charger le JDBC en mémoire
				try {
					try {
						Class.forName(Settings.getProperty("driverdb"));
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}

				String url = Settings.getProperty("url");	
					//Obtenir connexion
					con = DriverManager.getConnection(url, Settings.getProperty("user"), Settings.getProperty("password"));
					
					//Créer un Statement		
					stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("Select pseudo from ENCHERE_ENI ");
					while (rs.next()) {
						System.out.println(rs.getString("pseudo"));
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				}finally  {
					if (stmt!=null) {
						try {
							stmt.close();
						} catch (SQLException e) {
						e.printStackTrace();
						}
					}
					if (con!=null) {
					try {
						con.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
				}

	}

}
