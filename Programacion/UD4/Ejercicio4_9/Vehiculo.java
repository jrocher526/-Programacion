package ejercicio4_9;

public class Vehiculo {
    // Atributos comunes a todos los vehículos
    String marca;
    String modelo;
    int anio;

    // Constructor para inicializar los atributos
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Método para mostrar los detalles del vehículo
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }
}
