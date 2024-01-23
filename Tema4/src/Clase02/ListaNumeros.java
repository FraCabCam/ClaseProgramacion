package Clase02;

public interface ListaNumeros {
	
	/** Este método añade el número que recibe a la lista
	 * 
	 * @param numero
	 */
	public void addNumero(Integer numero);
	/** Devuelve el número de la lista que está en la
	 * posición que se indica
	 * @param posicion
	 * @return Número de la posición
	 */
	public Integer getNumeroDePosicion(Integer posicion);
	public Integer getPosicionDeNumero(Integer numero);
	public Integer getResta(Integer pos1, Integer pos2);
	public Integer sumaTodos();
	public Integer getMedia();
	public Integer getMayor();
}
