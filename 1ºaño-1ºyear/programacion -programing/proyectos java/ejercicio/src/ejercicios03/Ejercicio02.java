package ejercicios03;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double cantidad = 71283.567811;
		System.out.println();
		System.out.println("Ejemplo para mostrar un mismo valor con varios formatos");
		// El simbolo %n es un salto de linea
		// Formato normal double y float
		System.out.printf("%nEl valor de la variable cantidad es %f", cantidad);
		// Formato notaci�n cient�fica
		System.out.printf("%nEl valor de la variable cantidad es %e", cantidad);
		// Formato con 2 decimales
		System.out.printf("%nEl valor de la variable cantidad es %.2f", cantidad);
		// Formato con 6 decimales
		System.out.printf("%nEl valor de la variable cantidad es %.6f", cantidad);
		// Formato con simbolo + y 2 decimales
		System.out.printf("%nEl valor de la variable cantidad es %+.2f", cantidad);
		// Formato con espacios en blanco (suman 11 todas las cifras) con 2 decimales
		System.out.printf("%nEl valor de la variable cantidad es %11.2f", cantidad);
		// Formato con espacios en blanco (suman 11 todas las cifras) con s�mbolo + y 2 decimales
		System.out.printf("%nEl valor de la variable cantidad es %+11.2f", cantidad);
		// Formato con ceros delante (suman 11 todas las cifras) con 2 decimales
		System.out.printf("%nEl valor de la variable cantidad es %011.2f", cantidad);
		// Formato con ceros delante (suman 11 todas las cifras) con s�mbolo + y 2 decimales
		System.out.printf("%nEl valor de la variable cantidad es %+011.2f", cantidad);
		// Formato separando los miles (71,283.567811 en lugar de 71283.567811)
		System.out.printf("%nEl valor de la variable cantidad es %,f", cantidad);
	}

}
