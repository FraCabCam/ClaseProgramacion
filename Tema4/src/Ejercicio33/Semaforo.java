package Ejercicio33;

public class Semaforo {

	public static final String COLOR_ROJO = "ROJO";
	public static final String COLOR_VERDE = "VERDE";
	public static final String COLOR_AMBAR = "AMBAR";
	private Boolean parpadeando = false;
	private String color;

	public Semaforo() {
		color = COLOR_ROJO;
		parpadeando = false;
	}
	public Boolean getParpadeando() {
		return parpadeando;
	}
	public void setParpadeando(Boolean parpadeando) {
		if (parpadeando && this.color.equals(COLOR_AMBAR)) {
			this.parpadeando = true;
		} else if (!parpadeando && this.color.equals(COLOR_AMBAR)) {
			this.parpadeando = false;
		} else {
			if (parpadeando) {
				System.out.println("Solo puede parpadear el color " + COLOR_AMBAR);
			}
		}
	}
	public String getColor() {
		return color;
	}
	@Override
	public String toString() {
		if(parpadeando) {
			return "Semáforo en " + color + " parpadeando";
		}	
		return "Semáforo en " + color;
	}
	public void setColor(String color) {
		if (color.equalsIgnoreCase(COLOR_ROJO) || color.equalsIgnoreCase(COLOR_VERDE)
				|| color.equalsIgnoreCase(COLOR_AMBAR)) {
			this.color = color;
		} else
			System.out.println("COLOR INCORRECTO");
		return;
	}
	public void cambiarEstado() {
		if (this.color.equals(COLOR_ROJO)) {
			this.color = COLOR_VERDE;
		} else if (this.color.equals(COLOR_VERDE)) {
			this.color = COLOR_AMBAR;
			parpadeando = true;
		} else {
			if (parpadeando) {
				parpadeando = false;
			} else {
				this.color = COLOR_ROJO;
			}
		}
	}
}
