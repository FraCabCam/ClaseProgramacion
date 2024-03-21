package Ejercicio0055;

import java.math.BigDecimal;

public class App {
	public static void main(String[] args) {
		Evaluacion eva1 = new Evaluacion();
		eva1.addNota("2332323D", new BigDecimal(7.2));
		eva1.addNota("6332363F", new BigDecimal(5.2));
		eva1.addNota("0912399Z", new BigDecimal(9.1));
		eva1.addNota("7561323B", new BigDecimal(3.2));
		eva1.addNota("2913853R", new BigDecimal(4.9));
		
		System.out.println(eva1);
		
		eva1.addNota("2332323D", new BigDecimal(3.1));
		eva1.addNota("4756008L", new BigDecimal(9.8));
		
		System.out.println(eva1);
		
		System.out.println(eva1.obtenerNotaAlumno("4756008L"));
		
		System.out.println(eva1.obtenerNotaMedia());
		
		System.out.println(eva1.obtenerCantidadAprobados());
		
		System.out.println(eva1.obtenerSuspensos());
		
		eva1.borrarAprobados();
		
		System.out.println(eva1);
	}

}
