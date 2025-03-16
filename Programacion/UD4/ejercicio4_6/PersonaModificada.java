package ejercicio4_6;

public class PersonaModificada {

    // Atributos de la clase
    private String nombre;
    private int edad;
    private double estatura;
    private Sexo sexo;  // Nuevo atributo para indicar el sexo

    // Constructor
    public PersonaModificada(String nombre, int edad, double estatura, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.sexo = sexo;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    // Método para imprimir la información de la persona
    public void imprimirInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
        System.out.println("Sexo: " + sexo);
    }
}
