package EjercicioRepaso4;

import java.time.LocalDate;

public class Revista extends Articulo implements IConsultable {
	public Boolean isConsultado;

	public Revista(String codigo, String autor, String titulo, LocalDate añoPublicacion) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
		isConsultado = false;
	}

	@Override
	public void retirarParaConsulta() {
		if (isConsultado == false) {
			isConsultado = true;
		} else {
			System.out.println("El artículo que deseas consultar está siendo consultado ahora.");
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

		} else {

		}
		return isConsultado;
	}

}
