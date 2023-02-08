package EjerciciosTema2;

import java.util.Scanner;

public class ejercicio_cuadradomagico {
	
	public static int vertical(int[][]x) {
		int sol[]=new int[x.length];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				sol[i]+=x[j][i];
			}
		}
		if (sol[1]==sol[2]&&sol[0]==sol[1]) {
			return sol[1];
		}else {
			return 0;
		}
	}
	public static int horizontal(int[][]x) {
		int sol[]=new int[x.length];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				sol[i]+=x[i][j];
			}
		}
		if (sol[1]==sol[2]&&sol[0]==sol[1]) {
			return sol[1];
		}else {
			return 0;
		}
	}
	public static int diagonal(int[][]x) {
		
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
						System.out.println("Introduce el valor para la posicion "+i+"-"+j);
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
			int vertical=vertical(matriz);
			System.out.println(vertical);
			int horizontal=horizontal(matriz);
			System.out.println(horizontal);
		t.close();
	}

}
