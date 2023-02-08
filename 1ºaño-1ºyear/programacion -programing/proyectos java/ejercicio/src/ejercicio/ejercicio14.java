package ejercicio;

import java.util.Scanner;

public class ejercicio14 {
	public static void main(String[] args) {
		//habilitar teclado
		Scanner teclado = new Scanner(System.in);
		//determinar variables
		int numero=0;
		//pedir numero
		System.out.println("dame un numero del 0-9");
		numero=teclado.nextInt();
		//resultado
		while (numero < 0 || numero > 9) {
			System.out.println("numero fuera de rango, elija uno entre el 0-9");
			numero=teclado.nextInt();
		}
		if (numero>=0&&numero<=9) {
			if (numero==1) {
				System.out.println("uno");
			}
			else if (numero==2) {
				System.out.println("dos");
			}
			else if (numero==3) {
				System.out.println("tres");
			}
			else if (numero==4) {
				System.out.println("cuatro");
			}
			else if (numero==5) {
				System.out.println("cinco");
			}
			else if (numero==6) {
				System.out.println("seis");
			}
			else if (numero==7) {
				System.out.println("siete");
			}
			else if (numero==8) {
				System.out.println("ocho");
			}
			else if (numero==9) {
				System.out.println("nueve");
			}
			else if (numero==0) {
				System.out.println("cero");
			}
		}
		teclado.close();
	}
}