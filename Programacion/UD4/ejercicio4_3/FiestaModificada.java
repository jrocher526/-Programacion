package ejercicio4_3;

public class FiestaModificada {
	public static void main(String[] args) {
        // Crear personas con el constructor por defecto
	PersonaModificada pepe = new PersonaModificada(); 
	PersonaModificada paco = new PersonaModificada(); 
        
        // Imprimir los datos de las personas creadas por defecto
        System.out.println("Pepe: " + pepe);
        System.out.println("Paco: " + paco);
        
        // Crear personas usando el constructor con parámetros
        PersonaModificada juan = new PersonaModificada("Juan", 30, 1.80);
        PersonaModificada maria = new PersonaModificada("Maria", 25, 1.65);

        // Imprimir los datos de las personas creadas con parámetros
        System.out.println("Juan: " + juan);
        System.out.println("Maria: " + maria);
    }
}

