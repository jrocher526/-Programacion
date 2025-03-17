package ejercicio4_9;

public class PrincipalMain {
	public static void main(String[] args) {
		
		// Creamos un objeto de la clase Coche
        Coche coche = new Coche("Toyota", "Corolla", 2022, 4);

        // Creamos un objeto de la clase Motocicleta s
        Motocicleta moto = new Motocicleta("Harley-Davidson", "Sportster", 2020, true);

        // Llamamos al método mostrarDetalles() de cada objeto
        System.out.println("Detalles del coche:");
        coche.mostrarDetalles();
        System.out.println();

        System.out.println("Detalles de la motocicleta:");
        moto.mostrarDetalles();
    }

}
