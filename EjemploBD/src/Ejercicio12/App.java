package Ejercicio12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Ejercicio01.DatosIncompletosException;
import Ejercicio01.ErrorException;
import Ejercicio12.Modelo.Pedido;
import Ejercicio12.Modelo.PedidoLinea;
import Ejercicio12.Service.NotFoundException;
import Ejercicio12.Service.PedidoException;
import Ejercicio12.Service.PedidosService;

public class App {
	private static Scanner sc;
	private static PedidosService service = new PedidosService();
	private static DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static void main(String[] args) throws PedidoException, NotFoundException, DatosIncompletosException {
		try {
			sc = new Scanner(System.in);
			Integer opcion;
			do {
				opcion = mostrarMenu();
				switch (opcion) {
				case 1:
					crearNuevoPedido();
					break;
				case 2:
					verPedido();
					break;
				case 3:
					cambiarFecha();
					break;
				case 4:
					borrarPedido();
					break;
				case 5:
					buscarPedido();
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

	private static void buscarPedido() throws PedidoException, ErrorException {
		Integer opcion;

		do {
			opcion = mostrarMenuBuscar();
			switch (opcion) {
			case 1:
				buscarPorCliente();
				break;
			case 2:
				buscarPorFecha();
				break;
			case 0:
				mostrarMenu();
				System.out.println("Vuelta al menú principal.");
				break;
			default:
				System.out.println("Elige una opcion correcta.");
			}
		} while (opcion != 0);
	}

	private static void buscarPorFecha() throws PedidoException {
		List<Pedido> listaPedido = new ArrayList<Pedido>();
		try {
			System.out.println("Indique la fecha de entrega");
			LocalDate fecha = LocalDate.parse(sc.nextLine(), format);
			listaPedido = service.buscarFecha(fecha);
			System.out.println(listaPedido);
		} catch (NotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	private static void buscarPorCliente() throws PedidoException {
		List<Pedido> listaPedido = new ArrayList<Pedido>();
		try {
			System.out.println("Diga el nombre del cliente");
			String nombre = sc.nextLine();
			listaPedido = service.buscarCliente(nombre);
			System.out.println(listaPedido);
		} catch (NotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	private static Integer mostrarMenuBuscar() {
		System.out.println("Bienvenido al menú para buscar pedidos, qué desea hacer?");
		System.out.println("\t1. Buscar pedido por cliente");
		System.out.println("\t2. Buscar pedido por fecha");
		System.out.println("\t0. Volver al menú principal");
		Integer opcion = sc.nextInt();
		sc.nextLine();
		return opcion;
	}

	private static void borrarPedido() {
		try {
			System.out.println("Indique el número de pedido que desea borrar.");
			Integer numero = sc.nextInt();
			sc.nextLine();
			service.borrarPedido(numero);
		} catch (NotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	private static void cambiarFecha() throws NotFoundException {
		try {
			System.out.println("Indique el número de pedido.");
			Integer numero = sc.nextInt();
			sc.nextLine();
			System.out.println("Indique la nueva fecha de entrega.");
			LocalDate nuevaFecha = LocalDate.parse(sc.nextLine(), format);
			service.cambiarFecha(numero, nuevaFecha);
			System.out.println("Fecha modificada!.");
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	private static Pedido verPedido() throws ErrorException, PedidoException, NotFoundException {
		Pedido p1 = new Pedido();
		try {
			Integer numPedido = 0;
			System.out.println("Indica el número de pedido");
			numPedido = sc.nextInt();
			p1 = service.consultarPedidoCompleto(numPedido);
			System.out.println(p1);
		} catch (PedidoException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		return p1;

	}

	private static void crearNuevoPedido() throws ErrorException, PedidoException, DatosIncompletosException {
		Boolean pedidoInsertado = false;
		do {
			Pedido p1 = pedirDatosPedido();
			try {
				p1.validar();
				service.crearPedidoCompleto(p1);
				pedidoInsertado = true;
				System.out.println("Pedido creado!!");
			} catch (PedidoException e) {
				System.out.println(e.getMessage());
			}
		} while (!pedidoInsertado);

	}

	private static Pedido pedirDatosPedido() {
		Pedido p1 = new Pedido();
		PedidoLinea pL1 = new PedidoLinea();
		List<PedidoLinea> lista = new ArrayList<PedidoLinea>();
		System.out.println("Dime el numero del pedido");
		p1.setNumero(sc.nextInt());
		sc.nextLine();
		System.out.println("Dime el nombre del cliente ");
		p1.setCliente(sc.nextLine());
		System.out.println("Dime la fecha de entrega (dd/MM/yyyy)");
		p1.setFechaEntrega(LocalDate.parse(sc.nextLine(), format));
		System.out.println("Ahora dime el nombre del artículo ");
		pL1.setArticulo(sc.nextLine());
		System.out.println("Cuántas unidades de artículos?");
		pL1.setCantidad(sc.nextInt());
		sc.nextLine();
		System.out.println("Indique el precio del artículo");
		pL1.setPrecioUnitario(sc.nextBigDecimal());
		sc.nextLine();
		pL1.setNumPedido(p1.getNumero());
		lista.add(pL1);
		p1.setListaPedido(lista);
		return p1;
	}

	private static Integer mostrarMenu() {

		System.out.println("██████╗ ██╗███████╗███╗   ██╗██╗   ██╗███████╗███╗   ██╗██╗██████╗  ██████╗      █████╗     ███████╗ █████╗ ██████╗ ██╗      █████╗ ███████╗");
		System.out.println("██╔══██╗██║██╔════╝████╗  ██║██║   ██║██╔════╝████╗  ██║██║██╔══██╗██╔═══██╗    ██╔══██╗    ╚══███╔╝██╔══██╗██╔══██╗██║     ██╔══██╗██╔════╝");
		System.out.println("██████╔╝██║█████╗  ██╔██╗ ██║██║   ██║█████╗  ██╔██╗ ██║██║██║  ██║██║   ██║    ███████║      ███╔╝ ███████║██████╔╝██║     ███████║███████╗");
		System.out.println("██╔══██╗██║██╔══╝  ██║╚██╗██║╚██╗ ██╔╝██╔══╝  ██║╚██╗██║██║██║  ██║██║   ██║    ██╔══██║     ███╔╝  ██╔══██║██╔══██╗██║     ██╔══██║╚════██║");
		System.out.println("██████╔╝██║███████╗██║ ╚████║ ╚████╔╝ ███████╗██║ ╚████║██║██████╔╝╚██████╔╝    ██║  ██║    ███████╗██║  ██║██████╔╝███████╗██║  ██║███████║");
		System.out.println("╚═════╝ ╚═╝╚══════╝╚═╝  ╚═══╝  ╚═══╝  ╚══════╝╚═╝  ╚═══╝╚═╝╚═════╝  ╚═════╝     ╚═╝  ╚═╝    ╚══════╝╚═╝  ╚═╝╚═════╝ ╚══════╝╚═╝  ╚═╝╚══════╝");
		System.out.println("\t1. Crear Nuevo pedido");
		System.out.println("\t2. Ver pedido");
		System.out.println("\t3. Cambiar fecha de entrega");
		System.out.println("\t4. Borrar pedido");
		System.out.println("\t5. Ir al menú de búsqueda de pedidos");
		System.out.println("\t0. Salir");
		Integer opcion = sc.nextInt();
		sc.nextLine();
		return opcion;
	}

}
