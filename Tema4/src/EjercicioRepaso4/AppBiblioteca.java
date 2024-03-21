package EjercicioRepaso4;

import java.time.LocalDate;

public class AppBiblioteca {
	public static void main(String[] args) {
		Cd cd = new Cd ("CD001","David Bisbal","Corazón Latino",LocalDate.of(2003, 8, 23));
		Libro libro = new Libro("L001","Adolf Hitler","Mein kampf",LocalDate.of(1942, 11, 03));
		Revista revista = new Revista ("R001","pepito","Naturaleza",LocalDate.of(2022, 2, 14));
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.añadirArticulo(revista);
		biblioteca.añadirArticulo(libro);
		biblioteca.añadirArticulo(cd);
		System.out.println(biblioteca);
		libro.prestar();
		cd.prestar();
		libro.retirarParaConsulta();
		revista.retirarParaConsulta();
		for (Articulo a : biblioteca.getArticulos()) {
			
			
		}
		
	}

}
