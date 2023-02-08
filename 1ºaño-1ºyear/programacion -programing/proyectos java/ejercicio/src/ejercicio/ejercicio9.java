package ejercicio;
import java.util.Scanner;
public class ejercicio9 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num=0;
		System.out.println ("Introduce un numero para obtener su cuadrado: ");
		num = teclado.nextInt();
		//resultado
		System.out.println("el cuadrado de "+num+" es "+(Math.pow(num, 2)));
		teclado.close();
	}
	}
