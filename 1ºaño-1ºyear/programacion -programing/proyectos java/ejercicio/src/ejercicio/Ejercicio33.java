package ejercicio;

import java.util.Scanner;

public class Ejercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//activar teclado
		Scanner t = new Scanner(System.in);
		int numero=-1 , mayor=0 , menor=99999 , suma=0, divisor=0;
		double media=0;
		
		while (numero != 0) {
			
			//pedir numero
			System.out.println("introduce numeros, para cerrar introduce un 0");
			numero=t.nextInt();
			
			//calcular si es mayor
			if(numero>mayor) {
				mayor=numero;
			}
			//calcular si es menor
			if (numero<menor&&numero>0) {
				menor=numero;
			}
			//sumar para hacer la media
			if (numero>0) {
				suma=suma+numero;
				divisor++;
			}
		}
		//calcular la media y resultado en decimal
		media=(double)suma/(double)divisor;
		//solucion
		System.out.println("el numero mas alto es "+mayor);
		System.out.println("el numero mas bajo es "+menor);
		System.out.println("la media de todos los numeros es "+media);
	//cerrar teclado
	t.close();
	}

}
