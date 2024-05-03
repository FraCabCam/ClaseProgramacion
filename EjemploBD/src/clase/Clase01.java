package clase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import persistence.Gato;
import persistence.GatoDao;

public class Clase01 extends GatoDao{

	public Clase01() {
		// TODO Auto-generated constructor stub
	}
	/** Hacer varios insert simultáneos**/
	public void insertarGatos(List<Gato> gatos) {

		String sql = "insert into gatos values (?,?,?,?)";
		try (Connection conn = abrirConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			conn.setAutoCommit(false); //desactivo que el execute haga commit automático
			try {
				for (Gato gato : gatos) {
					stmt.setString(1, gato.getCodigo());
					stmt.setString(2, gato.getNombre());
					stmt.setString(3, gato.getRaza());
					stmt.setInt(4, gato.getEdad());
					stmt.execute();
				}
				conn.commit();//cuando termina el bucle hago el commit
			}catch (SQLException e) {
				conn.rollback();//si algo va mal hacemos rollback
			}
		

		} catch (SQLException e) {
			
			e.printStackTrace();
			System.err.println("Error al ejerctuar la Base de Datos." + e.getMessage());
		}

	}

}
