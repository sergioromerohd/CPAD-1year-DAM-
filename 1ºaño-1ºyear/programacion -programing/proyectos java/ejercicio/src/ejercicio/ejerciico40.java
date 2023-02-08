/*Ejercicio 40Ejercicio 40
Escribe un programa que pida un número y escriba su tabla de
multiplicar*/

package ejercicio;
import java.util.Scanner;
public class ejerciico40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0, solucion=0;
		
		Scanner teclado= new Scanner (System.in);
		System.out.println("Introduce un numero para calcular su tabla de multiplicar:");
		numero=teclado.nextInt();
		
		for(int i=0;i<=10;i++) {
			solucion=i*numero;
			System.out.println(numero+" X "+i+"= "+solucion);
		}
		teclado.close();
	}
}
