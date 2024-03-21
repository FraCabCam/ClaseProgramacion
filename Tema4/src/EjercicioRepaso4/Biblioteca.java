package EjercicioRepaso4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import EjercicioRepaso3.Libros;

public  class Biblioteca {
	public List<Articulo> listaBiblioteca;
	
	public Biblioteca() {
		listaBiblioteca = new ArrayList<Articulo>();
	}
	public void añadirArticulo(Articulo articulo) {
		listaBiblioteca.add(articulo);
	}
	@Override
	public String toString() {
		return "" +listaBiblioteca;
	}
	

	
}
