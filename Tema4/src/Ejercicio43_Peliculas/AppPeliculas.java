package Ejercicio43_Peliculas;

public class AppPeliculas {
	public static void main(String[] args) {
		Actores blas = new Actores("Blas Blau ",1983," España");
		Actores laura = new Actores("Laura Pozo ",1981," Italia");
		Actores marcel = new Actores("Marcel Cade ",2001," Suiza");
		Actores violeta = new Actores("Violeta Volo ",1999," Rusia");
		
		Directores sara = new Directores("Sara Marea ",1994," Portugal");
		
		Guionistas marco = new Guionistas("Marco Smith ", 1988," Reino Unido");
		Guionistas cheng = new Guionistas("Cheng Shu ", 1977, " China");
		
		Peliculas peli1 = new Peliculas();
		peli1.setAñoEstreno(2027);
		peli1.setDirector(sara);
		peli1.setGuionista(marco);
		peli1.getActores().add(blas);
		peli1.getActores().add(laura);
		peli1.setTitulo("Do you know Joe Blas?");
		
		Peliculas peli2 = new Peliculas();
		peli2.setAñoEstreno(2027);
		peli2.setDirector(sara);
		peli2.setGuionista(cheng);
		peli2.getActores().add(blas);
		peli2.getActores().add(laura);
		peli2.getActores().add(marcel);
		peli2.getActores().add(violeta);
		peli1.setTitulo("Muerte en la sombra");
		
		System.out.print("Actores que participan en " + peli1.getTitulo() + " son: ");
		System.out.println(peli1.getActores());
		
		System.out.println("Sueldo del guionista y nacionalidad " + peli1.getGuionista().getSueldo() + peli1.getGuionista().getNacionalidad());
		peli2.getActores().remove(marcel);
		peli1.getActores().add(marcel);
		
		System.out.println(peli1.getActores());
		System.out.println(peli2.getActores());
		
	}

}
