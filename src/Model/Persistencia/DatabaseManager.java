package Model.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {

	private static Connection databaseConnection;
	
	private static String CONNECTION_STRING = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String USUARIO = "JAVA";
	private static String CLAVE = "JAVA";
	private static String DRIVER = "oracle.jdbc.driver.OracleDriver";
	
	static {
		databaseConnection = null;
		
		try {
			Class.forName(DRIVER);
			System.out.println("Se encontró el driver Oracle para la conexión.");
			
			try {
				databaseConnection = DriverManager.getConnection(CONNECTION_STRING, USUARIO, CLAVE);
				System.out.println("Se estableció la conexión a la base con éxito.");
			} catch (SQLException e) {
				System.out.println("No se pudo establecer la conexión a la base de datos:");
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("No se encontró el Driver para conectarse a la base de datos:");
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return databaseConnection;
	}
	
}
