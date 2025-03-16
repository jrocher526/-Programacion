package ejercicio4_5;

public class ContadorMain {

	public static void main(String[] args) {
		
		// Crear objetos de la clase ContadorObjetos
		ContadorObjetos objeto1 = new ContadorObjetos();
		ContadorObjetos objeto2 = new ContadorObjetos();
		ContadorObjetos objeto3 = new ContadorObjetos();

		// Llamar al método estático para mostrar cuántos objetos se han creado
		ContadorObjetos.mostrarTotalObjetos(); // Debería mostrar 3
	}
}
