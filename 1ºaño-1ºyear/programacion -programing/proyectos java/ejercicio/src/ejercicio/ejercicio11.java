package ejercicio;

import java.util.Scanner;

public class ejercicio11 {
	public static void main(String[] args) {
		try (//habilitar teclado
			Scanner teclado = new Scanner(System.in)) {
				//declarar variables
					String Nombre="";
				//solicitar nombre
					System.out.println("cual es tu nombre");
					Nombre=teclado.next();
				//solucion
					System.out.println("Hola "+Nombre+" :):");
			}
	}
}
