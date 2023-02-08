package Examen2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int numeros[]=new int[10];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Que numero quieres guardae en la posicion:"+i);
			numeros[i]=t.nextInt();
		}
		System.out.print("Su array inverso es: ");
		for (int i = (numeros.length-1); i >=0 ; i--) {
			System.out.print(numeros[i]+" ");
		}
		t.close();
	}

}
