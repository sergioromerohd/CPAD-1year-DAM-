package automoviles;

public class automovil implements Comparable<automovil> {
	
		int NPuertas;
		char combustible;
		int lcombustible;
		int velocidad;
		static int numAutos;
		
		public int getNPuertas() {
			return NPuertas;
		}
		public void setNPuertas(int nPuertas) {
			NPuertas = nPuertas;
		}
		public char getCombustible() {
			return combustible;
		}
		public void setCombustible(char combustible) {
			this.combustible = combustible;
		}
		public int getLcombustible() {
			return lcombustible;
		}
		public void setLcombustible(int lcombustible) {
			this.lcombustible = lcombustible;
		}
		public int getVelocidad() {
			return velocidad;
		}
		public void setVelocidad(int velocidad) {
			this.velocidad = velocidad;
		}
		public int getNumAutos() {
			return numAutos;
		}
		public void setNumAutos(int numAutos) {
			this.numAutos = numAutos;
		}
		
		public automovil(){
			NPuertas=4;
			combustible='h';
			lcombustible=60;
			velocidad=0;
			numAutos+=1;
			
			
		}
		public automovil(int nPuertas, char combustible, int lcombustible) {
			NPuertas = nPuertas;
			this.combustible = combustible;
			this.lcombustible = lcombustible;
			this.velocidad = 0;
			numAutos+=1;
		}
		
		
		public String toString() {
			return "automovil [NPuertas=" + NPuertas + ", combustible=" + combustible + ", lcombustible=" + lcombustible
					+ ", velocidad=" + velocidad + ", numAutos=" + numAutos + "]";
		}
		public void acelerar (int v) {
			v+=10;
			setVelocidad(v);
		}
		public void frenar (int v) {
			v-=10;
			setVelocidad(v);
		}
		
		public int compareTo(automovil o) {
			int x;
			if (getCombustible()<o.getCombustible()) {
				x=-1;
			}else if (getCombustible()==o.getCombustible()) {
				x=0;
			}else {
				x=1;
			}
			return x;		
		}
		
		
		
}
		
		

