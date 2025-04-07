package ejerciciosDeClase;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ejercicio2 {
    public static void main(String[] args) {

    // Declarar el conjunto usando la interfaz Set
    Set<String> alumnosLinkedHashSet = new LinkedHashSet<>();
    Set<String> alumnosHashSet = new HashSet<>();

    // Agregar nombres al conjunto
    alumnosLinkedHashSet.add("Juan");
    alumnosLinkedHashSet.add("Maria");
    alumnosLinkedHashSet.add("Jose");
    alumnosLinkedHashSet.add("Fran");
    
    // Mostramos la los nombres almacenados en LinkedHashSet
    System.out.println("Nombres:");
    System.out.println(alumnosLinkedHashSet);
    
    // Añadimos un nombre repetido
    alumnosLinkedHashSet.add("Juan");
    
    // Volvemos a mostrar 
    System.out.println("\nNombres dupicados:");
    System.out.println(alumnosLinkedHashSet);
    
    // Añadimos un NULL
    alumnosLinkedHashSet.add(null);
    
    //Volvemos a mostrar
    System.out.println("\nNombres nullos:");
    System.out.println(alumnosLinkedHashSet);
    
    // imprime la referencia
    System.out.println("\nReferencia:");
    System.out.println(System.identityHashCode(alumnosLinkedHashSet));
    // Imprime el tamaño 
    System.out.println("\nTamaño: " + alumnosLinkedHashSet.size());
    
    /* Recorrer e imprimir en orden con LinkedHashSet
    System.out.println("\nRecorriendo con LinkedHashSet");
    for (String a : alumnosLinkedHashSet) {
    	System.out.println(a);
    }
    
    //Recorrer e imprimir en orden con HashSet
    System.out.println("\nRecorriendo con HashSet");
    for (String a : alumnosHashSet) {
    	System.out.println(a);
    }*/
    
    // Añadimos los valores del primer conjunto al segundo
    alumnosHashSet.addAll(alumnosLinkedHashSet);
     
    imprimir(HashSet(s));
    
	}
 // Imprime mediante funcion
    static void imprimir (Set<String> s) {
    	System.out.println(s.getClass() + ":");
    	for(String alumno : s ) {
    		System.out.println("D." + s);
    	}
    }
    
}
