package Mapas;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ClaseMapas01 {
	public static void main(String[] args) {
		Map<String, String> mapa = new HashMap<String, String>();
		//añadir cosas
		
		mapa.put("cristian", "abuelo cachondo");
		mapa.put("fran", "musculuso y buenorro");
		mapa.put("natalia", "mi hija");
		
		System.out.println(mapa);
		
		System.out.println(mapa.get("natalia"));
		
		mapa.isEmpty(); 
		//mapa.clear(); //borrar
		mapa.size(); //contar cuantas claves hay
		
		// solo explota cuando queremos modificar algo que da null por ejemplo: mapa.get("xd").toUpperCase();
		
		if (mapa.get("julian") == null ) {
			System.out.println("Julian no existe");
		}
		//forma1
		for (String key : mapa.keySet()) { //devuelve un set de todas las claves 
			System.out.println(key);
			System.out.println(" --> " + mapa.get(key));
		}
		
		
		//forma 2
		Set<String> claves = mapa.keySet();
		 for (String keys : claves) {
			
		}
		 
		//recorrer para obtener VALUES SIN KEYS 
		for (String value : mapa.values()) {
			System.out.println(value);
			
		}
		
		//recorrer todo el mapa, keys y values
		
		for (Entry<String, String> dupla : mapa.entrySet()) {
			System.out.println(dupla.getKey());
			System.out.println(dupla.getValue());
		}
		
		for (Iterator<String> iterator = mapa.keySet().iterator(); iterator.hasNext();) {
			String key = (String) iterator.next();
			if (key.startsWith("f")) {
				iterator.remove();
			}
		}
		
		System.out.println();
	}

}
