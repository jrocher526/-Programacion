package ejerciciosDeClase;

import java.util.*;

public class ComparadorSet {
    public static void main(String[] args) {
        // Crear instancias de cada tipo de Set
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Agregar elementos a cada Set
        String[] elementos = {"Java", "Python", "C++", "JavaScript", "Ruby", "Java"};
        for (String elemento : elementos) {
            hashSet.add(elemento);
            treeSet.add(elemento);
            linkedHashSet.add(elemento);
        }

        // Imprimir cada Set
        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Iteración con iterador
        System.out.println("\nIteración con HashSet:");
        mostrarElementosConIterador(hashSet);
        System.out.println("\nIteración con TreeSet:");
        mostrarElementosConIterador(treeSet);
        System.out.println("\nIteración con LinkedHashSet:");
        mostrarElementosConIterador(linkedHashSet);
        
        // Medir tiempo de inserción para cada Set
        medirTiempoInsercion(new HashSet<>());
        medirTiempoInsercion(new TreeSet<>());
        medirTiempoInsercion(new LinkedHashSet<>());
        
        // Modificación durante iteración
        System.out.println("\nModificación durante iteración en TreeSet:");
        modificarDuranteIteracion();
    }
    
    private static void mostrarElementosConIterador(Set<String> set) {
        Iterator<String> iterador = set.iterator();
        int contador = 1;
        while (iterador.hasNext()) {
            System.out.println("Elemento #" + contador + ": " + iterador.next());
            contador++;
        }
    }
    
    private static void medirTiempoInsercion(Set<Integer> set) {
        long inicio = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            set.add(i);
        }
        long fin = System.nanoTime();
        System.out.println("Tiempo de inserción para " + set.getClass().getSimpleName() + ": " + (fin - inicio) + " ns");
    }
    
    private static void modificarDuranteIteracion() {
        Set<Integer> treeSet = new TreeSet<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            treeSet.add(rand.nextInt(100) + 1);
        }
        System.out.println("TreeSet original: " + treeSet);

        try {
            Iterator<Integer> iterador = treeSet.iterator();
            while (iterador.hasNext()) {
                int num = iterador.next();
                if (num % 2 == 0) {
                    iterador.remove();
                }
                if (num == 50) {
                    treeSet.add(1000); // Esto lanzara ConcurrentModificationException
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Excepción atrapada: No se puede modificar la colección mientras se itera sobre ella.");
        }
        System.out.println("TreeSet modificado: " + treeSet);
    }
}