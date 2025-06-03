package ejemplos;

import java.io.File;
import java.io.IOException;

public class GestionFichero {
    public static void main(String[] args) {
        try {
            File fichero = new File("registro.txt");

            if (fichero.createNewFile()) {
                System.out.println("Fichero creado");
            } else {
                System.out.println("El fichero ya existe");
            }

            File carpeta = new File("datos");
            if (carpeta.mkdir()) {
                System.out.println("Carpeta creada");
            }

            // Eliminar (descomenta si quieres probarlo)
            // fichero.delete();
            // carpeta.delete();

        } catch (IOException e) {
            System.err.println("Error al crear el fichero: " + e.getMessage());
        }
    }
}

