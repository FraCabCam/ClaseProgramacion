package Ejercicio01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import persistence.Dao;
import persistence.Gato;

public class PersonaService extends Dao {

	public Persona consultarPersona(String dni) throws PersonaException {
		Persona persona = new Persona();
		String query = "select * from personas where dni = ? ";
		try (Connection conn = abrirConexion(); PreparedStatement stmt = conn.prepareStatement(query)) {
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				// existe la persona con ese DNI
				persona.setDni(rs.getString("DNI"));
				persona.setNombre(rs.getString("NOMBRE"));
				persona.setApellidos(rs.getString("APELLIDOS"));
				persona.setFechaNacimiento(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
			} else {
				throw new PersonaException("No existe la persona con ese DNI indicado.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new PersonaException("Error al ejecutar la BBDD.");

		}
		return persona;

	}

	public List<Persona> buscarPersonas(String filtro) throws PersonaException {
		String sql = "select * from personas where lower(nombre) like lower(?) or lower(apellidos) like lower(?)";
		List<Persona> personas = new ArrayList<Persona>();
		try (Connection conn = abrirConexion()) {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "%" + filtro + "%");
			stmt.setString(2, "%" + filtro + "%");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Persona persona = new Persona();
				persona.setDni(rs.getString("DNI"));
				persona.setNombre(rs.getString("NOMBRE"));
				persona.setApellidos(rs.getString("APELLIDOS"));
				persona.setFechaNacimiento(rs.getDate("FECHA_NACIMIENTO").toLocalDate());
				personas.add(persona);

			}
			if (personas.isEmpty()) {
				throw new PersonaException("No hay personas con los datos introducidos");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new PersonaException("Error al ejecutar la BBDD.");

		}
		return personas;

	}

	public void insertarVariasPersonas(List<Persona> personas) {
		try (Connection conn = abrirConexion()) {
			conn.setAutoCommit(false); // desactivo que el execute haga commit automático
			try {
				for (Persona persona : personas) {
					extractedInsertar(persona, conn);
				}
				conn.commit();// cuando termina el bucle hago el commit
			} catch (SQLException e) {
				conn.rollback();
				throw e;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Error al ejerctuar la Base de Datos." + e.getMessage());
		}
	}

	public void insertarPersonas(Persona persona) {
		try (Connection conn = abrirConexion()) {
			extractedInsertar(persona, conn);

		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Error al ejerctuar la Base de Datos." + e.getMessage());
		}

	}

	private void extractedInsertar(Persona persona, Connection conn) throws SQLException {
		String sql = "insert into personas values (?,?,?,?)";
		// he extraido con refactor, extract method
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, persona.getDni());
			stmt.setString(2, persona.getNombre());
			stmt.setString(3, persona.getApellidos());
			stmt.setDate(4, Date.valueOf(persona.getFechaNacimiento())); // de date a local date
			stmt.execute();
		}

	}

	public void actualizarPersonas(Persona persona) throws PersonaException {

		String sql = "update personas set nombre = ?, apellidos = ?, fecha_nacimiento = ? where dni = ?";
		try (Connection conn = abrirConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			// esto es si la query es como la primera y en el execute query pasamos el sql
			stmt.setString(1, persona.getNombre());
			stmt.setString(2, persona.getApellidos());
			stmt.setDate(3, Date.valueOf(persona.getFechaNacimiento())); // de date a local date
			stmt.setString(4, persona.getDni());
			Integer cantidad = stmt.executeUpdate();
			if (cantidad == 0) {
				throw new PersonaException("No hay ninguna persona con ese DNI");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Error al ejerctuar la Base de Datos." + e.getMessage());
		}

	}

	public void borrarPersonas(String dni) throws PersonaException {
		try (Connection conn = abrirConexion()) {
			extractedBorrar(dni, conn);
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Error al ejerctuar la Base de Datos." + e.getMessage());
		}

	}

	private void extractedBorrar(String dni, Connection conn) throws SQLException, PersonaException {
		String sql = "delete from  personas where dni = ?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, dni);
			Integer cantidad = stmt.executeUpdate();
			if (cantidad == 0) {
				throw new PersonaException("No hay ninguna persona con ese DNI");
			}
		}
		
	}

	public Integer borrarPersonasA() throws ErrorException, PersonaException {
		List<Persona> listaPersona = buscarPersonas("");
		Integer cantidad = 0;
		try (Connection conn = abrirConexion();) {
			 conn.setAutoCommit(false);
			 cantidad = (int) listaPersona.stream().filter(p -> p.isMayorEdad(p)).count();
			try {
				for (Persona persona : listaPersona) {
					if (persona.isMayorEdad(persona)) {
						extractedBorrar(persona.getDni(), conn);
					}
				}
				conn.commit();
			}catch (SQLException e) {
				conn.rollback();
				throw e;
			}		
		}catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Error al ejerctuar la Base de Datos." + e.getMessage());
		}
		
		return cantidad;
	}

	public Integer borrarPersonasB() throws PersonaException {
		String sql = "delete from personas where fecha_nacimiento <= ?";
		Integer cantidad = 0;
		try (Connection conn = abrirConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
					stmt.setDate(1, Date.valueOf(LocalDate.now().minusYears(18)));
					cantidad = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Error al ejerctuar la Base de Datos." + e.getMessage());
		}
		return cantidad;
	}

}
