package ejercicio4_17;

abstract class Vehicle implements Mantenimiento {
	protected static int vehicleCount = 0;
	protected String matricula;
	protected String marca;
	protected int anio;
	protected FuelType fuelType;

	public Vehicle(String matricula, String marca, int anio, FuelType fuelType) {
		this.matricula = matricula;
		this.marca = marca;
		this.anio = anio;
		this.fuelType = fuelType;
		vehicleCount++;
	}

	public abstract double calculateSpeed();
	
	public static int getVehicleCount() {
		return vehicleCount;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Vehicle vehicle = (Vehicle) obj;
			return matricula.equals(vehicle.matricula);
	}

	@Override
	public String toString() {
		return "matricula: " + matricula + ", Marca: " + marca + ","
				+ " Año: " + anio + ", Combustible: " + fuelType;
	}	
	
	// Get y Set
	public String getMatricula() { 
		return matricula; 
	}
	
    public void setMatricula(String matricula) { 
    	this.matricula = matricula; 
    }
    
    public String getMarca() { 
    	return marca; 
    }
    
    public void setMarca(String marca) { 
    	this.marca = marca;
    }
    
    public int getAnio() { 
    	return anio;
    }
    
    public void setAnio(int anio) { 
    	this.anio = anio; 
    }
    
    public FuelType getFuelType() { 
    	return fuelType; 
    }
    
    public void setFuelType(FuelType fuelType) { 
    	this.fuelType = fuelType; 
    }
}
