package Modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Libreria {

	private String nombre;	
	private Map<String, Libro> mapaLibros;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Map<String, Libro> getMapaLibros() {
		return mapaLibros;
	}
	public void setMapaLibros(Map<String, Libro> mapaLibros) {
		this.mapaLibros = mapaLibros;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libreria other = (Libreria) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	public void añadirLibro (Libro libro) {
		mapaLibros.put(libro.getISBN(), libro);
	}
	

	//getTasacionCompleta() que no recibe nada y devuelve un BigDecimal con la suma del
	//precio de todos los libros.
	
	public BigDecimal getTasacionCompleta() {
		BigDecimal sumaPrecios = BigDecimal.ZERO;
		Collection<Libro> values =  mapaLibros.values();
		for (Libro value : values) {
			sumaPrecios= sumaPrecios.add(value.getPrecio().setScale(2, RoundingMode.HALF_UP));	
		}
		return sumaPrecios;	
	}
	
	//getPrecioMedio() que devuelva el precio medio del libro
	
	public BigDecimal getPrecioMedio() {
		BigDecimal mediaPrecio = BigDecimal.ZERO;
		BigDecimal contador = BigDecimal.ZERO;
		Collection<Libro> values =  mapaLibros.values();
		for (Libro value : values) {
			mediaPrecio= mediaPrecio.add(value.getPrecio());
			contador = contador.add(BigDecimal.ONE);
		}
		
		mediaPrecio = mediaPrecio.divide(contador).setScale(2, RoundingMode.HALF_UP);
		return mediaPrecio;
	}
	
	//getLibrosBaratos() que devuelva una lista (List) con todos los libros (sean del tipo que
			//sean) que cuesten menos de 10 euros.
	
	public List<Libro> getLibrosBaratos(){
		Collection<Libro> valores =  mapaLibros.values();
		List<Libro> lista = new ArrayList<Libro>(valores);
		for (Libro libro : lista) {
			if (libro.getPrecio().compareTo( new BigDecimal(10)) < 0) {
				lista.add(libro);
			}
		}
		return lista;
	}
}
