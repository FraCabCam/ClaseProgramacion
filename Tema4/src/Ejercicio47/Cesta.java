package Ejercicio47;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



public class Cesta {
	LocalDate fechaCreacion;
	LocalDate fechaActualizacion;
	Cliente cliente;
	HashSet<Articulo> articulos;
	
	
	public Cesta(Cliente cliente) {
		fechaCreacion = LocalDate.now();
		articulos = new HashSet<Articulo>();
		setFechaActualizacion();
		this.cliente = cliente;
	}
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	public LocalDate getFechaActualizacion() {
		return fechaActualizacion;
	}
	private void setFechaActualizacion() {
		this.fechaActualizacion = LocalDate.now();
	}
	public Cliente getCliente() {
		return cliente;
	}
	public HashSet<Articulo> getArticulos() {
		setFechaActualizacion();
		return articulos;
	}
	public Integer getCantidad() {
		Integer cantidad = 0;
		if (articulos.size() > 0 ) {
			cantidad = articulos.size();
			return cantidad;
		}
		return 0;
		
	}
	public BigDecimal getTotal() {
		BigDecimal precioTotal = BigDecimal.ZERO;
		for (Articulo articulo : articulos) {
			precioTotal = precioTotal.add(articulo.getPrecio());
		}
		return precioTotal;
	}
	public BigDecimal getMedia() {
		
		if (articulos.isEmpty()) {
			return BigDecimal.ZERO;
		}
		BigDecimal cantidad = new BigDecimal(getCantidad());
		return getTotal().divide(cantidad,2,RoundingMode.HALF_UP);	
	}
	@Override
	public String toString() {
		return cliente + " Fecha:" + getFechaActualizacion() + " Cantidad de artículos "
				+ getCantidad() + " , precio total: " + getTotal();
	}
	public void addArticulo (Articulo articulo) {
		articulos.add(articulo);
		setFechaActualizacion();
	}
	public void borrarArticulo(Articulo articulo) {
		articulos.remove(articulo);
		setFechaActualizacion();
	}
	public void vaciarCesta() {
		articulos.clear();
	}
}
