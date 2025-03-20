package casa;

public class Bombilla {

	private boolean estado;

	public boolean estado(boolean estado) {
		return this.estado = estado;
	}
	
	public boolean encendida(boolean encendida) {
		return this.estado = encendida = false;
	}
	
	public boolean apagado(boolean apagado) {
		return this.estado = apagado = false;
	}
	
	public boolean interrruptorEncendido(boolean interruptor) {
		return this.estado = interruptor = !estado;
	}
	
	// Getters y Setters
    public void setEstado(boolean estado) { 
    	this.estado = estado;
    }
    
    public boolean getEstado() { 
    	return estado;
    }
}
