package EjerciciosLibro;

import java.util.Scanner;

public class Ejercicio48_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//habilitar teclado
		Scanner t=new Scanner(System.in);
		
		long a=0,b=0,b1=0;
		long c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0;
		
		System.out.println("Introduce un numero");
		a=t.nextLong();
		
		System.out.print("cifras que aparecen: ");
		
		while (a>0) {
			
			b=a%10;
			a=a/10;
			
			if (c1==0) {
				c1=b;
				}else if (c2==0) {
					c2=b;
				}else if (c3==0) {
					c3=b;
				}else if (c4==0) {
					c4=b;
				}else if (c5==0) {
					c5=b;
				}else if (c6==0) {
					c6=b;
				}else if (c7==0) {
					c7=b;
				}
			
			if (b1-b!=0) {
				System.out.print(b+" ");
			}
		b1=b;
		}
		
		System.out.println();
		
		System.out.print("Numeros que no salen: ");
		
		for (int i = 1; i < 10; i++) {
			
			if (i-c1!=0 && i-c2!=0 && i-c3!=0 && i-c4!=0 && i-c5!=0 && i-c6!=0 && i-c7!=0) {
				
				System.out.print(i+" ");
				
			}
		}
		t.close();
	}

}
