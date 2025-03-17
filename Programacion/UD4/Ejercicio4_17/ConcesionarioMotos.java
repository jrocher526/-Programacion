package ejercicio4_17;

public class ConcesionarioMotos {
	public static void main(String[] args) {
		//Creamos objetos
		Vehicle moto1 = new Motocycle("ABC123", "Kawasaki", 2020, FuelType.GASOLINA);
		Vehicle moto2 = new Motocycle("XYZ789", "Yamaha", 2022, FuelType.ELECTRICO);
		Vehicle moto3 = new Motocycle("ABC123", "Ducati", 2020, FuelType.GASOLINA);
        
		//Comparamos
        System.out.println("Comparando moto1 y moto2: " + moto1.equals(moto2));
        System.out.println("Comparando moto1 y moto3: " + moto1.equals(moto3)); 
        System.out.println("Comparando moto2 y moto3: " + moto2.equals(moto3));
        System.out.println();
        
        //Convertimos los objetos 
        Motocycle NinjaH2 = (Motocycle) moto1;
        Motocycle YZFR1 = (Motocycle) moto2;
        Motocycle PanigaleV4 = (Motocycle) moto3;
        
        //Informacion
        System.out.println("kawasaki NinjaH2");
        System.out.println("Velocidad Max: " + NinjaH2.calculateSpeed() + " km/h");
        System.out.println("Mantenimiento: " + NinjaH2.mantenimiento());
        System.out.println();
        
        System.out.println("Yamaha YZFR1");
        System.out.println("Volocidad Max: " + YZFR1.calculateSpeed() + " km/h");
        System.out.println("Mantenimiento: " + YZFR1.mantenimiento());
        System.out.println();
        
        System.out.println("Ducati PanigaleV4");
        System.out.println("Velocidad Max: " + PanigaleV4.calculateSpeed() + " km/h");
        System.out.println("Mantenimiento: " + PanigaleV4.mantenimiento());
        System.out.println();
        
        System.out.println("Total Vehicles: " + Vehicle.getVehicleCount());		

		
	}
}
