package ejemplos;

import java.io.IOException;

public class DemoFlujosSalida {

    public static void main(String[] args) throws IOException {

        // write: escribe un solo byte (el carácter 'H')
        System.out.write('H');
        System.out.write('\n'); // salto de línea (equivalente a println)

        // write + flush: necesario si no se imprime salto de línea y el buffer no se vacía automáticamente
        System.out.write('A');
        System.out.flush(); // fuerza que se muestre el carácter A en consola

        // print: imprime sin salto de línea
        System.out.print(" <- Esto lo imprimió print");
        
        // println: imprime y añade salto de línea
        System.out.println("\nEsto lo imprimió println con salto de línea");

        // printf: permite formatear texto (como en C)
        String nombre = "Ana";
        int edad = 25;
        System.out.printf("Nombre: %s, Edad: %d\n", nombre, edad);
        // %s → String | %d → double-Int
    }
}

