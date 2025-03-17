package ejercicio4_17;

public class Motocycle extends Vehicle implements Mantenimiento {

	public Motocycle(String matricula, String marca, int anio, FuelType fuelType) {
		super(matricula, marca, anio, fuelType);
	}

	@Override
	public String mantenimiento() {
		return "Cada medio año o cada 500Km";
	}

	@Override
	public double calculateSpeed() {
		return 320.0;
	}

	@Override
	public String toString() {
		return "Moto: " + super.toString();
	}
	
}
