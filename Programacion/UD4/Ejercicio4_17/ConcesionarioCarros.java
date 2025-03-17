package ejercicio4_17;

public class ConcesionarioCarros {
	public static void main(String[] args) {

		//Creamos objetos
		Vehicle carro1 = new Car("ABC123", "Toyota", 2020, FuelType.GASOLINA);
		Vehicle carro2 = new Car("XYZ789", "Honda", 2022, FuelType.ELECTRICO);
		Vehicle carro3 = new Car("ABC123", "lexus", 2020, FuelType.GASOLINA);
        
		//Comparamos
        System.out.println("Comparando carro1 y carro2: " + carro1.equals(carro2));
        System.out.println("Comparando carro1 y carro3: " + carro1.equals(carro3)); 
        System.out.println("Comparando carro2 y carro3: " + carro2.equals(carro3));
        System.out.println();
        
        //Convertimos los objetos 
        Car tacoma = (Car) carro1;
        Car typeR = (Car) carro2;
        Car NX = (Car) carro3;
        
        //Informacion
        System.out.println("Toyota tacoma");
        System.out.println("velocidad Max: " + tacoma.calculateSpeed() + " km/h");
        System.out.println("Mantenimiento: " + tacoma.mantenimiento());
        System.out.println();
        
        System.out.println("Honda typeR");
        System.out.println("Volocidad Max: " + typeR.calculateSpeed() + " km/h");
        System.out.println("Mantenimiento: " + typeR.mantenimiento());
        System.out.println();
        
        System.out.println("Lexus NX");
        System.out.println("Velocidad Max: " + NX.calculateSpeed() + " km/h");
        System.out.println("Mantenimiento: " + NX.mantenimiento());
        System.out.println();
        
        System.out.println("Total Vehicles: " + Vehicle.getVehicleCount());		
		
		
	}
}
