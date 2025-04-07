package ejerciciosDeClase;

import  java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;

public class Ejercicio3 {
	public static void main(String[] args) {
		// TreeSet o Set  
		TreeSet <Integer> conjunto = new TreeSet<>();
		
		conjunto.add(3);
		conjunto.add(2);
		conjunto.add(4);
		conjunto.add(1);
		
		// Devuelve los valores en orden
		System.out.println(conjunto);
		
		for (Integer numero : conjunto) {
			System.out.println(numero);
		}

		// Devuelve los valores de atras para adelante 
        Iterator<Integer> it = conjunto.descendingIterator();
    	while (it.hasNext()) {
    		System.out.println(it.next());
    		it.remove();
    	}
		
    	// Igual pero con nombres 
    	TreeSet<String> nombres = new TreeSet<>();
    	
    	nombres.add("Juan");
    	nombres.add("Jose");
    	nombres.add("Manuel");
    	
    	// Devuelven valores en orden
    	System.out.println(nombres);
    	
    	for (String n : nombres) {
    		System.out.println(n);
    	}
    	
    	
    	Iterator<String> m = nombres.iterator(
    			);
    	while (m.hasNext()) {
    		System.out.println(m.next());
    		m.remove();
    	}
    		
    	
	}
}

