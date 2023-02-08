package aviones;

public class Main {

	public static void main(String[] args) {

		Avion a1 = new Avion();
		Avion a2 = new Avion("a2", 5000.0, 2000.0);

		while (a1.getAltura() < 10000.0) {
			a1.ascender();
			System.out.println(a1);
		}
		try {
			while (a2.getAltura() > 2000) {
				a2.descender();
				System.out.println(a2);
			}
		} catch (AvionPorDebajoAlturaMinima e) {
			System.out.println(e.getMessage());
			a2.setAltura(a2.getAlturaMin());
		}

		try {
			while (a2.getAltura() > 1900) {
				a2.descender();
				System.out.println(a2);
			}
		} catch (AvionPorDebajoAlturaMinima e) {
			System.out.println(e.getMessage());
			a2.setAltura(a2.getAlturaMin());
		}
	}

}
