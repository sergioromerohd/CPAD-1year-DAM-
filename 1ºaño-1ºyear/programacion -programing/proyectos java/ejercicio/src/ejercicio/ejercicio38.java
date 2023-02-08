/*
 *
Escribe un programa que lea un número que hay que adivinar.
A continuación, comienza a leer números, y para cada uno nos dice si es
menor o mayor que el que hay que adivinar.
El programa termina cuando se adivine el númer
 */
package ejercicio;

import java.util.Scanner;

public class ejercicio38 {
	public static void main(String[] args) {
		
		int numero=0, dificultad=0, intentos=0;
		Scanner teclado= new Scanner (System.in);
		//dificultad
		System.out.println("Elige un numero para seleccionar dificultad:");
		System.out.println("(siendo el rango desde uno hasta el numero seleccionado)");
		dificultad=teclado.nextInt();
				System.out.println("la dificultad se ha establecido entre 1-"+dificultad);
		int random = (int)(Math. random()*dificultad+1);
		//separacion consola
				System.out.println("__________________________________");
		//comienza el juego
			System.out.println("Adivina el numero :=) ");
			
			while (numero!=random) {
			numero=teclado.nextInt();
			intentos++;
				//numero esta a 2 de diferencia del random
				if (numero>=(random-2)&&numero<=(random+2)&&numero!=random) {
					System.out.println("caliente");
				}
				//si el numero esta fuera del rango
				else if (numero<=0||numero>dificultad) {
					System.out.println("Este valor esta fuera del rango de dificultad");
				}
				//si el numero se acierta
				else if (numero==random) {
				}
				//si el numero esta alejado
				else {
					System.out.println("frio");
				}
			}
		System.out.println("BIEEEN, as adivinado el numero "+random+" en "+intentos+" intento/s");
		teclado.close();	
	}
	
}
