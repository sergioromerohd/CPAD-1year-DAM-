

/*
 * Ejercicio 24
Escribe un programa que lea caracteres hasta que se introduzca un
asterisco. Despu�s imprime en pantalla el n�mero de caracteres
introducido
 * 
 */
package ejercicio;
import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int i=0;
		char caracter='0';
		while (caracter!='*') {
			System.out.println("introduce un caracter solo");
			caracter=t.next().charAt(0);
			i++;
		}
		i--;
		System.out.print("has sumado un total de ");
		System.err.print(i);
		System.out.println(" caracteres");
		t.close();
	}

}
