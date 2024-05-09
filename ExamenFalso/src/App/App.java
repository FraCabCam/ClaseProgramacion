package App;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


import Modelo.Libreria;
import Modelo.Libro;
import Service.LibreriaService;
import Service.LibroException;

public class App {
	private static Scanner sc;
	private static LibreriaService service = new LibreriaService();
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Libreria paginasDesiertas = solicitarLibreria();
		
		Map<String, Libro> mapa = paginasDesiertas.getMapaLibros();
		Collection<Libro> valores =  mapa.values();
		for (Libro libro : valores) {
			if (libro.getPrecio().compareTo( new BigDecimal(10)) < 0) {
				try {
					service.insertarLibroNuevo(libro);
				} catch (LibroException e) {	
					e.printStackTrace();
				}
			}
		}
		System.out.println("Todo OK");
		System.out.println("Precio medio: " + paginasDesiertas.getPrecioMedio() + "\n Precio total: " + paginasDesiertas.getTasacionCompleta());
	}
	
	private static Libreria solicitarLibreria() {
		String usuario = "";
		Libreria paginasDesiertas = new Libreria();
		paginasDesiertas.setNombre("Paginas Desiertas");
		Map<String, Libro> mapalibros = new HashMap<String, Libro>();
		
		
		System.out.println("Introduce libros hasta escribir Fin");
		
		do {
			Libro libro1 = new Libro();
			System.out.println("Indica el ISBN del nuevo libro");
			libro1.setISBN(sc.nextLine());
			System.out.println("Indica el titulo del libro");
			libro1.setTitulo(sc.nextLine());
			System.out.println("Indica el autor del libro");
			libro1.setAutor(sc.nextLine());
			System.out.println("Indica el precio del libro");
			libro1.setPrecio(sc.nextBigDecimal());
			sc.nextLine();
			mapalibros.put(libro1.getISBN(), libro1);
			System.out.println("Si quieres volver a meter otro libro nuevo escribe cualquier cosa, para salir escribe fin.");
			usuario = sc.nextLine();
		} while (!usuario.equalsIgnoreCase("fin"));
		paginasDesiertas.setMapaLibros(mapalibros);
		return paginasDesiertas;
		
	}

}
