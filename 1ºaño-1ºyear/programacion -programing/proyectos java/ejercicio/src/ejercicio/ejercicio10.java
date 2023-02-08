package ejercicio;

import java.util.Scanner;

public class ejercicio10 {
	public static final double pi=Math.PI;
	public static void main(String[] args) {
		//comando de teclado
		Scanner teclado = new Scanner(System.in);
		//declaracion de variables
		double solucion=0,radio1=0;

		//solicitar el radio
		System.out.println("cual es el radio de la circunferencia");
		radio1=teclado.nextDouble();
		solucion=(pi*(radio1*radio1));
		System.out.println("la longitud de la circunferencia de un circulo de "+radio1+" de radio es "+solucion);
		teclado.close();
	}
}
