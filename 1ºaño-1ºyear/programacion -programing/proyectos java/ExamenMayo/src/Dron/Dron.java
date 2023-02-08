package Dron;

public class Dron {

	String estado;
	Double cargaBateria;
	
	public Dron() {
		this.estado="Base";
		this.cargaBateria=100.0;
		
	}
	

	@Override
	public String toString() {
		return "Dron [estado=" + estado + ", cargaBateria=" + cargaBateria + "]";
	}
	
	public void volar() throws NivelBateriaCritico{
		this.estado="Vuelo";
		this.cargaBateria-=10.0;
		if (this.cargaBateria<=20.0) {
			throw new NivelBateriaCritico("Bateria en estado critico");
		}else if (this.cargaBateria<0) {
			this.cargaBateria=0.0;
			System.out.println("Sin Bateria");
		}
	}
	public void aterrizar() {
		this.estado="Base";
	}
	public double getCargaBateria() {
		return this.cargaBateria;
	}
	
}
