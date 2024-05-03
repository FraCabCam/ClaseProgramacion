package Ejercicio12.Service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Ejercicio01.PersonaException;
import Ejercicio12.Modelo.Pedido;
import Ejercicio12.Modelo.PedidoLinea;
import persistence.Dao;

public class PedidosService extends Dao {

	public PedidosService() {

	}

	public List<PedidoLinea> consultarLineasPedido(Integer numeroPedido) throws PedidoException, NotFoundException {
		List<PedidoLinea> listaPedido = new ArrayList<PedidoLinea>();
		String sql = "select * from PEDIDOS_LINEAS where numero_pedido = ?";
		try (Connection conn = abrirConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, numeroPedido);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				PedidoLinea linea1 = new PedidoLinea();
				linea1.setNumPedido(rs.getInt("NUMERO_PEDIDO"));
				linea1.setArticulo(rs.getString("ARTICULO"));
				linea1.setCantidad(rs.getInt("CANTIDAD"));
				linea1.setPrecioUnitario(rs.getBigDecimal("PRECIO_UNITARIO"));
				listaPedido.add(linea1);
			}
			if (listaPedido.isEmpty()) {
				throw new NotFoundException("No hay pedidos con el número de pedido indicado");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new PedidoException("Error al ejecutar la BBDD.");
		}
		return listaPedido;

	}

	public Pedido consultarPedidoCompleto(Integer numero) throws PedidoException, NotFoundException {
		Pedido pedido1 = new Pedido();
		String sql = "select * from PEDIDOS where numero = ?";
		try (Connection conn = abrirConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, numero);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				// existe la persona con ese DNI
				pedido1.setNumero(rs.getInt("NUMERO"));
				pedido1.setCliente(rs.getString("CLIENTE"));
				pedido1.setFechaEntrega(rs.getDate("FECHA_ENTREGA").toLocalDate());
				pedido1.setListaPedido(consultarLineasPedido(numero));
			} else {
				throw new NotFoundException("No existe el pedido con el numero de pedido indicado.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Error al ejerctuar la Base de Datos." + e.getMessage());
		}
		pedido1.calcularTotales();
		return pedido1;
	}

	public void insertarLineaPedido(PedidoLinea pedidoLinea, Connection conn) throws SQLException {
		String sql = "insert into PEDIDOS_LINEAS values (?,?,?,?)";
		;
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, pedidoLinea.getNumPedido());
			stmt.setString(2, pedidoLinea.getArticulo());
			stmt.setInt(3, pedidoLinea.getCantidad());
			stmt.setBigDecimal(4, pedidoLinea.getPrecioUnitario()); // de date a local date
			stmt.execute();
		}

	}

	public void crearPedidoCompleto(Pedido pedido) throws PedidoException {
		String sql = "insert into PEDIDOS values (?,?,?)";
		try (Connection conn = abrirConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			try {
				conn.setAutoCommit(false);
				stmt.setInt(1, pedido.getNumero());
				stmt.setString(2, pedido.getCliente());
				stmt.setDate(3, Date.valueOf(pedido.getFechaEntrega()));
				stmt.execute();
				for (PedidoLinea pedidoLinea : pedido.getListaPedido()) {
					insertarLineaPedido(pedidoLinea, conn);
				}
				conn.commit();
			} catch (SQLException e) {
				conn.rollback();
				throw e;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new PedidoException("Error al ejecutar la BBDD.");
		}
	}

	public void cambiarFecha(Integer numero, LocalDate fechaEntrega) throws NotFoundException {
		String sql = "update PEDIDOS set FECHA_ENTREGA = ? where NUMERO = ?";
		try (Connection conn = abrirConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setDate(1, Date.valueOf(fechaEntrega));
			stmt.setInt(2, numero);
			Integer cantidad = stmt.executeUpdate();
			if (cantidad == 0) {
				throw new NotFoundException("No hay ningun pedido con ese número");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Error al ejerctuar la Base de Datos." + e.getMessage());
		}

	}

	public void borrarPedido(Integer numero) throws NotFoundException {
		String sql = "delete from PEDIDOS_LINEAS where NUMERO_PEDIDO = ?";
		try (Connection conn = abrirConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, numero);
			stmt.execute();
			try {
				String sql2 = "delete from  PEDIDOS where NUMERO = ?";
				try (PreparedStatement stmt2 = conn.prepareStatement(sql2)) {
					stmt.setInt(1, numero);
					Integer cantidad = stmt.executeUpdate();
					if (cantidad == 0) {
						throw new NotFoundException("No hay ningun pedido con ese número");
					}
					conn.commit();
				}
			} catch (SQLException e) {
				conn.rollback();
				throw e;
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Error al ejerctuar la Base de Datos." + e.getMessage());
		}

	}

	public List<Pedido> buscarCliente(String nombreCliente) throws NotFoundException, PedidoException {
		String sql = "select * from PEDIDOS where lower(cliente) = lower(?)";
		List<Pedido> listaPedidos = new ArrayList<Pedido>();
		try (Connection conn = abrirConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, nombreCliente);
			listaPedidos = extractedBuscar(stmt);

		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Error al ejerctuar la Base de Datos." + e.getMessage());
		}
		return listaPedidos;
	}

	public List<Pedido> buscarFecha(LocalDate fechaEntrega) throws NotFoundException, PedidoException {
		Pedido pedido1 = new Pedido();
		List<Pedido> listaPedidos = new ArrayList<Pedido>();
		String sql = "select * from PEDIDOS where FECHA_ENTREGA = ?";
		try (Connection conn = abrirConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setDate(1, Date.valueOf(fechaEntrega));
			listaPedidos = extractedBuscar(stmt);
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Error al ejerctuar la Base de Datos." + e.getMessage());
		}
		return listaPedidos;
	}

	private List<Pedido> extractedBuscar(PreparedStatement stmt) throws NotFoundException, PedidoException {
		List<Pedido> listaPedidos = new ArrayList<Pedido>();
		try {
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Pedido pedido1 = new Pedido();
				pedido1.setNumero(rs.getInt("NUMERO"));
				pedido1.setCliente(rs.getString("CLIENTE"));
				pedido1.setFechaEntrega(rs.getDate("FECHA_ENTREGA").toLocalDate());
				listaPedidos.add(pedido1);
			} if (listaPedidos.isEmpty()) {
				throw new NotFoundException("No hay ningún pedido con esos datos.");
			} 
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Error al ejerctuar la Base de Datos." + e.getMessage());
		}
		return listaPedidos;
		
		

	}
}
