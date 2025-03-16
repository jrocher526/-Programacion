package ejercicio4_5;

public class ContadorObjetos {

    // Atributo estático para llevar el conteo de objetos creados
    private static int totalObjetos = 0;

    // Constructor
    public ContadorObjetos() {
        // Cada vez que se crea un objeto, incrementamos el contador
        totalObjetos++;
    }

    // Método estático para mostrar el total de objetos creados
    public static void mostrarTotalObjetos() {
        System.out.println("Total de objetos creados: " + totalObjetos);
    }
}