package libros;

public class Libro {
	
	private static String material;
	private String titulo;
	private String autor;
	private Integer numPagina;
	private String editorial;
	
	public 	 void setTitulo (String titulo) {
		
		this.titulo = titulo;
	}
	
	public String getTitulo () {
		return titulo;
	}
	
	public void setNumPagina(Integer numPagina) {
		
		this.numPagina = numPagina;
		
	}
	
	public Integer getNumPagina () {
		return numPagina;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public static String getMaterial() {
		return material;
	}

	public static void setMaterial(String material) {
		Libro.material = material;
	}
	
	
	
}
