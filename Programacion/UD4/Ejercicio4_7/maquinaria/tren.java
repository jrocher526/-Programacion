package maquinarias;

import personal.maquinista;

public class tren {
	//TRENES
		private locomotora locomotoraAsig ;
		private maquinista maquinistaAsig;
		private vagon[] vagones;
		private int numVagones; 
				
	public tren(locomotora locomotoraAsig, maquinista maquinistaAsig) {
		this.locomotoraAsig = locomotoraAsig;
		this.maquinistaAsig = maquinistaAsig;
		this.vagones = new vagon [5];
		this.numVagones = 0;
	}
	 
	 public void engancharVagon(vagon vagon) {
	        if (numVagones < 5) {
	            vagones[numVagones] = vagon;
	            numVagones++; 
	            System.out.println("Vagon " + vagon + " añadido al tren.");
	        } else {
	            System.out.println("No se pueden añadir mas vagones. Capacidad maxima alcanzada.");
	        }
	    }
	 
}

