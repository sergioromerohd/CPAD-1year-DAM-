package Examen;

import java.util.Scanner;

public class Examen_1_pregunta_10 {
	static final Double pi = 3.1415;
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int	menu, L, apotema,radio,base,altura;
		float resultado;
		boolean semaforo=true;
		while (semaforo==true) {
		System.out.printf("\t\t\tcalculo de areas\n");
		System.out.printf("\t\t\t----------------\n");
		System.out.println("1. Circulo");
		System.out.println("2. Triangulo");
		System.out.println("3. Cuadrado");
		System.out.println("4. Pentagono");
		System.out.println("5. Exagono");
		System.out.println("9. salir");
		System.out.println("¿que area quieres calcular?");
		menu=t.nextInt();
		switch (menu) {
		case 9:
			semaforo=false;
			System.out.println("saliendo...");
			break;
		case 1:
			System.out.println("Introduzca el radio");
			radio=t.nextInt();
			resultado=(float)(pi*radio);
			resultado=resultado*resultado;
			System.out.println("-----------------------------");
			System.out.println("|el area es : "+resultado+" |");
			System.out.println("-----------------------------");
			
			break;
		case 2:
			System.out.println("Introduzca la base");
			base=t.nextInt();
			System.out.println("Introduzca la altura");
			altura=t.nextInt();
			resultado=base*altura/2;
			System.out.println("----------------------------");
			System.out.println("|el area es : "+resultado+" |");
			System.out.println("----------------------------");
			break;
		case 3:
			System.out.println("Introduzca la base");
			base=t.nextInt();
			System.out.println("Introduzca la altura");
			altura=t.nextInt();
			resultado=base*altura;
			System.out.println("----------------------------");
			System.out.println("|el area es : "+resultado+" |");
			System.out.println("----------------------------");
			break;
		case 4:
			System.out.println("Introduzca la L");
			L=t.nextInt();
			System.out.println("Introduzca el apotema");
			apotema=t.nextInt();
			resultado=(5*L*apotema)/2;
			System.out.println("-----------------------------");
			System.out.println("|el area es : "+resultado+" |");
			System.out.println("-----------------------------");
			break;
		case 5:
			System.out.println("Introduzca la L");
			L=t.nextInt();
			System.out.println("Introduzca el apotema");
			apotema=t.nextInt();
			resultado=(6*L*apotema)/2;
			System.out.println("---------------------------------");
			System.out.println("|el area es : "+resultado+" |");
			System.out.println("---------------------------------");
			break;
		default:
			System.out.println("saliendo...");
			break;
		}
		}
		t.close();
	}
}
