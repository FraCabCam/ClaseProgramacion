package Ejercicio01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class App {
	private static Scanner sc;
	private static PersonaService service = new PersonaService();

	public static void main(String[] args) throws DatosIncompletosException, PersonaException {

		try {
			sc = new Scanner(System.in);
			Integer opcion;
			do {
				opcion = mostrarMenu();
				switch (opcion) {
				case 1:
					consultarPersona();
					break;
				case 2:
					buscarPersona();
					break;
				case 3:
					insertarPersona();
					break;
				case 4:
					InsertarPersonasVarias();
					break;
				case 5:
					actualizarPersona();
					break;
				case 6:
					borrarPersona();
					break;
				case 7:
					borrarPersonaA();
					break;
				case 0:
					System.out.println("Chaaao chachaaooo");
					break;

				default:
					System.out.println("Elige una opcion correcta.");
				}
			} while (opcion != 0);
		} catch (ErrorException e) {
			System.err.println(e.getMessage());
		}

		finally {
			sc.close();
		}

	}

	private static void borrarPersonaA() throws ErrorException, PersonaException {	
		System.out.println(service.borrarPersonasA());
	}

	private static void borrarPersona() throws PersonaException {
		System.out.println("Dime el DNI de la persona que quieres borrar");
		String dni = sc.nextLine();
		service.borrarPersonas(dni);

	}

	private static Persona pedirDatosPersona() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Persona p1 = new Persona();
		System.out.println("Dime el DNI de la persona");
		p1.setDni(sc.nextLine());
		System.out.println("Dime el nombre");
		p1.setNombre(sc.nextLine());
		System.out.println("Dime el apellido");
		p1.setApellidos(sc.nextLine());
		System.out.println("Dime la fecha de nacimiento (dd/MM/yyyy)");
		p1.setFechaNacimiento(LocalDate.parse(sc.nextLine(), format));
		return p1;
	}

	private static void actualizarPersona() throws PersonaException {
		System.out.println("Indica los datos de la persona que quieres  actualizar");

		Persona p1 = pedirDatosPersona();
		try {
			service.actualizarPersonas(p1);
			System.out.println("Persona actualizada.");
		} catch (PersonaException e) {
			System.out.println(e.getMessage());

		}

	}

	private static Integer mostrarMenu() {
		System.out.println("Menú:");
		System.out.println("\t1. Consultar por DNI");
		System.out.println("\t2. Consultar por filtro");
		System.out.println("\t3. Insertar nueva persona");
		System.out.println("\t4. Insertar varias personas");
		System.out.println("\t5. Actualizar  persona");
		System.out.println("\t6. Borrar  persona");
		System.out.println("\t7. Borrar  personas mayor de edad");
		System.out.println("\t0. Salir");
		Integer opcion = sc.nextInt();
		sc.nextLine();
		return opcion;

	}

	private static Persona consultarPersona() throws ErrorException {
		Persona p1 = new Persona();
		try {
			String dni = "";
			System.out.println("Indica el DNI");
			dni = sc.nextLine();
			p1 = service.consultarPersona(dni);
			System.out.println(p1);
		} catch (PersonaException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		return p1;

	}

	private static void buscarPersona() throws ErrorException {
		try {
			System.out.println("Dime un filtro para buscar a las personas");
			String filtro = sc.nextLine();
			List<Persona> resultado = service.buscarPersonas(filtro);
			System.out.println("Personas encontradas");
			for (Persona p : resultado) {
				System.out.println(p);
			}
		} catch (PersonaException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}


	private static void insertarPersona() throws ErrorException {
		Boolean p1Insertada = false;
		do {
			Persona p1 = pedirDatosPersona();
			try {
				p1.validar();
				service.insertarPersonas(p1);
				p1Insertada = true;
				System.out.println("Persona insertada!!");
			} catch (DatosIncompletosException e) {
				System.out.println(e.getMessage());
			}

		} while (!p1Insertada);
	}

	private static void InsertarPersonasVarias() throws ErrorException {
		Boolean p1Insertada = false;
		System.out.println("Cuántas personas quieres insertar?");
		Integer num = sc.nextInt();
		Integer contador = 0;
		sc.nextLine();
		do {
			contador++;
			do {
				Persona p1 = pedirDatosPersona();
				try {
					p1.validar();
					service.insertarPersonas(p1);
					p1Insertada = true;
					System.out.println("Persona insertada!!");
				} catch (DatosIncompletosException e) {
					System.out.println(e.getMessage());
				}

			} while (!p1Insertada);
		} while (contador != num);
	}
}
