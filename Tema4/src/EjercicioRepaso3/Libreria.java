package EjercicioRepaso3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Libreria {
	public List<Libros> listaLibros;
	public String direccion;
	public Integer telefono;

	public Libreria(String direccion, Integer telefono) {
		listaLibros = new ArrayList<Libros>();
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public Libros obtenerLibroMasAntiguo() {
		Libros libroAntiguo = null;
		for (Libros libro : listaLibros) {
			if (libroAntiguo == null){
				libroAntiguo = libro;
			}
			else if (libro.getFechaEdicion().isBefore(libroAntiguo.getFechaEdicion()) ) {
				libroAntiguo = libro;
			}	
		}
		return libroAntiguo;
	}

	public BigDecimal obtenerPesoTotalDeLibros() {
		BigDecimal pesoTotal = BigDecimal.ZERO;
		for (Libros libros : listaLibros) {
			pesoTotal = pesoTotal.add(libros.getPeso());
		}
		return pesoTotal;
	}

	public Integer obtenerNumPaginasMedio() {
		Integer mediaPag;
		Integer totalPag = 0;
		for (Libros libros : listaLibros) {
			totalPag = totalPag + libros.getNumPag();
		}
		mediaPag = (totalPag / listaLibros.size());
		return mediaPag;
	}

	public void añadirLibro(Libros libro) {
		listaLibros.add(libro);
	}

	@Override
	public String toString() {
		return "Libreria  " + listaLibros + ", " + direccion + ",  " + telefono;
	}
	
}
