package ejercicio4_9;

class Coche extends Vehiculo {
    // Atributo de Coche
    int numPuertas;

    // Constructor de los atributos de Vehiculo y Coche
    public Coche(String marca, String modelo, int anio, int numPuertas) {
        super(marca, modelo, anio); // Llama al constructor de la clase base
        this.numPuertas = numPuertas;
    }

    // Método sobreescrito para mostrarDetalles() e incluir el número de puertas
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método mostrarDetalles() de la clase base
        System.out.println("Número de puertas: " + numPuertas);
    }
}