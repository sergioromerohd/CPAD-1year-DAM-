package ejercicios03;

import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner t = new Scanner(System.in);
		Double ex[]=new Double[4],media;
		String nombre,examen;
		int numeroclase;
		
		
		System.out.println("¿nombre y apellidos del alumno?");
		nombre=t.nextLine();
		System.out.println("¿numero de la clase?");
		numeroclase=t.nextInt();
		System.out.println("pon las notas de los 3 ultimos examenes separados con un '-''");
		examen=t.next();
		
		String[] separada = examen.split("-");
		for (int i = 0; i<=2; i++) {
			ex[i]=Double.parseDouble( separada[i]) ;
		}
		
			
			//esto es otra forma de hacerlo si se declara la variable ex1,ex2,ex3. (con el nuevo meodo se puede
			//ampliar la variable examen todo lo que quieras	)
				//String[] separada = examen.split("-");
				//ex1 = Double.parseDouble( separada[0]) ;
				//ex2 = Double.parseDouble( separada[1] );
				//ex3 = Double.parseDouble( separada[2] );
		
		
		
		media= (ex[0]+ex[1]+ex[2])/3;
		
		//System.out.println(ex1+""+ex2+""+ex3);
		
		for (int i = 0; i < 500; i++) {
			System.out.printf("―");
		}
		System.out.printf("\n|\tAlumno: "+numeroclase+" - "+nombre+"\t|\tex.1\t|\tex.2\t|\tex.3\t|\tMedia\t|\n");
		
		//esto es una linea de 105 "-"
		for (int i = 0; i < 500; i++) {System.out.printf("―");}
		
		System.out.printf("\n|\tNotas Primera Evaluación\t|\t"+ex[0]+"\t|\t"+ex[1]+"\t|\t"+ex[2]+"\t|");
		System.out.printf("\t%.2f",media);
		System.out.println("\t|");
		//esto es una linea de 105 -
		for (int i = 0; i < 500; i++) {System.out.printf("―");}
		
		t.close();
	}

}
