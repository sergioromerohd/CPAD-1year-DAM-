/*
 * Introducir números y que el programa parase cuando introdujeses -1y
 *  sacase cuantos números primos introducíos hay, cuantos pares, cuantos 
 *  impares, cuantos perfectos y cuantos números en general
 */


package EjemplosScripts;

import java.util.Scanner;

public class examenirene {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero=0, primos=0,pares=0,impares=0,perfectos=0,general=0, cont=0, suma=0;
		while (numero!=-1) {
			System.out.println("asdad");
			numero=teclado.nextInt();
			if(numero!=-1) {
				//calcular si es primo
				//resetear contador
				cont=0;
				for (int i = 1; i <=numero; i++) {
					if (numero%i==0) {
						cont++;
					}
				}
				if (cont==2) {
					primos++;
				}
				//numeros pares
				if (numero%2==0) {
					pares++;
				}else {
					//impares
					impares++;
				}
				//numeros perfectos
				suma=0;
				for (int i = 1; i <numero; i++) {
					if (numero%i==0) {
						suma+=i;
					}
				}
				if (suma==numero) {
					perfectos++;
				}
				//total
				general++;
			}
			
		}
		System.out.println("Numeros primos:"+primos);
		System.out.println("Numeros pares:"+pares);
		System.out.println("Numeros impares:"+impares);
		System.out.println("Numeros perfectos:"+perfectos);
		System.out.println("numeros en total:"+general);
	}

}
