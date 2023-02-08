package aviones;

public class Avion {

	String IdAvion;
	Double altura;
	Double alturaMin;
	//constructor por defecto
	public Avion() {
		IdAvion ="";
		this.altura = 0.0;
		this.alturaMin = 1000.0;
	}
	//constructor por campos (comprobara la altura antes de crearse)
	
	//getters y setters
	public Avion(String idAvion, Double altura, Double alturaMin) {
		IdAvion = idAvion;
		this.altura = altura;
		this.alturaMin = alturaMin;
	}
	public String getIdAvion() {
		return IdAvion;
	}
	public void setIdAvion(String idAvion) {
		IdAvion = idAvion;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getAlturaMin() {
		return alturaMin;
	}
	public void setAlturaMin(Double alturaMin) {
		this.alturaMin = alturaMin;
	}
	//to string

	@Override
	public String toString() {
		return "Avion [IdAvion=" + IdAvion + ", altura=" + altura + ", alturaMin=" + alturaMin + "]";
	}
	
	public void ascender() {
		this.altura+=100.0;
	}
	
	public void descender() throws AvionPorDebajoAlturaMinima {
			if (this.altura-100.0<this.alturaMin) {
				throw new AvionPorDebajoAlturaMinima("no puede descender por debajo del minimo");
			}else{
				this.altura-=100;
			}	
	}	
}
