package empresa;

import maquinarias.tren;
import maquinarias.vagon;
import personal.mecanico;
import personal.maquinista;
import personal.jefeEstacion;
import maquinarias.locomotora;

public class Empresa {
	public static void main(String[] args) {
	
		//Creamos al personal
		mecanico mecanico = new mecanico("Juan Perez", 123456789, "frenos");
		maquinista maquinista = new maquinista("Carlos Ruiz", "987654321A", 2500, "Senior");
		locomotora locomotora = new locomotora("AB1234", "2500HP", 2010, mecanico);

		vagon vagon1 = new vagon(1, 2000, 982.45, "Cereal");
		vagon vagon2 = new vagon(2, 3000, 2578.12, "Electronica");
		vagon vagon3 = new vagon(3, 2500, 11487.80, "Ropa");

		// Crear tren
		tren tren = new tren(locomotora, maquinista);

		// Añadir vagones al tren
		tren.engancharVagon(vagon1); 
		tren.engancharVagon(vagon2); 
		tren.engancharVagon(vagon3); 
	}
}


