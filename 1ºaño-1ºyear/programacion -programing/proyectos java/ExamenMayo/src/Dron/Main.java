package Dron;

import java.io.*;
import java.util.Scanner;


public class Main {
	static int potencia=0;
	public static int potenciaRecursiva(int a, int b) {
		
		while (b>1) {
			potencia=a*potenciaRecursiva(a, b-1);
			return potencia;
		}
		if (b==1) {
			return a;
		}else {
			return 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		//recursividad 
		System.out.println("Cual es la base?");
		int base=sc.nextInt();
		System.out.println("cual es el exponente");
		int exponente=sc.nextInt();
		
		System.out.println("La pontencia es :"+potenciaRecursiva(base,exponente));
		
		
		Dron d1=new Dron();
		try {
			while (d1.getCargaBateria()>10) {
				d1.volar();
			}
		} catch (NivelBateriaCritico e) {
			System.out.println(e.getMessage());
			d1.aterrizar();
		}
		try {
			FileWriter fw = new FileWriter("nombres.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw= new PrintWriter(bw);
            
            File file = new File("Calificaciones.dat");
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream dos = new DataOutputStream(bos);
            
            String nombre;
            double calificacion;
            
            for (int i = 0; i <5; i++) {
				System.out.println("nombre "+i);
				nombre=sc.next();
				pw.println(nombre);
				System.out.println("calificacion "+i);
				calificacion=sc.nextDouble();
				dos.writeDouble(calificacion);
			}
            pw.close();
            dos.close();
            
            FileReader fr = new FileReader("nombres.txt");
            BufferedReader br = new BufferedReader(fr);
            FileInputStream fis= new FileInputStream(file);
            BufferedInputStream bis= new BufferedInputStream(fis);
            DataInputStream dis= new DataInputStream(bis);
            //mostrar cada alumno
            double suma=0;
            int total=0;
            double este;
            for (int i = 0; i < 5; i++) {
				System.out.print(br.readLine()+" -> ");
				este=dis.readDouble();
				suma+=este;
				total++;
				System.out.println(este);
			}
            System.out.println("la media de la clase es :"+(suma/total));
            dis.close();
            br.close();
            
		} catch (Exception e) {
			
		}
		
		
		
		sc.close();
	}

}
