package EjercicioRepaso2;

public abstract class Telefono {
	protected Integer numero;
	protected Boolean enllamada;
	
	public Integer consultarNumero() {
		return numero;
	}


	public void marcar(Integer numeroRecibido) {
		if (numeroRecibido.equals(numero)) {
			 System.out.println("LLAMANDO A " + numeroRecibido +  "\nCOMUNICANDO...");
		}
		else {
			enllamada = true;
			System.out.println("LLAMANDO A " + numeroRecibido + "\nEN COMUNICACIÓN");
		}
		
	}
	
	public void colgar() {
		if (enllamada == true) {
			enllamada = false;
			System.out.println("COMUNICACIÓN TERMINADA.");
		}
		else {
			
		}
	}
	
}

