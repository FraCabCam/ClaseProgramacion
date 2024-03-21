package EjercicioRepaso4;

import java.time.LocalDate;

public class Libro extends Articulo implements IPrestable, IConsultable {
	public Boolean isConsultado;
	public Boolean isPrestado;
	
	public Libro (String codigo, String autor, String titulo, LocalDate añoPublicacion) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
		isConsultado = false;
	}
	@Override
	public void prestar() {
		if (isPrestado == false) {
			isPrestado = true;
		} else if (isPrestado == true || isConsultado == true) {
			System.out.println("El artículo que deseas tomar prestado no está disponible.");
		}
		
	}

	@Override
	public void devolver() {
		if (isPrestado == false) {
			System.out.println("Ese artículo no ha sido prestado.");
		} else {
			isPrestado = false;
		}
		
	}

	@Override
	public Boolean estaPrestado() {
		if (isPrestado == true || isConsultado == true ) {
			System.out.println("El artículo que deseas tomar prestado no está disponible.");
			
		} 

		return isPrestado;
	}
	@Override
	public void retirarParaConsulta() {
		if (isConsultado == false) {
			isConsultado = true;
		} else if (isPrestado == true || isConsultado == true) {
			System.out.println("El artículo que deseas consultar no está disponible ahora.");
		}

	}

	@Override
	public void terminarConsulta() {
		if (isConsultado == false) {
			System.out.println("Ese artículo no está siendo consultado.");
		} else {
			isConsultado = false;
		}

	}

	@Override
	public Boolean estaConsultando() {
		if (isConsultado == true) {
			System.out.println("El artículo que deseas consultar está siendo consultado ahora.");
		
		} 
		else if (isPrestado == true) {
			System.out.println("El artículo que deseas consultar ha sido prestado.");
		}
		else {

		}
		return isConsultado;
	}
}
