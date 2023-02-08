package ejercicio;

import java.util.Scanner;

public class ejercicio21 {
	public static void main(String[] args) {
		//habilitar teclado
			Scanner teclado = new Scanner(System.in);
		//declalrar variables
			int a=1,b=0,i=0,c=0;
			while (i<10) {
				c=a+b;
				System.out.println(a+"+"+b+"="+c);
				b=a;
				a=c;
				i++;
				
			}
		teclado.close();	
	}
}
