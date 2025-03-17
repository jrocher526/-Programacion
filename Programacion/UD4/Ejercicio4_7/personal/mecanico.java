package personal;

public class mecanico {
	//MECANICOS
		private String nombre;
		private int telefono;
		private Especialidad especialidad;
	
	public mecanico(String nombre, int telefono, String especialidad) {
		this.nombre =nombre;
		this.telefono = telefono;
		this.especialidad = Especialidad.valueOf(especialidad);
	}
	
	public enum Especialidad{
		frenos, hidraulica, electricidad, motor
	}
}



