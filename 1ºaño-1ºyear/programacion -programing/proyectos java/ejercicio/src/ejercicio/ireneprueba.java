package ejercicio;

import java.util.Scanner;

public class ireneprueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int n, nmayor, nmenor ,calc=0;
		boolean semaforo=false;
		System.out.println("puto numero");
		n=teclado.nextInt();
		nmayor=n+1;
		nmenor=n-1;
		while (semaforo==false) {
			calc=0;
			for (int i = 1; i<=nmayor; i++) {
				if ((nmayor%i)==0) {
					calc++;
				}
				}
			if (calc==2) {
				semaforo=true;
			}else {
				nmayor++;
			}
				
			}
		System.out.println(nmayor);
		semaforo=false;
		while (semaforo==false) {
			calc=0;
			for (int i = 1; i<=nmenor; i++) {
				if ((nmenor%i)==0) {
					calc++;
				}
				}
			if (calc==2) {
				semaforo=true;
			}else {
				nmenor--;
			}
				
			}
		System.out.println(nmenor);
	}
}
