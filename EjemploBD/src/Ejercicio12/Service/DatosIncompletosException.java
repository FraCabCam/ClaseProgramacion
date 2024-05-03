package Ejercicio12.Service;

public class DatosIncompletosException extends Exception {

	private static final long serialVersionUID = 5240662011678792793L;

		/**
		 * 
		 */

		public DatosIncompletosException() {
		}

		public DatosIncompletosException(String message) {
			super(message);
		}

		public DatosIncompletosException(Throwable cause) {
			super(cause);
		}

		public DatosIncompletosException(String message, Throwable cause) {
			super(message, cause);
		}

		public DatosIncompletosException(String message, Throwable cause, boolean enableSuppression,
				boolean writableStackTrace) {
			super(message, cause, enableSuppression, writableStackTrace);
		}


	

}
