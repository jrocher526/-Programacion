package ejerciciosDeClase;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {

		HashSet<String> libros = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
        	System.out.println("Ingrese el nombre del libro o pulse 'x' para salir");
        	String libro = scanner.nextLine();
        	
        		if (libro.equalsIgnoreCase("x")) break;
        			
        		if (libros.add(libro)) {
        			System.out.println("Libro agregado");
        		} else {
        			System.out.println("El libro ya existe");
        		}
        }
        
        System.out.println("\nLibros con for;");
        	for (String l : libros) {
        		System.out.println(l);
        		/*if (l.equals("libro2")) {
        			libros.remove("libro2");
        		}*/
        	}
        	
        	System.out.println("libros con iterator");
        Iterator<String> it = libros.iterator();
        	while (it.hasNext()) {
        		System.out.println(it.next());
        		it.remove();
        	}
        	
	}
}