package Ejercicio54;

public class Cargo extends Movimientos {
	

	protected String cif;

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}
	@Override
	public String toString() {
		return "Cargo " + cif +  " " + fechaActual + ", importe " + importe;
	}
	

}
