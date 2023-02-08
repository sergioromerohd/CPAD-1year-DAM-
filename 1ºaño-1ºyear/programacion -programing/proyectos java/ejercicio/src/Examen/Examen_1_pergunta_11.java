package Examen;

import java.util.Scanner;

public class Examen_1_pergunta_11 {

	public static void main(String[] args) {
		
	Scanner t = new Scanner(System.in);
	
	int precio, clases, pclases;
	String carnet;
	System.out.println("¿que carnet desea sacarse? ¿A B C o D ? (Utilize mayusculas gracias:)");
	carnet=t.next();

	switch (carnet) {
	case "A":
		precio=150;
		pclases=15;
		System.out.println("¿cuantas clases va a realizar?");
		clases=t.nextInt();
		System.out.println("Teniendo en cuenta sus necesidades la tarifa seria de: "+(precio+(pclases*clases))+"$");
		break;
	case "B":
		precio=325;
		pclases=21;
		System.out.println("¿cuantas clases va a realizar?");
		clases=t.nextInt();
		System.out.println("Teniendo en cuenta sus necesidades la tarifa seria de: "+(precio+(pclases*clases))+"$");
		break;
	case "C":
		precio=520;
		pclases=36;
		System.out.println("¿cuantas clases va a realizar?");
		clases=t.nextInt();
		System.out.println("Teniendo en cuenta sus necesidades la tarifa seria de: "+(precio+(pclases*clases))+"$");
		break;
	case "D":
		precio=610;
		pclases=50;
		System.out.println("¿cuantas clases va a realizar?");
		clases=t.nextInt();
		System.out.println("Teniendo en cuenta sus necesidades la tarifa seria de: "+(precio+(pclases*clases))+"$");
		break;

	default:
		System.out.println("Carnet no identificado");
		break;
	}
	t.close();
	}
}
