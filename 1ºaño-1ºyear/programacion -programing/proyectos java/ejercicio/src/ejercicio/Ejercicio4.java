package ejercicio;

public class Ejercicio4 {
	public static void main(String[] args) {
		//decalaracion de variables
		float b=0,a=0,c=0,resultado=0;
		//valores de variables
		a=3;
		b=4;
		c=5;
		//operacion 1
		resultado=a+b/c;
		System.out.println("3+4/5 es "+resultado);
		//operacion2
		resultado=(a+b)/c;
		System.out.println("(3+4)/5 es "+resultado);
		//resultado
		System.out.println("el resultado es diferente por que los parentesis priorizan por encima del divisor");
	
}
}