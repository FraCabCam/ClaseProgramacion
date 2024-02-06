package Ejercicio43_Peliculas;

public class Guionistas extends Empleados{
	
	
	public Guionistas(String nombre, Integer añoNacimiento, String nacionalidad) {
		super(nombre, añoNacimiento, nacionalidad);
		// TODO Auto-generated constructor stub
	}

	public Integer getSueldo() {
		return SUELDO_GUION;
	}

}
