package ejemplos;

public class TryCastFinally {
	public static void main(String[] args) {
		System.out.println("Inicio del programa.");

		try {
			int resultado = dividir(10, 0);
			System.out.println("Resultado: " + resultado);
		} catch (ArithmeticException e) {
			System.err.println("Error: División por cero no permitida.");
		}

		System.out.println("Fin del programa.");
	}

	public static int dividir(int a, int b) {
		return a / b; // Esto lanza una excepción si b es 0
	}
}
