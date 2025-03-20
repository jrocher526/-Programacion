package casa;

public class Casa extends Bombilla{

	Bombilla[] bombillas;
	
	Casa (int numBombillas) {
		bombillas = new Bombilla[numBombillas];
	}
	
	void encenderbombillo(int n) {
		bombillas[n].setEstado(true && interrruptorEncendido(false));
	}
	
	void apagarbombillo(int n) {
		bombillas[n].setEstado(false);
	}
}
