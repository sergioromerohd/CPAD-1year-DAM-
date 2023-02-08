package EjerciciosTema2;

import java.util.Scanner;

public class Ejercicio4 {
	
	private static boolean sabersiprimo(int rdm) {
		 int divisoresexactos=0;
		for (int i = 1; i <=rdm; i++) {
			if (rdm%i==0) {
				divisoresexactos++;
			}
		}
		if (divisoresexactos==2) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner t = new Scanner(System.in);
		
		int tamano=0,rango=0,min=0,max=0,rdm=0;
		boolean perfeccion=false;
		
		//pedir el tamaño del resultado
		System.out.println("¿Tamaño del resultado?");
		tamano=t.nextInt();
		
		//hacer la matriz resultado
		int resultado[]=new int[tamano];
		perfeccion=false;
		while (perfeccion==false) {
			System.out.println("¿Desde que numero quieres sacar numeros primos?");
			min=t.nextInt();
			
			System.out.println("¿hasta?");
			max=t.nextInt();
			rango=max-min;
			if (rango>0) {
				perfeccion=true;
			}else {
				System.out.println("Introduce un ");
			}
		}
		for (int i = 0; i <tamano; i++) {
			boolean semaforo=false;
			while (semaforo==false) {
			rdm=(int)(Math.random()*(rango+1))+min;
			}
			}
		}
	
			
		