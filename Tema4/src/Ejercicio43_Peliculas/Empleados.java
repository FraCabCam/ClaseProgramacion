package Ejercicio43_Peliculas;

    public abstract class Empleados {
	private String nombre;
	private Integer añoNacimiento;
	private String nacionalidad;
	protected  static final Integer SUELDO_DIRECTOR= 200000;
	protected static final Integer SUELDO_ACTOR= 100000;
	protected static final Integer SUELDO_GUION= 50000;
	
	
	
	public Empleados(String nombre, Integer añoNacimiento, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.añoNacimiento = añoNacimiento;
		this.nacionalidad = nacionalidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getAñoNacimiento() {
		return añoNacimiento;
	}
	public void setAñoNacimiento(Integer añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	

}
