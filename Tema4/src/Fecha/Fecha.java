package Fecha;

public interface Fecha {
		/** Cambiar la fecha actual con el día, mes y año indicados
		 * 
		 * @param dia
		 * @param mes
		 * @param año
		 */
		public void fechaCambiar (Integer dia, Integer mes, Integer año);
		/** Cambia la fecha actual por el día, mes, y año del día en curso.
		 * 
		 */
		public void fechaActual ();
		/**Comprobar que la fecha introducida es correcta
		 * 
		 * @return
		 */
		public Boolean validar();
		public Integer sumarDias(Integer dia);
		public Integer sumarMeses(Integer mes);
		public Integer sumarAños(Integer año);
		/** Devuelve un booleano indicando si la fecha actual corresponde
		 * a un dia festivo (fin desemana o festivo nacional fijo)
		 * @return
		 */
		public Boolean isFestivo();
		/** Resta a la fecha actual
		 * 
		 * @param cero
		 * @return
		 */
		public Integer restarFecha(Fecha cero);
		public Boolean isBisiesto();
		/** Devuelve la representación en cadena de la fecha
		 * según el formato configurado
		 * @return
		 */
		public String toString ();
		public boolean equals(Fecha Fecha);
		public Integer getDia(Integer dia);
		public Integer getMes(Integer mes);
		public Integer getAño(Integer año);
		/** Devuelve una cadena en castellano de el dia de la semana
		 * 
		 * @param dia
		 * @return
		 */
		public String getDiaSemana(Integer dia);
		/** Devuelve la cantidad de días que falta para terminar el año
		 * 
		 * @param año
		 * @return
		 */
		public Integer getDiasRestantesAño(Integer año);
		public Integer getDiferencia(Fecha uno);
		/**Cambiar formato de la fecha para que sea como el patron 
		 * 
		 * @param patron
		 * @return
		 */
		public String cambiarFormato(String patron);
		
	

}
