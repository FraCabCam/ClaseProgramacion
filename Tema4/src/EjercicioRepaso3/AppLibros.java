package EjercicioRepaso3;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AppLibros {
	public static void main(String[] args) {
		Libreria libreria1 = new Libreria("Avda. de los sueños perdidos, 89",954696954);
		LibroFisico librofisico1 = new LibroFisico(20,15,new BigDecimal(200.25));
		librofisico1.setAutor("Cristian Frieros");
		librofisico1.setFechaEdicion(LocalDate.of(2005, 10, 22));
		librofisico1.setNumPag(669);
		librofisico1.setTitulo("Soy un abuelo, pero mira como la tengo pa la edad que tengo");
		LibroFisico librofisico2 = new LibroFisico(40,25,new BigDecimal(425.25));
		librofisico2.setAutor("Fernando Alonso");
		librofisico2.setFechaEdicion(LocalDate.of(2024, 11, 22));
		librofisico2.setNumPag(333);
		librofisico2.setTitulo("Como gané la 33");
		LibroDigital libroDigital1 = new LibroDigital ();
		libroDigital1.setAutor("Rafael Madrigal Toscano");
		libroDigital1.setFechaEdicion(LocalDate.of(2021, 06, 17));
		libroDigital1.setNumPag(456);
		libroDigital1.setTitulo("Me encanta poner trabajos pa casa");
		LibroDigital libroDigital2 = new LibroDigital ();
		libroDigital2.setAutor("Abel Morillo Sanchez");
		libroDigital2.setFechaEdicion(LocalDate.of(2021, 06, 17));
		libroDigital2.setNumPag(123);
		libroDigital2.setTitulo("Fran es el mejor alumno que he tenido nunca");
		
		libreria1.añadirLibro(librofisico1);
		libreria1.añadirLibro(librofisico2);
		libreria1.añadirLibro(libroDigital1);
		libreria1.añadirLibro(libroDigital2);
		
		System.out.println(libreria1.obtenerLibroMasAntiguo());
		
		
		System.out.println(libreria1.obtenerNumPaginasMedio());

	}
		
}
