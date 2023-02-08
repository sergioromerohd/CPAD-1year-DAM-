package Examen;

import java.util.Scanner;

public class Examen_1_pregunta_8 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		
		int numero=-1 , suma=1;
		while(numero<0) {
		System.out.println("¿de que numero quieres calcular el factorial?");
		numero=t.nextInt();
		if (numero<0) {
			System.err.println("error. introduzca un numero positiivo");
		}
		}
		for (int i = 2; i <= numero; i++) {
			suma*=i;
		}
		System.out.println("! "+numero+"= "+suma);
		t.close();
	}
}
