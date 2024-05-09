package Service;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Modelo.Libro;
import Persistence.Dao;

public class LibreriaService extends Dao {

	public LibreriaService() {
		
	}
	public void insertarLibroNuevo(Libro libro) throws LibroException {
		String sql = "insert into LIBROS values (?,?,?,?)";
		;
		try (Connection conn = abrirConexion(); PreparedStatement stmt = conn.prepareStatement(sql))  {
			stmt.setString(1, libro.getISBN());
			stmt.setString(2, libro.getTitulo());
			stmt.setString(3, libro.getAutor());
			stmt.setBigDecimal(4, libro.getPrecio()); 
			stmt.execute();
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Error al ejerctuar la Base de Datos." + e.getMessage());
		}

	}
	
	public Boolean actualizarPrecioLibroNuevo(Libro libro) throws LibroException  {
		String sql = "update LIBROS set PRECIO = ? where ISBN = ?";
		Boolean existe = false;
		try (Connection conn = abrirConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setBigDecimal(1, libro.getPrecio());
			stmt.setString(2, libro.getISBN());
			Integer cantidad = stmt.executeUpdate();
			if (cantidad == 0) {
				throw new LibroException("No hay ningun libro con ese ISBN");
			}
			else {
				existe = true;
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Error al ejerctuar la Base de Datos." + e.getMessage());
		}
		return existe;
	}
}
