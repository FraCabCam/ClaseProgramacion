package Ejercicio44_Juego;

import java.util.Objects;

public abstract class Personajes {
	protected Integer vida;
	protected Integer daño;
	protected Integer dps;
	private String nombre;
	private String codigo;

	public Personajes(String nombre, String codigo,Integer vida, Integer daño, Integer dps) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.vida = vida;
		this.daño = daño;
		this.dps = dps;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		this.vida = vida;
	}

	public Integer getDaño() {
		return daño;
	}

	public void setDaño(Integer daño) {
		this.daño = daño;
	}

	public Integer getDps() {
		return dps;
	}

	public void setDps(Integer dps) {
		this.dps = dps;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personajes other = (Personajes) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
}
