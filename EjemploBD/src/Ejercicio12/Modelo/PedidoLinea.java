package Ejercicio12.Modelo;

import java.math.BigDecimal;

public class PedidoLinea {
	private Integer numPedido;
	private String articulo;
	private Integer cantidad;
	private BigDecimal precioUnitario;

	public Integer getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(Integer numPedido) {
		this.numPedido = numPedido;
	}

	public String getArticulo() {
		return articulo;
	}

	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public PedidoLinea() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "" + numPedido + ", Artículo: " + articulo + ", Cantidad: " + cantidad
				+ ", Precio por Unidad: " + precioUnitario;
	}
	

}
