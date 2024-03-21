package EjercicioRepaso2;

public class Movil extends Telefono {
	protected LocalizacionGPS posicionGPS;
	public Movil(Integer numero, LocalizacionGPS posicionGPS) {
		enllamada = false;
		this.numero = numero;
		this.posicionGPS = posicionGPS;
	}

}
