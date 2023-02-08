package Examen2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		//pedir el dni en forma de int
		long respuesta=0;
		int solucion=0;
		System.out.println("Introduce los numeros del dni?");
		boolean semaforo=false;
		while (semaforo==false) {
			respuesta=t.nextLong();
			if (respuesta>=10000000&&respuesta<=99999999) {
				semaforo=true;
			}else {
				System.out.println("Introduce un dni valido con solo los digitos");
			}
		}
		
		solucion=(int)(respuesta%23);
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		System.out.println("El numero correspondiente al dni introducido es:"+letras[solucion]);
		
		t.close();
	}

}
