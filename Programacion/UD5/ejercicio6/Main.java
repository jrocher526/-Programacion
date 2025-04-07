package ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		//Creamos una lista de persona tipo Arrays
        List<Persona> personas = new ArrayList<>();
        
        // Creaos varias personas 
        personas.add(new Persona("Ana", "García", 30, 1.65));
        personas.add(new Persona("Luis", null, 25, 1.75));
        personas.add(new Persona("Bea", "Fernández", 28, 1.70));
        personas.add(new Persona("Carlos", "García", 22, 1.80));
        personas.add(new Persona("Ana", null, 40, 1.60));
        
        //Mostramos la lista de manera original 
        System.out.println("Lista original:");
        mostrarLista(personas);
        
        //Ahora las mostrarmos usando los metodos creados
        Collections.sort(personas); 
        System.out.println("\nOrdenadas por nombre (Comparable):");
        mostrarLista(personas);

        Collections.sort(personas, new ComparadorPorApellido());
        System.out.println("\nOrdenadas por apellido (ComparadorPorApellido):");
        mostrarLista(personas);

        Collections.sort(personas, new ComparadorCompleto());
        System.out.println("\nOrdenadas por apellido, nombre y edad (ComparadorCompleto):");
        mostrarLista(personas);
    }
	
    public static void mostrarLista(List<Persona> lista) {
        for (Persona p : lista) {
            System.out.printf("%s %s, Edad: %d, Estatura: %.2f\n",
                p.getNombre(),
                (p.getApellido() != null ? p.getApellido() : "(sin apellido)"),
                p.getEdad(),
                p.estatura);
        }
    }
}
