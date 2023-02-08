package ejercicio;

import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {
		//habilitar teclado
			Scanner teclado = new Scanner(System.in);
		//declalrar variables
			int numero=0;
		//pedir un numero
			System.out.println("insertar cualquier numero entero");
			numero=teclado.nextInt();
		//operacion para saber si es par
			if ((numero%2)==0) {
				System.out.println("el numero "+numero+" es par");
			}
			else {
				System.out.println("el numero "+numero+" es impar");
			}
			teclado.close();
	}
}
