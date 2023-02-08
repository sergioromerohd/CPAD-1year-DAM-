package ejercicios03;

import java.util.Scanner;

public class Resolver_sudoku {
	private static void enseñarcuadricula(int[][] a_i,int[][] a_m,int[][] a_d,int[][] m_i,int[][] m_m,int[][] m_d,int[][] b_i,int[][] b_m,int[][] b_d) {
		System.out.println("------------------------");
		System.out.println("|"+a_i[0][0]+"|"+a_i[0][1]+"|"+a_i[0][2]+"|\t"+"|"+a_m[0][0]+"|"+a_m[0][1]+"|"+a_m[0][2]+"|\t"+"|"+a_d[0][0]+"|"+a_d[0][1]+"|"+a_d[0][2]+"|");
		System.out.println("------------------------");
		System.out.println("|"+a_i[1][0]+"|"+a_i[1][1]+"|"+a_i[1][2]+"|\t"+"|"+a_m[1][0]+"|"+a_m[1][1]+"|"+a_m[1][2]+"|\t"+"|"+a_d[1][0]+"|"+a_d[1][1]+"|"+a_d[1][2]+"|");
		System.out.println("------------------------");
		System.out.println("|"+a_i[2][0]+"|"+a_i[2][1]+"|"+a_i[2][2]+"|\t"+"|"+a_m[2][0]+"|"+a_m[2][1]+"|"+a_m[2][2]+"|\t"+"|"+a_d[2][0]+"|"+a_d[2][1]+"|"+a_d[2][2]+"|");
		System.out.println("------------------------");
		System.out.println("------------------------");
		System.out.println("|"+m_i[0][0]+"|"+m_i[0][1]+"|"+m_i[0][2]+"|\t"+"|"+m_m[0][0]+"|"+m_m[0][1]+"|"+m_m[0][2]+"|\t"+"|"+m_d[0][0]+"|"+m_d[0][1]+"|"+m_d[0][2]+"|");
		System.out.println("------------------------");
		System.out.println("|"+m_i[1][0]+"|"+m_i[1][1]+"|"+m_i[1][2]+"|\t"+"|"+m_m[1][0]+"|"+m_m[1][1]+"|"+m_m[1][2]+"|\t"+"|"+m_d[1][0]+"|"+m_d[1][1]+"|"+m_d[1][2]+"|");
		System.out.println("------------------------");
		System.out.println("|"+m_i[2][0]+"|"+m_i[2][1]+"|"+m_i[2][2]+"|\t"+"|"+m_m[2][0]+"|"+m_m[2][1]+"|"+m_m[2][2]+"|\t"+"|"+m_d[2][0]+"|"+m_d[2][1]+"|"+m_d[2][2]+"|");
		System.out.println("------------------------");
		System.out.println("------------------------");
		System.out.println("|"+b_i[0][0]+"|"+b_i[0][1]+"|"+b_i[0][2]+"|\t"+"|"+b_m[0][0]+"|"+b_m[0][1]+"|"+b_m[0][2]+"|\t"+"|"+b_d[0][0]+"|"+b_d[0][1]+"|"+b_d[0][2]+"|");
		System.out.println("------------------------");
		System.out.println("|"+b_i[1][0]+"|"+b_i[1][1]+"|"+b_i[1][2]+"|\t"+"|"+b_m[1][0]+"|"+b_m[1][1]+"|"+b_m[1][2]+"|\t"+"|"+b_d[1][0]+"|"+b_d[1][1]+"|"+b_d[1][2]+"|");
		System.out.println("------------------------");
		System.out.println("|"+b_i[2][0]+"|"+b_i[2][1]+"|"+b_i[2][2]+"|\t"+"|"+b_m[2][0]+"|"+b_m[2][1]+"|"+b_m[2][2]+"|\t"+"|"+b_d[2][0]+"|"+b_d[2][1]+"|"+b_d[2][2]+"|");
		System.out.println("------------------------");
		

	}
	
