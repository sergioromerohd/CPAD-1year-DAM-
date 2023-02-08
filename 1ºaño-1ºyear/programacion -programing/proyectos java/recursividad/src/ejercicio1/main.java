package ejercicio1;

import java.lang.*;

public class main {
	static int ndv = 0;

	public static int ContarVocales(String s) {
		StringBuilder sb = new StringBuilder(s);
		if (!s.equals("")) {
			Character s1 = s.charAt(0);
			sb = sb.deleteCharAt(0);
			s = sb.toString();
			ContarVocales(s);
			if (s1.equals('a') || s1.equals('e') || s1.equals('i') || s1.equals('o') || s1.equals('u')) {
				ndv++;
			}
		}
		return ndv;
	}

	public static void main(String[] args) {

		String ejemplo = "Hola esto es un ejemplo";
		System.out.println(ContarVocales(ejemplo));

	}

}
