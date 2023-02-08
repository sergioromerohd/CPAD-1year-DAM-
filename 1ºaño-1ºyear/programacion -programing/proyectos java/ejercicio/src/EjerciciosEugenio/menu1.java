package EjerciciosEugenio;

import java.util.Scanner;

public class menu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declarar variables de inicio
		boolean Encendido=true;
		int menu=0;
		Scanner t = new Scanner(System.in);	
		//generamos un menu en consola
		while (Encendido==true) {
			System.out.println("\t---Menu de Inicio---");
			System.out.println("1º-Numeros perfectos del 1 al 1000");
			System.out.println("2º-calcular si un numero es primo");
			System.out.println("3º-calcular primos entre un rango");
			boolean comprobar=false;
			while (comprobar==false) {
				try {
					menu=t.nextInt();
				} catch (Exception mi_exception) {
					System.out.println("Intoduce un valor Posible para este menu");
					comprobar=true;
				}
					switch (menu) {
					case 1:
						
						break;
					case 2:
										
						break;
					case 3:
						
						break;
	
					default:
						System.out.println("Intoduce un valor Posible para este ");
						break;
					}
				
			}
		}
		
	}

}
