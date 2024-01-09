package Asd;

public class Gato {
	private String nombre;
	private String raza;
	private Integer edad;
	
	public Gato() {
		System.out.println("Creando nuevo gato...");
		raza = "desconocida";
		edad = 0;
		nombre = "gato";
	}
	
	public Gato(String nombre) {
		System.out.println("Creando nuevo gato...");
		raza = "desconocida";
		edad = 0;
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public String getRaza () {
		return raza;
	}
	

}
