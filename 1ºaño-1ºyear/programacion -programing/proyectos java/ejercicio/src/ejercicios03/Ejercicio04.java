package ejercicios03;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//primerqa linea
			for (int i = 0; i < 160; i++) {
				System.out.printf("―");
			}
			//titulo
			System.out.printf("%n \t\t\t\t\t\t\t\t Tabla de equivalencia informatica%n");
			//segunda linea
			for (int i = 0; i < 160; i++) {
				System.out.printf("―");
			}
			//titulos
			System.out.printf("%n│\t\tMedida\t\t│\t\tsimbologia\t\t│\t\tEquivalencia\t\t│\t\tEquivalencia en bytes\t\t│%n");
			//tercera linea
			for (int i = 0; i < 160; i++) {
				System.out.printf("╳");
			}
				//primera fila
				System.out.printf("%n│\t\tbyte\t\t│\t\t\tb\t\t│\t\t8bits\t\t\t│\t\t1byte\t\t\t\t│%n");
				//cuarta linea
				for (int i = 0; i < 160; i++) {
					System.out.printf("―");
				}
				//segunda fila
				System.out.printf("%n│\t\tkilobyte\t│\t\t\tkb\t\t│\t\t1024bytes\t\t│\t\t1024bytes\t\t\t│%n");
				//quita linea
				for (int i = 0; i < 160; i++) {
					System.out.printf("―");
				}
				//segunda fila
				System.out.printf("%n│\t\tmegabyte\t│\t\t\tMB\t\t│\t\t1024kb\t\t\t│\t\t1048576bytes\t\t\t│%n");
				//sexta linea
				for (int i = 0; i < 160; i++) {System.out.printf("―");}
				//segunda fila
				System.out.printf("%n│\t\tgigabyte\t│\t\t\tGB\t\t│\t\t1024mb\t\t\t│\t\t1073741824bytes\t\t\t│%n");
				//septima fila
				for (int i = 0; i < 160; i++) {System.out.printf("―");}
				//segunda fila
				System.out.printf("%n│\t\tTerabyte\t│\t\t\tTB\t\t│\t\t1024GB\t\t\t│\t\t1099511627778bytes\t\t│%n");
	
	
	}
	


}
