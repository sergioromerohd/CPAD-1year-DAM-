/*
 *Ejercicio 29
Realiza un programa que calcule el precio de un desayuno. El programa
preguntará primero qué ha tomado el usuario de comer: palmera, donut o
pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
programa debe preguntar además si era con aceite o con tortilla; el primero
vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
café a 1’50 y 1’20 respectivamente
 */

package EjerciciosLibro;

import java.util.Scanner;

public class Ejercicio29_4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		float desayuno=0,Ppalmera=1.4f,Pdonut=1f,PpitufoA=1.2f,PpitufoT=1.6f,Pzumo=1.5f,Pcafe=1.20f;
		int palmera=0,donut=0,pitufoA=0,pitufoT=0,zumo=0,cafe=0;
		String pregunta="no";
		System.out.println("¿Que as desayunado hoy?");
		System.out.println("¿has desayunado palmeras? (S/N)");
		pregunta=t.next();
			if(pregunta.equals("s")||pregunta.equals("S")||pregunta.equals("si")||pregunta.equals("Si")||pregunta.equals("SI")){
				System.out.println("¿cuantas?");
				palmera=t.nextInt();
				Ppalmera=Ppalmera*palmera;
			}else {
				Ppalmera=0;
			}
			System.out.println("¿has desayunado donuts? (S/N)");
			pregunta=t.next();
			if(pregunta.equals("s")||pregunta.equals("S")||pregunta.equals("si")||pregunta.equals("Si")||pregunta.equals("SI")){
				System.out.println("¿cuantos?");
				donut=t.nextInt();
				Pdonut=Pdonut*donut;
			}else {
				Pdonut=0;
			}
			System.out.println("¿Has desayunado Pitufo? (S/N)");
			pregunta=t.next();
			if(pregunta.equals("s")||pregunta.equals("S")||pregunta.equals("si")||pregunta.equals("Si")||pregunta.equals("SI")){
				System.out.println("¿De aceite?");
				pregunta=t.next();
				if(pregunta.equals("s")||pregunta.equals("S")||pregunta.equals("si")||pregunta.equals("Si")||pregunta.equals("SI")){
					System.out.println("¿cuantos?");
					pitufoA=t.nextInt();
					PpitufoA=PpitufoA*pitufoA;
				}else {
					PpitufoA=0;
					}
				System.out.println("¿De Tortilla?");
				pregunta=t.next();
				if(pregunta.equals("s")||pregunta.equals("S")||pregunta.equals("si")||pregunta.equals("Si")||pregunta.equals("SI")){
					System.out.println("¿cuantos?");
					pitufoT=t.nextInt();
					PpitufoT=PpitufoT*pitufoT;
					
				}else {
					PpitufoT=0;
				}
			}else {
				PpitufoA=0;
				PpitufoT=0;
			}
			desayuno=Ppalmera+Pdonut+PpitufoA+PpitufoT;
			System.out.println();
			System.out.println("palmeras: X"+palmera+" "+Ppalmera+"$ donut: X"+donut+" "+Pdonut+"$ pitufos: X"+
			(pitufoA+pitufoT)+" "+(PpitufoA+PpitufoT)+"$");
			System.out.println("el dasayuno ha costado "+desayuno+"$");
			System.out.println();
			System.out.println("¿has tomado algo de beber (S/N)");
			pregunta=t.next();		
			
			//zumos
			if(pregunta.equals("s")||pregunta.equals("S")||pregunta.equals("si")||pregunta.equals("Si")||pregunta.equals("SI")){
				System.out.println("¿era zumo?");
				pregunta=t.next();
				if(pregunta.equals("s")||pregunta.equals("S")||pregunta.equals("si")||pregunta.equals("Si")||pregunta.equals("SI")){
					System.out.println("¿cuantos?");
					zumo=t.nextInt();
					Pzumo=Pzumo*zumo;
				}else {
					Pzumo=0;
					}
				System.out.print("|¿era cafe?");
				pregunta=t.next();
				if(pregunta.equals("s")||pregunta.equals("S")||pregunta.equals("si")||pregunta.equals("Si")||pregunta.equals("SI")){
					
					System.out.println("¿cuantos?");
					cafe=t.nextInt();
					Pcafe=Pcafe*cafe;
					
				}else {
					Pcafe=0;
				}
			}else {
				Pzumo=0;
				Pcafe=0;
			}
			desayuno=desayuno+Pcafe+Pzumo;
			System.out.println("zumos: X"+zumo+" "+Pzumo+"$ cafe: X"+cafe+" "+Pcafe+"$");
			System.out.println("_________________________________________________________________________________");
			System.out.println("todo el desayuno ha costado "+desayuno+"$");
			t.close();
	}

}