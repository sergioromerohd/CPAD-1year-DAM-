package ejercicio;

import java.util.Scanner;

public class Ejercicio22 {
	public static void main(String[] args) {
		//habilitar teclado
			Scanner teclado = new Scanner(System.in);
		//declalrar variables
			int a=1,b=0,i=0,c=0,rango=0;
			System.out.println("¿Que rango quieres?:");
			rango=teclado.nextInt();
			while (i<rango) {
				c=a+b;
				System.out.println(a+"+"+b+"3="+c);
				b=a;
				a=c;
				i++;
				
			}
		teclado.close();	
	}
}
