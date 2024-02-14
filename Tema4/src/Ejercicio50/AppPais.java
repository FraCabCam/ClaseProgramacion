package Ejercicio50;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AppPais {
	public static void main(String[] args) {
		Set<Pais> paises = new HashSet<Pais>();
		Pais españa = new Pais("ES","España");
		Pais islasCook = new Pais("CK","Islas Cook");
		Pais islasCaiman = new Pais("CK","Islas Caiman");
		
		paises.add(españa);
		paises.add(islasCaiman);
		paises.add(islasCook);
		System.out.println(paises);
		
		Pais españa2 = new Pais("es","España");
		paises.add(españa2);
		System.out.println(paises);
		
		Iterator<Pais> it = paises.iterator();
		
		for (Iterator<Pais> iterator = paises.iterator(); iterator.hasNext();) {
			Pais pais = (Pais) iterator.next();
			if (!pais.getCodigo().equalsIgnoreCase("ES")) {
				iterator.remove();
			}
		}	
		System.out.println(paises);
		
		paises.clear();
		System.out.println(paises);
		
		
	}
	
	
}
