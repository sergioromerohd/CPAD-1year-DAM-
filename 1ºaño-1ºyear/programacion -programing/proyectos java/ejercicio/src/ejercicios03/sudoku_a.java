package ejercicios03;

import java.util.Scanner;

public class sudoku_a {
	private static int[][] RellenaCuadros(){
		int matriz[][]=new int [4][4];
		matriz[0][0]=1;
		matriz[0][3]=2;
		matriz[3][0]=3;
		matriz[3][3]=4;
		return matriz;
	}
	private static void sudoku(int [][] matriz) {
		System.out.println("----------");
		System.out.println("|"+matriz[0][0]+"|"+matriz[0][1]+"|"+matriz[0][2]+"|"+matriz[0][3]+"|");
		System.out.println("----------");
		System.out.println("|"+matriz[1][0]+"|"+matriz[1][1]+"|"+matriz[1][2]+"|"+matriz[1][3]+"|");
		System.out.println("----------");
		System.out.println("|"+matriz[2][0]+"|"+matriz[2][1]+"|"+matriz[2][2]+"|"+matriz[2][3]+"|");
		System.out.println("----------");
		System.out.println("|"+matriz[3][0]+"|"+matriz[3][1]+"|"+matriz[3][2]+"|"+matriz[3][3]+"|");
		System.out.println("----------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);	
		int sudoku[][]=new int[4][4];
		sudoku=RellenaCuadros();
		sudoku(sudoku);
		
		t.close();
	}

}
	