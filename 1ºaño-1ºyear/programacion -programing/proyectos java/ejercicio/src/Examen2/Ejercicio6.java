package Examen2;

import java.util.Scanner;

public class Ejercicio6 {
	public static int diagonales(int[][] n, int tam) {
		int suma1=0,suma2=0;
		//diagonal izquierda derecha
		for (int i = 0; i < tam; i++) {
			suma1+=n[i][i];
		}
		for (int i = 0; i < tam; i++) {
			suma2+=n[i][(tam-i)-1];
		}
		if (suma1==suma2) {
			return suma1;
		}else {
			return 0;
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		System.out.println("Tamaño del cuadrado magico");
		int tam=0;
		tam=t.nextInt();
			int[][] matriz= new int[tam][tam];
			boolean correcta=false;
			while (correcta==false) {
				for (int i = 0; i < tam; i++) {
					for (int j = 0; j < tam; j++) {
						System.out.println("Introduce el valor positivo para la posicion "+i+"-"+j);
						matriz[i][j]=t.nextInt();
					}
				}
				System.out.println("la matriz resultante es esta");
				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz.length; j++) {
						System.out.print("|"+matriz[i][j]);
					}
					System.out.println("|");
					System.out.println("--------");
				}
				System.out.println("Es correcta?");
				String resultado=t.next();
				if (resultado.equals("si")) {
					correcta=true;
				}
			}
		int solucion=diagonales(matriz,tam);
		if (solucion!=0) {
			System.out.println("Es un cuadrado magico simplificado, la suma de sus diagonales es:");
			System.out.println(solucion);
		}else {
			System.out.println("no es un cuadrado magico");
		}
		t.close();
	}

}
