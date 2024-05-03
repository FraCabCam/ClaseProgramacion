package Ejercicio12.Modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import Ejercicio01.DatosIncompletosException;
import Ejercicio12.Service.PedidosService;

public class Pedido {
	private Integer numero;
	private String cliente;
	private LocalDate fechaEntrega;
	private List<PedidoLinea> listaPedido;
	private BigDecimal subtotal;
	private BigDecimal iva;
	private BigDecimal total;
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public LocalDate getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(LocalDate fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public List<PedidoLinea> getListaPedido() {
		return listaPedido;
	}
	public void setListaPedido(List<PedidoLinea> listaPedido) {
		this.listaPedido = listaPedido;
	}
	public Pedido() {
		// TODO Auto-generated constructor stub
	}
	public void validar() throws DatosIncompletosException {
		PedidosService p1 = new PedidosService();
		if (numero == null) {
			throw new  DatosIncompletosException("El Numero no puede ser vacío.");
			}
			if ( cliente == null || cliente.isBlank()) {
				throw new DatosIncompletosException("El cliente no puede ser vacío");
			}	
			if ( fechaEntrega == null ) {
				throw new DatosIncompletosException("La fecha de entrega no puede ser vacía");
			}
			if ( numero > 999 || cliente.length() > 50) {
				throw new DatosIncompletosException("Los valores indicados superan el tamaño máximo");
			}	
		
	}
	public void calcularTotales() {
		Pedido p1 = new Pedido();
		subtotal = BigDecimal.ZERO;
		for (PedidoLinea pedidoLinea : listaPedido) {
			 BigDecimal totalLinea = pedidoLinea.getPrecioUnitario().multiply(new BigDecimal(pedidoLinea.getCantidad()));
			 
			subtotal = subtotal.add(totalLinea).setScale(2,RoundingMode.HALF_UP);
		}
		iva = subtotal.multiply( new BigDecimal(0.21)).setScale(2,RoundingMode.HALF_UP);
		total = subtotal.add(iva).setScale(2, RoundingMode.HALF_UP);
		
	}
	
	@Override
	public String toString() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		if (listaPedido == null) {
			return "\nPedido numero: " + numero + " ,Cliente: " + cliente + ", Fecha de Entrega: " + fechaEntrega.format(format);
		}
		return "Pedido numero: " + numero + " Cliente: " + cliente + ", Fecha de Entrega: " + fechaEntrega.format(format) + "\n Pedido solicitado: "
				+ listaPedido + "\n Subtotal: " + subtotal + ", IVA: " + iva + ", Precio Total: " + total;
	}
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	public BigDecimal getIva() {
		return iva;
	}
	public BigDecimal getTotal() {
		return total;
	}

}
