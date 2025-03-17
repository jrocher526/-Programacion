package personal;

import java.time.LocalDateTime;

public class jefeEstacion {
	//JEFES DE ESTACION
		private String nombre;
		private String dni;
		LocalDateTime fechaNombramiento;
			
			
	public jefeEstacion(String nombre, String dni, LocalDateTime fechaNombramiento){
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNombramiento = fechaNombramiento;
	}
		
}
