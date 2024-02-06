package Ejercicio47;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cesta {
	LocalDate fechaCreacion;
	LocalDate fechaActualizacion;
	Cliente cliente;
	List<Articulo> articulos;
	
	
	public Cesta(Cliente cliente) {
		fechaCreacion = LocalDate.now();
		articulos = new ArrayList<Articulo>();
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
	public List<Articulo> getArticulos() {
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
	public Integer getTotal() {
		Integer precioTotal = 0;
		for (int i = 0; i < articulos.size(); i++) {
			precioTotal += articulos.get(i).getPrecio();
		}
		return precioTotal;	
	}
	public Integer getMedia() {
		Integer precioMedia = 0;
		Integer precioTotal = 0;
		if (articulos.isEmpty()) {
			return 0;
		}
		for (int i = 0; i < articulos.size(); i++) {
			precioTotal += articulos.get(i).getPrecio();	
		}
		precioMedia = (precioTotal/(articulos.size()));
		return precioMedia;	
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
	public void borrarArticulo(int articulo) {
		articulos.remove(articulo);
		setFechaActualizacion();
	}
	public void vaciarCesta() {
		articulos.clear();
	}
}
