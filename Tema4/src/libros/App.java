package libros;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Libro x = new Libro();
		Libro y = new Libro();
		Scanner sc = new Scanner(System.in);
		String titulo = sc.nextLine();
		x.setTitulo(titulo);

		System.out.println(x.getTitulo());
		
		String titulo2 = sc.nextLine();
		y.setTitulo(titulo2);

		System.out.println(y.getTitulo());
		
		x.setNumPagina(69);
		
		System.out.println(x.getNumPagina());
		
		x.setAutor("Gabriel Márquez");
		x.setEditorial("ayayayayay");
		System.out.println(x.getAutor());
		
		//cuando es un static no se cambia el objeto.
		
		Libro.setMaterial("Papel");
		System.out.println(Libro.getMaterial());
	}
}
