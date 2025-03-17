package ejercicio4_17;

final public class Car extends Vehicle implements Mantenimiento {

	public Car(String matricula, String marca, int anio, FuelType fuelType) {
		super(matricula, marca, anio, fuelType);
	}

	@Override
	public String mantenimiento() {
		return "Cada año o cada 2000Km";
	}

	@Override
	public double calculateSpeed() {
		return 240.0;
	}
	
	@Override
	public String toString() {
		return "Carro: " + super.toString();
	}
}
