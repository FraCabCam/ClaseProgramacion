package Ejercicio01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Persona {
	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;	

	
	

	public Persona(String dni, String nombre, String apellidos, LocalDate fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}



	public Persona() {
		// TODO Auto-generated constructor stub
	}



	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "DNI: " + dni + ", nombre: " + nombre + ", apellidos: " + apellidos + ", fecha de Nacimiento: "
				+ formato.format(fechaNacimiento);
	}
	
	public void validar()  throws DatosIncompletosException{
		if (dni == null || dni.isBlank()) {
		throw new  DatosIncompletosException("El DNI no puede ser vacío");
		}
		if ( nombre == null || nombre.isBlank()) {
			throw new DatosIncompletosException("El nombre no puede ser vacío");
		}
		if ( apellidos == null || apellidos.isBlank()) {
			throw new DatosIncompletosException("Los apellidos no pueden ser vacíos");
		}
		if ( fechaNacimiento == null ) {
			throw new DatosIncompletosException("La fecha de nacimiento no puede ser vacía");
		}
		if ( dni.length() > 50 || nombre.length() > 50 || apellidos.length() > 100) {
			throw new DatosIncompletosException("Los valores indicados superan el tamaño máximo");
		}	
		
	}

	public Boolean isMayorEdad(Persona persona) {
		if (LocalDate.now().getYear() - persona.getFechaNacimiento().getYear() >= 18 ) {
			return true;
		}
		else {
			return false;
		}
	}
}
