package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GatoDao extends Dao {

	public List<Gato> consultarGatos(Integer edadMinima, String inicial) {
		List<Gato> gatitos = new ArrayList<Gato>();
		// String sql = "select * from gatos where edad > " + edadMinima + " and nombre
		// like '" + inicial + "%'";
		String sql = "select * from gatos where edad >  ?  and nombre like ?";
		try (Connection conn = abrirConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			// esto es si la query es como la primera y en el execute query pasamos el sql
			// Statement stmt = conn.createStatement()){
			stmt.setInt(1, edadMinima); // Al primer valor le paso la edadMinima
			stmt.setString(2, inicial + "%"); // al segundo valor le paso la inicial
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Gato gato = new Gato();
				gato.setCodigo(rs.getString("CODIGO"));
				gato.setNombre(rs.getString("NOMBRE"));
				gato.setRaza(rs.getString("RAZA"));
				gato.setEdad(rs.getInt("EDAD"));
				gatitos.add(gato);
			}
		} catch (SQLException e) {
			System.err.println("Error al ejerctuar la Base de Datos." + e.getMessage());
		}
		return gatitos;
	}

	public void insertarGatos(Gato gato) {

		String sql = "insert inro gatos values (?,?,?,?)";
		try (Connection conn = abrirConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			// esto es si la query es como la primera y en el execute query pasamos el sql
			stmt.setString(1, gato.getCodigo());
			stmt.setString(2, gato.getNombre());
			stmt.setString(3, gato.getRaza());
			stmt.setInt(4, gato.getEdad());
			stmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Error al ejerctuar la Base de Datos." + e.getMessage());
		}

	}

}
