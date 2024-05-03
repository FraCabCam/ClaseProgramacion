package persistence;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {

	public void testConexion() {
		Connection conn = abrirConexion();
		System.out.println("Esta es mi conexión: " + conn);
		if (conn != null) {
			System.out.println("Está todo gucci");
		} else {
			System.out.println("Esto no rula...");
		}
	}

	protected Connection abrirConexion() {
		String urlConexion = "jdbc:oracle:thin:@//localhost:1521/xe";
		String oracleDriver = "oracle.jdbc.driver.OracleDriver";
		String usuario = "programacion";
		String password = "abel";

		try {

			Class.forName(oracleDriver);

			Connection conn = DriverManager.getConnection(urlConexion, usuario, password);
			return conn;
		} catch (Exception e) {
			System.err.println("No he podido abrir la conexión. " + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("No puedo conectarme ala Base de Datos");
		}
		
	}

}
