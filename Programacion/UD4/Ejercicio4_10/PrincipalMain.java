package figurasGeometricas;

public class PrincipalMain {
	public static void main(String[] args) {

		// Creamos un array de tamaño 2 con tipo Figura
        Figura[] figuras = new Figura[2];

        // Creamos instancias de Circulo y Rectangulo y lo agregmos al array
        figuras[0] = new Circulo(5.0); 
        figuras[1] = new Rectangulo(4.0, 6.0); 

        // Bucle para recorrer el array de figuras
        for (Figura figura : figuras) {
        	
            // Llamar a los métodos mostrarInfo y calcularArea de cada figura
            figura.mostrarinfo();
            System.out.println("Area: " + figura.calcularArea());
            System.out.println(); // Espacio entre cada figura
        }
    }
}
