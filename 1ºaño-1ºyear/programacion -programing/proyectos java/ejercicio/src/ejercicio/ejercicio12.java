package ejercicio;

import java.util.Scanner;

public class ejercicio12 {
	public static final int ahora=2021;
	public static void main(String[] args) {
		int nacimiento=0;
		//habilitar teclado
			Scanner teclado = new Scanner(System.in);
		//solicitar a�o
			System.out.println("�de que a�o eres?");
			nacimiento=teclado.nextInt();
		//solucion
			System.out.println("tienes "+(ahora-nacimiento)+" a�os");
		teclado.close();
		}
		
	}
