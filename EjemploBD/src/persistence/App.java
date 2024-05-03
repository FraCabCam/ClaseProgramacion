package persistence;

import java.util.List;

public class App {

	public static void main(String[] args) {
		GatoDao g1 = new GatoDao();
		
		List<Gato> gatos = g1.consultarGatos(3,"A");
		for (Gato gato : gatos) {
			System.out.println(gato);
		}
		
	}

}
