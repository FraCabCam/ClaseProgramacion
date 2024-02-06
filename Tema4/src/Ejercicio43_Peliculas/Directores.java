package Ejercicio43_Peliculas;

public class Directores extends Empleados {
	
	public Directores(String nombre, Integer añoNacimiento, String nacionalidad) {
		super(nombre, añoNacimiento, nacionalidad);
		// TODO Auto-generated constructor stub
	}

	private static final Integer SUELDO= 200000;
	
	public Integer getSueldo() {
		return SUELDO_DIRECTOR;
	}
}
	
	