	private static int[][] medio(int[][] m_m,int[][] a_m,int[][] m_i,int[][] m_d,int[][] b_m){
		
		for (int i = 1; i <=9; i++) {
			if (m_m[0][0]!=i&&m_m[0][1]!=i&&m_m[0][2]!=i&&m_m[1][0]!=i&&m_m[1][1]!=i&&m_m[1][2]!=i&&m_m[2][0]!=i&&m_m[2][1]!=i&&m_m[2][2]!=i) {
				int posible=0;
				for (int j2 = 0; j2 < 3; j2++) {
					for (int j = 0; j < 3; j++) {
						boolean posiblevertical=false;
						boolean posiblehorizontal=false;
						if (m_m[j2][j]==0) {
							//comprovar en la vertical
							if ((a_m[0][j]==i)||(a_m[1][j]==i)||(a_m[2][j]==i)||(b_m[0][j]==i)||(b_m[1][j]==i)||(b_m[2][j]==i)) {
								posiblevertical=false;
							}else {
								posiblevertical=true;
							}
							//comprobar en la horizontal
							if (m_i[j2][0]==i||m_i[j2][1]==i||m_i[j2][2]==i||m_d[j2][0]==i||m_d[j2][1]==i||m_d[j2][2]==i) {
								posiblehorizontal=false;
							}else {
								posiblehorizontal=true;
							}
							if (posiblehorizontal==true&&posiblevertical==true) {
								posible++;
							}
						}
					}
				}
				if (posible==1) {
					for (int j2 = 0; j2 < 3; j2++) {
						for (int j = 0; j < 3; j++) {
							boolean posiblevertical=false;
							boolean posiblehorizontal=false;
							if (m_m[j2][j]==0) {
								//comprovar en la vertical
								if ((a_m[0][j]==i)||(a_m[1][j]==i)||(a_m[2][j]==i)||(b_m[0][j]==i)||(b_m[1][j]==i)||(b_m[2][j]==i)) {
									posiblevertical=false;
								}else {
									posiblevertical=true;
								}
								//comprobar en la horizontal
								if (m_i[j2][0]==i||m_i[j2][1]==i||m_i[j2][2]==i||m_d[j2][0]==i||m_d[j2][1]==i||m_d[j2][2]==i) {
									posiblehorizontal=false;
								}else {
									posiblehorizontal=true;
								}
								if (posiblehorizontal==true&&posiblevertical==true) {
									m_m[j2][j]=i;
								}
							}
						}
					}
				}
			}
		}
		return m_m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);	
		
		//enunciado 	
			//primera fila
			int[][] a_i= {{1,3,0},{0,0,6},{9,0,0}};
			int[][] a_m= {{0,6,0},{0,0,0},{2,4,1}};
			int[][] a_d= {{9,0,8},{0,0,0},{0,3,0}};
			//segunda fila
			int[][] m_i= {{0,0,0},{0,0,0},{0,8,0}};
			int[][] m_m= {{9,1,0},{0,0,2},{0,7,0}};
			int[][] m_d= {{7,0,0},{0,0,4},{0,2,0}};
			//tercera fila
			int[][] b_i= {{8,5,0},{0,9,0},{4,0,0}};
			int[][] b_m= {{0,0,0},{7,0,4},{0,0,6}};
			int[][] b_d= {{0,0,0},{0,0,0},{0,0,1}};
		//intentar reyenar numeros
			for (int i = 0; i <100; i++) {
				//arriba izquierda
				a_i=medio(a_i,m_i,a_m,a_d,b_i);
				//arriba medio
				a_m=medio(a_m,m_m,a_i,a_d,b_m);
				//arriba derecha
				a_d=medio(a_d,m_d,a_m,a_i,b_d);
				//medio izquierda
				m_i=medio(m_i,a_i,m_m,m_d,b_i);
				//medio
				m_m=medio(m_m,a_m,m_i,m_d,b_m);
				//medio derecha
				m_d=medio(m_d,a_d,m_m,m_i,b_d);
				//abajo izquierda
				b_i=medio(b_i,a_i,b_m,b_d,m_i);
				//bajo medio
				b_m=medio(b_m,m_m,b_i,b_d,a_m);
				//bajo derecha
				b_d=medio(b_d,m_d,b_m,b_i,a_d);
			}
			
			//enseñar la tabla
			enseñarcuadricula(a_i,a_m,a_d,m_i,m_m,m_d,b_i,b_m,b_d);

		t.close();
	}

}

