package Examen2;

public class Ejercicio4 {
	public static int contarpares(int[] n) {
		int cont=0;
		for (int i = 0; i < n.length; i++) {
			if ((n[i]%2)==0) {
				cont++;
			}
		}
		return cont;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {3, 93, 2, 39, 78, 12, 3, 25, 94, 18, 73, 78, 49, 95, 6, 36, 33, 15, 66, 56};
		int[] par = new int[contarpares(n)];
		int[] impar = new int[n.length-par.length];
		int a=0, b=0;
		for (int i = 0; i < n.length; i++) {
			if (n[i]%2==0) {
				par[a]=n[i];
				a++;
			}else {
				impar[b]=n[i];
				b++;
			}
		}
		
		for (int i = 0; i < par.length; i++) {
			n[i]=par[i];
		}
		int c=0;
		for (int i = n.length-1; i>=par.length ; i--) {
			n[i]=impar[c];
			c++;
		}
		System.out.print("Solucion: ");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]+" ");
		}

	}

}
