package ejercicio4_9;

class Motocicleta extends Vehiculo {
    // Atributo de Motocicleta
    boolean tieneSidecar;

    // Constructor de los atributos de Vehiculo y Motocicleta
    public Motocicleta(String marca, String modelo, int anio, boolean tieneSidecar) {
        super(marca, modelo, anio); // Llama al constructor de la clase base
        this.tieneSidecar = tieneSidecar;
    }

    // Sobrescribir el método mostrarDetalles() para incluir si tiene sidecar
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); 
        System.out.println("Tiene Sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }
}