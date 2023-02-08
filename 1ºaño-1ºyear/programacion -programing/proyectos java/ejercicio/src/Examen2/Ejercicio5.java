package Examen2;

import java.util.Scanner;


public class Ejercicio5 {
	public static void mostrar(int[][] n ,int[] f, int[] c) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("|"+n[i][j]);
			}
			System.out.println("|=\t"+f[i]);
			System.out.println("--------");
		}
		System.out.println("-"+c[0]+"-"+c[1]+"-"+c[2]+"-"+c[3]);
	}
	public static int[] filas(int[][] n) {
		int resultados[]=new int[3];
		for (int i = 0; i < 3; i++) {
			int suma=0;
			for (int j = 0; j < 4; j++) {
				suma+=n[i][j];
			}
			resultados[i]=suma;
		}
		return resultados;
	}
	public static int[] columnas(int[][] n) {
		int resultados[]=new int[4];
		for (int i = 0; i < 4; i++) {
			int suma=0;
			for (int j = 0; j < 3; j++) {
				suma+=n[j][i];
			}
			resultados[i]=suma;
		}
		return resultados;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		int tabla[][]=new int[3][4];
		int filas[]=new int[3],columnas[]=new int[4];
		for (int i = 0; i <3; i++) {
			for (int j = 0; j <4; j++) {
				System.out.println("Introduce el valor entero positivo para la posicion "+(i+1)+" "+(j+1));
				tabla[i][j]=t.nextInt();
				
		
			}
		}
		for (int i = 0; i < 3; i++) {
			filas[i]=(filas(tabla)[i]);
		}
		for (int i = 0; i < 4; i++) {
			columnas[i]=(columnas(tabla)[i]);
		}
		mostrar(tabla, filas , columnas);
		t.close();
	}

}
