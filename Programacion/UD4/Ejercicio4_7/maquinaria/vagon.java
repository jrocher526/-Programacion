package maquinarias;

public class vagon {
	//VAGONES
		private int id;
		private int cargaMax;
		private double cargaActual;
		private String mercacia;
			
	public vagon(int id, int cargaMax, double cargaActual, String mercancia) {
		this.id = id;
		this.cargaMax = cargaMax;
		this.cargaActual = cargaActual;
		this.mercacia = mercancia;			
	}	
}

