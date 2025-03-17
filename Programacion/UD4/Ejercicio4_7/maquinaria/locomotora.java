package maquinarias;

import personal.mecanico;

public class locomotora {
	//LOCOMOTORAS
		private String matricula;
		private String potencia;
		private int antiguedad ;
		private mecanico mecanicoAsig;
				
	public locomotora(String matricula, String potencia, int antiguedad, mecanico mecanicoAsig) {
		this.matricula = matricula;
		this.potencia = potencia;
		this.antiguedad = antiguedad;
		this.mecanicoAsig = mecanicoAsig;			
	}		
}
