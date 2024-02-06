package Ejercicio43_Peliculas;

public class Actores extends Empleados{
	
	

	public Actores(String nombre, Integer añoNacimiento, String nacionalidad) {
		super(nombre, añoNacimiento, nacionalidad);
		// TODO Auto-generated constructor stub
	}

	public Integer getSueldo() {
		return SUELDO_ACTOR;
	}

	@Override
	public String toString() {
		return getNombre();
	}

	
}
