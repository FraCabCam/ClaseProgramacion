package Ejercicio01;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
/**Esta clase sirve para crear métodos para sacar números de una lista
 * 
 * @author fcabrera
 */

public class SacoNumeros {

	private List<Integer> lista;
	
	/**Constructor que inicializa la lista
	 * 
	 */
	public SacoNumeros() {
		
		lista = new ArrayList<Integer>();
	}
	/**Recibe un numero integer y 
	 * si el numumero no es -1 lo añade a la lista (para que no pete la lista)
	 * 
	 */
	public void addNumero(Integer num) {
		
		if (num != -1) {
			lista.add(num);
		}
	}
	/**Método para devolver el número de la posicion que es el num que recibe
	 * si el numero que pide está fuera del rango de la lista en vez de petar manda un null,
	 * si no, manda directamente el número de la posición solicitada
	 */
	public Integer getNumero(Integer num) {
		
		Integer posicion = 0;
		try {
			posicion = lista.get(num);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}

		return posicion;
	}

	public String toString() {

		return "numeros de la lista: " + lista;
	}
	/**Metodo para realizar una división del 1 con el 2, el resultado de esto con el 3, y asi sucesivamente
	 *  y devolver el resultado de la misma
	 * Se inicializa la variable que devolvemos en 0 luego, con un bucle for
	 * recorremos la lista, miramos si la variable vale 0 en ese caso con el metodo creado
	 * anteriormente "getNumero" obtiene el número de la posición 0.
	 */
	public BigDecimal division() {
		
		BigDecimal dividir = BigDecimal.ZERO;
		for (Integer num : lista) {
			if (dividir.equals(BigDecimal.ZERO)) {
				dividir = new BigDecimal(getNumero(0));
			} else {
				try {
					dividir = dividir.divide(new BigDecimal(num), 2, RoundingMode.HALF_UP);
				} catch (ArithmeticException e) {
					return BigDecimal.ZERO;
				}
			}
		}

		return dividir;
	}

}
