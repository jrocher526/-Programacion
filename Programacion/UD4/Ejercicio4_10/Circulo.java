package figurasGeometricas;

public class Circulo extends Figura {

	double radio;
	
	Circulo(String nombre) {
		super(nombre);
	}
	
    // Constructor del nombre y el radio
    public Circulo(double radio) {
        super("Circulo"); // Llama al constructor de la clase base
        this.radio = radio;
    }

    // Sobrescribir el metodo calcularArea() para calcular el área de un circulo
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio; // Esto nos dice que el area de un círculo: PI * radio^2
    }
}
