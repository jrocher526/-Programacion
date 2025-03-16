package ejercicio4_3;

public class PersonaModificada {

	// Atributos
    private String nombre;
    private int edad;
    private double estatura;

    // Constructor por defecto
    public PersonaModificada() {
        this.nombre = "anónimo";
        this.edad = 18;
        this.estatura = 1.70;
    }
    
    // Constructor con parámetros (nombre, edad, estatura)
    public PersonaModificada(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }
    
    // Método para incrementar la edad en uno
    public void cumplirAños() {
        edad++; // Aumenta la edad en 1
    }
    
    // Método para incrementar la estatura según un valor dado
    public void crecer(double incremento) {
        estatura += incremento; // Aumenta la estatura en el valor proporcionado
    }
    
    // Métodos getters para obtener los atributos
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public double getEstatura() {
        return estatura;
    }
    
    // Método toString para representar a la persona como una cadena
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Estatura: " + estatura;
    }
}
