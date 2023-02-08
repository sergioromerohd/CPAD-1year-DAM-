package ejercicios03;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=8,b=3 ;
		double resultado;
		resultado=(double)a/(double)b;
		//primera opccion 2.6666666666666667
		System.out.printf("%nEl resultado con decimales:%n%f",resultado);
		//	segunda opcion 2,67
		System.out.printf("%nEl resultado con 2 decimales:%n%.2f", resultado);
		//tercera opcion x2,67
		System.out.printf("%nEl resultado con 1 espacio alante y 2 decimales:%n%5.2f",resultado);
		//cuarta opcion xx2,667
		System.out.printf("%nEl resultado con 2 espacios delante y 3 decimales:%n%7.3f",resultado);
		//quita opcion 002,667
		System.out.printf("%nEl resultado con 2 espacios delante y 3 decimales:%n%07.3f",resultado);
		//sexta opcion xxxx2,6667
		System.out.printf("%nEl resultado con 2 espacios delante y 3 decimales:%n%10.4f",resultado);
		//septima opcion 2,667
		System.out.printf("%nEl resultado con 2 decimales:%n%.3f",resultado);
		//octava opcion xxx2,66667
		System.out.printf("%nEl resultado con 2 espacios delante y 3 decimales:%n%10.5f",resultado);
		//novena opcion 0000000003
		System.out.printf("%nEl resultado con 2 espacios delante y 3 decimales:%n%010.0f",resultado);
	
	}

}
