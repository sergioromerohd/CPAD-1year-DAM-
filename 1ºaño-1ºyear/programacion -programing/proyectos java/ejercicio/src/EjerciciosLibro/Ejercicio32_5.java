/*
 * Escribe un programa que, dado un número entero positivo, diga cuáles son y
cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
números largos.
 * 
 */


package EjerciciosLibro;

import java.util.Scanner;

public class Ejercicio32_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t=new Scanner(System.in);
		
		int numero=0, volteado=0;
		//pedir numero
		System.out.println("introduce un numero");
		numero=t.nextInt();
		//dar la vuelta y contar cifras
		while(numero>0) {
			//sacar el ultimo valor
			volteado=(volteado*10)+(numero%10);
			//numero sin el ultimo valor y un "0" al final
			numero/=10;
		}
		//ir de derecha a izquierda viendo si es par y añadirlo a una suma de pares
		System.out.print("Las cifras pares son: ");
		int cifra=0,suma=0;
		while(volteado>0) {
			cifra=volteado%10;
				if ((cifra%2)==0) {
				System.err.print(cifra+" ");
				suma+=cifra;
				}
			volteado/=10;
		}
		System.out.println();
		System.out.println("la suma es "+suma);
		t.close();
	}

}
