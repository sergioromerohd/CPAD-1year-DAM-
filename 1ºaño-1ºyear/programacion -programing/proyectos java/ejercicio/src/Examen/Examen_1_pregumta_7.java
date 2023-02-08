package Examen;

import java.util.Scanner;

public class Examen_1_pregumta_7 {

		static final Double descuento = 0.80;

		public static void main(String[] args) {
			Scanner t = new Scanner(System.in);
			int cantidad=-1;
			float precio=-1 , suma=0;
			while (precio<0) {
				
			
			System.out.println("Precio del Producto a valorar (use el formato x,y en caso de necesitar centimos)");
			precio=t.nextFloat();
			if (precio<0) {
				System.err.println("Error, intrduzca una cantidad valida");
			}
			}
			while(cantidad<0) {
			System.out.println("Cuantos produtos como este lleva?");
			cantidad=t.nextInt();
			if (cantidad<0) {
				System.err.println("Error, intrduzca una cantidad valida");
			}
			}
			suma=precio*cantidad;
			System.out.println("el precio a pagar es de "+(suma*descuento)+"$, teniendo en cuenta un descuento del 20% sobre el precio de "+suma+"$");
			t.close();
		}
}
