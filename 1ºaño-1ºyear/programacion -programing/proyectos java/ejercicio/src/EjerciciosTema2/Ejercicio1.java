package EjerciciosTema2;

import java.util.*;
import java.text.*;

public class Ejercicio1 {

	private static void enseñarmenu() {
		System.out.println(" Aplicación Fechas ");
		System.out.println("--------------------------");
		System.out.println("1.- Obtener fecha actual");
		System.out.println("2.- Obtener hora actual");
		System.out.println("3.- Sumar días");
		System.out.println("4.- Restar días");
		System.out.println("5.- Fecha anterior o posterior");
		System.out.println("0.- Salir");
		System.out.print("Seleccione [0..5]: ");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion=-1, dias=0;
		Date hoy= new Date();
		
		Scanner t = new Scanner(System.in);
		while (opcion!=0) {
			enseñarmenu();
			opcion=t.nextInt();
			switch (opcion) {
	
			case 0:{
				System.out.println("Saliendo...");
				break;
			}
			case 1:{
				SimpleDateFormat fecha = new SimpleDateFormat("dd/MMMM/YYYY");
				System.out.println(fecha.format(hoy));
				break;
			}
			case 2:{
				SimpleDateFormat hora = new SimpleDateFormat("HH:MM:SS");
				System.out.println(hora.format(hoy));
				break;
			}
			case 3:{
				System.out.println("¿cuantos dias quieres sumar?");
				dias=t.nextInt();
				Calendar cal= new GregorianCalendar();
				cal.setTimeInMillis(hoy.getTime());
				cal.add(Calendar.DATE,dias);
				SimpleDateFormat fecha = new SimpleDateFormat("dd/MMMM/YYYY");
				System.out.println(fecha.format(hoy));
				break;
			}
			case 4:{
				
			}
			case 5:{
				
			}
			default:{
				System.out.println("...");
			}
			
			}
			
		}
		t.close();
	}

}
