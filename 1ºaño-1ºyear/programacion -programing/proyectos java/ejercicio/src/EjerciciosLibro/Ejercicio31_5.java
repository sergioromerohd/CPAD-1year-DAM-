/*
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedir� la altura. El palo horizontal de la L tendr� una longitud de la
mitad (divisi�n entera entre 2) de la altura m�s uno.
 * 
 */

package EjerciciosLibro;

import java.util.Scanner;

public class Ejercicio31_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		int altura=0;
		System.out.println("Introduzca la altura de la L");
		altura=t.nextInt();
		System.out.println("____________________________");
		for (int i = 0; i < (altura-1); i++) {
			System.out.println("*");
		}
		for (int c = 0; c <=(altura/2); c++) {
			System.out.print("*");
		}
		t.close();
	}

}
