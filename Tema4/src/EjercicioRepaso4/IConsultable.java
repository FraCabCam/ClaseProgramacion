package EjercicioRepaso4;

public interface IConsultable {
	/** cambia el atributo consultado a true */
	public void retirarParaConsulta();
	/** cambia el atributo consultado a false */
	public void terminarConsulta();
	/** devuelve true/false indicando si está o no siendo consultado */
	public Boolean estaConsultando();



}
