package EjercicioRepaso3;

import java.math.BigDecimal;

public class LibroFisico extends Libros {
	protected Integer ancho;
	protected Integer alto;
	protected BigDecimal gramos = BigDecimal.ZERO;
	
	

	public LibroFisico(Integer ancho, Integer alto, BigDecimal gramos) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.gramos = gramos;
	}

	public Integer getAncho() {
		return ancho;
	}


	public Integer getAlto() {
		return alto;
	}



	public BigDecimal getGramos() {
		return gramos;
	}

	
	
}
