package Ejercicio47;

public class appCarrito {
	public static void main(String[] args) {
		Cliente blas = new Cliente("12345678X", "Blas de los Montes");
		Cesta cestaBlas = new Cesta(blas);
		System.out.println(cestaBlas);
		Ropa poncho = new Ropa("Poncho",20,"XL","AZUL");
		
		cestaBlas.addArticulo(poncho);
		cestaBlas.addArticulo(poncho);
		System.out.println(cestaBlas);
		
		Libro nietzsche = new Libro("Así habló Zaraustra" , 15, "Nietzsche");
		cestaBlas.addArticulo(nietzsche);
		System.out.println(cestaBlas);
		cestaBlas.borrarArticulo(1);
		System.out.println(cestaBlas);
		System.out.println(cestaBlas.getMedia());
		cestaBlas.vaciarCesta();
		System.out.println(cestaBlas);
		System.out.println(cestaBlas.getMedia());
		
		
	}

}
