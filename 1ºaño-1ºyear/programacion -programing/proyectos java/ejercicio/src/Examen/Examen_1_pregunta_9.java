package Examen;

import java.util.Scanner;

public class Examen_1_pregunta_9 {
	
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int numero,resultado;
		boolean semaforo=false;
		System.out.println("de que numero quieres calcular la tabla de multiplicar");
		numero=t.nextInt();
		for(int i = 0; i <= 20; i++) {
			resultado=numero*i;
			if (resultado%2==0) {
				System.out.println(numero+"X"+i+"= "+resultado);
				semaforo=true;
			}
		}
		if (semaforo=false) {
			System.out.println("No hay numero que ostrar");
		}
		
		t.close();
	}
}
