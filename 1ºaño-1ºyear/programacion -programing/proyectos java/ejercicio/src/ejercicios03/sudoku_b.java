package ejercicios03;

import java.util.Scanner;

public class sudoku_b {
	private static int[][] RellenaCuadros(int tamano){
		int matriz[][]=new int [tamano][tamano];
		tamano-=1;
		matriz[0][0]=1;
		matriz[0][tamano]=2;
		matriz[tamano][0]=3;
		matriz[tamano][tamano]=4;
		return matriz;
	}
	private static void sudoku(int [][] matriz,int tamano) {
		for (int j = 0; j < tamano; j++) {
			for (int i = 0; i < tamano; i++) {
					System.out.print("--");
			}
			System.out.println();
			System.out.print("|");
			for (int i = 0; i < tamano; i++) {
				System.out.print(matriz[j][i]+"|");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		System.out.println("¿Tamaño del lado de la matriz cuadrada?");
		int tamano=t.nextInt();
		int sudoku[][]=new int[tamano][tamano];
		sudoku=RellenaCuadros(tamano);
		sudoku(sudoku,tamano);
		
		t.close();
	}

}
