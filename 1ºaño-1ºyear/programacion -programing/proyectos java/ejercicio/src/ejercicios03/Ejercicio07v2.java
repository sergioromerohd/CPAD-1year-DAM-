package ejercicios03;

import java.util.Scanner;

public class Ejercicio07v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// iniciar escaner
		Scanner t = new Scanner(System.in);
		
		//declarar variables
		Double media=0.0;
		String nombre,examen;
		int numeroclase,examenes=0;
		
		//hacer preguntas y dar valores a las variables necesarias
		System.out.println("¿nombre y apellidos del alumno?");
			nombre=t.nextLine();
		System.out.println("¿numero de la clase?");
			numeroclase=t.nextInt();
		System.out.println("¿Cuantos examenes tiene este alumno?");
			examenes=t.nextInt();
		//declarar variable ex[];
		Double ex[]=new Double[examenes+1];
		System.out.println("pon las notas de los "+examenes+" ultimos examenes separados con un '-' usa '.' para poner decimales");
			examen=t.next();
		
		//dar valores a variables, en funcion de la cantidad de examenes, con los valores de las notas
		String[] separada = examen.split("-");
		for (int i = 0; i < examenes; i++) {
			ex[i]=Double.parseDouble( separada[i]) ;
			//calcular la suma de todas las notas
			media = media + ex[i];
		}
		//calcular la media de las notas 
		media = media / examenes;
			
					//esto es otra forma de hacerlo si se declara la variable ex1,ex2,ex3. (con el nuevo 
					//meodo se puede ampliar la variable examen todo lo que quieras	)
							//String[] separada = examen.split("-");
							//ex1 = Double.parseDouble( separada[0]) ;
							//ex2 = Double.parseDouble( separada[1] );
							//ex3 = Double.parseDouble( separada[2] );
					
		//hacer las lines horizontales a medida de los examenes
		for (int i = 0; i < 41; i++) {System.out.printf("―");}
		for (int i = 0; i <examenes+1; i++) {
			for (int l = 0; l < 16; l++) {System.out.printf("―");}
		}
		
		System.out.printf("\n|\tAlumno: "+numeroclase+" - "+nombre+"\t");
		
		//bucle de los cuadradps de la primera fila
		for (int i = 1; i <=examenes; i++) {
			
			System.out.printf("|\tex."+i+"\t");
			
		}
		System.out.printf("|\tMedia\t|\n");
		
		//hacer las lines horizontales a medida de los examenes
		for (int i = 0; i < 41; i++) {System.out.printf("―");}
		for (int i = 0; i <examenes+1; i++) {
			for (int l = 0; l < 16; l++) {System.out.printf("―");}
		}
		
			System.out.printf("\n|\tNotas Primera Evaluación\t");
		
		for (int i = 0; i <examenes; i++) {
			System.out.printf("|\t"+ex[i]+"\t");
		}
		
		System.out.printf("|\t%.2f",media);
		System.out.println("\t|");
		
		//hacer las lines horizontales a medida de los examenes
		for (int i = 0; i < 41; i++) {System.out.printf("―");}
		for (int i = 0; i <examenes+1; i++) {
			for (int l = 0; l < 16; l++) {System.out.printf("―");}
		}		
		t.close();
	}
}
