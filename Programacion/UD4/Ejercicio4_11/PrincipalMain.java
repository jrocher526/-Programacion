package ejercicio4_11;

public class PrincipalMain {
	public static void main(String[] args) {
		
		// Creamos objetos tipo libro
		Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", "123456789", 1943);
        Libro libro2 = new Libro("1984", "George Orwell", "987654321", 1949);
        Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry", "123456789", 1943);
        
        // Imprimir los libros usando el metodo toString
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
        
        // Comparar dos libros con el mismo ISBN
        System.out.println("\nComparar libro1 y libro3, Las ISBN son iguales?: " + libro1.equals(libro3));  
        
        // Comparar dos libros con ISBN diferentes
        System.out.println("Comparar libro1 y libro2, Las ISBN son diferentes?: " + libro1.equals(libro2));  
	}
}
