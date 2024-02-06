package Kahoot;

public class Kahootillo {

	public class Libro {
		private String titulo;
		private String autor;
		private static Integer edicion;
		
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor = autor;
		}
		public static Integer getEdicion() {
			return edicion;
		}
		public static void setEdicion(Integer edicion) {
			Libro.edicion = edicion;
		}
		
		
	}
}
