package Ejercicio32;

import java.util.Objects;

public class Reloj {
	private Integer horas;
	private Integer minutos;
	private Integer segundos;
	private Boolean formarto24horas;

	public Reloj() {
		horas = 0;
		minutos = 0;
		segundos = 0;
		formarto24horas = true;
	}

	public Reloj(Integer horas, Integer minutos, Integer segundos) {
		super();
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
		this.formarto24horas = true;
	}

	public Integer getHoras() {
		return horas;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public Integer getSegundos() {
		return segundos;
	}

	public Boolean getFormarto24horas() {
		return formarto24horas;
	}

	public void ponerEnHora(Integer horas, Integer minutos) {
		this.horas = horas;
		this.minutos = minutos;
		return;
	}

	public void ponerEnHora(Integer horas, Integer minutos, Integer segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
		return;
	}

	public void setFormarto24horas(Boolean formarto24horas) {
		this.formarto24horas = formarto24horas;
	}

	public boolean check() {
		if (getHoras() >= 0 && getHoras() <= 23 && getMinutos() >= 0 && getMinutos() <= 59
				&& getSegundos() >= 0 && getSegundos() <= 59) {
			return true;
		}

		return false;
	}

	@Override
	public String toString() {
		if (!check()) {
			return "HORA INCORRECTA";
		}
		if (formarto24horas || horas <= 12) {
			return  formatNumber(horas) + ":" + formatNumber(minutos) + ":" + formatNumber(segundos);
		}
		 return formatNumber(horas - 12) + ":" + formatNumber(minutos) + ":" + formatNumber(segundos);
	}
	private String formatNumber (Integer x) {
		if (x >= 10) {
			return x.toString();
		}
		return "0" + x;
	}

	@Override
	public int hashCode() {
		return Objects.hash(horas, minutos, segundos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reloj other = (Reloj) obj;
		return Objects.equals(horas, other.horas) && Objects.equals(minutos, other.minutos)
				&& Objects.equals(segundos, other.segundos);
	}

}
