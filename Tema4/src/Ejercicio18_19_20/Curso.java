package Ejercicio18_19_20;

import java.util.Iterator;

public class Curso {
	
	private Integer identificador;
	private String descripcion;
	private Alumno[] alumnos;
	
	
	
	public Curso(Integer cantAlumnos) {
		alumnos = new Alumno[cantAlumnos];
	}
	public void addAlumno(Alumno alumnoNuevo) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = alumnoNuevo;
				break;
			}
		}
	}
	public Integer getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Cargando alumno del curso " + identificador + descripcion + "...";
	}
	public Alumno[] getAlumnos() {
		return alumnos;
	}
}
