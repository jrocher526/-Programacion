package figurasGeometricas;

public class Figura {

	//Atributo
	protected String nombre;
	//constructor
	Figura(String nombre) {
		this.nombre = nombre;
	}
	//Metodo Calcular Area
	public double calcularArea() {
		return 0.0;
	}
	//Metodo Mostrar Informacion
	public void mostrarinfo() {
		System.out.println("La figura es un:" + nombre);
	}
}
