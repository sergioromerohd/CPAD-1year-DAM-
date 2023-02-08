package ejercicios03;

import java.util.Scanner;

public class SudokuGenerar {
	private static int[][] Generarnumero(int[][] a,int[][] vertical1,int[][]vertical2,int[][] horizontal1,int[][] horizontal2,int probabilidad){
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <3; j++) {
				//se puede poner el numero?
				boolean vertical=false,horizontal=false;
				int dado=(int)(Math.random()*probabilidad+1);
				if (dado==1) {
					//generamos un numero random para la posicion en la que este
					int sudoku=(int)(Math.random()*9+1);
					//vemos si este numero vale
					//primero vemos si este numero ya esta en el cuadrado
					if (a[0][0]!=sudoku&&a[0][1]!=sudoku&&a[0][2]!=sudoku&&a[1][0]!=sudoku&&a[1][1]!=sudoku&&a[1][2]!=sudoku&&a[2][0]!=sudoku&&a[2][1]!=sudoku&&a[2][2]!=sudoku) {
						//comprobamos en verticales 
						if ((vertical1[0][j]==sudoku)||(vertical1[1][j]==sudoku)||(vertical1[2][j]==sudoku)||(vertical2[0][j]==sudoku)||(vertical2[1][j]==sudoku)||(vertical2[2][j]==sudoku)) {
							vertical=false;
						}else {
							vertical=true;
						}
						//comprobamos en horizontales
						if (horizontal1[i][0]==sudoku||horizontal1[i][1]==sudoku||horizontal1[i][2]==sudoku||horizontal2[i][0]==sudoku||horizontal2[i][1]==sudoku||horizontal2[i][2]==sudoku) {
							horizontal=false;
						}else {
							horizontal=true;
						}
						//vemos si este numero vale
						if (horizontal==true&&vertical==true) {
							a[i][j]=sudoku;
						}
						
					}
				}
			}
		}
		return a;
	}
	private static void mostrarsudoku(int[][] a_i,int[][] a_m,int[][] a_d,int[][] m_i,int[][] m_m,int[][] m_d,int[][] b_i,int[][] b_m,int[][] b_d) {
		
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
		
		//primera fila
		int[][] a_i=new int[3][3];
		int[][] a_m=new int[3][3];
		int[][] a_d=new int[3][3];
		//segunda fila
		int[][] m_i=new int[3][3];
		int[][] m_m=new int[3][3];
		int[][] m_d=new int[3][3];
		//tercera fila
		int[][] b_i=new int[3][3];
		int[][] b_m=new int[3][3];
		int[][] b_d=new int[3][3];
		
		//añadir numeros random con las caracteristicas
		//de un Sudoku en cada cuadrado desde arriba izquierda
			//generar numeros arriba a la izquierda
		for (int i = 0; i < 3; i++) {
			
			a_i=Generarnumero(a_i,m_i,b_i,a_m,a_d,6);
			//generar numeros arriba medio
			a_m=Generarnumero(a_m, m_m, b_m, a_i, a_d,6);
			//generar numeros arriba derecha
			a_d=Generarnumero(a_d, m_d, b_d, a_m, a_i,6);
			//generar numeros medio izquierda
			m_i=Generarnumero(m_i, a_i, b_i, m_m, m_d,5);
			//generar numeros en medio
			m_m=Generarnumero(m_m, a_m, b_m, m_i, m_d,4);
			//generar numeros medio izquierda
			m_d=Generarnumero(m_d, a_d, b_d, m_m, m_i,4);
			//generar numeros abajo izquierda
			b_i=Generarnumero(b_i, m_i, a_i, b_m, b_d,4);
			//generar numeros abajo medio
			b_m=Generarnumero(b_m, m_m, a_m, b_i, b_d,3);
			//generar numeros abajo derecha
			b_d=Generarnumero(b_d, m_d, a_d, b_i, b_m,3);
		}
			System.out.println("Enunciado");
		mostrarsudoku(a_i,a_m,a_d,m_i,m_m,m_d,b_i,b_m,b_d);
		System.out.println("¿quieres intentar resolver el sudoku automaticamente?");
		String respuesta=t.next();
		if (respuesta.equals("si")) {
			String completo="no";
			while (completo.equals("no")) {
				for (int i = 0; i <1000; i++) {
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
				mostrarsudoku(a_i,a_m,a_d,m_i,m_m,m_d,b_i,b_m,b_d);
				System.out.println("¿esta completo?");
				completo=t.next();
				if (completo.equals("no")) {
					a_i=Generarnumero(a_i,m_i,b_i,a_m,a_d,1);
					//generar numeros arriba medio
					a_m=Generarnumero(a_m, m_m, b_m, a_i, a_d,1);
					//generar numeros arriba derecha
					a_d=Generarnumero(a_d, m_d, b_d, a_m, a_i,1);
					//generar numeros medio izquierda
					m_i=Generarnumero(m_i, a_i, b_i, m_m, m_d,1);
					//generar numeros en medio
					m_m=Generarnumero(m_m, a_m, b_m, m_i, m_d,1);
					//generar numeros medio izquierda
					m_d=Generarnumero(m_d, a_d, b_d, m_m, m_i,1);
					//generar numeros abajo izquierda
					b_i=Generarnumero(b_i, m_i, a_i, b_m, b_d,2);
					//generar numeros abajo medio
					b_m=Generarnumero(b_m, m_m, a_m, b_i, b_d,2);
					//generar numeros abajo derecha
					b_d=Generarnumero(b_d, m_d, a_d, b_i, b_m,2);
				}
			}
		}
		t.close();
	}

}
