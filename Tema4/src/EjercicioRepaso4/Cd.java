package EjercicioRepaso4;

import java.time.LocalDate;

public class Cd extends Articulo implements IPrestable{
	public Boolean isPrestado;
	
	public Cd (String codigo, String autor, String titulo, LocalDate añoPublicacion) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
		isPrestado = false;
	}
	@Override
	public void prestar() {
		if (isPrestado == false) {
			isPrestado = true;
		} else {
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
		if (isPrestado == true) {
			System.out.println("El artículo que deseas tomar prestado no está disponible.");

		} else {

		}
		return isPrestado;
	}
}
