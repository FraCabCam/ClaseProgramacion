package EjercicioRepaso2;

import java.math.BigDecimal;

public class AppTelefono {
	public static void main(String[] args) {
		LocalizacionGPS coordenadas1 = new LocalizacionGPS();
		coordenadas1.setCoordenada1(new BigDecimal(20.30));
		coordenadas1.setCoordenada1(new BigDecimal(33.33));
		
		Movil movil1 = new Movil (654654654,coordenadas1);
		Fijo fijo1 = new Fijo (954954954,"Calle Alonso");
		System.out.println(movil1.consultarNumero());
		System.out.println(fijo1.consultarNumero());
		movil1.marcar(654654654);
		movil1.marcar(610610610);
		movil1.colgar();
		movil1.colgar();
		
	}

}
