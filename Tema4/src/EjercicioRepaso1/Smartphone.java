package EjercicioRepaso1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Smartphone {
	private String marca;
	private String modelo;
	private String imei;
	private BigDecimal precio;
	private LocalDate añoFabricacion;
	private Boolean activo;
	
	public Smartphone() {
		activo = true;
		precio = BigDecimal.ZERO;
	}

	public Smartphone(String imei) {
		super();
		this.imei = imei;
		activo = true;
		precio = BigDecimal.ZERO;
	}
	public Smartphone(String imei,String marca,String modelo) {
		super();
		this.imei = imei;
		this.marca = marca;
		this.modelo = modelo;
		activo = true;
		precio = BigDecimal.ZERO;
		
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public void activar() {
		activo = true;
	}
	public void desActivar() {
		activo = false;
	}
	
	public Integer getEdad() {
		LocalDate fecha = LocalDate.of(2000, 04, 01);
		Period period = añoFabricacion.until(fecha);
		Integer  añosDiferencia = period.getYears();
		return añosDiferencia;
	}
	public String cambiarMarcaModelo(String marca, String modelo) {	
		 return null;
	}
	public void establecerFabricacion(LocalDate fecha) {
		añoFabricacion = fecha;
	}
	public BigDecimal getPrecioMasIva(BigDecimal precio) {
		BigDecimal iva = precio.multiply(new BigDecimal(1.21));
		return iva;
	}
	public Boolean isAltaGama(BigDecimal precioBase) {
		if (precioBase.compareTo(precio) > 0) {
			return false;
		}
		return true;
	}
	public Boolean isDatosCompletos(String imei,BigDecimal precio ) {
		return imei != null && imei.isBlank() && precio == null;
	
		
	}
	public Boolean isGratis(BigDecimal precio) {
		if (precio.compareTo(BigDecimal.ZERO) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public void rebajar() {
	precio = precio.subtract(BigDecimal.TEN);
	}

	@Override
	public String toString() {
		if (activo == true) {
			return "Smartphone " + marca + "(" + modelo + ") " + " ACTIVO";
		}
		return "Smartphone " + marca + "(" + modelo + ") " + " INACTIVO";
		
	}
	
	
}
