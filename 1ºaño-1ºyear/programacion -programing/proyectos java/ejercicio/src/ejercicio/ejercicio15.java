package ejercicio;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		//habilitar teclado
		Scanner teclado = new Scanner(System.in);
		//definir variables
		float numero=0;
		//pedir numero
		System.out.println("Elige un numero.");
		numero=teclado.nextFloat();
		if (numero==50) {
			System.out.println("Tu numero es = a 50.");
		}			
		else if (numero<50) {
			System.out.println("Tu numero es menor que 50.");
		}
		else {
			System.out.println("Tu numero es mayor que 50.");
	
		}
		teclado.close();
	}
}
