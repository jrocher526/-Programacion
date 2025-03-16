package ejercicio4_2;

import ejercicio4_1.Persona;

public class Fiesta {
	public static void main(String[] args) {
		
		// Crear una persona
        Persona persona1 = new Persona("Juan", 25, 1.75);
        
        // Mostrar datos iniciales
        System.out.println(persona1);
        
        // Llamar al metodo cumplirAños y crecer
        persona1.cumplirAños(); // Incrementa la edad en 1
        persona1.crecer(0.05); // Incrementa la estatura en 5 cm
        
        // Mostrar datos después de modificar la edad y la estatura
        System.out.println("Después de cumplir años y crecer:");
        System.out.println(persona1);
    }
}

