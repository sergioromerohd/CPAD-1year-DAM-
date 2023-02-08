/*
 * Ejercicio 16
Realiza un simulador de mÃ¡quina tragaperras simplificada que cumpla los
siguientes requisitos:
a) El ordenador mostrarÃ¡ una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazÃ³n, diamante, herradura, campana y limÃ³n.
b) Si las tres figuras son diferentes se debe mostrar el mensaje â€œLo siento, ha
perdidoâ€�.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje â€œBien,
ha recuperado su monedaâ€�.
d) Si las tres figuras son iguales se debe mostrar â€œEnhorabuena, ha ganado
10 monedasâ€�.

 */


package EjerciciosLibro;

import java.util.Scanner;

public class Ejercicio16_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//habilitar teclado
		Scanner t=new Scanner(System.in);
		
		int monedas=10, intentos=0,
				resultado1=((int)(Math.random()*4)),
				resultado2=((int)(Math.random()*4)),
				resultado3=((int)(Math.random()*4));
		String aceptar="si";
		
		while (monedas>0) {
			System.out.print("quieres probar suerte por 1 moneda, tienes ");
			System.out.print(monedas);
			System.out.println(" moneda/s");
			aceptar=t.next();
			
			if (aceptar.equals("si")||aceptar.equals("SI")||aceptar.equals("Si")||aceptar.equals("s")||aceptar.equals("S")) {
				
				monedas-=1;
				
				System.out.println("\n\n\n\n\n\n\n\n");
				
				System.out.print("| ");
				
				resultado1=((int)(Math.random()*4));
				
				switch (resultado1) {
				case 0:
					 System.out.print("O");
					break;
				case 1:
					System.out.print("$");
					break;
				case 2:
					System.out.print("@");
					break;
				case 3:
					System.out.print("{}");
					break;
				}
				System.out.print(" | ");
				
				resultado2=((int)(Math.random()*4));
				
				switch (resultado2) {
				case 0:
					 System.out.print("O");
					break;
				case 1:
					System.out.print("$");
					break;
				case 2:
					System.out.print("@");
					break;
				case 3:
					System.out.print("{}");
					break;
				}
				System.out.print(" | ");
				
				resultado3=((int)(Math.random()*4));
				
				switch (resultado3) {
				case 0:
					 System.out.print("O");
					break;
				case 1:
					System.out.print("$");
					break;
				case 2:
					System.out.print("@");
					break;
				case 3:
					System.out.print("{}");
					break;	
				}
				System.out.println(" |");
				
				System.out.println("\n");
				
				//3 iguales
				
				if (resultado1==resultado2&&resultado1==resultado3&&resultado2==resultado3) {
					
					monedas+=5;
					System.out.println("enhorabuena ha ganado el premio gordo usted gana 5 monedas");
					
				}
				//solo 2 son iguales
				else if ((resultado1==resultado2&&resultado3!=resultado1)||
						(resultado1==resultado3&&resultado2!=resultado1)||
						(resultado2==resultado3&&resultado1!=resultado2)) {
					
					System.out.println("Bien, ha recuperado su moneda");
					monedas+=1;
				}else {
					
					System.out.println("prueba suerte la proxima vez");
					
				}

			}
			intentos++;
			
		}
		System.err.println("te as quedado sin monedas en "+intentos+" jugadas, recargalas y juega de nuevo");
		t.close();
	}
}

