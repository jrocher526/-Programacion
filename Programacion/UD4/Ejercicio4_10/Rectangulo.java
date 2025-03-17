package figurasGeometricas;

public class Rectangulo extends Figura {

	double base, altura;

	// Constructor del nombre, base y altura
    public Rectangulo(double base, double altura) {
        super("Rectangulo"); // Llama al constructor de la clase base con el nombre
        this.base = base;
        this.altura = altura;
    }

    // Metedo sobreescrito
    @Override
    public double calcularArea() {
        return base * altura; // El area de un rectángulo = base * altura
    }

}
