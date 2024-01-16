package Ejercicio18_19_20;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alumno extends Persona {
	
	private String dni;
	private Integer nota;
	private Curso curso;
	public Alumno(String dni) {
		super();
		if (dni != null) {
		this.dni = dni.toUpperCase();	
		}
		
	}
	public boolean validar() {
		if  (nombre == null || nombre.isEmpty() || (nombre.length() < 10)) { 
			return false;
		}
		if (curso == null) {
			return false;
		}
		
		if (edad == null || (edad < 12 || edad > 65)) {
			return false;
		}
		
		return true;
	}
	public void aprobar () {
	if (nota < 5) {
	nota = 5;
	}	
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		if (dni != null) {
			this.dni = dni.toUpperCase();	
			}
		this.dni = dni;
	}
	public boolean validarDNI() {
		String ejemploDni = "00000000T";
		Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
		Matcher match = patron.matcher(ejemploDni);
		if (dni == null || dni.isEmpty()) {
			return false;
		}
		if (dni.length() != 9) {
			return false;
		}
	return true;
	}
	public Integer getNota() {
		return nota;
	}
	public void setNota(Integer nota) {
		this.nota = nota;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
	@Override
	public String toString() {
		return "El Alumno con dni " + dni  + " y nombre " + nombre + " de edad " + edad +  " tiene una nota de " + nota;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni);
	}
	
	

}
