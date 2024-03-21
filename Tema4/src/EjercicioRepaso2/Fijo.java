package EjercicioRepaso2;

public class Fijo extends Telefono {
	protected String direccion;
	
	public Fijo(Integer numero, String direccion) {
		enllamada = false;
		this.numero = numero;
		this.direccion = direccion;
	}

	
}
