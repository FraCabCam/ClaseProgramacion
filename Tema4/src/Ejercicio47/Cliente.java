package Ejercicio47;

public class Cliente {
	private String DNI;
	private String nombre;
	public Cliente(String dNI, String nombre) {
		super();
		DNI = dNI;
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Cliente " + DNI + ", " + nombre;
	}
	

}
