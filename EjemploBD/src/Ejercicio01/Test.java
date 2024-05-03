package Ejercicio01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Persona> lista = new ArrayList<Persona>();
		PersonaService service = new PersonaService();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Persona p1 = new Persona("96385214A","JOSEMANUEL", "DEL VALLE",LocalDate.parse("03/03/2003", format));
		lista.add(p1);
		Persona p2 = new Persona("96385214B","MARGARITA", "DEL BOSQUE",LocalDate.parse("05/12/1956", format));
		lista.add(p2);
		Persona p3 = new Persona("96385214C","INDALECIO", "GARCIA", LocalDate.parse("21/07/1999", format));
		lista.add(p3);
		
		service.insertarVariasPersonas(lista);
		
		
	}

}
