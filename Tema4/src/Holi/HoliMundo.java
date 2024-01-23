package Holi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



public class HoliMundo {
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();//Estos array tienen el tamaño segun las cosas que le metas dentro
		List<String> lista2 = new LinkedList<>();
		lista.add("vete");
		lista.add("quedate");
		
		
		System.out.println(lista.size());
		System.out.println(lista);
		lista.add(1, "cristian");
		System.out.println(lista);
		
		String cristian = lista.get(1);//guardar en una variable lo de la posicion 1
		System.out.println(cristian);
		
		//lista.remove(0);
	
		System.out.println(lista);
		lista.remove("quedate");
		System.err.println(lista.isEmpty());
		
		lista.set(1, "te amo");//cambiar la posicion 1 (quedate) por el te amo
		System.out.println(lista);
		
		System.out.println(lista.contains("te amo"));//para comprobar si existe.
		System.out.println(lista.contains("feo"));
		
		System.out.println(lista.indexOf("vete"));//para saber en qué posicion está.
		System.out.println(lista.indexOf("mortadela"));
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
		
		Iterator<String> it = lista.iterator();//para borrar elementos.
		while (it.hasNext()) {
			String palabra = (String) it.next();
			if (palabra.contains("a")){//borrar las palabras que contienen a
				it.remove();
				}
			}
		System.out.println(lista);
	}

}
