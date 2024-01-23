package Ejercicio33;

public class AppSemaforo {
	public static void main(String[] args) {
		Semaforo semaforo = new Semaforo();
		Semaforo semaforo2 = new Semaforo();
		System.out.println(semaforo);
		semaforo.setColor("azul");
		System.out.println(semaforo);
		semaforo.setColor(Semaforo.COLOR_VERDE);
		System.out.println(semaforo);
		semaforo.setParpadeando(true);
		semaforo.setColor(Semaforo.COLOR_AMBAR);
		semaforo.setParpadeando(true);
		System.out.println(semaforo);
		for (int i = 0; i <= 4; i++) {
			semaforo.cambiarEstado();
			System.out.println(semaforo);
		}

		System.out.println("-------------------------------------------------");

		semaforo2.setColor(semaforo.getColor());
		semaforo2.setParpadeando(semaforo.getParpadeando());
	}

}
