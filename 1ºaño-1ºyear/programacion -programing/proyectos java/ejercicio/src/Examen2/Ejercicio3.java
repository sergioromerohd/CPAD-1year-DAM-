package Examen2;
public class Ejercicio3 {
	public static void main(String[] args) {
		long numero[]=new long[20],cuadrado[]=new long[20],cubo[]=new long[20];
		System.out.println("|Numero|Cuadrado|cubo|");
		for (int i = 0; i < numero.length; i++) {
			numero[i]=(int)(Math.random()*100);
			cuadrado[i]=(numero[i]*numero[i]);
			cubo[i]=(cuadrado[i]*numero[i]);
			System.out.println("|"+numero[i]+"\t|"+cuadrado[i]+"\t|"+cubo[i]+"\t|");
		}
	}
}