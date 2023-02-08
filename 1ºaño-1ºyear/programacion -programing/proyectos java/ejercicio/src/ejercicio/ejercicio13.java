package ejercicio;

import java.util.Scanner;

public class ejercicio13 {
	public static void main(String[] args) {
		//declaracion de variables
			float ano=0;
		//habilitar teclado
			Scanner teclado = new Scanner(System.in);
		//calculos
			System.out.println("dame un año");
			ano=teclado.nextInt();
		float resultado= ano % 400;
		System.out.println(resultado);
		if (resultado==0) {
			if ((ano%400)==0) {
				System.out.println("el año "+ano+" es bisiesto");
				}
			else if ((ano%100==0)) {
				System.out.println("el año "+ano+" no es bisiesto");
			}
			}
				
		else {
			System.out.println("el año "+ano+" no es bisiesto");
		}
		teclado.close();
	}
}
